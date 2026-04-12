
class Distance {
   float km, m, ft, inches;

    public Distance(float km) {
        this.km = km;
    }
    void convert(){
        m = 1000 * km ;
        ft = 3.281f * m;
        inches = 12 * ft ;

    }

void display()
{
    System.out.println("Given kilometers="+km);
    System.out.println("Equivalent m="+m+"\tft="+ft+"\tInches="+inches);
    System.out.println("______________________");
}
}
public class Constructor_Distance
{  
public static void main(String args[])
{  
    Distance d1=new Distance(5.2f);
    d1.convert();
    d1.display();
    Distance d2=new Distance(25.33f);
    d2.convert();
    d2.display();
}//main
}