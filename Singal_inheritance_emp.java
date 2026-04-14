class Employee{
    private String name;
    private float  salary;
    public void setName(String name){
        this.name = name;
    }
    public void setBasicSalary(float  salary){
        this.salary = salary;
    }
    public float getBasicSalary(){
        return salary;
    }
    void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Basic Salary: "+salary);
    }
}
class Manager extends Employee{
    private float bonus;
    public void setBonus(float bonus){
        this.bonus = bonus;
    } 
    void displayManager(){
        super.display();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+(getBasicSalary()+bonus));
    }
}

public class Singal_inheritance_emp {
 public static void main(String[] args) 
    {
        Manager m = new Manager();
        m.setName("Apoorva");
        m.setBasicSalary(150000);
        m.setBonus(20000);
        m.displayManager();
    }
}