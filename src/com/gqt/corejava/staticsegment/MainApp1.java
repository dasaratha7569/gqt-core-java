package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class Farmer{
	static double r;
	double p;
	double t;
	double si;
	static {
		r=2.789;
	}
	void CollectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle:");
		p=sc.nextDouble();
		System.out.println("Enter time:");
		t=sc.nextDouble();
	}
	void calculate() {
		si=(p*t*r)/100;
	}
	void display() {
		System.out.println("SI="+si);
	}
}
public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		System.out.println("Farmer-1");
		f1.CollectData();
		f1.calculate();
		f1.display();
		System.out.println("----------");
		System.out.println("Farmer-2");
		f2.CollectData();
		f2.calculate();
		f2.display();
		System.out.println("----------");
		System.out.println("Farmer-3");
		f3.CollectData();
		f3.calculate();
		f3.display();
		System.out.println("----------");
	}

}
