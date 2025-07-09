public class PersonQueueImpl {

    // Front and rear pointers
    private QueueElement front;
    private QueueElement rear;

    // Constructor: initializes an empty queue
    public PersonQueueImpl() {
        front = null;
        rear = null;
    }

    // Method for adding a person
    public void enqueue(Person person) {
        QueueElement newElement = new QueueElement(person, null);
        front = rear = newElement;
    }

    // Method for removing the person from the front of the queue
    public Person dequeue() {

        Person person = front.getValue();
        front = front.getNext();

        // If the front is null, the rear is null
        if (front == null) {
            rear = null;
        }

        return person;
    }

    // Method for displaying queue
    public void displayQueue() {
        QueueElement current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }

}
