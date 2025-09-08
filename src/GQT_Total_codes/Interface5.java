package GQT_Total_codes;

interface Comparable {
    int compareTo(Object obj);
}

interface Cloneable {
    Object clone();
}

class NumberClass implements Comparable, Cloneable {
    int value;

    NumberClass(int value) {
        this.value = value;
    }

    public int compareTo(Object obj) {
        NumberClass n = (NumberClass) obj;
        return this.value - n.value;
    }

    public Object clone() {
        return new NumberClass(this.value);
    }
}

class Person implements Comparable, Cloneable {
    String name;

    Person(String name) {
        this.name = name;
    }

    public int compareTo(Object obj) {
        Person p = (Person) obj;
        return this.name.compareTo(p.name);
    }

    public Object clone() {
        return new Person(this.name);
    }
}

public class Interface5 {
    public static void main(String[] args) {
        NumberClass n1 = new NumberClass(10);
        NumberClass n2 = new NumberClass(20);
        System.out.println("Compare Numbers: " + n1.compareTo(n2));
        NumberClass n3 = (NumberClass) n1.clone();
        System.out.println("Cloned Number: " + n3.value);

        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");
        System.out.println("Compare Persons: " + p1.compareTo(p2));
        Person p3 = (Person) p1.clone();
        System.out.println("Cloned Person: " + p3.name);
    }
}