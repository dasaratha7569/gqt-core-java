package com.gqt.corejava.arrays;
import java.util.Scanner;
class ArrayOp {
	    String[][] arr;
	    Scanner sc = new Scanner(System.in);
	    void createArray() {
	        System.out.println("Enter class count:");
	        int cls = sc.nextInt();
	        System.out.println("Enter student count in each class:");
	        int stu = sc.nextInt();
	        arr = new String[cls][stu];
	        System.out.println("Array is created");
	        System.out.println("---------------------");
	    }
	    void collectData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside class no: " + (i + 1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print("Enter name of student " + (j + 1) + ": ");
	                arr[i][j] = sc.next();
	            }
	        }
	        System.out.println("Data Collected");
	        System.out.println("-------------------");
	    }
	    void displayData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside class no: " + (i + 1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("The name of students no: " + (j + 1) + " is = " + arr[i][j]);
	            }
	        }
	        System.out.println("---------------");
	    }
	}
public class Array2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOp ao = new  ArrayOp();
	        ao.createArray();
	        ao.collectData();
	        ao.displayData();
	    }
	}

