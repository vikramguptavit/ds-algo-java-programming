import java.util.Random;

public class ThreadExample implements Runnable{
    public Integer counter;
    @Override
    public void run() {
        counter = new Random().nextInt();
        Integer count = new Random().nextInt();
        System.out.println("counter : "+counter+" count : "+count);
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread thread1 = new Thread(threadExample);
        Thread thread2 = new Thread(threadExample);
        thread1.start();
        thread2.start();
    }
}
