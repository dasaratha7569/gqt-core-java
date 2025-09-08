package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;

class Operations12{
	void function12() throws Exception{
		System.out.println("Inside function-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division Operation");
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();//critical statement -- InputMismatchException
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();//critical statement -- InputMismatchException
		int res = n1 / n2;//critical statement -- ArithmeticException
		System.out.println(res);
		System.out.println("outoff function-1");
	}
}
class Operations23{
	void function23() throws Exception{
		System.out.println("Inside function-2");
		Operations12 op1= new Operations12();
		op1.function12();
		System.out.println("outoff function-2");
	}
}
class Operations34{
	void function34() throws Exception{
		System.out.println("Inside function-3");
		Operations23 op2= new Operations23();
//		op2.function23();
		try {
			op2.function23();
		}catch(Exception e) {
			System.out.println("Exception handled in function-3");
			throw e;
		}
		System.out.println("outoff function-3");
	}
}
public class ReThrowing {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Inside main function");
		Operations34 op3= new Operations34();
		try {
			op3.function34();
		} catch (Exception e) {
			System.out.println("Exception handled in  main function");
		}
		System.out.println("Outoff main function");
	}
}
