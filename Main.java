public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        group.addStudent(new Student(101, "Бурак", "Озчивит"));
        group.addStudent(new Student(102, "Эльчин", "Сангу"));
        group.addStudent(new Student(103, "Серкан", "Болат"));

        Controller.sortStudentsById(group);

        System.out.println("\nСтуденты, отсортированные по ID:");
        for (Student student : group) {
            System.out.println(student);
        }

        Controller.sortStudentsByName(group);

        System.out.println("\nСтуденты, отсортированные по имени и фамилии:");
        for (Student student : group) {
            System.out.println(student);
        }
    }
}