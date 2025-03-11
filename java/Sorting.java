import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) array[i] = sc.nextInt();
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        Arrays.sort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
        sc.close();
    }
}