import java.util.Scanner;

class program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour,min,seconds;

        System.out.println("Enter the hours:");
        hour = sc.nextInt();

        min = hour*60;
        seconds = min*60;

        System.out.println("Equivalent minutes are "+ min);
        System.out.println("Equivalent seconds are "+ seconds);

    }
}