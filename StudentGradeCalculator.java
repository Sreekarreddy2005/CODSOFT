import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after nextInt()

        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        System.out.println("Enter subject names and marks:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " name: ");
            subjectNames[i] = scanner.nextLine();

            System.out.print("Marks:" + subjectNames[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
            scanner.nextLine(); // Consume the newline after nextInt()
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nSubject Names:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i]);
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}