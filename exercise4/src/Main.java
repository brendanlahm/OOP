import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Instantiate the tree
        GenericBSTImpl<Vehicle> fleet = new GenericBSTImpl<>();

        // Add cars to the tree
        fleet.add(new Vehicle(301, "Hyundai", "Sonata", 2013, null, null));
        fleet.add(new Vehicle(309, "Hyundai", "Accord", 2024, null, null));
        fleet.add(new Vehicle(291, "Honda", "Civic", 2001, null, null));
        fleet.add(new Vehicle(289, "Honda", "Odyssey", 2016, null, null));
        fleet.add(new Vehicle(292, "Lamborghini", "Gallardo", 2014, null, null));
        fleet.add(new Vehicle(303, "Lamborghini", "Huracan", 2023, null, null));
        fleet.add(new Vehicle(311, "Lamborghini", "Aventador", 2020, null, null));

        // Create a vehicle list
        List<Vehicle> vehicleList = new ArrayList<>();
        // Add vehicles
        for (Vehicle v : fleet) {
            vehicleList.add(v);
        }

        // Sort using the custom comparator
        vehicleList.sort(new VehicleComparator());

        // Print sorted list
        System.out.println("\nSorted Vehicle Info (by make, model, descending year):");
        for (Vehicle v : vehicleList) {
            System.out.println(v);
        }
    }
}
