package Enum;

public enum Day {

    SUNDAY("raviwaar"),
    MONDAY("somwaar"),
    TUESDAY("mangalwaar"),
    WEDNESDAY("budhwaar"),
    THURSDAY("brahaspatiwaar"),
    FRIDAY("sukrawaar"),
    SATURDAY("saniwaar");

    private Day(String hindi) {
        System.out.println("Constuctor called: ");
    }

    private String hindi;

    public void getHindi() {
        System.out.println(this.name());
    }
}
