package myfirstproject;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the year :");
		int year = sc.nextInt();
		
		if(year%4==0)
		    System.out.print("Leap year");
		
		else
			System.out.print("Not a leap year");
		
		
	}

}
