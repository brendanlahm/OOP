public class Hotel {

    // Private fields
    public String Location;
    public int Rooms;
    public int Price;

    // Constructor
    public Hotel(String Location, int Rooms, int Price) {
        this.Location = Location;
        this.Rooms = Rooms;
        this.Price = Price;
    }

    // Getters
    public String getLocation() {
        return Location;
    }
    public int getRooms() {return Rooms;}
    public int getPrice() {return Price;}

    // Display method
    @Override
    public String toString() {
        return "\nLocation: " + Location + "\nRooms: " + Rooms + "\nPrice: " + Price;
    }

}
