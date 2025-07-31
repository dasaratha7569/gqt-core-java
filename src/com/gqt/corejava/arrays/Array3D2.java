package com.gqt.corejava.arrays;
import java.util.Scanner;
class ArrayOp3 {
	    String arr[][][] ;
	    Scanner sc = new Scanner(System.in);

	    void createArray() {
	    	System.out.println("Enter the count of school:");
		    int schl = sc.nextInt();
//	    	System.out.println("Enter class count in each  school:");
//	        int cls = sc.nextInt();
//	        System.out.println("Enter student count in each class:");
//	        int stu = sc.nextInt();
		    arr=new String[schl][][];
		    //collecting class count
		    for(int i=0;i<arr.length;i++) {
	        	System.out.println("Enter the class count in school no : "+(i+1));
	        	arr[i]=new String[sc.nextInt()][];
	        }
		    //collecting student count
		    for(int i=0;i<arr.length;i++) {
		    	System.out.println("Inisde schhol no:"+(i+1));
		    	for(int j=0;j<arr[i].length;j++) {
		        	System.out.println("Enter the count of students inside the class no: "+(j+1));
		        	arr[i][j] = new String[sc.nextInt()];
		        }
		    }
	        System.out.println("Array is created");
	        System.out.println("---------------------");
	    }

	    void collectData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside school no: " + (i));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("inside class no " + (j) + ": ");
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println("Enter the student name no "+ (k+1) +": ");
	                	arr[i][j][k]=sc.next();
	                }
	            }
	        }
	        System.out.println("Data Collected");
	        System.out.println("-------------------");
	    }

	    void displayData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside school no: " + (i));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("The name of class no: " + (j));
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println( "the name of student no: "+ (k+1) +"is : "+arr[i][j][k]);
	                }
	            }
	        }
	        System.out.println("---------------");
	    }
}
public class Array3D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOp3 s1=new ArrayOp3();
		s1.createArray();
		s1.collectData();
		s1.displayData();

	}

}
