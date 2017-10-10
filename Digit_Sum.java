import java.util.Scanner;

public class Digit_Sum
{
 public static void main(String args[])
 {
  int n, m, sum=0;
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter a number : ");
  m = sc.nextInt();
  while(m > 0)
  {
   n=m%10;
   sum=sum+n;
   m=m/10;
  }
  System.out.println("Sum of Digits: "+sum);
 }


}
