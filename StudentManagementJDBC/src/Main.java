import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();

                    Student newStudent = new Student(name, email, age, course, dept);
                    dao.addStudent(newStudent);
                    break;

                case 2:
                    List<Student> list = dao.getAllStudents();
                    System.out.println("\n--- Student List ---");
                    for (Student st : list) {
                        System.out.println(st);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID of student to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("\nWhich field do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Email");
                    System.out.println("3. Age");
                    System.out.println("4. Course");
                    System.out.println("5. Department");
                    System.out.print("Enter choice: ");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    switch (updateChoice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();
                            dao.updateStudentField(updateId, "name", newName);
                            break;
                        case 2:
                            System.out.print("Enter new email: ");
                            String newEmail = sc.nextLine();
                            dao.updateStudentField(updateId, "email", newEmail);
                            break;
                        case 3:
                            System.out.print("Enter new age: ");
                            int newAge = sc.nextInt();
                            dao.updateStudentField(updateId, "age", newAge);
                            break;
                        case 4:
                            System.out.print("Enter new course: ");
                            String newCourse = sc.nextLine();
                            dao.updateStudentField(updateId, "course", newCourse);
                            break;
                        case 5:
                            System.out.print("Enter new department: ");
                            String newDept = sc.nextLine();
                            dao.updateStudentField(updateId, "department", newDept);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;


                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
