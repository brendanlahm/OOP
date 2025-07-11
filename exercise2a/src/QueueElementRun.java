public class QueueElementRun {

    //Object-Oriented Method
    public static void main(String[] args) {

        // Creating the queue
        PersonQueueImpl queue = new PersonQueueImpl();

        // Testing IllegalStateException
        // queue.dequeue();

        // Enqueue some people
        queue.enqueue(new Person("Alice"));
        queue.enqueue(new Person("Bob"));
        queue.enqueue(new Person("Carl"));
        queue.enqueue(new Person("Dan"));

        // Display queue
        queue.displayQueue();

        // Dequeue a person
        queue.dequeue();
        queue.displayQueue();

    }
}




