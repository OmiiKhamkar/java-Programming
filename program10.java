import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4-digit number:");
        int num = sc.nextInt(); //1234

        int d4 = num%10; // 4
        num/=10; // 123
        int d3 = num%10; // 3
        num/=10; // 12
        int d2 = num%10; // 2
        int d1 = num/10; // 1

         System.out.println("Forth digit is:"+d4);
        System.out.println("Third digit is:"+d3);
        System.out.println("Second digit is:"+d2);
        System.out.println("First digit is:"+d1);

        System.out.println("Sum of digits = "+(d4+d3+d2+d1));


    }
}
