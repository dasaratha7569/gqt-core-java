package GQT_Total_codes;
interface Drawable1 {
    void draw();
}

interface Erasable {
    void erase();
}

class Whiteboard implements Drawable1, Erasable {
    public void draw() { System.out.println("Drawing on Whiteboard"); }
    public void erase() { System.out.println("Erasing Whiteboard"); }
}

class Chalkboard implements Drawable1, Erasable {
    public void draw() { System.out.println("Drawing on Chalkboard"); }
    public void erase() { System.out.println("Erasing Chalkboard"); }
}

public class Interface21 {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        wb.draw();
        wb.erase();

        Chalkboard cb = new Chalkboard();
        cb.draw();
        cb.erase();
    }
}