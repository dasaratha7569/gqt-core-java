package GQT_Total_codes;


import java.util.ArrayList;
import java.util.HashSet;
interface List {
    void add(String item);
    void remove(String item);
    boolean contains(String item);
}

interface Set {
    void add(String item);
    void remove(String item);
    boolean contains(String item);
}


class ArrayListClass implements List {
    ArrayList<String> list = new ArrayList<>();

    public void add(String item) { list.add(item); }
    public void remove(String item) { list.remove(item); }
    public boolean contains(String item) { return list.contains(item); }
}

class HashSetClass implements Set {
    HashSet<String> set = new HashSet<>();

    public void add(String item) { set.add(item); }
    public void remove(String item) { set.remove(item); }
    public boolean contains(String item) { return set.contains(item); }
}

public class Interface7 {
    public static void main(String[] args) {
        ArrayListClass list = new ArrayListClass();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List contains Apple: " + list.contains("Apple"));

        HashSetClass set = new HashSetClass();
        set.add("Dog");
        set.add("Cat");
        System.out.println("Set contains Cat: " + set.contains("Cat"));
    }
}