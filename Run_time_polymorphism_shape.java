abstract class Shape
{
  abstract float calarea();
}//class Shape
//--------------------------------------------------------------------
 class Circle extends Shape
{
  float radius,areaofcircle;
  Circle(float radius)
 {
   this.radius = radius;  
 }

 float calarea() {
     areaofcircle=radius*radius*3.14f;
     return areaofcircle;
    }

}//class Circle
//--------------------------------------------------------------------
 class Rectangle extends Shape
{
float height, width, areaofrectangle;
Rectangle(float height, float width)
{
  this.height=height;
  this.width=width;
}
float calarea(){
 areaofrectangle = height*width;
 return areaofrectangle;
}

}//class Rectangle
//--------------------------------------------------------------------
public class Run_time_polymorphism_shape
{
public static void main(String r[])
{
  Shape sh;   // reference of base class
  sh=new Circle(15.5f);
  System.out.println("Area of Circle = " + sh.calarea());
  sh=new Rectangle(5.5f,5f);
  System.out.println("Area of Rectangle = " + sh.calarea());
}//main
}