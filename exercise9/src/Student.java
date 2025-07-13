public class Student {

    // Public attributes
    String name;
    int studentID;

    // Constructor
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return String.valueOf(studentID);
    }

    // Method for printing student info
    @Override
    public String toString() {
        return name + ", " + studentID + "\n";
    }

}
