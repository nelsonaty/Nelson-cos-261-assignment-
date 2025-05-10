import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    static HashMap<String, Integer> studentGrades = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Update Student Grade");
            System.out.println("3. View All Grades");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    viewGrades();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Use update option.");
        } else {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            studentGrades.put(name, grade);
            System.out.println("Student added successfully.");
        }
    }

    public static void updateStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            System.out.print("Enter new grade: ");
            int grade = scanner.nextInt();
            studentGrades.put(name, grade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void viewGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No records available.");
        } else {
            System.out.println("\nStudent Grades:");
            for (String name : studentGrades.keySet()) {
                System.out.println(name + ": " + studentGrades.get(name));
            }
        }
    }
}
