package com.gqt.corejava.Lpatterns;
import java.util.Scanner;
public class PatternQ{

	public static void main(String[] args) {
	
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			                
			   if (j==0  || i==0 || i==n || j==n){
				System.out.print("# ");
					}
			   else
			  {
					 System.out.print("  ");
					}
				}
				System.out.println();
			}
	}

}
