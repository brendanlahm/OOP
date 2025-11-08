public class HotelImpl {

    public QueueElement front;
    public QueueElement rear;

    // Constructor
    public HotelImpl() {
        this.front = front;
        this.rear = rear;
    }

    // Method for adding a Hotel to the list
    public void enqueue(Hotel hotel) {
        QueueElement newElement = new QueueElement(hotel, null);

        if (rear == null) {
            front = newElement;
            rear = newElement;
        } else {
            rear.setNext(newElement);
            rear = newElement;
        }
    }

    // Method for displaying queue
    public void displayQueue() {
        QueueElement current = front;
        System.out.println("Queue:");
        while (current != null) {
            System.out.println("- " + current.getValue());
            current = current.getNext();
        }
    }
}











