package lab11q1;

import java.util.Scanner;

class MyRunnable implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from Runnable Thread (" + i + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from Thread (" + i + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab11q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Thread Creation Menu:");
            System.out.println("1. Create Thread using Runnable interface");
            System.out.println("2. Create Thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Runnable runnable = new MyRunnable();
                    Thread thread1 = new Thread(runnable);
                    thread1.start();
                    break;
                case 2:
                    Thread thread2 = new MyThread();
                    thread2.start();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
