public class StringSetImpl {

    // Public Attributes
    public StringElement root;

    // Public Constructor
    public StringSetImpl() {
        this.root = null;
    }

    // Inner Class
    class StringElement {
        String value;
        StringElement left;
        StringElement right;

        StringElement(String value) {
            this.value = value;
        }

        int getLength() {
            return value.length();
        }

    }

    // Method for adding a string to the set
    public void add(String s) {

        StringElement newNode = new StringElement(s);

        if (root == null) {
            root = newNode;
            return;
        }

        StringElement current = root; // Begin at the root
        while (current != null) {
            if (current.value.equals(newNode)) {
                return;
            } else if (newNode.getLength() < current.getLength()) {
                if (current.left == null) { // If Left Node is empty
                    current.left = newNode; // Left Node is set
                    return;
                } else { current = current.left; }
            } else if (newNode.getLength() > current.getLength()) {
                if (current.right == null) { // If Right Node is empty
                    current.right = newNode; // Right Node is set
                    return;
                } else { current = current.right; }
            }
        }
    }

    public void remove(String s) {
        root = removeRecursive(root, s);
    }

    // Method for removing a string
    private StringElement removeRecursive(StringElement node, String s) {
        if (node == null) {
            return null;
        }

        if (s.equals(node.value)) {

            // Case 1: no children
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 2: one child
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            // Case 3: two children
            StringElement successor = findMin(node.right);
            node.value = successor.value;
            node.right = removeRecursive(node.right, successor.value);
            return node;
        }

        // Traverse by length
        if (s.length() < node.getLength()) {
            node.left = removeRecursive(node.left, s);
        } else {
            node.right = removeRecursive(node.right, s);
        }
        return node;
    }

    // Find smallest node in the subtree
    private StringElement findMin(StringElement node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Method for checking if a string is contained in the set
    public boolean contains(String s) {
        StringElement it = root;

        while (it != null) {
            if (it.value.equals(s)) {
                return true;
            } else if (s.length() < it.getLength()) {
                it = it.left;
            } else if (s.length() > it.getLength()) {
                it = it.right;
            }
        }
        return false;
    }

    // Public wrapper method for printing method
    public void inOrderPrint() {
        inOrderPrint(root);
    }

    // Method for printing the set
    private void inOrderPrint(StringElement node) {
        if (node == null) {
            return;
        }
        inOrderPrint(node.left);
        System.out.println(node.value);
        inOrderPrint(node.right);
    }

}
