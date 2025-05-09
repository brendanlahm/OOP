public class QueueElementRun {

    //Object-Oriented Method
    public static void main(String[] args) {
        PersonQueueImpl queue = new PersonQueueImpl();

        // Enqueue some people
        queue.enqueue(new Person("Alice"));
        queue.enqueue(new Person("Bob"));

        // Display queue
        System.out.println("Queue: " + queue);
        queue.displayQueue();

    }
}




