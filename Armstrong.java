import java.util.Scanner;

public class Armstrong
{ 
 public static void main(String[] Args)
 {
  System.out.println("Please enter the number:");
  Scanner arm = new Scanner(System.in);
  int c=0,a,temp; 
  int n=arm.nextInt(); 
  temp=n;
  
  while(n>0)
  {
   a=n%10; 
   n=n/10; 
   c=c+(a*a*a);
  }
  
  if(temp==c)
  {
   System.out.println("armstrong number");
  }
  else
  {
   System.out.println("Not armstrong number"); 
  } 
 }
}
