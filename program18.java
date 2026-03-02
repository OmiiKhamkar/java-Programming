
import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Both are same");
        }
        else if(a>b){
            System.out.println("Bigger is "+a);
        }
        else{
            System.out.println("Bigger is "+b);
        }
    }
}
