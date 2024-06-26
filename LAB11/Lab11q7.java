package lab11q7;

public class Lab11q7 {
    public static void main(String[] args) {
        Thread table5Thread = new Thread(new MultiplicationTableGenerator(5));
        Thread table7Thread = new Thread(new MultiplicationTableGenerator(7));
        Thread table13Thread = new Thread(new MultiplicationTableGenerator(13));

        table5Thread.start();
        table7Thread.start();
        table13Thread.start();
    }
}

class MultiplicationTableGenerator implements Runnable {
    private int number;

    public MultiplicationTableGenerator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
