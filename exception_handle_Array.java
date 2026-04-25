import java.lang.ArrayIndexOutOfBoundsException;
public class exception_handle_Array {
    public static void main(String[] args) {

     int i=0;
    int a[]={10,20,30,40,50};
    System.out.println("The array contains following elements");
    // This program terminates throwing ArrayIndexOutOfBoundsException
    // Use try-catch block and get out of infinite-loop when exception occurs
    try{
     while(true)
    {
        System.out.println(a[i]);
        i++;
    }//while
    }
    catch(ArrayIndexOutOfBoundsException e){
        
        System.out.println("Over...");
    }
    
  }//main
}//class 
