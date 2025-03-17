package Enum;

public class Test1 {

    public static void main(String[] args) {
        Day day = Day.SATURDAY;

        day.getHindi();

        switch (day) {
            case MONDAY ->
                System.out.println("M");

            case TUESDAY ->
                System.out.println("T");

            default -> System.out.println("Rest Day!");
        }
    }
}
