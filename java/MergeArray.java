import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) array1[i] = sc.nextInt();
        
        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) array2[i] = sc.nextInt();
        
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);
        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
        sc.close();
    }
}