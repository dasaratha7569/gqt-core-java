package com.gqt.corejava.InterFaceProgramming;
//composition
class OS{
	String vers_name;
	double vers_numb;
	public OS(String vers_name, double vers_numb) {
		super();
		this.vers_name = vers_name;
		this.vers_numb = vers_numb;
	}
	public String getVers_name() {
		return vers_name;
	}
	public double getVers_numb() {
		return vers_numb;
	}
	
}
//aggregation
class Charger{
	String company;
	double voltage;
	public Charger(String company, double voltage) {
		super();
		this.company = company;
		this.voltage = voltage;
	}
	public String getCompany() {
		return company;
	}
	public double getVoltage() {
		return voltage;
	}
}
class Mobile{
	OS os= new OS("Windows",12.7);
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger c= new Charger("HP",5.5);
		Mobile m= new Mobile();
		System.out.println(m.os.getVers_name());
		System.out.println(m.os.getVers_numb());
		m.hasCharger(c);
		
		m=null;
//		System.out.println(m.os.getVers_name());
//		System.out.println(m.os.getVers_numb());
		
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
		
	}

}
