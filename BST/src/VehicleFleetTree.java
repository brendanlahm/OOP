package src;

// BST Implementation
public class VehicleFleetTree {

    // Private attributes
    private Vehicle root;

    // Constructor
    public VehicleFleetTree() {
        root = null;
    }

    // Method for adding a vehicle
    public void add(int vehicleId, String make, String model, int year, Vehicle left, Vehicle right) {

        Vehicle v = new Vehicle(vehicleId, make, model, year, left, right);

        // Setting the root vehicle
        if (root == null) {
            root = v;
            System.out.println("Root vehicle: " + root.getVehicleId() + ", " + root.getMake() + ", " + root.getModel() + ", " + root.getYear());

            // Setting vehicle to the left of root
        } else if (v.vehicleId < root.getVehicleId() && root.left == null) {
            root.left = v;
            System.out.println("Added vehicle (root -> left): " + root.left.getVehicleId() + ", " + root.left.getMake() + ", " + root.left.getModel() + ", " + root.left.getYear());

            // Setting vehicle to left -> left
        } else if (root.left != null && v.vehicleId < root.getVehicleId() && v.vehicleId < root.left.getVehicleId()) {
            root.left.left = v;
            System.out.println("Added vehicle (root -> left -> left): " + root.left.left.getVehicleId() + ", " + root.left.left.getMake() + ", " + root.left.left.getModel() + ", " + root.left.left.getYear());

            // Setting vehicle to left -> right
        } else if (root.left != null && v.vehicleId < root.getVehicleId() && v.vehicleId > root.left.getVehicleId()) {
            root.left.right = v;
            System.out.println("Added vehicle (root -> left -> right): " + root.left.right.getVehicleId() + ", " + root.left.right.getMake() + ", " + root.left.right.getModel() + ", " + root.left.right.getYear());

            // Setting vehicle to the right of root
        } else if (v.vehicleId > root.getVehicleId() && root.right == null) {
            root.right = v;
            System.out.println("Added vehicle (root -> right): " + root.right.getVehicleId() + ", " + root.right.getMake() + ", " + root.right.getModel() + ", " + root.right.getYear());

        // Setting vehicle to right -> left
        } else if (root.right != null && v.vehicleId > root.getVehicleId() && v.vehicleId < root.right.getVehicleId()) {
            root.right.left = v;
            System.out.println("Added vehicle (root -> right -> left): " + root.right.left.getVehicleId() + ", " + root.right.left.getMake() + ", " + root.right.left.getModel() + ", " + root.right.left.getYear());

        // Setting vehicle to right -> right
        } else if (root.right != null && v.vehicleId > root.getVehicleId() && v.vehicleId > root.right.getVehicleId()) {
            root.right.right = v;
            System.out.println("Added vehicle (root -> right -> right): " + root.right.right.getVehicleId() + ", " + root.right.right.getMake() + ", " + root.right.right.getModel() + ", " + root.right.right.getYear());
        }
    }
}
