
import java.util.Scanner;

public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a nuber:");
        int n = sc.nextInt();
        int i = 1;
        int mul = 1;

        while (i<=n) { 
            System.out.println(""+i);
            mul*=i;
            i++;
        }
         System.out.println("Factorial of "+n+" is "+mul);
        
    }
}