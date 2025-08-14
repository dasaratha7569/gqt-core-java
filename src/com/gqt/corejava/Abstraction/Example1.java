package com.gqt.corejava.Abstraction;
abstract class test{
	void land() {
		System.out.println("Plane lands..");
	}
}
abstract class Plane1{
	abstract void TakeOff();
	abstract void fly() ;
	void land() {
		System.out.println("Plane lands..");
	}
}
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("CargoPlans flys at low heights..");
	}
	@Override
	void TakeOff() {
		System.out.println("CargoPlans takeoff from longer ways..");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods..");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("PassengerPlans flys at medium heights..");
	}
	@Override
	void TakeOff() {
		System.out.println("PassengerPlans takeoff from medium ways..");
	}
	void carryHumans() {
		System.out.println("PassengerPlans carry Humans..");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights..");
	}
	@Override
	void TakeOff() {
		System.out.println("fighterPlans takeoff from shorter ways..");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons..");
	}
}
class Airport{
	void permit(Plane1 ref) {
		ref.TakeOff();
		ref.fly();
		ref.land();
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane1 cp= new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp= new FighterPlane1();
		Airport ap= new Airport();
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("-------------");
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-----------");
		ap.permit(fp);
		fp.carryWeapons();
		System.out.println("-------------");
		
//		Plane1 p1= new Plane1();
		Plane1 p1= new Plane1() {
			@Override
			void TakeOff() {
				// TODO Auto-generated method stub
				System.out.println("Plane takeoff");
			}
			@Override
			void fly() {
				// TODO Auto-generated method stub
				System.out.println("Plane flys..");
			}
		};
		p1.TakeOff();
		p1.fly();
		
		test t1= new test() {};
	}

}
