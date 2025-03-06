package Constructor;

public class Const {
    private String name;
    private int age;

    public Const(int age, String name){
        System.out.println("Const constructor is called");
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

