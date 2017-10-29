import java.util.Scanner;


public class Harmonic
{
 public static void main(String args[])
 {
  
  int n, i=1;
  double sum=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number for length of series : ");
  n = sc.nextInt();

  while(i <= n)
  {
   System.out.print(" 1/"+i+" +");
   sum=sum+(double)1/i;
   i++;
  }
 System.out.print("\nSum = "+sum);
 }
}
 
