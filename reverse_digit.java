
import java.util.Scanner;
public class reverse_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,first,last;

        System.out.println("Enter 2-digit number:");
        num=sc.nextInt();

        first = num/10;
        last = num%10;
        
        int middle  = first;
        first = last;
        last = middle;
    
        

        System.out.print(first);
        System.out.println(last);
    




    }
}
