package com.gqt.corejava.p;
import java.util.Scanner;
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size=");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            for (int j = 1; j < (i - 1) * 2 + 1; j++) {
                System.out.print("  ");
            }
            if (i != 1) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            for (int j = 1; j < (i - 1) * 2+1 ; j++) {
                System.out.print("  ");
            }
            if (i != 1) {
                System.out.print(i);
            }
            System.out.println();
        }
		sc.close();
	}

}
