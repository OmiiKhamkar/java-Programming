import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Enter Valid Marks");
        }
        else if(marks>=35){
            System.out.println(" You Passsed");
        }
        else {
            System.out.println("You Failed");
        }
    }
}
