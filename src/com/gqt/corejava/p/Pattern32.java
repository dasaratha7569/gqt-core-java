package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size=");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			for (int j=i-1;j>=1;j--) {
                System.out.print(i+" ");
            }
			System.out.println();
			
		}
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			for (int j=i-1;j>=1;j--) {
                System.out.print(i + " ");
            }
			System.out.println();
			
		}
		sc.close();
	}

}
