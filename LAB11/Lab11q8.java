package lab11q8;

public class Lab11q8 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread2");

        System.out.println("Initial thread names:");
        displayThreadNames(thread1, thread2);

        // Change the names of the threads
        thread1.setName("NewThread1");
        thread2.setName("NewThread2");

        System.out.println("\nUpdated thread names:");
        displayThreadNames(thread1, thread2);

        thread1.start();
        thread2.start();
    }

    public static void displayThreadNames(Thread thread1, Thread thread2) {
        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 name: " + thread2.getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

