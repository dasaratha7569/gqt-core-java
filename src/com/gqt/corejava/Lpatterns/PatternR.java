package com.gqt.corejava.Lpatterns;

import java.util.Scanner;

public class PatternR {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();
	    	for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if( j == 0 ||                                    // Left vertical line
	                    i == 0 && j < n - 1 ||                       // Top horizontal line
	                    i == n / 2 && j < n - 1 ||                   // Middle horizontal line
	                    j == n - 1 && i > 0 && i < n / 2 ||          // Right vertical (top half)
	                    i - j == n / 2                   )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
