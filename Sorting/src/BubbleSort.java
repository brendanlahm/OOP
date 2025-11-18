import java.util.Comparator;

public class BubbleSort<T> {

    // Private Attributes
    private Comparator<T> comparator;

    // Constructors
    public BubbleSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    // Public Node Wrapper
    public Node<T> sort(Node<T> head) {
        return bubSort(head);
    }

    // Private Method
    private Node<T> bubSort(Node<T> head) {

        if (head == null) { return null; }

        boolean swapped;
        Node<T> N;
        Node<T> N1 = null;

        do {
            N = head;
            swapped = false;
            while (N.next != N1) {
                if (comparator.compare(N.data, N.next.data) > 0) {
                    T temp = N.data;
                    N.data = N.next.data;
                    N.next.data = temp;
                    swapped = true;
                }
                N = N.next;
            }
            N1 = N;
        } while (swapped);
        return head;
    }

    // Method for printing the List
    public <T> void printList(Node<T> head) {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
