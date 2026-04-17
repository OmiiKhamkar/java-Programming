
class Time
{
  int hr,min;
  Time(int hr, int min)
  {
    this.hr=hr;
    this.min=min;
  }
  void display()
  {
    System.out.println("Time: "+hr+":"+min);
  }
}//class Time
//-------------------------------------------------------------
class Date extends Time
{
  int dd,mm,yy;
  Date(int hr,int min, int dd, int mm, int yy)
  {
    super(hr,min);
    this.dd=dd;
    this.mm=mm;
    this.yy=yy;
  }
  void display()
  {
    super.display(); // call display() method of class Time here
    System.out.println("Date: "+dd+"/"+mm+"/"+yy);
  }
}//class Time
//-------------------------------------------------------------
public class Constructor_in_inheritance_Time {
  public static void main(String args[])
  {
    Date d=new Date(7,30,15,8,1947); // hr, min, dd, mm, yy
    d.display();
  }//main
}

