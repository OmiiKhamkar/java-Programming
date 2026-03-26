import java.util.Scanner;

public class AdditionFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition = "+add(a,b));
    }
 static int add(int x, int y){
    return x + y;
 }
}
