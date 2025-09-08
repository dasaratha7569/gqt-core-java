package com.gqt.corejava.InterFaceProgramming;

class Brain{
	double weight;
	float iq;
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public float getIq() {
		return iq;
	}
}

class Heart{
	double size;
	int valves;
	public Heart(double size, int valves) {
		super();
		this.size = size;
		this.valves = valves;
	}
	public double getSize() {
		return size;
	}
	public int getValves() {
		return valves;
	}
}
class Human{
	Brain b= new Brain(35.600,23.7f);
	Heart h1= new Heart(30.89,4);
}

class Book{
	String name;
	int cost;
	public Book(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
}
class Mobile1{
	String company;
	String type;
	public Mobile1(String company, String type) {
		super();
		this.company = company;
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public String getType() {
		return type;
	}
}
class Student extends Human{
	Human h= new Human();
	void hasBook(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getCost());
	}
	void hasMobile(Mobile1 m) {
		System.out.println(m.getCompany());
		System.out.println(m.getType());
	}
}
public class CombinationOfIsAHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		Book bk= new Book("Alibaba 40 theives",45);
		Mobile1 m= new Mobile1("Samsung","S23 FE");
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getIq());
		System.out.println("--------------");
		System.out.println(s.h1.getSize());
		System.out.println(s.h1.getValves());
		System.out.println("--------------");
		s.hasBook(bk);
		System.out.println("--------------");
		s.hasMobile(m);
	}

}
