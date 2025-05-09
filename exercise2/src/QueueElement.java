// This class is a wrapper for the Person class (implementation)

public class QueueElement {

    // Private Fields
    private Person value;
    private QueueElement next;

    // Constructor
    public QueueElement(Person value, QueueElement next) {
        this.value = value;
        this.next = next;
    }

    // Getter
    public Person getValue() {
        return value;
    }

    // Setter
    public void setValue(Person value) {
        this.value = value;
    }

    // Getter
    public QueueElement getNext() {
        return next;
    }

    // Setter
    public void setNext(QueueElement value) {
        this.next = next;
    }

}


