// Generic Implementation
public class GenericBSTImpl<T extends Comparable<T>>{

    private Node<T> root;

    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }

    public void add(T value) {
        root = addRecursive(root, value);
    }

    private Node<T> addRecursive(Node<T> current, T value) {
        if (current == null) {
            System.out.println("Inserted: " + value);
            return new Node<>(value);
        }

        int cmp = value.compareTo(current.data);

        if (cmp < 0) {
            current.left = addRecursive(current.left, value);
        } else if (cmp > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            System.out.println("Duplicate value ignored: " + value);
        }

        return current;
    }

}
