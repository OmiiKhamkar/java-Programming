
import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a nuber:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i<=n) { 
            System.out.println(""+i);
            i++;
            sum=sum+i-1;
           
        }
         System.out.println("Sum of "+n+" is "+sum);
        
    }
}
