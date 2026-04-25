public class Divide_By_zero_exception_handle {
 
    public static void main(String args[])
  {
    int x=10,y=0,z;
    for(y=3;y>=-1;y--)
    {
      try
      {
        // monitor the code for exception
        z=x/y;
        System.out.println("\t\tI am in try block");
      }//try
      catch(ArithmeticException e)  //catch the divide-by-zero exception
      {
        System.out.println(e);
        z=x;
      }//catch
      System.out.println("y="+y+"\t"+"z=" + z);
    }//for
  }//main
}//class