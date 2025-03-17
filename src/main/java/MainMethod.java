public class MainMethod {
    public static void main(String[] args) {
        //System.out.printf("%s : %s", args[0],args[1]);
        System.out.println("hi");
        MainMethod mainMethod = new MainMethod();
        mainMethod.main("hello");
        main();
    }

    public void main(String str) {
        System.out.println(str);
    }

    public static void main() {
        System.out.print("In noArg main method");
    }


}
