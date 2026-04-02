import java.util.Scanner;
public class Array_Max_Fun {
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
        System.out.println("Max Element is = "+maxArray(a));
    }
    static int maxArray(int []a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
             if(a[i]>max)
               max = a[i];
        }
        return max;
    }
}
