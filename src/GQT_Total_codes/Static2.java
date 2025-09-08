package GQT_Total_codes;
class MathUtil {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) fact *= i;
        return fact;
    }
}

public class Static2 {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + MathUtil.factorial(5));
    }
}