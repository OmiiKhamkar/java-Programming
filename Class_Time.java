class Time{
    int Hr,Min,Sec;
    void display(){
        System.out.println("Time Value is "+Hr+":"+Min+":"+Sec);
    }
    void  setHr(int hr){
        this.Hr = hr;
    }
    void  setMin(int Min){

        this.Min = Min;
    }
    void  setSec(int Sec){
        this.Sec = Sec;
    }

}
class Class_Time
{  
public static void main(String args[])
{  
  Time t1=new Time();
  Time t2=new Time();
  t1.setHr(12);
  t1.setMin(55);
  t1.setSec(33);
  t2.setHr(9);
  t2.setMin(10);
  t2.setSec(12);
  System.out.println("First time object");
  t1.display();
  System.out.println("Second time object");
  t2.display();
}//main
}//class Demo