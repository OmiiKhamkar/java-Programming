class Student
{
  int rollno;
  String name;
  Student (int rollno, String name)
  {
    this.rollno=rollno;
    this.name=name;
  }
  void display()
  {
    System.out.println("Roll Number: " + rollno+" Name: "+name);
  }
}//class Student
//--------------------------------------------------------------------
class Exam extends Student
{
  protected int maths,english,science;
  Exam(int rollno, String name, int maths, int english, int science)
  {
    super(rollno,name);
    this.maths=maths;
    this.english=english;
    this.science=science;
  }
  void display()
  {
    super.display();
    System.out.println("Marks\tMaths: "+maths+" English: "+english+" Science: "+science);
  }
}//class Exam
//--------------------------------------------------------------------
class Result extends Exam
{
  protected float percentage;
  Result(int rollno, String name,int maths, int english, int science)
  {
    super(rollno,name,maths,english,science);
    percentage=(maths+english+science)/3.0f;
  }  
  void display()
  {
    super.display();
    System.out.println("Percentage: "+percentage);
  }
}//class Result
//--------------------------------------------------------------------
public class Constructor_in_inheritance_Student {
  public static void main(String r[])
  {
    Result R=new Result(1,"Yashwant Patil",85,63,77);
    R.display();
  }//main
}//P29

