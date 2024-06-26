package lab11q3;

public class Lab11q3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();

        System.out.println("Is Thread 1 alive? " + thread1.isAlive());

        try {

            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Is Thread 1 alive? " + thread1.isAlive());


        System.out.println("Is Thread 2 alive? " + thread2.isAlive());
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
