package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal tiger = new Tiger();     // taking reference of Animal class
        tiger.sayHello();               // can only call methods defined in Animal class

        Cat cat = new Cat();
        cat.sayHello();
        cat.jump();
    }
}
