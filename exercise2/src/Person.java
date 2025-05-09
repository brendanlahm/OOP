import java.lang.String;

public class Person {

    // Private fields
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Display method
    @Override
    public String toString() {
        return name;
    }

}
