public class Main {
    public static void main(String[] args) {

        // Create the queue
        HotelImpl queue = new HotelImpl();

        // Enqueue Hotels into the catalog
        queue.enqueue(new Hotel("Park Ave", 120, 1100));
        queue.enqueue(new Hotel("College Ave", 10, 50));
        queue.enqueue(new Hotel("University Ave", 40, 75));

        // Display queue
        queue.displayQueue();

        // Create Hotels as Arrays
        Hotel a = queue.get(0);
        Hotel b = queue.get(1);
        Hotel c = queue.get(2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Comparator
        HotelComparator comparator = new HotelComparator();
        if (comparator.compare(a, b) == 1) {
            System.out.println("\nHotel A more expensive than Hotel B");
        } else {
            if (comparator.compare(a, b) == -1) {
                System.out.println("\nHotel B more expensive than Hotel A");
            } else {
                if (comparator.compare(a, b) == 0) {
                    System.out.println("\nHotel B same price as Hotel A");
                }
            }
        }
    }
}
