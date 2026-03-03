import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your Marks :");
        int marks = sc.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Wrong Input");
        }
        else if(marks>=90){
            System.out.println("Distinction");
        }
        else if(marks>=75){
            System.out.println("I Class");
        }
        else if(marks>=40){
            System.out.println("II Class");
        }
        else{
            System.out.println("Failed");
        }
            
        
    }
}
