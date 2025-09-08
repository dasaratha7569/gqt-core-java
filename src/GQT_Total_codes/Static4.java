package GQT_Total_codes;
class DigitUtil {
    public static int sumDigits(int n) {
        if(n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}

public class Static4 {
    public static void main(String[] args) {
        System.out.println("Sum of digits (1234) = " + DigitUtil.sumDigits(1234));
    }
}