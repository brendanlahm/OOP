import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        int makeCompare = a.name.compareTo(b.name);
        if (makeCompare != 0) return makeCompare;

        return Integer.compare(a.studentID, b.studentID);
    }
}

