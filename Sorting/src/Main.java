import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Havelock", 99, 300));
        list.next = new Node<>(new Hotel("Port Blair", 330, 420));
        list.next.next = new Node<>(new Hotel("Neil", 50, 250));
        list.next.next.next = new Node<>(new Hotel("Samssara", 42, 200));

        // Display the Linked List
        //System.out.println(list);

        // Instantiate BubbleSort
        BubbleSort<Hotel> bubSort = new BubbleSort(new HotelComparator());
        Node<Hotel> list1 = bubSort.sort(list);
        System.out.println("\nSort the list by Price");
        //bubSort.printList(list1);

        // Create List of Hotels
        ArrayList<Hotel> catalog = new ArrayList<>();
        catalog.add(new Hotel("Samssara", 42, 200));
        catalog.add(new Hotel("Neil", 50, 250));
        catalog.add(new Hotel("Havelock", 99, 300));
        catalog.add(new Hotel("Port Blair", 330, 420));

        // Implement Iterator
        HotelIterator iter = new HotelIterator(catalog, 100);
        System.out.println("\nIterate through Hotel Catalog");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Array Sorting
        String[] array = {"Metallic", "Silver", "Gold", "Bronze"};
        System.out.println(Arrays.toString(array));
        Sorting sorting = new Sorting();
        sorting.swap(array, 1, 3);

    }
}
