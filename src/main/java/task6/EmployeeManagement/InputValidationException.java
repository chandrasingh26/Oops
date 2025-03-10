package task6.EmployeeManagement;

public class InputValidationException extends Exception {
    public InputValidationException(String message) {
        super(message);    // refer to immediate parent
    }
}
