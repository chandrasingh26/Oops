package Exception;

public class Demo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Hello :)");
    }
}
