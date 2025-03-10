package task6.EmployeeManagement;

import java.util.Scanner;

public class HR extends Employee {
    int recruitmentsHandled;

    // Use of super keyword to refer to the immediate parent class
    HR(int id, String name, String department, int salary, int recruitmentsHandled) {
        super(id, name, department, salary);
        this.recruitmentsHandled = recruitmentsHandled;
    }

    // Function overriding (polymorphism)
    @Override
    public void displayDetails(String type) {
        super.displayDetails(type);
        System.out.println("Recruitments Handled: " + recruitmentsHandled);
    }
}
