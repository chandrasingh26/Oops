package task6.EmployeeManagement;

import java.util.Scanner;

public class Main {
    public static void printEmployeeDetails(Employee e) {
        e.displayDetails();
        System.out.println(e.toString());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            // Employee Type selection
            System.out.println("Select Employee Type:");
            System.out.println("1. Employee");
            System.out.println("2. Manager");
            System.out.println("3. HR");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                throw new InputValidationException("Invalid choice! Please enter a number between 1 and 3.");
            }
            if(choice == 3){
                System.out.println("Sorry, HR is not yet implemented.");
                return;
            }

            if(choice == 2){
                System.out.println("Sorry, Manager is not yet implemented.");
                return;
            }


            System.out.print("Enter employee ID: ");
            int empId = scanner.nextInt();
            if (empId <= 0) {
                throw new InputValidationException("Employee ID must be positive.");
            }

            // For Reading next input

            scanner.nextLine();
            System.out.print("Enter employee name: ");
            String empName = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double empSalary = scanner.nextDouble();
            if (empSalary < 0) {
                throw new InputValidationException("Salary cannot be negative.");
            }
            scanner.nextLine();
            System.out.print("Enter employee department: ");
            String empDepartment = scanner.nextLine();

            // Employee object instantiated

            Employee employee = new Employee(empId, empName, empSalary, empDepartment);
            printEmployeeDetails(employee);

            System.out.print("Enter manager ID: ");
            int manId = scanner.nextInt();
            if (manId <= 0) {
                throw new InputValidationException("Manager ID must be positive.");
            }
            scanner.nextLine();
            System.out.print("Enter manager name: ");
            String manName = scanner.nextLine();
            System.out.print("Enter manager salary: ");
            double manSalary = scanner.nextDouble();
            if (manSalary < 0) {
                throw new InputValidationException("Salary cannot be negative.");
            }
            scanner.nextLine();
            System.out.print("Enter manager department: ");
            String manDepartment = scanner.nextLine();
            System.out.print("Enter team size: ");
            int teamSize = scanner.nextInt();
            if (teamSize < 0) {
                throw new InputValidationException("Team size must be positive or zero.");
            }
            scanner.nextLine();


            //Manager object instantiated

            Manager manager = new Manager(manId, manName, manSalary, manDepartment, teamSize);
            printEmployeeDetails(manager);

            System.out.print("Enter HR ID: ");
            int hrId = scanner.nextInt();
            if (hrId <= 0) {
                throw new InputValidationException("HR ID must be positive.");
            }
            scanner.nextLine();
            System.out.print("Enter HR name: ");
            String hrName = scanner.nextLine();
            System.out.print("Enter HR salary: ");
            double hrSalary = scanner.nextDouble();
            if (hrSalary < 0) {
                throw new InputValidationException("Salary cannot be negative.");
            }
            scanner.nextLine();
            System.out.print("Enter HR department: ");
            String hrDepartment = scanner.nextLine();
            System.out.print("Enter recruitments handled: ");
            int recruitments = scanner.nextInt();
            if (recruitments < 0) {
                throw new InputValidationException("Recruitments handled must be positive or zero.");
            }
            scanner.nextLine();

            // HR object instantiated

            HR hr = new HR(hrId, hrName, hrSalary, hrDepartment, recruitments);
            printEmployeeDetails(hr);

        } catch (InputValidationException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Invalid input type. Please enter the correct data type.");
            scanner.nextLine();
        } finally {
            System.out.println("Program ends.");
            scanner.close();     // prevents resource leaks
        }
    }
}
