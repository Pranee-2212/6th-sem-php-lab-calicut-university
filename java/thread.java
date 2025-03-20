import java.util.Scanner;

class EvenTask implements Runnable {
    private int limit;

    EvenTask(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddTask implements Runnable {
    private int limit;

    OddTask(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        Thread evenThread = new Thread(new EvenTask(limit));
        Thread oddThread = new Thread(new OddTask(limit));

        evenThread.start();
        oddThread.start();

        sc.close();
    }
}