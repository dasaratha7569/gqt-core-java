package GQT_Total_codes;
interface Drawablea {
    void draw();
}

interface Printable {
    void print();
}

class Canvas implements Drawablea {
    public void draw() { System.out.println("Drawing on Canvas..."); }
}

class Printer implements Printable {
    public void print() { System.out.println("Printing on Paper..."); }
}
public class Interface29 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.draw();

        Printer printer = new Printer();
        printer.print();
    }
}