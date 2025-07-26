package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size=");
		int n=sc.nextInt();
		int n1=n;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n1-1;j++) {
				System.out.print("  ");
			}
			n1-=1;
			for(int j=1;j<=k;j++) {
				System.out.print(i+" ");
			}
			k=k+2;
			System.out.println();
			
		}
		sc.close();
	}

}
