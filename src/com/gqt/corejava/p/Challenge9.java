package com.gqt.corejava.p;
import java.util.Scanner;
public class Challenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count=");
		int x=sc.nextInt();
		char c='A';
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
		sc.close();
	}

}
