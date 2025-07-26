package com.gqt.corejava.p;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size=");
		int n=sc.nextInt();
		int k=1;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=k;j++) {
				System.out.print(ch+" ");
			}
			k=k+2;
			ch++;
			System.out.println();
		}
		sc.close();
	}

}
