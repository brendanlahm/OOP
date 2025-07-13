public class BubbleSort<T extends Comparable<T>> {

    // Public wrapper method
    public Node<T> sort(Node<T> head) {
        return bubSort(head);
    }

    // Wrapped private method
    private Node<T> bubSort(Node<T> head) {

        if (head == null) return null;

        boolean swapped;
        Node<T> ptr1;
        Node<T> lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data.compareTo(ptr1.next.data) > 0) {
                    // Swap data
                    T temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
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
