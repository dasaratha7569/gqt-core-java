package com.gqt.corejava.Polymorphism;

class Animal8 {
    void eat() {
        System.out.println("Animal eats...");
    }
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
    void sleep() {
        System.out.println("Animal sleeps...");
    }
}
class Lion8 extends Animal8 {
    @Override
    void eat() {
        System.out.println("Lion eats meat...");
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

    void sprayWater() {
        System.out.println("Elephant sprays water with trunk...");
    }
}
class Monkey8 extends Animal8 {
    @Override
    void eat() {
        System.out.println("Monkey eats bananas...");
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
public class CondensedPolymExample2 {

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
    }
}