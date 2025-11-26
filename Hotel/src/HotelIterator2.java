import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class HotelIterator2 implements Iterator<Hotel> {

    private Node<Hotel> head;
    private int maxRooms;  // dynamic parameter

    // Constructor w/ dynamic parameter maxRooms
    public HotelIterator2(Node<Hotel> head, int maxRooms) {
        this.head = head;
        this.maxRooms = maxRooms;
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public Hotel next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Hotel data = head.data;
        if (head.data.getRooms() > maxRooms) {
            data = null; }
        head = head.next;
        return data;
    }

}

