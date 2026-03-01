
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost Price and selling Price:");
        int cost_price = sc.nextInt();
        int selling_price = sc.nextInt();

        int profit = selling_price - cost_price;
        int loss = cost_price - selling_price;

        if(cost_price>selling_price){
            System.out.println("There is loss of Rs."+loss);
        }
        else{
            System.out.println("There is profit of Rs."+profit);
        }

    }
}