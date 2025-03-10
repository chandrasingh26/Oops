package task6.EmployeeManagement;


public class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    // Run-time Polymorphism

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + this.teamSize);
    }

    @Override
    public String toString() {
        return super.toString() + ", Team Size=" + teamSize + "}";
    }
}

