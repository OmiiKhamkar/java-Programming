import java.util.Scanner;
class Result {
   int m1,m2,m3,m4;
   float percentage;
void read()
{
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter marks of 4 subjects (out of 100)");
  m1 = sc.nextInt();
  m2 = sc.nextInt();
  m3 = sc.nextInt();
  m4 = sc.nextInt();
}
float findPerentage()
{
  return (m1+m2+m3+m4)/4.0f;
}
}
public class Class_Result {
public static void main(String args[])
{ // Do not change content of main method 
    Result r =new Result();
    r.read();
    float p=r.findPerentage();
    System.out.println("Percentage of marks = "+p);
}//main
}

