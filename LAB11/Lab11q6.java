package lab11q6;

public class Lab11q6 {
    public static void main(String[] args) {
        int bufferSize = 5;
        Buffer buffer = new Buffer(bufferSize);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private int[] data;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (size == capacity) {
                wait();
            }

            data[rear] = item;
            rear = (rear + 1) % capacity;
            size++;
            System.out.println("Produced: " + item);
            notify();
        }
    }

    public int consume() throws InterruptedException {
        int item;
        synchronized (this) {
            while (size == 0) {
                wait();
            }

            item = data[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println("Consumed: " + item);
            notify();
        }
        return item;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                int item = buffer.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
