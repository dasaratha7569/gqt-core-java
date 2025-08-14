package com.gqt.corejava.Inheritance;
class Plane{
	void TakeOff() {
		System.out.println("Plane take off..");
	}
	void fly() {
		System.out.println("Plane flys..");
	}
	void land() {
		System.out.println("Plane lands..");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlans flys at low heights..");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods..");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("PassengerPlans flys at medium heights..");
	}
	void carryHumans() {
		System.out.println("PassengerPlans carry Humans..");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights..");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons..");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp= new FighterPlane();
		
		cp.TakeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("-------------");
		pp.TakeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("-----------");
		fp.TakeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("-------------");
	}

}
