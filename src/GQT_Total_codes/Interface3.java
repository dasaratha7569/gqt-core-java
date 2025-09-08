package GQT_Total_codes;
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying in the sky...");
    }
}

class Fish implements Swimable {
    public void swim() {
        System.out.println("Fish is swimming in the water...");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}