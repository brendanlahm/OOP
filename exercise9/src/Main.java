import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Swap 2 indices in an array
        SwapArray swapArray = new SwapArray();
        String[] newSeq = swapArray.swapIndices(new String[] {"A","B","C","D","E"}, 0, 3);
        System.out.println(Arrays.toString(newSeq));

        // Instantiate the Linked List
        Node<Student> stud = new Node<>(new Student("Harry Potter", 6485267));
        stud.next = new Node<>(new Student("Ron Weasley", 6485249));
        stud.next.next = new Node<>(new Student("Hermione Granger", 6485286));
        stud.next.next.next = new Node<>(new Student("Draco Malfoy", 6485221));
        stud.next.next.next.next = new Node<>(new Student("Harry Potter", 2156591));

        // Implementing the Bubble Sort algorithm on Student class
        BubbleSort<Student> sorter2 = new BubbleSort<>(new StudentComparator());
        stud = sorter2.sort(stud);
        sorter2.printList(stud);

    }

}
