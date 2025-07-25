package com.gqt.corejava.p;
import java.util.Scanner;
public class Challenge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if ((i+j) %2==0) {
					System.out.print("1 ");
					
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
