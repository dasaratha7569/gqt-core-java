package GQT_Total_codes;
import java.util.*;

interface Sortable {
    void sort();
}

interface Searchable {
    boolean search(String key);
}

class MyList implements Sortable, Searchable {
    ArrayList<String> list = new ArrayList<>();

    void add(String item) { list.add(item); }

    public void sort() { Collections.sort(list); }
    public boolean search(String key) { return list.contains(key); }
}

class Dictionary implements Sortable, Searchable {
    TreeMap<String, String> dict = new TreeMap<>();

    void add(String word, String meaning) { dict.put(word, meaning); }

    public void sort() { 
        System.out.println("Dictionary sorted keys: " + dict.keySet());
    }
    public boolean search(String key) { return dict.containsKey(key); }
}

public class Interface11 {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("Banana");
        list.add("Apple");
        list.sort();
        System.out.println("Search Apple in List: " + list.search("Apple"));

        Dictionary dict = new Dictionary();
        dict.add("Dog", "Animal");
        dict.add("Book", "Object");
        dict.sort();
        System.out.println("Search Cat in Dictionary: " + dict.search("Cat"));
    }
}