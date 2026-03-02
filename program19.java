
import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("All are same");
        }
        else if(a>b & a>c){
            System.out.println("Bigger number is "+a);
        }
        else if(b>c){
            System.out.println("Bigger number is "+b);
        }
        else{
            System.out.println("Bigger number is "+c);
        }

    }
}
