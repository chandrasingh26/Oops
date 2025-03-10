package task6.EmployeeManagement;

import java.util.Scanner;

public class InputHandler {

    static Scanner sc = new Scanner(System.in);

    public static int getInt(String message) {
        int value;
        while (true) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();  // Consume newline

                if (value >= 0) {
                    return value;  // Valid input, return the value
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (Exception e) {
                sc.nextLine();  // Clear invalid input
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }

    public static String getString(String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = sc.nextLine().trim();   // Trim to remove extra spaces

            if (!input.isEmpty()) {
                return input;   // Return valid input
            } else {
                System.out.println("Input cannot be empty! Please enter a value.");
            }
        }
    }

}
