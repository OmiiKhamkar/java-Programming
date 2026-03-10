package myfirstproject;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		
		System.out.print("Enter the number:");
		int b = sc.nextInt();
		
		
		if(a>b) 
			System.out.print("First no is greater");
		
		else if(a==b)
			System.out.print("Both are equal");
			
		else 
			System.out.print("Second no is greater");
		
		

	}

}
