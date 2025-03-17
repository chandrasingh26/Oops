package task6.EmployeeManagement;

public class Employee {
    int id;
    String name;
    private double salary;
    String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
       // System.out.println("Employee Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
    }

//    @Override
//    public String toString() {
//        return "Employee{ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=$" + salary + "}";
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

