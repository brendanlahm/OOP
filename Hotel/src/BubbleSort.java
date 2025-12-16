import java.util.Comparator;

public class BubbleSort {

    // Private Attributes
    private Comparator<Node<Hotel>> comparator;

    // Public Constructor
    public BubbleSort(Comparator<Node<Hotel>> comparator) {
        this.comparator = comparator;
    }

    // Sorting method
    public Node<Hotel> sort(Node<Hotel> head) {

        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        Node<Hotel> endMarker = null;

        do {
            swapped = false;
            Node<Hotel> current = head;

            while (current.next != endMarker) {
                // compare nodes, not hotels
                if (comparator.compare(current, current.next) < 0) { // Flipped the sign -> Highest # Rooms goes to top

                    // swap data inside the nodes
                    Hotel temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
            endMarker = current;  // last sorted position

        } while (swapped);

        return head;
    }

    public <Hotel> void printList(Node<Hotel> head) {
        Node<Hotel> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
