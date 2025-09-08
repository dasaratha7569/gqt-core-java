package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;

class Operations1{
	void function1() throws Exception{
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
class Operations2{
	void function2(){
		System.out.println("Inside function-2");
		Operations1 op1= new Operations1();
//		op1.function1();
		try {
			op1.function1();
		}catch(Exception e) {
			System.out.println("Exception handled in function-3");
		}
		System.out.println("outoff function-2");
	}
}
class Operations3{
	void function3(){
		System.out.println("Inside function-3");
		Operations2 op2= new Operations2();
		op2.function2();
		System.out.println("outoff function-3");
	}
}
public class Throws {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Inside main function");
		Operations3 op3= new Operations3();
		op3.function3();
		System.out.println("Outoff main function");
	}

}
