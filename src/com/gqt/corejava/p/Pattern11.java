package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size=");
		int n=sc.nextInt();
		int n1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((n1)+"  ");
				n1+=1;
			}
			//n1=n1+5;
			System.out.println();
		}
		sc.close();
	}

}
