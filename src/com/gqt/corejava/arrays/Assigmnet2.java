package com.gqt.corejava.arrays;
import java.util.Scanner;

class collegeData {
	String arr[][][][]; // [college][dept][classroom][students]
	Scanner sc = new Scanner(System.in);
	int dept1Total = 0;
	int dept2Total = 0;
	int dept3Total = 0;
	long dept1reve=1;
	long dept2reve=1;
	long dept3reve=1;
	void createArray() {
		System.out.println("Enter the count of colleges:");
		int clg = sc.nextInt();

		System.out.println("Enter the dept count in each college:");
		int depty = sc.nextInt();

		arr = new String[clg][depty][][];

		for (int i = 0; i < arr.length; i++) { // for each college
			System.out.println("Inside college no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) { // for each dept
				System.out.println("Enter the count of classrooms inside dept no: " + (j + 1));
				int classrooms = sc.nextInt();
				arr[i][j] = new String[classrooms][];
				for (int k = 0; k < classrooms; k++) { // for each classroom
					System.out.println("Enter the count of students inside classroom no: " + (k + 1));
					int students = sc.nextInt();
					arr[i][j][k] = new String[students];

					// Increment global dept totals
					if (j == 0) dept1Total += students;
					else if (j == 1) dept2Total += students;
					else if (j == 2) dept3Total += students;
				}
			}
		}
		dept1reve=dept1Total*2500000;
		dept2reve=dept2Total*250000;
		dept3reve=dept3Total*80000;
		System.out.println("Array structure created successfully.");
		System.out.println("----------------------------------------");
	}

	void collectNames() {
		for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside college no: " + (i+1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("inside dept no " + (j+1) + ": ");
                for(int k=0;k<arr[i][j].length;k++) {
                	System.out.println("Inside classroom no "+ (k+1) +": ");
                	for(int m=0;m<arr[i][j][k].length;m++) {
                		System.out.print("Enter the name of the student no :"+(m+1)+" is: ");
                		arr[i][j][k][m]=sc.nextLine();
                	}
                }
            }
        }
        System.out.println("Data Collected");
        System.out.println("-------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside college no: " + (i+1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside dept no: " + (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println( "insdie collge no: "+ (k+1));
					for(int m=0;m<arr[i][j][k].length;m++) {
						System.out.print("the name of the student no :"+(m+1)+" is: "+arr[i][j][k][m]);
					}
				}
			}
		}

		System.out.println("-------------------------------------");
		System.out.println("Total students in Dept 1 across all colleges: " + dept1Total);
		System.out.println("Total students in Dept 2 across all colleges: " + dept2Total);
		System.out.println("Total students in Dept 3 across all colleges: " + dept3Total);
		System.out.println("------------------------------");
		System.out.println("Total revenue made by swathi during the academic year 2024-25 is: "+(dept1reve+dept2reve+dept3reve));
	}
}

public class Assigmnet2 {
	public static void main(String[] args) {
		collegeData d1 = new collegeData();
		d1.createArray();
//		d1.collectNames();
		d1.displayData();
	}
}
