import java.util.Comparator;
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
            Node<Hotel> current = head; // Start at the root
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(h);
        }
    }

    // Method for calculating size of the HotelCatalog
    public int size() {
        int count = 0;
        Node<Hotel> it = head;

        while (it != null) {
            it = it.next;
            count++;
        }
        return count;
    }

    // Bubble Sort
    public void bubbleSort(Comparator<Node<Hotel>> comparator) {
        if (head == null || head.next == null) {return;}

        int n = size();

        for (int i = 0; i < n - 1; i++) {
            Node<Hotel> current = head;
            while (current.next != null) {
                if (comparator.compare(current, current.next) < 0) { // Custom comparator used here
                    Hotel temp = current.next.data;
                    current.next.data = current.data;
                    current.data = temp;
                }
                current = current.next;
            }
        }
    }

    // Public wrapper method
    public Iterator<Hotel> iterator() {
        return new HotelIterator(head);
    }

    // Wrapped private Iterator (inner class)
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
