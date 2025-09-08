package GQT_Total_codes;
interface Drawable{
	void draw();
}
interface Resizable{
	void resize();
}
class Draw implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Invoking interface Drawable methods");
		
	}
	
}
class Resize implements Resizable{

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("Invoking interface Resizable Methods");
		
	}
	
}
public class Interface1 {
	public static void main(String[] args) {
		Resize r=new Resize();
		r.resize();
		Draw d=new Draw();
		d.draw();
	
	}
}