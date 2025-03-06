package Polymorphism;

public class Tiger extends Animal {

    private int age;
    private String name;

    @Override
    public void sayHello(){
        System.out.println("roar");
    }

    public void jump() {
        System.out.println("tiger can jump high");
    }
}
