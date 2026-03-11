import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;      // get last digit
            reverse = reverse * 10 + lastDigit; // build reversed number
            num = num / 10;                // remove last digit
        }
        System.out.println(reverse);

       if(reverse == temp){
         System.out.println("Palindrome Number");
       }
       else{
        System.out.println("Not a Palindrome");
       }

        
    }
}