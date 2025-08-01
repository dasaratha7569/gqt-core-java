package com.gqt.corejava.CVArrays;

public class FreqElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,6,3,5,78,9,2,1,6,2,78,9,10,9};
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					c+=1;
				}
			}
			System.out.println("The count of "+arr1[i]+" is : "+c);
		}
	}

}
