
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Invalid Marks");
        }
        else{
            System.out.println("Valid Marks");
        }
    }
}
