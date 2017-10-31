class Rectangle
{
 int length;
 int width;
 void insert(int i, int w)
 {
  length=i;
  width=w;
 }
 void calculateArea()
 {
  System.out.println("Area with length " +length+" and width "+width+"= "+length*width);
 }
}
class Rect_main
{
 public static void main(String args[])
 {
  Rectangle r1=new Rectangle(),r2=new Rectangle();
  r1.insert(11,5);
  r2.insert(3,15);
  r1.calculateArea();
  r2.calculateArea();
 }
}