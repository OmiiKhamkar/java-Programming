package myfirstproject;

import java.util.Scanner;

public class greatest_number_in_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter first number :");
	int a = sc.nextInt();
	
	System.out.print("Enter second number :");
	int b = sc.nextInt();
	
	System.out.print("Enter third number :");
	int c = sc.nextInt();
	
	
	if(a>b && a>c)
		System.out.print("First number is greater");
	
	else if(b>a && b>c)
		System.out.print("Second number is greater");
	
	else
		System.out.print("Third number is greater");
	
 
	}

}
