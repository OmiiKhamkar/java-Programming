
public class Divide_By_zero_exception {
    public static void main(String args[]) 
{
  int x=10, y=5,z=5;
  try
  {
    System.out.println("Hello");
    x=x/(z-y);
    System.out.println("Bye bye");
  }
  catch(ArithmeticException e)
  {
    System.out.println("Divide by zero Error...");
    System.out.println(e);
    System.out.println(e.getMessage());
  }
  System.out.println("x is"+x);
}//main
}//class P1