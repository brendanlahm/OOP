package src;

public class BSTImpl {

    IntElement root;

    public class IntElement {
        int value;
        IntElement left;
        IntElement right;

        IntElement(int v, IntElement l, IntElement r) {
            value = v;
            left = l;
            right = r;
        }
        public int getValue() { return value; }
    }

    public void add(int v) {

        IntElement e = new IntElement(v, null, null); // Constructor

        if (root == null) {
            root = e;
            return;
        }

        System.out.println(e.getValue());
        System.out.println(root.getValue());
    }

}




