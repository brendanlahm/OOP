// Wrapper class for Hotel

public class QueueElement {

    private Hotel value;
    private QueueElement next;

    // Constructor
    public QueueElement(Hotel value, QueueElement next) {
        this.value = value;
        this.next = next;
    }

    // Getters
    public Hotel getValue() {
        return value;
    }
    public QueueElement getNext() {
        return next;
    }

    // Setters
    public void setValue(Hotel value) { this.value = value; }
    public void setNext(QueueElement value) { this.next = value; }

}
