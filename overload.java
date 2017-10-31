class overload 
{
 void sum(int a, int b, int c)
 {
  System.out.println("sum = "+(a+b+c));
 }
 void sum(float a, float b)
 {
  System.out.println("sum = "+(a+b));
 }
 public static void main(String[] args)
 {
  overload ol = new overload();
  ol.sum(8,5,9);
  ol.sum(4.6f,3.8f);
 }
}