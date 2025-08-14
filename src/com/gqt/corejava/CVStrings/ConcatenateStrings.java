package com.gqt.corejava.CVStrings;

import java.util.Scanner;

public class ConcatenateStrings {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Strings :");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("the conactenated String is: "+(str1+str2));
		sc.close();
	}
}
