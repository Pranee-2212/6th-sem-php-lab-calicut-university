import java.util.Scanner;

public class Armstrong{
     public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the starting Range: ");
          int start=sc.nextInt();
          System.out.println("Enter the ending Range: ");
          int end=sc.nextInt();
          System.out.println("Armstrong number between the range are: ");
          for(int i=start;i<end;i++){
               
               int power=String.valueOf(i).length();
               
               int num=i;
               int sum=0;
               while(num!=0){
                    int reminder=num%10;
                    sum+=Math.pow(reminder,power);
                    num=num/10;
               }
               if (sum==i){
                    System.out.println(i+" ");
                    System.out.println();
               }
               
               sc.close();
          }
     }
}
