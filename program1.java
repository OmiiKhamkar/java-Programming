import java.util.*;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter co-ordinates of first point");
        float x1= sc.nextFloat();
        System.out.println("Enter co-ordinates of first point");
        float y1 = sc.nextFloat();

        System.out.println("Enter co-ordinates of first point");
        float x2 = sc.nextFloat();
        System.out.println("Enter co-ordinates of first point");
        float y2 = sc.nextFloat();

        double lenth = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        System.out.println("Lenth of line joining given 2 points is "+lenth);


    }
}
  
