
import java.util.Scanner ;
public class Fibonacci{
     public static void main(String[] args){
          
          Scanner sc=new Scanner(System.in);
          
          System.out.println("enter the limit : ");
          int limit=sc.nextInt();

          System.out.println("Fibonacci series upto the limit :");
          
          for (int i=0 ,f=0,s=1;i<=limit;i++){
               if(i<=limit){
                    System.out.print(" " + f);
                    System.out.println();
                   int t=f+s;
                    f=s;
                    s=t;
               }

          }
          System.out.println();
          sc.close();
          }
     }