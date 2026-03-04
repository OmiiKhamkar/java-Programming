
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Days");
        int days = sc.nextInt();

        int salary;

        if(days<15){
            System.out.println("Salary is "+(days*350));
        }
        else if(days<=22){
            System.out.println("Salary is "+((days*350)+2000));
        }
        else{
             System.out.println("Salary is "+((days*500)+2000));
        }
           
    }
}

