import java.util.Scanner;

public class Fibonacci
{ 
 public static void main(String args[])
 {
  int i=1,n=10,t1=0,t2=1;
  System.out.println("Please enter the limit: ");
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  System.out.print("First " +n+ " fibonacci numbers are: ");
  
  do
  {
   System.out.print(t1+" ");
   int sum = t1 + t2;
   t1 = t2;
   t2 = sum;
   i++;
  }
  while(i<=n);
 }
}
