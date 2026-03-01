
import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong");
        }
    }
}
