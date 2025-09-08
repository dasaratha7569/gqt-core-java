package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class GCDof2Numbers {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		System.out.println("GCD is: "+x);
		sc.close();
	}
}
