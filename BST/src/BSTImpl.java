package src;

public class BSTImpl {

    IntElement root;

    class IntElement {
        int value;
        IntElement left;
        IntElement right;

        IntElement(int v, IntElement l, IntElement r) {
            value = v;
            left = l;
            right = r;
        }
    }

    public void add(int v) {

        IntElement e = new IntElement(v, null, null); // Constructor

        if (root == null) {
            root = e;
            return;
        }

    }

}




