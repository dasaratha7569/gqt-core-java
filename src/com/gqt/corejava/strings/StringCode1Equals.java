package com.gqt.corejava.strings;

public class StringCode1Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="RAMA";
		String str2="RAMA";
		String str3="rama";
		String str4="SITA";
		System.out.println("Case-1 : Same strings..");
		if(str1.equals(str2)==true) {
			System.out.println("Strings equal..");
		} else {
			System.out.println("Strings not equal");
		}
		System.out.println("-------------");
		if(str1==str2) {
			System.out.println("Refernces equal..");
		} else {
			System.out.println("Refernces not equal");
		}
		System.out.println("==============");
		System.out.println("Case-2 : Different strings..");
		if(str1.equals(str4)==true) {
			System.out.println("Strings equal..");
		} else {
			System.out.println("Strings not equal");
		}
		System.out.println("-------------");
		if(str1==str4) {
			System.out.println("Refernces equal..");
		} else {
			System.out.println("Refernces not equal");
		}
		System.out.println("==============");
		System.out.println("Case-3 : Same strings but different case..");
		if(str1.equals(str3)==true) {
			System.out.println("Strings equal..");
		} else {
			System.out.println("Strings not equal");
		}
		System.out.println("-------------");
		if(str1==str3) {
			System.out.println("Refernces equal..");
		} else {
			System.out.println("Refernces not equal");
		}
		System.out.println("==============");
	}

}
