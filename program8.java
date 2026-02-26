
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int num , first , last;

        System.out.println("Enter a 4-digit number:");
        num = sc.nextInt();

        first = num/1000;
        last = num%10;

        System.out.println("First digit is "+first);
        System.out.println("Last digit is "+last);



    }
}
