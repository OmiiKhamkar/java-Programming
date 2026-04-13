class Student{
    static  int count = 0;
    private String name ;
    static void showCount(){
      count++;
    }
    public Student(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Total Students: "+(count));
      System.out.println("Name: "+name);
    }
}
public class Count_objects {
    public static void main(String[] args) {
        Student.showCount();
        Student s1 = new Student("Raj");
        s1.display();
        Student.showCount();
        Student s2 = new Student("Amit");
        s2.display();
        Student.showCount();
        Student s3 = new Student("Sneha");
        s3.display();
        Student.showCount();
    }
}

