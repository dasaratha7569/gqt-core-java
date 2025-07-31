package com.gqt.corejava.arrays;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns: ");
		int c=sc.nextInt();
		int [][]arr1 =new int[r][c];
		int [][]arr2 =new int[r][c];
		int [][]res= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
