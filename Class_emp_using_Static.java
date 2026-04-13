
class Employee{
    private String name;
    static String Com_Name;
    public static void setCompanyName(String com_Name) {
        Com_Name = com_Name;
    }
    public Employee(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Employee Name: "+name+"\t\tCompany Name: "+Com_Name);
    }
 
}
public class Class_emp_using_Static {
      public static void main(String[] args) {
      // Set company name using static setter
        Employee.setCompanyName("TCS");

        Employee e1 = new Employee("Raj");
        Employee e2 = new Employee("Amit");
        Employee e3 = new Employee("Sneha");

        e1.display();
        e2.display();
        e3.display();

        // Change company name
        Employee.setCompanyName("Infosys");

        System.out.println("After company change:\n");

        e1.display();
        e2.display();
        e3.display();
    }
}

