import java.util.Scanner;

public class Array_Reverse_Fun {
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
        a = reverseArray(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    static int[] reverseArray(int[] a){
       int i = 0, j = a.length-1;
          while(i<j){
            int temp = a[i] ; 
            a[i] = a[j] ;
            a[j] = temp ;
            i++;
            j--;
          }
          return a;
    }
}
