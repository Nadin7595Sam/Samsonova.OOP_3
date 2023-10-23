import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getFirstName() + " " + student1.getLastName())
                .compareTo(student2.getFirstName() + " " + student2.getLastName());
    }
}