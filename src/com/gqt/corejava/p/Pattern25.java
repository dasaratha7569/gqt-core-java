package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size=");
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		sc.close();
	}

}
