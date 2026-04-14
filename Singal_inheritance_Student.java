class Person{
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
}
class Student extends Person{
    private String course ;
    private int marks;
    public void setCourse(String course){
        this.course = course;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    void displayStudent(){
        System.out.println("Course: "+course);
        System.out.println("Marks: "+marks);
    }
}
public class Singal_inheritance_Student {
  public static void main(String[] args) 
    {
        Student s = new Student();
        s.setName("Shubham Patil");
        s.setAge(20);
        s.setCourse("Java+DSA");
        s.setMarks(85);
        s.displayPerson();
        s.displayStudent();
    }
}

