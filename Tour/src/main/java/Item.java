import java.lang.String;

public class Item {

    // Private attributes
    private String name;
    private double weight; // in kg

    // Constructor
    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getters
    public String getItemName() {
        return name;
    }
    public double getItemWeight() { return weight; }

    // Method for printing an item
    public String toString() {
        return name + " (" + weight + "kg)";
    }
}
