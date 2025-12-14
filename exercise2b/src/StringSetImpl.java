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

    public void inOrderPrint(StringElement node) {
        if (node == null) {
            return;
        }
        inOrderPrint(node.left);
        System.out.println(node.value);
        inOrderPrint(node.right);
    }

}
