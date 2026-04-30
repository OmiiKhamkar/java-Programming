 class MyException extends Exception {

      MyException() { 
     System.out.println("Number is Zero");
    }
      
 }
 class User_Exception{

static void checkoe(int num) throws MyException
{
    if(num==0)
    {
      // throw UserDefinedException
     throw new MyException();
    }
    if(num%2==0)
      System.out.println("Even");
    else 
      System.out.println("Odd");
}
public static void main(String[] args) 
{
  
   try {
    checkoe(14);
  } catch (MyException e ){
    System.out.println(e);
  }
  try {
    checkoe(0);
  } catch (MyException e ){
    System.out.println(e);
  }
  try {
    checkoe(21);
  }catch(MyException e ){
    System.out.println(e);
  }
}//main
}//class 
    
