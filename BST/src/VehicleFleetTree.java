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
            System.out.println("Root vehicle: " + root.getVehicleId() + ", " + root.getMake() + ", " + root.getModel() + ", " + root.getYear());

            // Setting vehicle to the left of root
        } else if (v.vehicleId < root.getVehicleId()) {
            root.left = v;
            System.out.println("Added vehicle (left): " + root.left.getVehicleId() + ", " + root.left.getMake() + ", " + root.left.getModel() + ", " + root.left.getYear());

            // Setting vehicle to the right of root
        } else if (v.vehicleId > root.getVehicleId()) {
            root.right = v;
            System.out.println("Added vehicle (right): " + root.right.getVehicleId() + ", " + root.right.getMake() + ", " + root.right.getModel() + ", " + root.right.getYear());
        }

    }

}
