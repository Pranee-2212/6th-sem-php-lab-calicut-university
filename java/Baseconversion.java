import java.util.Scanner;

public class Baseconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
        
        sc.close();
    }
}