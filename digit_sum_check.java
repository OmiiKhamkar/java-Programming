
import java.util.Scanner;

public class digit_sum_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num,sum,first,middle,last,main_middle;

        System.out.println("Enter 3- digit number:");
        num = sc.nextInt();

        first = num/100;
        middle = num/10;
        main_middle = middle%10;
        last = num%10;

        sum= first + main_middle + last ;

        if(sum>=15){
            System.out.println("large number");
        }
        else{
            System.out.println("Small number");
        }
        System.out.println("Sum of digits: " + first + " + " + main_middle + " + " + last + " = " + sum);


    }
}
