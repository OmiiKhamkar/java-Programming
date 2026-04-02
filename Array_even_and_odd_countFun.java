import java.util.Scanner;

public class Array_even_and_odd_countFun {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter this numbers:");
        for(int i = 0; i<n ; i++)
        {
             a[i]  = sc.nextInt();
           } 
        System.out.println("Even numbers = "+evenArray(a));
        System.out.println("Odd numbers = "+oddArray(a));   
        
    }
    static int evenArray(int[] a){
       int evencount = 0 ;
       for (int i = 0; i < a.length; i++) {
           if(a[i]%2==0)
            evencount ++;
        }
         return evencount;
     }
    static int oddArray(int []a){
        int oddcount = 0;
       for (int i = 0; i < a.length; i++) {
           if(a[i]%2==0)
          { 
          }
        else{
             oddcount++;
        }
       }
    return oddcount;
}
}
