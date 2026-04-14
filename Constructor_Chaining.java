class MyDate{
    private int dd,mm,yy;
    MyDate(){   
        System.out.println("Defulalt Constructor Executed");    // defualt constructor
        dd = 1 ;
        mm = 1;
        yy = 2000;
    }
    MyDate(int dd, int mm, int yy){  // Parameterized constructor
        System.out.println("Parameterized Constructor Executed");
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    MyDate(MyDate p){
        System.out.println("Copy Constructor Executed");
        this.dd = p.dd;
        this.mm = p.mm;
        this.yy = p.yy;
    }
    void display(){
        System.out.println(dd+"/"+mm+"/"+yy);
    }
}
public class Constructor_Chaining {
    public static void main(String[] args) 
    {
        MyDate d1 = new MyDate();
        d1.display();
        MyDate d2 = new MyDate(15, 8, 2025);
        d2.display();
        MyDate d3 = new MyDate(d2);
        d3.display();
    }
}

