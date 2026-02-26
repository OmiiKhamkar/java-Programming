import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float km,m,feat,inches;

        System.out.println("Enter distance in kilometer:");
        km=sc.nextFloat();

        m=km*1000;
        feat= m*3.26f;
        inches=feat*12;

        System.out.println("Equivalent meters = "+m);
        System.out.println("Equivalent feats = "+feat);
        System.out.println("Equivalent inches = "+inches);


    }
}
