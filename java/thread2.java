import java.util.Scanner;
public class thread2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt(); // You can change the limit as needed

        Runnable evenTask = () -> {
            for (int i = 0; i <= limit; i += 2) {
                System.out.println("Even: " + i);
            }
        };

        Runnable oddTask = () -> {
            for (int i = 1; i <= limit; i += 2) {
                System.out.println("Odd: " + i);
            }
        };

        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        evenThread.start();
        oddThread.start();
        sc.close();
    }
}
