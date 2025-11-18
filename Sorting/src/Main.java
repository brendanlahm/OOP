public class Main {
    public static void main(String[] args) {

        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Havelock", 101, 300));
        list.next = new Node<>(new Hotel("Port Blair", 330, 420));
        list.next.next = new Node<>(new Hotel("Neil", 50, 250));
        list.next.next.next = new Node<>(new Hotel("Samssara", 42, 200));

        // Display the Linked List
        System.out.println(list);

        // Instantiate BubbleSort
        BubbleSort<Hotel> bubSort = new BubbleSort(new HotelComparator());
        Node<Hotel> list1 = bubSort.sort(list);
        bubSort.printList(list1);

    }
}
