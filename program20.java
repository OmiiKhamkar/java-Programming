
import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number between 1 to 7:");
        int num=sc.nextInt();
        int day;

        if(num>7 || num<1){
            System.out.println("Wrong input");
        }
        else if(num==1){
            System.out.println("Monday");
        }
         else if(num==2){
            System.out.println("Tuesday");
        }
         else if(num==3){
            System.out.println("Wensday");
        }
         else if(num==4){
            System.out.println("Thusday");
        }
         else if(num==5){
            System.out.println("Friday");
        }
         else if(num==6){
            System.out.println("Saturday");
        }
         else {
            System.out.println("Sunday");
        }

    }
}
