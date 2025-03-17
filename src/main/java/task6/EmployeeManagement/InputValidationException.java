package task6.EmployeeManagement;

import java.util.Scanner;

public class InputValidationException {
    public static int getValidIntInput(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    scanner.nextLine();     // add newline
                    return value;
                } else {
                    System.out.println("Error: Value must be positive.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next();        // discard invalid input
            }
        }
    }

    public static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= 0) {
                    scanner.nextLine();     // add newline
                    return value;
                } else {
                    System.out.println("Error: Salary cannot be negative.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.next();         // discard invalid input
            }
        }
    }

    public static String getValidStringInput(Scanner scanner, String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine().trim();
            if (value.matches("[a-zA-Z ]+")) {
                return value;
            } else {
                System.out.println("Error: Invalid input. Please enter a valid string (letters only).");
            }
        }
    }
}
