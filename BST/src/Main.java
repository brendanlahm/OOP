package src;

public class Main {

    // Object-Oriented Method
    public static void main(String[] args) {

    // Initiate the tree
    VehicleFleetTree tree = new VehicleFleetTree();

    // Add cars to the tree
    tree.add(301, "Hyundai", "Sonata", 2013, null, null);
    tree.add(309, "Hyundai", "Accord", 2024, null, null);
    tree.add(291, "Honda", "Civic", 2001, null, null);
    tree.add(289, "Honda", "Odyssey", 2016, null, null);
    tree.add(292, "Lamborghini", "Gallardo", 2014, null, null);
    tree.add(303, "Lamborghini", "Huracan", 2023, null, null);
    tree.add(311, "Lamborghini", "Aventador", 2020, null, null);

    }

}
