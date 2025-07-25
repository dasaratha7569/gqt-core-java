package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size=");
		int n=sc.nextInt();
		int n1=n;
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n1;j++) {
				System.out.print(c+"   ");
				c++;
			}
			n1=n1-1;
			System.out.println();
			
		}
		sc.close();
	}

}
