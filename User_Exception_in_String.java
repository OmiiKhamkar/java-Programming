
class TooSmallStringException extends Exception
{
    public TooSmallStringException() {
      System.out.println("Too Small String");
    }
    
}
class TooBigStringException extends Exception
{
    public TooBigStringException() {
      System.out.println("Too Big String");
    }
 
}
public class User_Exception_in_String {

  static String convert(String s)
  throws TooSmallStringException,TooBigStringException {
    if(s.length()>12){
     throw new TooBigStringException();
      //return TooBigStringException();
    }  
    else if(s.length()<6){
      throw new TooSmallStringException();
    }
    else{
        return s.toUpperCase();
    }
  }
  public static void main(String args[])
{
  String text;
  try
  {
    text=User_Exception_in_String.convert("Hello");
    System.out.println(text);
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
  try
  {
    text=User_Exception_in_String.convert("Welcome Guys");
    System.out.println(text);
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
  try
  {
    text=User_Exception_in_String.convert("I am proud to be an Indian");
    System.out.println(text);
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
}//main
}//class
