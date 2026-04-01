import java.util.Scanner;

public class Prime_Number_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if(isPrime(num))
            System.out.println("PRIME");
        else
            System.out.println("Not Prime");
    }
    static boolean isPrime(int num){
        if(num<=1)
            return true;
        for (int i = 2; i*i < num; i++) {
            if(num%i==0)
                return false;
        }
         return  true;
    }
}

