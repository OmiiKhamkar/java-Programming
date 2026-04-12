import java.util.Scanner;
class Calculation{
  int a , b , c;
  void read(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter two Numbers:");
    a = sc.nextInt();
    b = sc.nextInt();
  }
  int add(){
    return a + b;
  }
  int mult (){
    return a*b;
  }
  void display(){
    System.out.println("Addition is "+add()+" and Multiplication is "+mult());
  }
}
public class Class_Calculation
{  
public static void main(String args[])
{  
  Calculation c=new Calculation();
  c.read();
  c.add();
  c.mult();
  c.display();
}//main
}