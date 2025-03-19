package MultiThreading;

public class NumberCounter extends  Thread{
    @Override
    public void run() {
        int count = 0;
        for(int i=0; i<=50000000; i++) {
            if(i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Nos ending with 7 :" + count);
    }
}
