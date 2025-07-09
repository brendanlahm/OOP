package src;

// BST Implementation
public class VehicleFleetTree {

    // Private attributes
    private Vehicle root;

    public void add(int vehicleId, String make, String model, int year, Vehicle left, Vehicle right) {

        Vehicle v = new Vehicle(vehicleId, make, model, year, left, right); // Constructor

        // Setting the root vehicle
        if (root == null) {
            root = v;
            return;
        }

        System.out.println(root.getVehicleId());
        System.out.println(v.getVehicleId());
    }

}
