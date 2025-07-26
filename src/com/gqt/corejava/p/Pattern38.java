package com.gqt.corejava.p;

import java.util.Scanner;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size=");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			char ch=(char)(64+(i*2));
			for(int j=1;j<i*2;j++) {
				System.out.print((char)(ch-j)+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
