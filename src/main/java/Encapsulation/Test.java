package Encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Harsh";
        student.rollNo = 21;
        student.setAge(-1);

        System.out.println(student.getAge());

    }
}
