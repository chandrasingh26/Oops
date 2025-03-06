package Interface.Devices;

public class Smartphone implements Camera, MusicPlayer, Phone {

    @Override
    public void takePicture() {
        System.out.println("Taking picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void endcall() {
        System.out.println("End Call");
    }
}
