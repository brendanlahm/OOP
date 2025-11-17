public class Main {
    public static void main(String[] args) {

        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Sea Shell: Samssara", 42, 200));
        list.next = new Node<>(new Hotel("Sea Shell: Havelock", 101, 300));
        list.next.next = new Node<>(new Hotel("Sea Shell: Port Blair", 330, 420));

        // Display the Linked List
        System.out.println(list);

        // Create Hotels as Arrays
        Node<Hotel> a = list;
        Node<Hotel> b = list.next;
        Node<Hotel> c = list.next.next;

        // Comparator
        HotelComparator comparator = new HotelComparator();
        if (comparator.compare(a, b) == 1) {
            System.out.println("\nHotel A more expensive than Hotel B");
        } else if (comparator.compare(a, b) == -1) {
                System.out.println("\nHotel B more expensive than Hotel A");
            } else if (comparator.compare(a, b) == 0) {
                    System.out.println("\nHotel B same price as Hotel A");
                }
    }
}
