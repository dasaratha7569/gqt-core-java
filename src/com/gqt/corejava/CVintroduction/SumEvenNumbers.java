package com.gqt.corejava.CVintroduction;

public class SumEvenNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even Numbers from 1 to 100 is "+sum);
	}

}
