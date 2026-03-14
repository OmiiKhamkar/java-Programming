
import java.util.Scanner;

public class repeat_program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         while (true) { 
            System.out.println("Enter a number to find its odd or even...-1 to end");
            int num = sc.nextInt();
             if(num==-1){
                System.out.println("Thanks...Program ending...");
                break;
             }
            if (num%2==0){
                System.out.println("EVEN");
                
             }
             else{
                System.out.println("ODD");
            
             }

         }
    }
}