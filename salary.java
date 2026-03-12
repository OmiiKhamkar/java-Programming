package myfirstproject;
import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter you salary :");
		float salary = sc.nextFloat();
		
		if (salary >= 50000) {
			System.out.println("Tax in your salary is 20% ");
			System.out.println("paybal Tax is "+(salary*20/100));
			System.out.println("In hand salary is "+(salary-(salary*20/100)));
		}
		else if (salary<50000||salary>=30000) {
			System.out.println("Tax in your salary is 10% ");
			System.out.println("paybal Tax is "+(salary*10/100));
			System.out.println("In hand salary is "+(salary-(salary*10/100)));
		}
		else {
			System.out.println("No Tax in your salary ");
		}

	}

}
