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
	
	// 오버라이딩
	public String information() {
		return super.information() + ", 바퀴수 : " + tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 구동하며 움직인다.");
	}

}
