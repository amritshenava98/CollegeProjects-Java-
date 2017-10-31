public class SimpleInterestExample{
 public static void main(String args[])
 {
  double p,t,r,result;

  p=Double.parseDouble(args[0]);
  t=Double.parseDouble(args[1]);
  r=Double.parseDouble(args[2]);

  result = (p*t*r)/100;
  System.out.println("simple interest : "+result);

 }
}