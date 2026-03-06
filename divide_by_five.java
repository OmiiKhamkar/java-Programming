package myfirstproject;

import java.util.Scanner; 

public class divide_by_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numebr:");
		int a = sc.nextInt();
		
		if (a%5==0 && a%3==0)
			System.out.print("1");
		else
			System.out.print("2");
			
			
     
	}

}
