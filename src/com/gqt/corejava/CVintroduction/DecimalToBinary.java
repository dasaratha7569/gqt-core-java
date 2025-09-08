package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String bin="";
		while(n>0) {
			bin=(n%2)+bin;
			n=n/2;
		}
		
		System.out.println("the Binary representation is "+bin);
		sc.close();
	}
}
