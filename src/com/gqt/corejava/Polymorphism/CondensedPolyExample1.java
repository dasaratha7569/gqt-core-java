package com.gqt.corejava.Polymorphism;

class Plane1{
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
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("CargoPlans flys at low heights..");
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
	void carryHumans() {
		System.out.println("PassengerPlans carry Humans..");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights..");
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
public class CondensedPolyExample1 {

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
	}

}
