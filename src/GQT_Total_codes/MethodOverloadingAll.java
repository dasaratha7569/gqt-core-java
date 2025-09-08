package GQT_Total_codes;

public class MethodOverloadingAll {

    public int sum(int a, int b) {
        return a + b;
    }
    public float sum(float a, float b) {
        return a + b;
    }
    public double area(double length, double breadth) {
        return length * breadth;
    }
    public double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public int min(int a, int b) {
        return (a < b) ? a : b;
    }
    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public double sqrt(double n) {
        return Math.sqrt(n);
    }
    public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double average(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return (double) sum / arr.length;
    }
    public double compoundInterest(double p, double r, double t, int n) {
        return p * Math.pow((1 + (r / (n * 100))), n * t) - p;
    }
    public double trapezoidArea(double a, double b, double h) {
        return ((a + b) / 2) * h;
    }
    public double parallelogramArea(double base, double height) {
        return base * height;
    }
    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }
    public double squareArea(double side) {
        return side * side;
    }
    public double rhombusArea(double d1, double d2) {
        return (d1 * d2) / 2.0;
    }
    public double polygonArea(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        MethodOverloadingAll obj = new MethodOverloadingAll();

        System.out.println("Sum of integers: " + obj.sum(5, 10));
        System.out.println("Sum of floats: " + obj.sum(5.5f, 3.3f));
        System.out.println("Area of rectangle: " + obj.area(5, 10));
        System.out.println("Volume of cylinder: " + obj.volume(3, 7));
        System.out.println("Factorial of 5: " + obj.factorial(5));
        System.out.println("Average of 3 numbers: " + obj.average(3, 6, 9));
        System.out.println("Max of 5 and 9: " + obj.max(5, 9));
        System.out.println("Min of 5 and 9: " + obj.min(5, 9));
        System.out.println("Power (2^5): " + obj.power(2, 5));
        System.out.println("Is 17 prime? " + obj.isPrime(17));
        System.out.println("Square root of 25: " + obj.sqrt(25));
        System.out.println("Perimeter of rectangle: " + obj.perimeter(5, 10));
        System.out.println("Area of circle: " + obj.area(7));
        System.out.println("Area of triangle: " + obj.area(5, 10, true));
        System.out.println("Celsius to Fahrenheit (100): " + obj.celsiusToFahrenheit(100));
        System.out.println("Fahrenheit to Celsius (212): " + obj.fahrenheitToCelsius(212));
        System.out.println("Volume of sphere (r=3): " + obj.sphereVolume(3));
        System.out.println("Average of array: " + obj.average(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Compound Interest: " + obj.compoundInterest(10000, 5, 2, 2));
        System.out.println("Area of trapezoid: " + obj.trapezoidArea(5, 7, 10));
        System.out.println("Area of parallelogram: " + obj.parallelogramArea(6, 4));
        System.out.println("Simple Interest: " + obj.simpleInterest(10000, 5, 2));
        System.out.println("Area of square: " + obj.squareArea(6));
        System.out.println("Area of rhombus: " + obj.rhombusArea(10, 12));
        System.out.println("Area of polygon (hexagon, side=6): " + obj.polygonArea(6, 6));
    }
}