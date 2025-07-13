public class Node<T> {
    T data;
    Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
