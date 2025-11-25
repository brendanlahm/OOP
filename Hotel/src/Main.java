import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Havelock", 101, 300));
        list.next = new Node<>(new Hotel("Port Blair", 330, 420));
        list.next.next = new Node<>(new Hotel("Neil", 50, 250));
        list.next.next.next = new Node<>(new Hotel("Samssara", 42, 200));

        // Display the Linked List
        //System.out.println(list);

        // Convert Nodes to Arrays
        Node<Hotel> a = list;
        Node<Hotel> b = list.next;
        Node<Hotel> c = list.next.next;
        Node<Hotel> d = list.next.next.next;

        // Comparator
        HotelComparator comparator = new HotelComparator();
        if (comparator.compare(a, b) == 1) {
            System.out.println("\nHotel A has more rooms than Hotel B");
        } else if (comparator.compare(a, b) == -1) {
                System.out.println("\nHotel B has more rooms than Hotel A");
        } else if (comparator.compare(a, b) == 0) {
                    System.out.println("\nHotel B has same # rooms as Hotel A"); }
        if (comparator.compare(b, c) == 1) {
            System.out.println("\nHotel B has more rooms than Hotel C");
        } else if (comparator.compare(b, c) == -1) {
            System.out.println("\nHotel C has more rooms than Hotel B");
        } else if (comparator.compare(b, c) == 0) {
            System.out.println("\nHotel B has same # rooms as Hotel C"); }

        // Convert to Array List
        List<Node<Hotel>> hotelList = new ArrayList<>();
        hotelList.add(list);
        hotelList.add(list.next);
        hotelList.add(list.next.next);
        hotelList.add(list.next.next.next);

        // Sort the list
        hotelList.sort(new HotelComparator());

        // Loop through & print each Node in the sorted list
        System.out.println("\nSort the list by # Rooms");
        for (Node<Hotel> node : hotelList) {
            System.out.println(node.data);
        }

        // Implement Iterator
        HotelCatalog catalog = new HotelCatalog();
        catalog.add(new Hotel("Port Blair", 330, 420));
        catalog.add(new Hotel("Neil", 50, 250));
        catalog.add(new Hotel("Samssara", 42, 200));
        catalog.add(new Hotel("Havelock", 101, 300));
        System.out.println("\nIterate through Hotel Catalog");
        for (Hotel node : catalog) {
            System.out.println(node);
        }

    }
}
