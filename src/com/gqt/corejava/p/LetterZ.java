package com.gqt.corejava.p;
import java.util.Scanner;
public class LetterZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j < n; j++) { // Columns
                if (i == 0 || i == n - 1 || (i + j) == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
