
import java.util.Scanner;
class Lucky_number{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int sum;

        System.out.println("Enter two number:");
        int a = sc.nextInt();
        System.out.println("Enter two number:");
        int b = sc.nextInt();

        sum = a+b;

        if (sum==7){
            System.out.println("Lucky Number ");
        }
        else {
            System.out.println("Unlucky number");
        }
    }

}