import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number between 1 to 12");
        int month = sc.nextInt();

        if(month>12 || month<1){
            System.out.println("Sorry...Wrong Inpute");
        }
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
               System.out.println("Days are 31");
         }
         else if(month==2){
            System.out.println("Days are 28");
         }
         else{
            System.out.println("Days are 30");
         }

    }
}