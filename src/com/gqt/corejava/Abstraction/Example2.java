package com.gqt.corejava.Abstraction;

abstract class Animal8 {
    abstract void eat();
    abstract void makeSound();
    void sleep() {
        System.out.println("Animal sleeps...");
    }
}
class Lion8 extends Animal8 {
    @Override
    void eat() {
        System.out.println("Lion eats meat...");
    }
    @Override
    void makeSound() {
    	System.out.println("Lion roars...");
    }
    void hunt() {
        System.out.println("Lion hunts prey...");
    }
}

class Elephant8 extends Animal8 {
    @Override
    void eat() {
        System.out.println("Elephant eats grass and fruits...");
    }
    @Override
    void makeSound() {
    	System.out.println("Elephant small sounds...");
    }
    void sprayWater() {
        System.out.println("Elephant sprays water with trunk...");
    }
}
class Monkey8 extends Animal8 {
    @Override
    void eat() {
        System.out.println("Monkey eats bananas...");
    }
    @Override
    void makeSound() {
    	System.out.println("Monkey kichkich...");
    }
    void climbTrees() {
        System.out.println("Monkey climbs trees...");
    }
}
class Zoo{
	void permit(Animal8 ref) {
		ref.eat();
		ref.makeSound();
		ref.sleep();
	}
}
public class Example2 {

    public static void main(String[] args) {
        Lion8 l1 = new Lion8();
        Elephant8 e1 = new Elephant8();
        Monkey8 m1 = new Monkey8();
        Zoo z1= new Zoo();
        
        z1.permit(l1);
        l1.hunt();
        System.out.println("-------------");
        z1.permit(e1);
        e1.sprayWater();
        System.out.println("-----------");
        z1.permit(m1);
        m1.climbTrees();
        System.out.println("-------------");
        Animal8 a1= new Animal8() {
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Animal eats food...");
			}
			@Override
			void makeSound() {
				// TODO Auto-generated method stub
				System.out.println("Animal make sounds each differently...");
			}	
        };
        a1.eat();
        a1.makeSound();
    }
}