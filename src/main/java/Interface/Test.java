package Interface;

import Interface.Devices.Smartphone;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sayHello();
//        Animal.info();

        Smartphone smartphone = new Smartphone();
        smartphone.takePicture();
        smartphone.recordVideo();
        smartphone.playMusic();
        smartphone.stopMusic();
        smartphone.call("23467890");
        smartphone.endcall();

    }
}
