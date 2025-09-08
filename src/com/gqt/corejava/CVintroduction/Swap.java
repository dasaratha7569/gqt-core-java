package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" After swapping a="+a);
		System.out.println("After swapping b="+b);
		sc.close();
	}
}
