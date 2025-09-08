package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class PrintName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name= sc.nextLine();
		System.out.println("My name is "+name);
		sc.close();
	}

}
