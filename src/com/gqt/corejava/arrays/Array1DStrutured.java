package com.gqt.corejava.arrays;
import java.util.Scanner;
class Program1 {
		Scanner sc=new Scanner(System.in);
		int arr[];
		void createArray() {
			System.out.println("Enter the students count: ");
			int n=sc.nextInt();
			arr=new int[n];
			
		}
		void collectData() {
			System.out.println("Enter the Marks: ");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
		}
		void displayData() {
			System.out.println("Display Data: ");
			for(int i=0;i<arr.length;i++) {
				System.out.println("The marks of student no:"+(i+1)+" is= "+arr[i]);
			}
		}

}
public class Array1DStrutured {
	public static void main(String[] args) {
		Program1 a=new Program1();
		a.createArray();
		a.collectData();
		a.displayData();
	}
}