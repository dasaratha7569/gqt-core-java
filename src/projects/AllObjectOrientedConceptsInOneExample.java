package projects;
import java.util.Scanner;
abstract class Shapes{
	Scanner sc= new Scanner(System.in);
	double area;
	abstract void collect();
	abstract void calculate();
	void area() {
		System.out.println("The Area is: "+area);
	}
}
class Circle extends Shapes{
	private double r;
	private final double pi=3.147;
	@Override
	void collect() {
		System.out.println("enter the radius: ");
		r=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=pi*r*r;
	}
}
class Rectangle extends Shapes{
	private double l,b;
	@Override
	void collect() {
		System.out.println("enter the length: ");
		l=sc.nextDouble();
		System.out.println("enter the breadth: ");
		b=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=l*b;
	}
}
class Square extends Shapes{
	private double side;
	@Override
	void collect() {
		System.out.println("enter the side: ");
		side=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=side*side;
	}
}
class Geometry{
	void useShapes(Shapes s) {
		s.collect();
		s.calculate();
		s.area();
	}
}

public class AllObjectOrientedConceptsInOneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Square s= new Square();
		Geometry g= new Geometry();
		
		g.useShapes(c);
		System.out.println("---------------");
		g.useShapes(r);
		System.out.println("---------------");
		g.useShapes(s);
		System.out.println("---------------");
	}

}
