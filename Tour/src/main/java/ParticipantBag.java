import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ParticipantBag extends Tour implements HikeTour {

    // Constructor for 'participants' attribute
    private List<Participant> participants;

    // Inheritance from Superclass
    public ParticipantBag(String name, String date, String type, int duration, int length, List<Participant> participants) {
        super(name, date, type, duration, length, participants);
        this.participants = participants;
    }

    // Constructors for Item Arrays
    ArrayList<Item> allItems = new ArrayList<>();
    ArrayList<Item> bagItems = new ArrayList<>();

    // Account for all Participant items
    public void collectItems() {
        for (Participant p : participants) {
            allItems.addAll(p.getParticipantItems());
        }
        // Sort items based on weight
        allItems.sort((a, b) -> Double.compare(b.getItemWeight(), a.getItemWeight()));
        System.out.println("\nAll Items:" + allItems.toString()); // Print list of items
    }

    // Ensure no younger child carries more than an older child
    public boolean isChildLoadValid(List<Participant> participants) {
        List<Participant> children = participants.stream()
                .sorted(Comparator.comparingInt(Participant::getParticipantAge).reversed())
                .toList();

        double maxWeightSoFar = Double.MAX_VALUE;

        for (Participant p : children) {
            double weight = p.getTotalWeight();
            if (weight > maxWeightSoFar) {
                return false;
            }
            maxWeightSoFar = weight;
        }
        return true;
    }

    // Redistribute Items
    public void distributeItems() {
        System.out.println("\nStarting redistribution...");
        for (Item i : allItems) {
            participants.sort(Comparator.comparingDouble(Participant::getTotalWeight) // First sort: Lightest Participant
                    .thenComparing(Comparator.comparingInt(Participant::getParticipantAge).reversed())); // Next sort: Oldest Participant

            // Give the next participant the next item if they are not carrying their max weight
            for (Participant p : participants) {
                if (p.getRemainingWeight() >= i.getItemWeight()) {
                    p.addItem(i);

                    // Account for younger children not receiving more weight than older children
                    if (isChildLoadValid(participants)) {
                        System.out.println(p.getParticipantName() + " takes " + i.getItemName() + " with " + i.getItemWeight() + " kg");
                        break;
                    } else {
                        // Remove Item if it violates child rules
                        p.removeItem(i);
                    }
                }
            }
        }
    }

    // Report Bag contents
    public void statusBag() {
        System.out.println("\nDistribution - " + getName());
        for (Participant p : participants) {
            if (p.getParticipantItems().isEmpty()) {System.out.println("\n" + p.getParticipantName() + ": Nothing (0.0 kg)");}
            else {System.out.println("\n" + p.getParticipantName() + ": " + p.getParticipantItems() + "\nTotal Weight = " + p.getTotalWeight() + " kg");}
        }
    }

    // Empty Items from Bags
    public void emptyBag() {
        System.out.println("\nEmptying Bags...");
        for (Participant b : participants) {
            b.clearItems();
            bagItems.addAll(b.getParticipantItems());
        }
    }
}
