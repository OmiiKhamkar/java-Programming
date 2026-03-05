import java.util.Scanner;
class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
    System.out.println("Enter your salary;");
    double salary = sc.nextDouble();

    System.out.println("Enter your years of experience;");
    int experience = sc.nextInt();
    if(experience>=5){
        System.out.println("You get 20% Bonus:"+(salary*20/100));
        System.out.println("Total salary you get "+(salary+(salary*20/100)));
    }
    else{
        System.out.println("You get 10% Bonus:"+(salary*10/100));
        System.out.println("Total salary you get "+(salary+(salary*10/100)));
    }


    }
}