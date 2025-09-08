package GQT_Total_codes;
class CylinderUtil {
    public static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}

public class Static11 {
    public static void main(String[] args) {
        System.out.println("Volume of cylinder = " + CylinderUtil.volume(3, 10));
    }
}