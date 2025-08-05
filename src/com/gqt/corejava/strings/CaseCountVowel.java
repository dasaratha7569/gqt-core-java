package com.gqt.corejava.strings;

import java.util.Scanner;

public class CaseCountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		int v_cap_co=0;
		int v_sma_co=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					v_cap_co++;
				}
			} else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					v_sma_co++;
				}
			}
		}
		System.out.println("The vowel captial case count is = "+v_cap_co);
		System.out.println("The vowel small case count is = "+v_sma_co);
		sc.close();

	}

}
