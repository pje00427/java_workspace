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
	
	// �������̵�
	public String information() {
		return super.information() + ", �����緯�� : " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("�����緯�� �����ϸ� �����δ�.");
	}
	
}
