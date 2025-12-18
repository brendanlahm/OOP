import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Define participants in Kampenwand-Tour & assign items (Done)
        List<Participant> participants = new ArrayList<>(List.of(
                new Participant("Peter", 27, new ArrayList<>(List.of(
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Sausage sandwiches", 0.5),
                        new Item("Jacket", 1.5)
                ))),
                new Participant("Max", 14, new ArrayList<>(List.of(
                        new Item("Cheese sandwiches", 0.7),
                        new Item("Chocolate", 0.3),
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Climbing equipment", 7.5),
                        new Item("Jacket", 1.0)
                ))),
                new Participant("Sabine", 10, new ArrayList<>(List.of(
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Apples", 0.5),
                        new Item("Blanket", 2.0),
                        new Item("Tent", 8.0),
                        new Item("Jacket", 1.0)
                ))),
                new Participant("Gerda", 26, new ArrayList<>(List.of(
                        new Item("Bananas", 0.5),
                        new Item("Frisbee", 0.2),
                        new Item("Apple spritzer", 1.5),
                        new Item("Picnic basket", 3.5),
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Jacket", 0.7)
                ))),
                new Participant("Otto", 4, new ArrayList<>(List.of())
        )));

        // Constructor for Kampenwand ParticipantBag Implementation
        ParticipantBag tour = new ParticipantBag("Kampenwand-Tour", "15.08.2025", "Family Hiking Tour", 4, 20, participants);

        // Print the Tour info
        System.out.println(tour);

        // Print Bag info
        tour.collectItems();
        tour.statusBag();

        // Empty the bags
        tour.emptyBag();

        // Redistribute Items
        tour.distributeItems();
        tour.statusBag();

        // Write to Markdown
        List<String> report = List.of(
        "Kampenwand-Tour Report",
        "Date = 15.08.2025",
        "Type = Family Hiking Tour",
        "Duration = 4 hours",
                "Length = 20 km",
        "\nParticipants:",
                "\nPeter (27): Tent (8.0kg), Jacket (1.5kg), Water bottle (1.5kg), Water bottle (1.5kg), Water bottle (1.5kg), Jacket (1.0kg), Cheese sandwiches (0.7kg), Apples (0.5kg), Chocolate (0.3kg)\n",
                "Total Weight = 16.5 kg (no limit)",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nGerda (26): Climbing equipment (7.5kg), Water bottle (1.5kg), Water bottle (1.5kg), Apple spritzer (1.5kg), Water bottle (1.5kg), Jacket (1.0kg), Jacket (0.7kg), Sausage sandwiches (0.5kg), Bananas (0.5kg), Frisbee (0.2kg)\n",
                        "Total Weight = 16.4 kg (no limit)",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nSabine (10): Blanket (2.0kg), Water bottle (1.5kg), Water bottle (1.5kg)\n",
                        "Total Weight = 5.0 / 5.0 kg",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nMax (14): Picnic basket (3.5kg), Water bottle (1.5kg)\n",
                        "Total Weight = 5.0 / 5.0 kg",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nOtto (4): Nothing 0.0 / 0.0 kg"
        );

        try {
            MarkdownReporter.writeToFile("kampenwand_tour.md", report);
        } catch (IOException e) {
            System.err.println("Failed to write Markdown file: " + e.getMessage());
            e.printStackTrace(); // For debugging
        }

        // Define participants in Simsee-Tour & assign items
        List<Participant> participantsSimsee = new ArrayList<>(List.of(
                new Participant("Franz", 19, new ArrayList<>(List.of(
                        new Item("Gatorade bottle", 1.5),
                        new Item("Gatorade bottle", 1.5),
                        new Item("Gatorade bottle", 1.5),
                        new Item("Power bars", 1.0),
                        new Item("Jacket", 1.5)
                )))));

        // Constructor for Simsee ParticipantBag Implementation
        ParticipantBag tourSimsee = new ParticipantBag("Simsee-Tour", "30.05.2025", "Extreme Tour", 3, 45, participantsSimsee);

        // Print the Tour info
        System.out.println(tourSimsee);

        // Print Bag info
        tourSimsee.collectItems();
        tourSimsee.statusBag();

        // Empty the bags
        tourSimsee.emptyBag();

        // Redistribute Items
        tourSimsee.distributeItems();
        tourSimsee.statusBag();

        // Write to Markdown
        List<String> reportSimsee = List.of(
                "Simsee-Tour Report",
                "Date = 30.05.2025",
                "Type = Extreme Tour",
                "Duration = 3 hours",
                "Length = 45 km",
                "\nParticipants:",
                "\nFranz (19): Gatorade bottle (1.5kg), Gatorade bottle (1.5kg), Gatorade bottle (1.5kg), Power bars (1.0kg), Jacket (1.5kg)\n",
                        "Total Weight = 7.0 kg (no limit)"
        );

        try {
            MarkdownReporter.writeToFile("simsee_tour.md", reportSimsee);
        } catch (IOException e) {
            System.err.println("Failed to write Markdown file: " + e.getMessage());
            e.printStackTrace(); // For debugging
        }

        // Define participants in Königssee-Tour & assign items
        List<Participant> participantsKoenig = new ArrayList<>(List.of(
                new Participant("Lena", 9, new ArrayList<>(List.of(
                        new Item("Protein bar", 0.4),
                        new Item("Water bottle", 1.5),
                        new Item("Hiking jacket", 1.0),
                        new Item("Rain poncho", 0.5)
                ))),
                new Participant("Mila", 34, new ArrayList<>(List.of(
                        new Item("Thermos flask w/ tea", 1.2),
                        new Item("Sandwiches", 0.7),
                        new Item("Fruit box", 1.1),
                        new Item("Hiking guide", 0.2)
                ))),
                new Participant("Ben", 6, new ArrayList<>(List.of(
                        new Item("Small water bottle", 0.75),
                        new Item("Small water bottle", 0.75),
                        new Item("Oreos", 0.3),
                        new Item("Cap", 0.2)
                ))),
                new Participant("Tobias", 12, new ArrayList<>(List.of(
                        new Item("First aid kit", 1.0),
                        new Item("Camera", 0.9),
                        new Item("Water bottle", 1.5),
                        new Item("Water bottle", 1.5),
                        new Item("Fruit", 0.5),
                        new Item("Jacket", 1.5)
                ))),
                new Participant("Ella", 5, new ArrayList<>(List.of(
                        new Item("Teddy Bear", 0.3)
                ))
                )));

        // Constructor for Königssee ParticipantBag Implementation
        ParticipantBag tourKoenig = new ParticipantBag("Königssee-Tour", "01.10.2025", "Family Hiking Tour", 5, 16, participantsKoenig);

        // Print the Tour info
        System.out.println(tourKoenig);

        // Print Bag info
        tourKoenig.collectItems();
        tourKoenig.statusBag();

        // Empty the bags
        tourKoenig.emptyBag();

        // Redistribute Items
        tourKoenig.distributeItems();
        tourKoenig.statusBag();

        // Write to Markdown
        List<String> reportKoenigsee = List.of(
                "Königssee-Tour Report",
                "Date = 01.10.2025",
                "Type = Family Hiking Tour",
                "Duration = 5 hours",
                "Length = 16 km",
                "\nParticipants:",
                "\nMila (34): Water bottle (1.5kg), Thermos flask w/ tea (1.2kg), Camera (0.9kg), Rain poncho (0.5kg), Teddy Bear (0.3kg)\n",
                        "Total Weight = 4.4 kg (no limit)",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nTobias (12): Water bottle (1.5kg), Fruit box (1.1kg), Small water bottle (0.75kg), Fruit (0.5kg)\n",
                        "Total Weight = 3.85 kg / 5.0 kg",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nLena (9): Water bottle (1.5kg), Hiking jacket (1.0kg), Small water bottle (0.75kg), Protein bar (0.4kg), Hiking guide (0.2kg)\n",
                        "Total Weight = 3.85 kg / 5.0 kg",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nBen (6): Jacket (1.5kg), First aid kit (1.0kg), Sandwiches (0.7kg), Oreos (0.3kg), Cap (0.2kg)\n",
                        "Total Weight = 3.7 kg / 5.0 kg",
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "\nElla (5): Nothing 0.0 kg / 0.0 kg"
        );

        try {
            MarkdownReporter.writeToFile("koenigssee_tour.md", reportKoenigsee);
        } catch (IOException e) {
            System.err.println("Failed to write Markdown file: " + e.getMessage());
            e.printStackTrace(); // For debugging
        }

    }
}

