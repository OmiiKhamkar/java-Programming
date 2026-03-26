import java.util.Scanner;

public class Square_of_Number_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        System.out.println("Square = "+square(a));
    }
 static int square(int x){
    return x * x ;

 }
}
