import java.util.Collections;

public class Controller {
    public static void sortStudentsById(StudentGroup group) {
        Collections.sort(group.students);
    }

    public static void sortStudentsByName(StudentGroup group) {
        Collections.sort(group.students, new StudentComparator());
    }
}