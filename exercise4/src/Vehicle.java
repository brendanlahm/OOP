public class Vehicle implements Comparable<Vehicle>{

    // Public attributes
    int vehicleId;
    String make;
    String model;
    int year;
    Vehicle left, right;

    // Constructor
    public Vehicle(int vehicleId, String make, String model, int year, Vehicle left, Vehicle right) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.left = null;
        this.right = null;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Comparable Interface
    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.vehicleId, other.vehicleId);
        //return CharSequence.compare(this.make, other.make);
    }

    // Method for printing vehicle info
    @Override
    public String toString() {
        return vehicleId + ", " + make + ", " + model + ", " + year;
    }

}
