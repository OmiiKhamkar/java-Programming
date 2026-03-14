import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int digit;
        int even = 0,odd = 0;

         while (n>0) { 
            digit = n%10;
           // System.out.print(digit+"\n");
       
            n = n/10;

            if(digit%2==0){
               even = digit+1;
              // System.out.print(even+", ");
            } // if
            else{
               odd = digit-1;
              // System.out.print(odd+", ");
            } // else
                 System.out.print(even);
          System.out.print(odd);
               
        } // whileloop
         
       
    } //main
} // class
