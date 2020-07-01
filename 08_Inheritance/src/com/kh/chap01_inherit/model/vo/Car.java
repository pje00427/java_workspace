package com.kh.chap01_inherit.model.vo;

public class Car extends Vehicle {
	
	private int tire;
	
	public Car() {
		
	}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public int getTire() {
		return tire;
	}
	
	// �������̵�
	public String information() {
		return super.information() + ", ������ : " + tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("������ �����ϸ� �����δ�.");
	}

}
