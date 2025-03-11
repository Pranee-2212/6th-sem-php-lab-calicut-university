import java.util.Scanner;

public class SumandRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, reverse = 0, temp = num;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse of number: " + reverse);
        sc.close();
    }
}