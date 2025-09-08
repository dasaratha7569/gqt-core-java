package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class FibonnaciSeries {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of terms: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		if(n==1) {
			System.out.println(a);
			return;
		}
		if (n==2) {
			System.out.println(a);
			System.out.println(b);
			return;
		}
		if(n>3) {
			System.out.println(a);
			System.out.println(b);
			for(int i=2;i<n;i++) {
				c=a+b;
				System.out.println(c);
				a=b;b=c;
			}
		}
	}
}








