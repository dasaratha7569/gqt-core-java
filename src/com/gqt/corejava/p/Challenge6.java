package com.gqt.corejava.p;
import java.util.Scanner;
public class Challenge6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count=");
		int n=sc.nextInt();
		int c=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
			c--
			;
		}
		sc.close();
	}

}
