package myfirstproject;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		
		if(a%2==0&&a%3==0) {
			
			System.out.println("Even and divide by 3");
			}
		else if (a%2!=0&&a%5==0) {
			System.out.println("Odd and divide by 5");
		}
		
		else {
			System.out.println("None");
		}
		
	}

}
