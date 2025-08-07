package com.gqt.corejava.strings;

public class ImmutableProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Maha";
		String str2="Bharatha";
		str1.concat(str2);
		System.out.println(str1);
		str1=str1.concat(str2);//we forcedly allows to store inside the main string 
		System.out.println(str1);
	}

}
