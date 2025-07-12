import java.util.Iterator;
import java.util.Stack;

// Generic Implementation
public class GenericBSTImpl<T extends Comparable<T>> implements Iterable<T> {

    private Node<T> root;

    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }

    // Public wrapper method
    public void add(T value) {
        root = addRecursive(root, value);
    }

    // Wrapped private method w/ Comparable Interface
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

    // Public wrapper method
    public Iterator<T> iterator() {
        return new InOrderIterator(root);
    }

    // Wrapped private iterator for looping through the tree
    private class InOrderIterator implements Iterator<T> {
        private Stack<Node<T>> stack = new Stack<>(); // Initiate the stack

        // Public wrapper method
        public InOrderIterator(Node<T> root) {
            pushLeft(root);
        }

        // Wrapped private method
        private void pushLeft(Node<T> node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public T next() {
            Node<T> node = stack.pop();
            pushLeft(node.right);
            return node.data;
        }
    }
}
