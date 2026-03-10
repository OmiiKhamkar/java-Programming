
import java.util.Scanner;

public class Grade_with_Remark{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your Marks:");
        int marks = sc.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Enter valid Marks");
        }
        else if (marks>=90){
            System.out.println("Grede A");
            System.out.println("Excellent");
        }
        else if(marks>=75){
            System.out.println("Grede B");
            System.out.println("Very Good");
        }
        else if(marks>=60){
            System.out.println("Grede C");
            System.out.println("Good");
        }
        else if(marks>=35){
            System.out.println("Grede D");
            System.out.println("Pass");
        }
        else{
            System.out.println("Failed");
        }
        }

    }
