import java.util.Scanner ;

public class sumofcomplex {
     int real ,imag;
     sumofcomplex(int r, int i){
          real=r;
          imag=i;

     }
     sumofcomplex add(sumofcomplex c){
          return new sumofcomplex(real+c.real,imag+c.imag);
     }
     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);

          System.out.println("Enter the real and imaginary part of first complex number: ");
          sumofcomplex c1 = new sumofcomplex(sc.nextInt(), sc.nextInt());

          System.out.println("Enter the real and imaginary part of second complex number: ");
          sumofcomplex c2 = new sumofcomplex(sc.nextInt(), sc.nextInt());

          sumofcomplex result = c1.add(c2);
          System.out.println("The first number : "+c1.real+" + "+c1.imag+"i");  // This line is not compulsory 
          System.out.println("The second number : "+c2.real+" + "+c2.imag+"i");// this line is not compulsory
          System.out.println("Sum is: "+result.real+" + "+result.imag+"i");

          sc.close();
     }
}
