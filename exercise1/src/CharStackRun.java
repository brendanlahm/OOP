package exercise1;

public class CharStackRun {

    //Object-Oriented Method
    public static void main(String[] args) {
        CharStack stack = new CharStackImpl();

        // push some values
        char[] data = {'a', 'b', 'c', 'd'};
        for(char c : data) {
            stack.push(c);
        }

        System.out.println("Stack after pushing: " + stack);

        // Pop an element
        char popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Print stack after pop
        System.out.println("Stack after popping: " + stack);

        // Push again
        stack.push('e');
        System.out.println("Stack after pushing: " + stack);

        // Print stack size
        System.out.println("Stack size: " + stack.size());
    }

}




