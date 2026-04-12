
import java.util.Scanner;

class Factors{
  int num;
  void read(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a Number:");
    num=sc.nextInt();
  }
  void  showFactors(){
    System.out.print("The factors are");
    for (int i = 2; i <= num; i++) {
        if(num%i==0){
            System.out.print(" "+i);
        }
    }
  }
}
public class Class_factors {
public static void main(String args[])
{  
  Factors f =new Factors();
  f.read();
  f.showFactors();
}//main
}

