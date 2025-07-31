package com.gqt.corejava.arrays;
import java.util.Scanner;
class MovieOperations {
	    long arr[][][] ;
	    long inve;
	    long prev_profit;
	    long sum_revenue;
	    Scanner sc = new Scanner(System.in);
	    void createArray() {
	    	System.out.println("Enter the count of languages:");
		    int lan = sc.nextInt();
	    	System.out.println("Enter category count in each language:");
	        int cat = sc.nextInt();
	        System.out.println("Enter movie count in each category:");
	        int mov = sc.nextInt();
	        arr = new long[lan][cat][mov];
	        System.out.println("Array is created");
	        System.out.println("---------------------");
	        
	        System.out.println("Enter the total investemnt: ");
	        inve=sc.nextLong();
	        System.out.println("Enter the previous year profit: ");
	        prev_profit=sc.nextLong();
	        System.out.println("------------------------");
	     }
	    void collectRevenue() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside language no: " + (i+1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("inside category no " + (j+1) + ": ");
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println("Enter the revenue of movie no "+ (k+1) +": ");
	                	arr[i][j][k]=sc.nextLong();
	                	sum_revenue+=arr[i][j][k];
	                }
	            }
	        }
	        System.out.println("Data Collected");
	        System.out.println("-------------------");
	    }
	    void displayData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside language no: " + (i+1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("Inside category no: " + (j+1));
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println( "the revenue of movie no: "+ (k+1) +"is : "+arr[i][j][k]);
	                }
	            }
	        }
	        if(sum_revenue>inve) {
	        	long profit=sum_revenue-inve;
	        	System.out.println("The profit earned by Dasaratha is:"+(profit));
	        	if(profit>prev_profit) {
	        		System.out.println("Dasaratha got more profit than last year.....");
	        	}else {
	        		System.out.println("Dasaratha got less profit than prev year.....");
	        	}
	        }else {
	        	System.out.println("The loss cursed by the Dasaratha is : "+(inve-sum_revenue));
	        }
	        System.out.println("---------------");
	    }
}
public class Assigmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieOperations m1=new MovieOperations();
		m1.createArray();
		m1.collectRevenue();
		m1.displayData();

	}

}
