import java.util.Scanner;

public class Power
{ 
 public static void main(String args[])
 {
  long n,p,r=1;
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter a number : ");
  n=sc.nextLong();
  System.out.println(" Enter a power : ");
  p=sc.nextLong();
  if(n>=0 && p==0)
  {
   r=1;
  }
  else if(n==0 && p==0)
  {
   r=0;
  }
  else
  {
   for(int i=1;i<=p;i++)
   {
    r=r*n;
   }
  }
  System.out.println(n+"^"+p+"="+r);
 }
}
