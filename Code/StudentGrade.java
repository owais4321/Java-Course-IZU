import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Marks
        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        // Using Nested if-else and else-if ladder
        if (marks >= 0 && marks <= 100) { // Valid marks
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            // Invalid input
            System.out.println("Error: Marks must be between 0 and 100.");
        }

        scanner.close();
    }
}
