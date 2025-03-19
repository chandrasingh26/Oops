package MultiThreading;

public class withMultiThreading {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        NumberCounter thread1 = new NumberCounter();            // class that extends thread can be called directly

        SumCalculator sumCalculator = new SumCalculator();    // class that implement runnable can be called by making object and then create thread
        Thread thread2 = new Thread(sumCalculator);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time taken : " + (System.currentTimeMillis() - startTime) + " ms");

    }
}
