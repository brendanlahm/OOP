public class Main {
    public static void main(String[] args) {

        // Create the queue
        HotelImpl queue = new HotelImpl();

        // Enqueue Hotels into the catalog
        queue.enqueue(new Hotel("Park Ave", 14, 3000000));
        queue.enqueue(new Hotel("College Ave", 2, 400000));

        // Display queue
        queue.displayQueue();

    }

}
