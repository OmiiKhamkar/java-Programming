 
class Furniture
{
  int l,w;
  void display()
  {
    System.out.println("Length = " + l + " Width= " + w);
  }
}//class Furniture

class Chair extends Furniture
{
  int wheels;
  void setdataC(int l, int w, int wheels)
  {
    this.l=l;
    this.w=w;
    this.wheels=wheels;
  }
  void display()
  {
    super.display();
    System.out.println("Wheels = " + wheels);
  } 
}//class Chair
public class method_Overriding_Furniture
{
  public static void main(String r[])
  {
    Chair c = new Chair();
    c.setdataC(20,50,3);
    c.display();
}//main
}//P25