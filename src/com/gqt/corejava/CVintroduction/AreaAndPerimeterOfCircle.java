package com.gqt.corejava.CVintroduction;
import java.util.Scanner;
public class AreaAndPerimeterOfCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius=sc.nextDouble();
		double area= Math.PI*radius*radius;
		System.out.println("The area of the circle is: "+area);
		double perimeter=2*Math.PI*radius;
		System.out.println("The perimeter of the circle is: "+perimeter);
		sc.close();
	}

}
