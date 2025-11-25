import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Havelock", 101, 300));
        list.next = new Node<>(new Hotel("Port Blair", 330, 420));
        list.next.next = new Node<>(new Hotel("Neil", 50, 250));
        list.next.next.next = new Node<>(new Hotel("Samssara", 42, 200));

        // Display the Linked List
        System.out.println(list);

        // Convert Nodes to Arrays
        Node<Hotel> a = list;
        Node<Hotel> b = list.next;
        Node<Hotel> c = list.next.next;
        Node<Hotel> d = list.next.next.next;

        // Comparator
        HotelComparator comparator = new HotelComparator();
        if (comparator.compare(a, b) == 1) {
            System.out.println("\nHotel A more expensive than Hotel B");
        } else if (comparator.compare(a, b) == -1) {
                System.out.println("\nHotel B more expensive than Hotel A");
        } else if (comparator.compare(a, b) == 0) {
                    System.out.println("\nHotel B same price as Hotel A"); }

        // Convert to Array List
        List<Node<Hotel>> hotelList = new ArrayList<>();
        hotelList.add(list);
        hotelList.add(list.next);
        hotelList.add(list.next.next);
        hotelList.add(list.next.next.next);

        // Sort the list
        //hotelList.sort(new HotelComparator());

//        // Loop through & print each Node in the sorted list
//        for (Node<Hotel> node : hotelList) {
//            System.out.println(node.data);
//        }

        // Implement Iterator
        HotelCatalog catalog = new HotelCatalog();
        catalog.add(new Hotel("Port Blair", 330, 420));
        catalog.add(new Hotel("Neil", 50, 250));
        catalog.add(new Hotel("Samssara", 42, 200));
        catalog.add(new Hotel("Havelock", 101, 300));
        for (Hotel node : catalog) {
            System.out.println(node);
        }

    }
}
