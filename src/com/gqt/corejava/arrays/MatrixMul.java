package com.gqt.corejava.arrays;

public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {
				{1, 2, 5},
				{3, 4, 8}
		};
		int[][] arr2 = {
				{5, 6},
				{7, 8},
				{2, 1}
		};
		int[][] re = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					re[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re[0].length; j++) {
				System.out.print(re[i][j] + " ");
			}
			System.out.println();
		}

	}

}
