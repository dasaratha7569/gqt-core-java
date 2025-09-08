package GQT_Total_codes;
class CircleUtil {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
public class Static3 {
	public static void main(String[] args) {
        System.out.println("Area of circle (r=7): " + CircleUtil.area(7));
    }
}
