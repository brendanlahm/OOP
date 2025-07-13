import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Swap 2 indices in an array
        SwapArray swapArray = new SwapArray();
        String[] newSeq = swapArray.swapIndices(new String[] {"A","B","C","D","E"}, 0, 3);
        System.out.println(Arrays.toString(newSeq));

        // Instantiate the Linked List
        Node<Integer> head = new Node<>(5);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(6);

        // Implementing the Bubble Sort algorithm
        BubbleSort<Integer> sorter = new BubbleSort<>();
        head = sorter.sort(head); // sort the list
        sorter.printList(head); // print the sorted list

    }

}
