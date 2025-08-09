package com.gqt.corejava.CVDataTypes;

import java.util.Scanner;

public class ArithmeticOperFloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the float values= ");
		float f1= sc.nextFloat();
		float f2= sc.nextFloat();
		System.out.println("Addition= "+(f1+f2));
		System.out.println("Substraction= "+(f1-f2));
		System.out.println("Multiplication= "+(f1*f2));
		System.out.println("Division= "+(f1/f2));
		System.out.println("----------------");
		
		System.out.println("enter the double values= ");
		double d1= sc.nextFloat();
		double d2= sc.nextFloat();
		System.out.println("Addition= "+(d1+d2));
		System.out.println("Substraction= "+(d1-d2));
		System.out.println("Multiplication= "+(d1*d2));
		System.out.println("Division= "+(d1/d2));
		System.out.println("----------------");
		
	}

}
