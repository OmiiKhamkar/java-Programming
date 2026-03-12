
import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int reverse = 0;

        while(num != 0){
            int lastDigit = num % 10;     
            reverse = reverse * 10 + lastDigit; 
            num = num / 10;
            
            
        }
        sum = sum+reverse;
        System.out.println(reverse+"\n"+sum);
    }
}