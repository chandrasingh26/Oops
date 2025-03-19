package MultiThreading;

class Counter  {
    private int count;

    public synchronized void increment() {                 // For thread safety, sync whole method
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class ThreadSync {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("final count : " + counter.getCount());   //without synchronized count will be less than 2000
    }

}
