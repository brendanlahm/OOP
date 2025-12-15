public class Employee {

    // Private Attributes
    private int ID;
    private String name;
    private String department;
    private int salary;
    private int joinYear;

    // Public Constructor
    public Employee(int ID, String name, String department, int salary, int joinYear) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joinYear = joinYear;
    }

    // Getters
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getJoinYear() {
        return joinYear;
    }

    // Method for printing Employee Profile
    @Override
    public String toString() {
        return ID + ". " + name + ", Department: " + department + ", Salary: " + salary + ", Join Year: " + joinYear;
    }

}
