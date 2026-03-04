
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the amount to be withdrawn");
      int  amt=sc.nextInt();// 2890

       System.out.print("Rs. 100 notes => ");
       int r100 = sc.nextInt();
       System.out.print("Rs. 50 notes => ");
       int r50 = sc.nextInt();
       System.out.print("Rs. 10 notes => ");
       int r10 = sc.nextInt();
    }
}