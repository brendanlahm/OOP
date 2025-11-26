import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Linked List ///////////////////////////////////////////
        // Working w/ Nodes to create the Linked List
        Node<Hotel> list = new Node<>(new Hotel("Havelock", 101, 300));
        list.next = new Node<>(new Hotel("Port Blair", 330, 420));
        list.next.next = new Node<>(new Hotel("Neil", 50, 250));
        list.next.next.next = new Node<>(new Hotel("Samssara", 42, 200));

        // Display the Linked List
        System.out.println(list);

        // Comparator ///////////////////////////////////////////
        HotelComparator comparator = new HotelComparator();
        if (comparator.compare(list, list.next) == 1) {
            System.out.println("\nHotel list has more rooms than Hotel list.next");
        } else if (comparator.compare(list, list.next) == -1) {
                System.out.println("\nHotel list.next has more rooms than Hotel list");
        } else if (comparator.compare(list, list.next) == 0) {
                    System.out.println("\nHotel B has same # rooms as Hotel A"); }

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

        // Iterating ///////////////////////////////////////////
        // Implement Iterator w/o the Iterable Interface
        System.out.println("\nIterate through Node list (unsorted)");
        HotelIterator2 iter = new HotelIterator2(list, 100); // maxRooms is dynamic parameter
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

//        // Implement Iterator using the Iterable Interface
//        HotelCatalog catalog = new HotelCatalog(); // HotelCatalog is a Node class w/ an Iterable Interface
//        catalog.add(new Hotel("Port Blair", 330, 420));
//        catalog.add(new Hotel("Neil", 50, 250));
//        catalog.add(new Hotel("Samssara", 42, 200));
//        catalog.add(new Hotel("Havelock", 101, 300));
//        System.out.println("\nIterate through Hotel Catalog");
//        for (Hotel node : catalog) {
//            System.out.println(node);
//        }

    }
}
