package com.kh.chap01_inherit.model.vo;

			// 자식   extends 부모클래스
public class Airplane extends Vehicle {
	
	private int tire;
	private int wing;
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	
	public int getWing() {
		return wing;
	}
	
	// 오버라이딩 
	public String information() {
		return super.information() + ", 바퀴수 : " + tire + ", 날개수 : " + wing;
	}

	@Override
	public void howToMove() {
		System.out.println("날개를 구동하며 움직인다.");
	}
	
}
