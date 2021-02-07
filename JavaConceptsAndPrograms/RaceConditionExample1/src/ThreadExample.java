public class ThreadExample extends Thread {
    public Counter counter;

    public ThreadExample(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        this.counter.doCount();
    }

    public static void main(String args[]) {
        Counter theCounter = new Counter();
        /**
         * Creating 2 threads and these threads' 'counter' field
         * will  refer  to  the  same  'Counter'  object  in the
         * heap(shared resource)
         */
        ThreadExample thread1 = new ThreadExample(theCounter);
        ThreadExample thread2 = new ThreadExample(theCounter);
        thread1.start();
        thread2.start();

    }
}

class Counter {
    public void doCount() {
        synchronized (this      ){
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}