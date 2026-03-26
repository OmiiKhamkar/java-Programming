
import java.util.Scanner;

public class Even_or_Odd_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(check(num)){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number ");
        }
    }
    static boolean check(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
}
