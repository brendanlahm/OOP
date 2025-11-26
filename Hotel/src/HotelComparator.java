import java.util.Comparator;

public class HotelComparator implements Comparator<Node<Hotel>> {

    @Override
    public int compare(Node<Hotel> a, Node<Hotel> b) {
        return Integer.compare(a.data.getRooms(), b.data.getRooms()); // 1 -> a is bigger
    }
}
