package lab11q2;

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

public class Lab11q2 {
    public static void main(String[] args) {
        int numThreads = 5;

        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new Thread(new MyRunnable("Thread " + i));
            thread.start();
        }
    }
}
