
import java.util.Scanner;

 public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total bill :");
        double bill = sc.nextDouble();
       
        if(bill>=5000){
            double dis = bill*20/100;
            System.out.println("Total bill "+(bill-dis));
        }
        else if(bill>=2000&&bill<=4999){
            double dis = bill*10/100;
            System.out.println("Total bill "+(bill-dis));
        }
        else{
            System.out.println("No Discount!");
        }
        
        
    }
}
