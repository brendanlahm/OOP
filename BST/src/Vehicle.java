package src;

public class Vehicle {

    // Private attributes
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
    public int getVehicleId() { return vehicleId; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    // Setters
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }

}
