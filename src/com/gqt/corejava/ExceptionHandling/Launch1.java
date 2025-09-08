package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();//critical statement -- InputMismatchException
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();//critical statement -- InputMismatchException

		int res = n1 / n2;//critical statement -- ArithmeticException

		System.out.println(res);
	}

}
