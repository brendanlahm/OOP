public class Hotel {

    // Private fields
    private String Location;
    private int Rooms;
    private int Price;

    // Constructor
    public Hotel(String Location, int Rooms, int Price) {
        this.Location = Location;
        this.Rooms = Rooms;
        this.Price = Price;
    }

    // Getter
    public String getLocation() {
        return Location;
    }
    public int getRooms() {return Rooms;}
    public int getPrice() {return Price;}

    // Setter
    public void setLocation(String Location) {
        this.Location = Location;
    }
    public void setRooms(int Rooms) {this.Rooms = Rooms;}
    public void setPrice(int Price) {this.Price = Price;}

    // Display method
    @Override
    public String toString() {
        return Location;
    }

}
