
import java.util.Scanner;

public class Reverse_Fun {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a Number :");
      int num = sc.nextInt();
      int digit=0;
      reverse(digit,num);
    }
    static void  reverse(int digit , int num){
        while(num>0){
          digit=num%10;
           System.out.print(digit);
          num=num/10;
         
       }
    }
}
