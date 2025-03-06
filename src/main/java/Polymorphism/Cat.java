package Polymorphism;

public class Cat extends Animal{

    @Override
    public void sayHello(){
        System.out.println("Meow");
    }

    public void jump() {
        boolean isDangerous = false;
        System.out.println("Cat can jump lesser");
        System.out.println(isDangerous);
    }


}
