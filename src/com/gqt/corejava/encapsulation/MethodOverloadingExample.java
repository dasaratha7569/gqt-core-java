package com.gqt.corejava.encapsulation;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	double add(float a, double b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, int b) {
		return a+b;
	}
	double add(double a, float b) {
		return a+b;
	}
	double add(int a,int b, double c) {
		return a+b+c;
	}
	double add(int a,float b, double c) {
		return a+b+c;
	}
	double add(float a,float b, double c) {
		return a+b+c;
	}
	double add(double a,double b, double c) {
		return a+b+c;
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		int a=10,b=20,c=30;
		float f1=10.33f,f2=28.88f,f3=30.56f;
		double d1=100.333,d2=200.333,d3=300.333;
		System.out.println(c1.add(a, b));
		System.out.println(c1.add(f1, b));
		System.out.println(c1.add(c, f2));
		System.out.println(c1.add(a, d1));
		System.out.println(c1.add(d2, b));
		System.out.println(c1.add(d1, d2));
		System.out.println(c1.add(f2, d3));
		
	}

}
