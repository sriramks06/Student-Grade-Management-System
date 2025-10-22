import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        System.out.print("Enter student name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, rollNo, marks);
        double avg = GradeCalculator.calculateAverage(s.marks);
        char grade = GradeCalculator.calculateGrade(avg);

        System.out.println("\n--- STUDENT REPORT ---");
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Total: " + GradeCalculator.calculateTotal(s.marks));
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
