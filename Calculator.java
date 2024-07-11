import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("""
                1. Addition
                2. Subtraction
                3. Division
                4. Multiplication
                0. Exit
                """);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            int a = 0, b = 0;

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter 1st number: ");
                a = sc.nextInt();
                System.out.print("Enter 2nd number: ");
                b = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.println("Answer: " + cal.add(a, b));
                    break;
                case 2:
                    System.out.println("Answer: " + cal.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Answer: " + cal.divide(a, b));
                    break;
                case 4:
                    System.out.println("Answer: " + cal.multiply(a, b));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}
