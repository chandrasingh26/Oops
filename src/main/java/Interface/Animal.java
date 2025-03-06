package Interface;

public interface Animal {

    public abstract void sayHello();

    void eat();

    public static void info(){
        System.out.println("Animal is an interface");
    }

    default void walk(){
        System.out.println("Animal is walking");
    }
}
