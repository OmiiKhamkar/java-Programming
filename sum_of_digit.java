
import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int digit;
        int sum = 0;
        
        while (n>0) { 
            digit = n%10;
            System.out.print(digit+"...");
            sum = sum+digit;
            n = n/10;
        }
        System.out.println("\nSum is "+sum);
    }
}
