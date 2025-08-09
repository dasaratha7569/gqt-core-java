package com.gqt.corejava.CVDataTypes;

import java.util.Scanner;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);	
		byte by=sc.nextByte();
		short sh=sc.nextShort();
		int in=sc.nextInt();
		long lo=sc.nextLong();
		float flo=sc.nextFloat();
		double dou=sc.nextDouble();
		boolean bool=sc.nextBoolean();
		
		
		
		char c='D';
		byte b=126;
		short s=32767;
		int i=21434;
		long l=7569592272L;
		float f=32.67f;
		double d=3.142223434;
		boolean b1=false;
		
		System.out.println("Character= "+ch);
		System.out.println("Byte= "+by);
		System.out.println("Short= "+sh);
		System.out.println("Integer= "+in);
		System.out.println("long= "+lo);
		System.out.println("float= "+flo);
		System.out.println("Double= "+dou);
		System.out.println("Boolean= "+bool);
		
		
		System.out.println("Character= "+c);
		System.out.println("Byte= "+b);
		System.out.println("Short= "+s);
		System.out.println("Integer= "+i);
		System.out.println("long= "+l);
		System.out.println("float= "+f);
		System.out.println("Double= "+d);
		System.out.println("Boolean= "+b1);
		
	}

}
