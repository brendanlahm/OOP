import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Create ArrayList of employees
        ArrayList<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee(1, "Violet", "Contracts", 90000, 2002));
        employeeList.add(new Employee(1, "Warren", "Management", 174000, 2006));
        employeeList.add(new Employee(1, "Xi", "IT", 42000, 2004));
        employeeList.add(new Employee(1, "Yams", "IT", 65000, 20010));
        employeeList.add(new Employee(1, "Zac", "Contracts", 125000, 2009));

        // Counting employees by department using HashMap
        Map<String, Long> count = new HashMap<>();
        for (Employee e : employeeList) {
            String Department = e.getDepartment();
            if (!count.containsKey(Department)) {
                count.put(Department, 1L);
            } else { count.put(Department, count.get(Department) + 1); }
        }
        System.out.println(count);

        // Stream
        Map<String, Long> stream1 = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.counting()));

        // Print the Map
        for (Map.Entry<String, Long> e : stream1.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
