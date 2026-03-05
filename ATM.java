package myfirstproject;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your PIN :");
		double PIN = sc.nextDouble();
		
		double balance = 10000;
		double Withdraw,Deposit;		
		if(PIN == 1234) {
			System.out.print("1. Check balance\n2. Withdraw\n3. Deposit ");
			}
		else {
			System.out.print("Incorrect PIN");
		}
		}
		
	}


