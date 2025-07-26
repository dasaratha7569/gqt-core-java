package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size=");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=k;j++) {
				System.out.print(j+" ");
			}
			k=k+2;
			System.out.println();
			
		}
		sc.close();
	}

}
