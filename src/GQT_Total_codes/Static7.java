package GQT_Total_codes;
class PowerUtil {
    public static double power(double base, int exp) {
        return Math.pow(base, exp);
    }
}

public class Static7 {
    public static void main(String[] args) {
        System.out.println("2^5 = " + PowerUtil.power(2, 5));
    }
}