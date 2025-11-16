import java.util.ArrayList;

public class HotelImpl {

    public QueueElement front;
    public QueueElement rear;
    public int size;

    // Constructor
    public HotelImpl() {
        this.front = front;
        this.rear = rear;
        this.size = 0;
    }

    // Method for returning index of item being added to the queue
    public Hotel get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        QueueElement current = front;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
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

        size++;
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











