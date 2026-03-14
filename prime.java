
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    while (true) { 

     System.out.println("Enter a number :");
     int n = sc.nextInt();
     int i = 2;
     boolean  flag = false;
     if(n == -1){
        System.out.println("Thanks for visit..");
        break;
     }
     while(i<n){
        if(n%2==0){
            System.out.println("It is not a prime number");
            flag = true;
            break; 
        }
      i++;
     }
      if(flag == false){
          System.out.println("Prime Number");
     } 
    } 
    }
}
