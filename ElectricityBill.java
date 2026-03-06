import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your units: ");
        int units = sc.nextInt();

        int totalBill = 0;

        if (units <= 100) {
            totalBill = units * 5;
        }
        else if (units <= 200) {
            totalBill = (100 * 5) + ((units - 100) * 7);
        }
        else {
            totalBill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total bill is: " + totalBill);

        sc.close();
    }
}