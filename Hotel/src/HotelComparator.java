import java.util.Comparator;

public class HotelComparator implements Comparator<Node<Hotel>> {

    @Override
    public int compare(Node<Hotel> a, Node<Hotel> b) {

        int roomCompare = Integer.compare(a.data.getRooms(), b.data.getRooms()); // Sort by Room # first (1 -> a is bigger)
        if (roomCompare != 0) return roomCompare;

        int locationCompare = a.data.getLocation().compareTo(b.data.getLocation()); // Sort by Location second
        if (locationCompare != 0) return locationCompare;

        return Integer.compare(b.data.getPrice(), a.data.getPrice()); // Sort by Price last (a & b switched -> cheapest first!)
    }
}
