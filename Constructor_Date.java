


class Date {

    int day;
    int month;
    int year;

    public Date() {
        day = 26;
        month = 01;
        year = 1950;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    void display() {
        System.out.println(day + "/" + month + "/" + year+"\n");
    }

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    } 
    public Date(Date d){
      this.day = d.day;
      this.month = d.month;
      this.year = d.year;
    }
}

public class Constructor_Date 
{
    public static void main(String[] args) 
    {
        Date d1 = new Date();
        d1.display();
        Date d2 = new Date(15, 8, 2025);
        d2.display();
        Date d3 = new Date(21, 2); //year is 2000
        d3.display();
        Date d4 = new Date(d2); //copy of d2
        d4.display();
    }
}