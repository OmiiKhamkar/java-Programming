
import java.util.Scanner;

class Student{
   private String name;
   private int roll_no;

   public Student(String name, int roll_no) {
    this.name = name;
    this.roll_no = roll_no;
   }
   void display(){
    System.out.println("Roll_no.: "+roll_no+"\tStudent Name: "+name);
   }
}
class Exam extends Student{
  private int sub1,sub2,sub3;
  
  public Exam(String name,int roll_no,int sub1, int sub2, int sub3) {
    super(name, roll_no);
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
  }
  
   float Total_Marks()
  {
    return sub1+sub2+sub3;
  }
   float percentage(){
    return (Total_Marks()/300)*100;
  }
  void display(){

    super.display();
    System.out.println("Total Marks = "+Total_Marks()+"\nPercentage = "+percentage());
  }

}

class Result extends Exam{

    public Result(String name, int roll_no, int sub1, int sub2, int sub3) {
        super(name, roll_no, sub1, sub2, sub3);
    }
   public void display()
    {
        super.display();
        
        if(percentage()>80){
            System.out.println("First Class");
        }
        else if(percentage()>60){
            System.out.println("Second class");
        }
        else if(percentage()>40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
    
}
     
public class Student_Result_System {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll_No: ");
        int roll_no = sc.nextInt();
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter sub marks: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3= sc.nextInt();
       
        Student s1 = new Result(name,roll_no,sub1,sub2,sub3);
        s1.display();


    }
}
