
import java.util.Scanner;

public class while_loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to enter ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int e = 0;
        int o = 0;
        System.out.println("Enter those numbers now ");
        while (i<=n) {

            System.out.print(i+"..");
            int num = sc.nextInt();
            sum = sum+num;
            i++;
            if(num%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.println("Sum is "+sum);
        System.out.println("Averege is "+sum/(float)n);
        System.out.println("These are "+e+" even numbers");
        System.out.println("These are "+o+" odd numbers");
    }
}
