import java.util.List;
import java.util.ArrayList;

public class Participant {

    // Private Attributes
    private String name;
    private int age;
    private List<Item> items = new ArrayList<>();

    // Constructor
    public Participant(String name, int age, ArrayList items) {
        this.name = name;
        this.age = age;
        this.items = items;
    }

    // Getters
    public String getParticipantName() {
        return name + " (" + age + ")";
    }
    public int getParticipantAge() {return age;}
    public List<Item> getParticipantItems() { return items; }

    // Calculate total weight carried by a Participant (iterate through all items and summarize)
    public double getTotalWeight() {
        return items.stream().mapToDouble(Item::getItemWeight).sum();
    }

    // Calculate max weight allowed by a Participant
    public double getMaxWeight() {
        if (age < 6) return 0;
        else if (age <= 14) return 5;
        else return Double.MAX_VALUE;
    }

    // Calculate remaining weight allowed to be given to a Participant
    public double getRemainingWeight() {
        return getMaxWeight() - getTotalWeight();
    }

    // Method for giving a Participant an Item
    public void addItem(Item item) {
        items.add(item);
    }

    // Method for taking an Item from a Participant
    public void removeItem(Item item) {
        items.remove(item);
    }

    // Method for clearing items from the class
    public void clearItems() {
        items.clear();
    }

}
