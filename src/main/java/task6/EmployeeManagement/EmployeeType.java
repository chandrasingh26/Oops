package task6.EmployeeManagement;

public class EmployeeType {
    public static Employee createEmployee(String type) {
        int id = InputHandler.getInt("Enter ID: ");
        String name = InputHandler.getString("Enter Name: ");
        String department = InputHandler.getString("Enter Department: ");
        int salary = InputHandler.getInt("Enter Salary: ");

        switch (type) {
            case "Employee":
                return new Employee(id, name, department, salary);
            case "Manager":
                int teamSize = InputHandler.getInt("Enter Team Size: ");
                return new Manager(id, name, department, salary, teamSize);
            case "HR":
                int recruitmentsHandled = InputHandler.getInt("Enter Recruitments Handled: ");
                return new HR(id, name, department, salary, recruitmentsHandled);
            default:
                System.out.println("Invalid employee type! Please enter 'Employee', 'Manager', or 'HR'.");
                return null;  // Ensures that the program does not proceed with an invalid object
        }
    }
}
