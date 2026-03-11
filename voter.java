package myfirstproject;

import java.util.Scanner;

public class voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the age :");
		
		int age = sc.nextInt();
		
		
		if(age>=18)
			System.out.print("Eligible for voting");
		else
			System.out.print("Note eligible for voting");
			
		
 
	}

}
