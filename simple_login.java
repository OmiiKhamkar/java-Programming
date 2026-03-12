

import java.util.Scanner;

public class simple_login {
    public static void main(String[] args) {
    
    Scanner sc= new Scanner  (System.in);

    System.out.print("Enter username :");
    String username = sc.nextLine();

    System.out.println("Enter Passowrd:");
    String pass = sc.nextLine();


    if( username.equalsIgnoreCase("admin") && pass.equals("1234")){
        System.out.println("Login Successful");
    }
    else{
        System.out.println("Invalid credentials");
    }
}
}