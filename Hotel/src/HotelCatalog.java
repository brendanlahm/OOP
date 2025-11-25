import java.util.Iterator;
import java.util.NoSuchElementException;

public class HotelCatalog implements Iterable<Hotel> {

    // Private Attributes
    private Node<Hotel> head;

    // Adding to the list
    public void add(Hotel h) {
        if (head == null) {
            head = new Node<>(h);
        } else {
            Node<Hotel> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(h);
        }
    }

    // Public wrapper method
    public Iterator<Hotel> iterator() {
        return new HotelIterator(head);
    }
    
    // Wrapped private Iterator
    private class HotelIterator implements Iterator<Hotel> {
        private Node<Hotel> it;

        public HotelIterator(Node<Hotel> head) {
            this.it = head;
        }

        public boolean hasNext() {
            return it != null;
        }
        public Hotel next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Hotel data = it.data;
            it = it.next;
            return data;
        }

    }

}
