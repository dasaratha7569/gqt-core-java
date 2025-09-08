package com.gqt.corejava.MultiThreading;

import java.util.Scanner;

class Operation1 extends Thread {
	@Override
	public void run() {
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
class Operation2 extends Thread {
	@Override
	public void run(){
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
class Operation3 extends Thread {
	@Override
	public void run() {
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
public class ThreadCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation1 op1= new Operation1();
		Operation2 op2= new Operation2();
		Operation3 op3= new Operation3();
		op1.run();
		op2.run();
		op3.run();
	}

}
