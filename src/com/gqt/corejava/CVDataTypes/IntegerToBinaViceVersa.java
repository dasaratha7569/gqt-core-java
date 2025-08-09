package com.gqt.corejava.CVDataTypes;

import java.util.Scanner;

public class IntegerToBinaViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String bin="";
		while(n>0) {
			bin=(n%2)+bin;
			n=n/2;
		}
		
		System.out.println("the Binary representation is "+bin);
		
		
		String str=sc.next();
		int num=Integer.parseInt(str,2);
		System.out.println("the number representation is "+num);
		sc.close();
	}

}
