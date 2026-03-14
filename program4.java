
import java.util.Scanner;

public class program4 {
    static public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float amt ;
        System.out.println("Enter the purchase amount:");
        amt = sc.nextFloat();

        float discount = amt*7/100;

        if(amt>=5000){
            System.out.println("Discount is "+(discount+500));
        }
        else if(amt>=1000){
            System.out.println("Discount is "+(discount+300));
        }
        else{
            System.out.println("Discount is "+(discount));
        }

    }
}
