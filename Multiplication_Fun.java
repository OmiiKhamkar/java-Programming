import java.util.Scanner;

public class Multiplication_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Multiplication of Table :");
        int num = sc.nextInt();
        table(num);
    }
    static void   table(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
