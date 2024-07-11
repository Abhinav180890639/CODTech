import java.util.Scanner;
import java.util.ArrayList;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Grade Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        for (int i = 0; i < numSubjects; i++) {
            double grade;
            while (true) {
                System.out.print("Enter grade for subject " + (i + 1) + ": ");
                grade = scanner.nextDouble();
                if (isValidGrade(grade)) {
                    break;
                } else {
                    System.out.println("Invalid grade. Please enter a non-negative grade.");
                }
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            double average = calculateAverage(grades);
            String letterGrade = getLetterGrade(average);
            double gpa = getGPA(average);

            System.out.println("\nGrade Report:");
            System.out.printf("Average Grade: %.2f%n", average);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.printf("GPA: %.1f%n", gpa);
        }

        scanner.close();
    }

    private static boolean isValidGrade(double grade) {
        return grade >= 0;
    }

    private static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    private static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    private static double getGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}