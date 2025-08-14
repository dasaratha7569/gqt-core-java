package com.gqt.corejava.Polymorphism;

class Animal {
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
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat...");
    }
    void hunt() {
        System.out.println("Lion hunts prey...");
    }
}

class Elephant3 extends Animal {
    @Override
    void eat() {
        System.out.println("Elephant eats grass and fruits...");
    }

    void sprayWater() {
        System.out.println("Elephant sprays water with trunk...");
    }
}
class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("Monkey eats bananas...");
    }
    void climbTrees() {
        System.out.println("Monkey climbs trees...");
    }
}
public class Example2 {

    public static void main(String[] args) {
        Lion l1 = new Lion();
        Elephant3 e1 = new Elephant3();
        Monkey m1 = new Monkey();

		Animal ref;
        
        ref=l1;
        ref.eat();
        ref.makeSound();
        ref.sleep();
        l1.hunt();
        System.out.println("-------------");
        ref=e1;
        ref.eat();
        ref.makeSound();
        ref.sleep();
        e1.sprayWater();
        System.out.println("-----------");
        ref=m1;
        ref.eat();
        ref.makeSound();
        ref.sleep();
        m1.climbTrees();
        System.out.println("-------------");
    }
}