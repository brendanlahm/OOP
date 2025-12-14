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
        String g = "ramped";
        strings.add(b);
        strings.add(c);
        strings.add(d);
        strings.add(e);
        strings.add(f);
        strings.add(g);

        // Print the set in order of string size
        strings.inOrderPrint();
        System.out.println("\nRoot: " + strings.root.value); // Print the root value

        // Check the set for strings
        System.out.println("\nSet contains word: " + strings.contains("panther"));
        System.out.println("\nSet contains word: " + strings.contains("fantastisch"));

        // Remove strings from the set
        strings.remove("pan");
        strings.inOrderPrint();
        System.out.println("\nRoot: " + strings.root.value + "\n"); // Print the root value
        strings.remove("panther");
        strings.inOrderPrint();

    }
}
