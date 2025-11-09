public class Main {
    public static void main(String[] args) {

        // Create the queue
        HotelImpl queue = new HotelImpl();

        // Enqueue Hotels into the catalog
        queue.enqueue(new Hotel("Park Ave", 120, 1100));
        queue.enqueue(new Hotel("College Ave", 10, 50));

        // Display queue
        queue.displayQueue();

    }

}
