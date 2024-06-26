package lab11q5;

public class Lab11q5 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(new MyRunnable("Thread 1", resource));
        Thread thread2 = new Thread(new MyRunnable("Thread 2", resource));

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private final Object lock = new Object();

    public synchronized void doSomethingSyncMethod(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Sync Method - Step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doSomethingSyncBlock(String threadName) {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ": Sync Block - Step " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable implements Runnable {
    private String threadName;
    private SharedResource resource;

    public MyRunnable(String threadName, SharedResource resource) {
        this.threadName = threadName;
        this.resource = resource;
    }

    public void run() {
        // Call synchronized method
        resource.doSomethingSyncMethod(threadName);

        // Call synchronized block
        resource.doSomethingSyncBlock(threadName);
    }
}
