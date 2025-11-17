import java.util.Comparator;

public class HotelComparator implements Comparator<Node<Hotel>> {

    @Override
    public int compare(Node<Hotel> a, Node<Hotel> b) {
        return Integer.compare(a.data.getPrice(), b.data.getPrice()); // Lowest Price first
    }
}
