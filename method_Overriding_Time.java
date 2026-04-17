class Time
{
  int hr,min;
  void setTime(int hr, int min)
  {
    this.hr=hr;
    this.min=min;
  }
  void display()
  {
    System.out.println("Time is "+hr+":"+min);
  }
}//class Time
class Date extends Time
{
  int dd,mm,yy;
  void setDate(int dd, int mm, int yy)
  {
    this.dd=dd;
    this.mm=mm;
    this.yy=yy;
  }
  void display()
  {
    super.display();
    System.out.println("Date is "+dd+"/"+mm+"/"+yy);
  }
}//class Date
public class method_Overriding_Time
{
  public static void main(String args[])
  {
    Date d=new Date();
    d.setTime(7,30);
    d.setDate(15,8,1947);
    d.display();
    // display data of object d
    // Do not modify class Time
    
}//main
}