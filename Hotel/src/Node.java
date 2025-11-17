public class Node<T> {
    T data;
    Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // Display Method for a Linked List
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node<T> current = this;
        while (current != null) {
            sb.append(current.data);   // calls Hotel.toString()
            current = current.next;
            }

        return sb.toString();
        }
}
