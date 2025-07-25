package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class Aadhaar3{
	String fullname;
	String gender;
	String DOB;
	int age;
	String address;
	int pincode;
	static String country;
	long phonenumber;
	String email;
	static {
		country="India";
	}
	void data() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the FullName:");
		fullname=sc.nextLine();
		System.out.println("Enter the Gender:");
		gender=sc.nextLine();
		System.out.println("Enter the DOB:");
		DOB=sc.nextLine();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Address:");
		address=sc.nextLine();
		System.out.println("Enter the pincode:");
		pincode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the phoneNumber:");
		phonenumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the email:");
		email=sc.nextLine();	
	}
	void display() {
		System.out.println("FullName:"+fullname);
		System.out.println("gender  :"+gender);
		System.out.println("DOB     :"+DOB);
		System.out.println("Age     :"+age);
		System.out.println("Address :"+address);
		System.out.println("Pincode :"+pincode);
		System.out.println("Country :"+country);
		System.out.println("PhoneNumber:"+phonenumber);
		System.out.println("Email   :"+email);
		
	}
	
}

public class Aadhaar1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadhaar3 a1=new Aadhaar3();
		Aadhaar3 a2=new Aadhaar3();
		System.out.println("AADHAAR-1 DETAILS");
		a1.data();
		a1.display();
		System.out.println("----------------");
		System.out.println("AADHAAR-2 DETAILS");
		a2.data();
		a2.display();
	}

}
