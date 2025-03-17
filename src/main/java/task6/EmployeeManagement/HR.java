package task6.EmployeeManagement;


public class HR extends Employee {
    private int recruitmentsHandled;

    public HR(int id, String name, double salary, String department, int recruitmentsHandled) {
        super(id, name, salary, department);
        this.recruitmentsHandled = recruitmentsHandled;
    }

    // Run-time Polymorphism

    @Override
    public void displayDetails() {
//        super.displayDetails();
        System.out.println("Recruitments Handled: " + this.recruitmentsHandled);
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", Recruitments Handled=" + recruitmentsHandled + "}";
//    }
}

