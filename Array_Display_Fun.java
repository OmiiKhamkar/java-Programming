
import java.util.Scanner;

public class Array_Display_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10,20,30,40,50};
        a = displayArray(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    static int[] displayArray(int a[]){
        int i;
        for (i = 0; i < a.length; i++) {
        }
        return a;
    }
}
