package com.gqt.corejava.MultiThreading;

import java.util.Scanner;

public class ThreadCode2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Addition Operation started.");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2= sc.nextInt();
		int res= num1+num2;
		System.out.println("Result: "+res);
		System.out.println("Addition Operation completed.");
		
		System.out.println("Printing Operation started.");
		for(int i=0;i<10;i++) {
			System.out.println("My self Dasaratha...");
			Thread.sleep(3000);
		}
		System.out.println("Printing operation completed...");
		
		System.out.println("Banking Operation Started.");
		System.out.println("Enter the account number: ");
		int acc= sc.nextInt();
		System.out.println("Enter the pin number: ");
		int pin= sc.nextInt();
		System.out.println("Data Entered..");
		System.out.println("Banking Operation completed.");
	}

}
