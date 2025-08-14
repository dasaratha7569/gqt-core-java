package com.gqt.corejava.Inheritance;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal zero parametrized constructor is invoked..");
	}
	public Animal(String msg) {
		super();
		System.out.println("Animal parametrized constructor is invoked..");
		System.out.println("The animal constructor has received the messages as : "+msg);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello from elephant");
		System.out.println("Hii from  elephant construtor..");
	}
	public Elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e1= new Elephant();
		System.out.println("-----------");
		Elephant e2= new Elephant("Arjun",769083);
		System.out.println("----------");
	}

}
