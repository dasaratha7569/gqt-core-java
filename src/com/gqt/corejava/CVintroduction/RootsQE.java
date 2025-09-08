package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class RootsQE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a,b,c values:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=(b*b)-(4*a*c);
		if(a==0) {
			System.out.println("a sould dont be zero");
		}
		else if(d>0){
			System.out.println("roots are Real and Distinct");
		}
		else if(d==0){
			System.out.println("roots are Real and Equal");
		}
		else {
			System.out.println("Roots are complex and imaginary");
		}
	}
}
