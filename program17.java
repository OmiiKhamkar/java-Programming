/*Program No. 13: Conditional operator*/
// $$$$ Predict the output
// Rajesh Jain Academy - Enter confidently in the world of I.T. 
import java.util.Scanner;
class P13{
     public static void main(String[] args) {
  int a=10,b=5,c;
  char ch='r';
  c=a>b?a:b; // a 10
  System.out.println(c);
  c=a==b?a:b; // b 5
  System.out.println(c);
  c=a!=b?a+b:a-b; //a+b 15
  System.out.println(c);
  c=a<b?a*b:a/b; // a/b 2
  System.out.println(c);
System.out.println( (ch >= 'a' && ch <= 'z') 
        ? "Lower-case alphabet" 
        : "NOT Lower-case alphabet"
); // Lower-case alphabet
}
}