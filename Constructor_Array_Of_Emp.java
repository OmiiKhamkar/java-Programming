class Employee{
    private int id;
    private String name;
    private float  salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void Display(){
       System.out.println(name+"\t\t\t"+salary+"\t\t\t"+bonus());
    }
    float bonus(){
       float bonusadd = salary*5/100;
       return bonusadd + salary;
    } 
    public float getSalary() {
        return salary;
    }
}

public class Constructor_Array_Of_Emp {
 
    public static void main(String[] args) {

        Employee[] emp = {
            new Employee(101, "Amit", 45000),
            new Employee(102, "Neha", 52000),
            new Employee(103, "Rahul", 39000),
            new Employee(104, "Sneha", 61000),
            new Employee(105, "Vikas", 47000)
        };
       System.out.println("Name\t\tOriginalSalarry\t\tUpdatedSalary(5% Bonus)");
       System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < emp.length; i++) {
            emp[i].Display();
        }
        System.out.println("----------------------------------------------------------------");
        float sum = 0;
        int count = 0;
        for (int i = 0; i < emp.length; i++) {
            sum = sum + emp[i].getSalary();
            if(emp[i].getSalary()>50000){
                count ++;
            }
        }
        System.out.println("Total salary expense = "+sum);
        System.out.println("Employees earning more than 50000 : " +count);
      }
      
}

