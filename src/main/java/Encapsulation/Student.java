package Encapsulation;

public class Student {
    String name;
    private int age;
    int rollNo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }
}
