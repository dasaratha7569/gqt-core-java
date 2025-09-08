package com.gqt.corejava.MultiThreading;

import java.util.Scanner;

class Addition {
	void add() {
		System.out.println("Addition Operation started.");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2= sc.nextInt();
		int res= num1+num2;
		System.out.println("Result: "+res);
		System.out.println("Addition Operation completed.");
	}
}
class Printing{
	void print() {
		System.out.println("Printing Operation started.");
		for(int i=0;i<10;i++) {
			System.out.println("My self Dasaratha...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation completed...");
	}
}
class Banking{
	void bank() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Banking Operation Started.");
		System.out.println("Enter the account number: ");
		int acc= sc.nextInt();
		System.out.println("Enter the pin number: ");
		int pin= sc.nextInt();
		System.out.println("Data Entered..");
		System.out.println("Banking Operation completed.");
	}
}
public class ThreadCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a= new Addition();
		Printing p= new Printing();
		Banking b= new Banking();
		a.add();
		p.print();
		b.bank();
	}

}
