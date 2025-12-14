public class Main {
    public static void main(String[] args) {

        // Implementation
        StringSetImpl strings = new StringSetImpl();

        // Add strings to the tree
        String a = "also";
        System.out.println("\n" + a + " is " + a.length() + " letters"); // Print length of String
        strings.add(a);
        String b = "fantastic";
        String c = "panther";
        String d = "pan";
        String e = "it";
        String f = "major";
        strings.add(b);
        strings.add(c);
        strings.add(d);
        strings.add(e);
        strings.add(f);
        strings.inOrderPrint(strings.root);

    }
}
