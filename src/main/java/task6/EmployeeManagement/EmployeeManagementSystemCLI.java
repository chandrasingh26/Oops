package task6.EmployeeManagement;

import java.util.Scanner;

public class EmployeeManagementSystemCLI {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = null;

        while (employee == null) {  // Keep asking until valid input is given
            System.out.print("Please enter employee type (Employee, Manager, or HR): ");
            String type = scanner.nextLine();
            employee = EmployeeType.createEmployee(type);
        }

        // Display details only if a valid employee was created
        // Display employee according to given condition
        // Retrive the inherited class names

        employee.displayDetails(employee.getClass().getSimpleName());
    }
}
