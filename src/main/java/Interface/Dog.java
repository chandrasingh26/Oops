package Interface;

public class Dog implements Animal {
    @Override
    public void sayHello() {
        System.out.println( "Dog is saying hello");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
