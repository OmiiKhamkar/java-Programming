import java.util.Scanner;
class proram9{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
         System.out.print("Enter 4-digit number:");
         int num  = sc.nextInt(); //1234

         int d1 = num/1000; // 1
         num%=1000;  // 234
         int d2 = num/100; // 2 
         num = num%100; // 34
         int d3 = num/10; // 3
         int d4 = num%10;
         
        System.out.println("First digit is:"+d1);
        System.out.println("Second digit is:"+d2);
        System.out.println("Third digit is:"+d3);
        System.out.println("Forth digit is:"+d4);

        System.out.println("Sum of digits = "+(d1+d2+d3+d4));


    
    }
}