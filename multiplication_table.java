import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i = 1;

        while(i<=10){
            System.out.println(n+"x"+i+"="+n*i);
            i++;
        }
    }
}
