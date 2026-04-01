
import java.util.Scanner;

public class Palindrome_Fun {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a Number :");
      int num = sc.nextInt();
      if(isPalindrome(num)){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not Palindrome");
      }
    }
   static boolean  isPalindrome(int num){
    int rev = 0;
    int temp = num;
    while(num > 0){
        int digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }
    if(rev==temp){
        return true;
    }
    return false;
}
    }

