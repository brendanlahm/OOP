// This class is a wrapper for the Person class

public class QueueElement {

    // Private Fields
    private Person value;
    private QueueElement next;

    // Constructor
    public QueueElement(Person value, QueueElement next) {
        this.value = value;
        this.next = next;
    }

    // Getters
    public Person getValue() {
        return value;
    }
    public QueueElement getNext() {
        return next;
    }

    // Setters
    public void setValue(Person value) {
        this.value = value;
    }
    public void setNext(QueueElement value) {
        this.next = value;
    }

}


