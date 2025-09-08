package GQT_Total_codes;
interface Runnable {
    void run();
}

interface Walkable {
    void walk();
}

class Cheetah implements Runnable {
    public void run() { System.out.println("Cheetah runs fast!"); }
}

class Tortoise implements Walkable {
    public void walk() { System.out.println("Tortoise walks slowly."); }
}

public class Interface17 {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.run();

        Tortoise tortoise = new Tortoise();
        tortoise.walk();
    }
}