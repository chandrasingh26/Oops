package Inheritance;

public class Dog extends Animals{

    public void run(){
        System.out.println("Dog run");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.run();
        myDog.setBreed("Golden Retriever");
        System.out.println(myDog.getBreed());
    }
}