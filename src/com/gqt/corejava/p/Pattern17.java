package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count=");
		int n=sc.nextInt();
		int n1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n1+" ");
				n1+=1;
			}
			System.out.println();
		}
		sc.close();
	}

}
