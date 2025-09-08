package GQT_Total_codes;
class TriangleUtil {
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Static9 {
    public static void main(String[] args) {
        System.out.println("Area of triangle = " + TriangleUtil.area(10, 5));
    }
}