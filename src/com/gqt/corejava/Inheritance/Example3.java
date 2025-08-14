package com.gqt.corejava.Inheritance;

class Animal43 {
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
class Lion extends Animal43 {
    @Override
    void eat() {
        System.out.println("Lion eats meat...");
    }
    void hunt() {
        System.out.println("Lion hunts prey...");
    }
}

class Elephant3 extends Animal43 {
    @Override
    void eat() {
        System.out.println("Elephant eats grass and fruits...");
    }

    void sprayWater() {
        System.out.println("Elephant sprays water with trunk...");
    }
}
class Monkey extends Animal43 {
    @Override
    void eat() {
        System.out.println("Monkey eats bananas...");
    }
    void climbTrees() {
        System.out.println("Monkey climbs trees...");
    }
}
public class Example3 {

    public static void main(String[] args) {
        Lion l1 = new Lion();
        Elephant3 e1 = new Elephant3();
        Monkey m1 = new Monkey();

        l1.eat();
        l1.makeSound();
        l1.sleep();
        l1.hunt();
        System.out.println("-------------");

        e1.eat();
        e1.makeSound();
        e1.sleep();
        e1.sprayWater();
        System.out.println("-----------");

        m1.eat();
        m1.makeSound();
        m1.sleep();
        m1.climbTrees();
        System.out.println("-------------");
    }
}