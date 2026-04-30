
import java.util.Scanner;

class Employee
{ 
  int emp_id;  
  String emp_name;
  float salary;

    public Employee(int emp_id, String emp_name, float salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }
    float calculateSalary(){
        return salary;
    }
    void display(){
        System.out.println("Employee id: "+emp_id+"\tEmployee Name: "+emp_name+"\nBase Salary "+salary);
    }
  
}
class Manager extends Employee
{

    public Manager(int emp_id, String emp_name, float salary) {
        super(emp_id, emp_name, salary);
    }
    @Override
  float calculateSalary(){
    return salary+5000;
  }
  @Override
  void display(){
     super.display();
     System.out.println("Bonus Added: 5000");
     System.out.println("Total Salary:"+calculateSalary());
     }
  }

class Developer extends Employee
{
  int hours;
    public Developer(int emp_id, String emp_name, float salary, int hours) {
        super(emp_id, emp_name, salary);
        this.hours = hours;
    }
    @Override
  float calculateSalary(){
    return (salary+(hours*1000));
  }
  @Override
  void display(){
    super.display();
    System.out.println("Added Overtime pay: "+(hours*1000));
    System.out.println("Total Salary: "+calculateSalary());
  }
}
public class Employee_Salary_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int id = sc.nextInt();
        System.out.println("Enter Employee name: ");
        String name = sc.next();
        System.out.println("Enter your salary: ");
        float sal = sc.nextFloat();
        System.out.println("Enter overtime hours");
        int h = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Devplopers Details");
        Employee emp1 = new Developer(id, name, sal,h);
        emp1.display();
        System.out.println("----------------------------");
        System.out.println("Managers Details");
        Employee emp2 = new Manager(id, name, sal);
        emp2.display();
        
    }
}
