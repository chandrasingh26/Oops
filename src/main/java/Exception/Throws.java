package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException, FileNotFoundException {
        try {
        FileReader fileReader = new FileReader("input.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File NOT FOUND");
            throw e;     // Forcefully throw an exception
        }
    }
}
