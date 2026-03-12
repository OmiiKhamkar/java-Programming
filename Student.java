package myfirstproject;

import java.util.Scanner;

public class Student {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.print("Positive Number");
		}
		else if (n==0) {
			System.out.print("Zero");
		}
		
		else {
			System.out.print("Negetive Number");
		}
		
	}

}	