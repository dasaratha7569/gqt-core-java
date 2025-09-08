package GQT_Total_codes;
interface Printable1 {
    void print();
}

interface Scannable {
    void scan();
}

class Printer1 implements Printable1 {
    public void print() { System.out.println("Printing document..."); }
}

class ScannerDevice implements Scannable {
    public void scan() { System.out.println("Scanning document..."); }
}

public class Interface9 {
    public static void main(String[] args) {
        Printer1 printer = new Printer1();
        printer.print();

        ScannerDevice scanner = new ScannerDevice();
        scanner.scan();
    }
}