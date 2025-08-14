package com.gqt.corejava.encapsulation;
class Dog143{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	//zero-parameterized constructor
	public Dog143(){
		super();

		System.out.println("Inside the zero parameterized constructor...");
		this.name="Ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="Pomorian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	//one parameterized constructor
	public Dog143(String name){
		this();//this will call to the 0 parameterized constructor

		System.out.println("Inside the one parameterized constructor...");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	//Two parameterized constructor
	public Dog143(String name,String color){
		this("Chintu");//this will call to the 1 parameterized constructor

		System.out.println("Inside the two parameterized constructor...");
		this.name=name;
		this.color=color;

		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	//Three parameterized constructor
	public Dog143(String name,String color,int cost){
		this("Tommy","Blue");//this will call to the 2 parameterized constructor

		System.out.println("Inside the three parameterized constructor...");
		this.name=name;
		this.color=color;
		this.cost=cost;


		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	//Four parameterized constructor
	public Dog143(String name,String color,int cost,int age){
		this("Dobby","Orange",9000);//this will call to the 3 parameterized constructor

		System.out.println("Inside the four parameterized constructor...");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;

		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	//Five parameterized constructor
	public Dog143(String name,String color,int cost,int age, String breed){
		this("Jimmy","Purple",7500,7);//this will call to the 4 parameterized constructor

		System.out.println("Inside the five parameterized constructor...");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;

		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}


}
public class ExampleForAllThePointsOnTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog143 d1= new Dog143("Rocky","White",8000,8,"GR");
	}
}
