class Teacher
{
  private String name,dept;
  private int salary;
  
  public void setName(String name) {
    this.name = name;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  public int getSalary(int salary){
    return this.salary;
  }
  
  void display()
  {
    System.out.println("Name:"+name+"\tDepartment:"+dept+"\tSalary:"+salary);
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getSalary() {
    return salary;
  } 
}
class Class_Teacher_using_Getter
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
  System.out.println("Data of second teacher is ");
  t2.display();
  System.out.print("Name of teacher with maximum salary is ");
  if(t1.getSalary()>t2.getSalary()){
    System.out.println(t1.getName());
  }
  else{
    System.out.println(t2.getName());
  }
  
}//main
}