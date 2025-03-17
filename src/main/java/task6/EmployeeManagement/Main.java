package task6.EmployeeManagement;

import java.util.Scanner;

import static task6.EmployeeManagement.InputValidationException.*;

public class Main {
    public static void printEmployeeDetails(Employee e) {
        e.displayDetails();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Employee Type:");
            System.out.println("1. Employee");
            System.out.println("2. Manager");
            System.out.println("3. HR");
            System.out.println("4. Exit");
            int choice = getValidIntInput(scanner, "Enter choice (1-4): ");

            if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            int id = getValidIntInput(scanner, "Enter ID: ");
            String name = getValidStringInput(scanner, "Enter name: ");
            double salary = getValidDoubleInput(scanner, "Enter salary: ");
            String department = getValidStringInput(scanner, "Enter department: ");

            if (choice == 1) {
                Employee employee = new Employee(id, name, salary, department);
                System.out.println("Employee Details:");
                printEmployeeDetails(employee);
            } else if (choice == 2) {
                int teamSize = getValidIntInput(scanner, "Enter team size: ");
                Manager manager = new Manager(id, name, salary, department, teamSize);
                System.out.println("Manager Details:");
                printEmployeeDetails(manager);
            } else if (choice == 3) {
                int recruitments = getValidIntInput(scanner, "Enter recruitments handled: ");
                HR hr = new HR(id, name, salary, department, recruitments);
                System.out.println("HR Details:");
                printEmployeeDetails(hr);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
}
