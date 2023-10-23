public class Student implements Comparable<Student> {
    private int studentId;
    private String firstName;
    private String lastName;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentId, otherStudent.studentId);
    }

    @Override
    public String toString() {
        return "ID студента: " + studentId + ", Имя: " + firstName + " " + lastName;
    }
}