class Cal{
    static void add(int a, int b){
        System.out.println("Addition = "+(a+b));
    }
    static void mult(int a, int b){
        System.out.println("Multiplication = "+(a*b));
    }
}
public class Class_cal_using_Static {
    
    public static void main(String[] args) {
        Cal.add(10,5);
        Cal.mult(10,5);
    }
}
