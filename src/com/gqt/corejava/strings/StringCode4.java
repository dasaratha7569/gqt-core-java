package com.gqt.corejava.strings;

public class StringCode4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("RAMA");
		String str2=new String("RAMA");
		String str3=new String("rama");
		String str4=new String("SITA");
		System.out.println("Case-1 : Same strings..");
		if(str1.equalsIgnoreCase(str2)==true) {
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
		if(str1.equalsIgnoreCase(str4)==true) {
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
		if(str1.equalsIgnoreCase(str3)==true) {
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
