package Inheritance;

public class Animals {
    int age;
    String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat(){
        System.out.println("Animals eat");
        this.breed = "German Shepherd";
        System.out.println(this.breed);
    }
}
