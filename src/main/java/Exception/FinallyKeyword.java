package Exception;

public class FinallyKeyword {
    public static void main(String[] args) {
        int result = divide(1, 0);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return -1;
        } finally {
            System.out.println("Bye!");
        }
    }
}
