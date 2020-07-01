package com.kh.chap01_inherit.model.vo;

public class Ship extends Vehicle {

	private int propeller;
	
	public Ship() {
		
	}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	
	// 오버라이딩
	public String information() {
		return super.information() + ", 프로펠러수 : " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 구동하며 움직인다.");
	}
	
}
