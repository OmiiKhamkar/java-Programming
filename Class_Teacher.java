class Teacher{
    String Name;
    String Dept ;
    int Salary ;
    void display(){
        System.out.println("Name :"+Name+"\tDepartment :"+Dept+"\tSalary :"+Salary);
    }
    void setName(String Name){
         this.Name = Name;
    }
    void setDept(String Dept){
        this.Dept = Dept;
    }
    void setSalary(int Salary){
        this.Salary = Salary;
    }
    void checkSalary(){
        if(this.Salary>100000){
            System.out.println("Salary is Good");
        }
        else{
            System.out.println("Salary is OK");
        }
    }
 }
class Class_Teacher
{  
public static void main(String args[])
{  
  Teacher t1,t2;
  t1=new Teacher();
  t2=new Teacher();
  t1.setName("Mrs. Joshi");
  t1.setDept("Computer");
  t1.setSalary(80000);
  t2.setName("Mr. Patil");
  t2.setDept("Computer");
  t2.setSalary(120000);
  System.out.println("Data of first teacher is ");
  t1.display();
  t1.checkSalary();
  System.out.println("Data of second teacher is ");
  t2.display();
  t2.checkSalary();
}//main
}