package GQT_Total_codes;
class Number {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}

public class Static6 {
    public static void main(String[] args) {
        System.out.println("Min = " + Number.min(10, 20));
    }
}