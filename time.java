import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in 24 hour formate :");
        int a = sc.nextInt();

        if(a>=5 && a<=11){
            System.out.println("Morning");
        }
        else if(a>12 && a<=16){
            System.out.println("Afternoon");
        }
        else if(a>=17 && a<=20){
            System.out.println("Evening");
        }
        else{
            System.out.println("Night");
        }



    }
}
