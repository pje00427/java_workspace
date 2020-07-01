package com.kh.chap01_inherit.model.vo;

			// �ڽ�   extends �θ�Ŭ����
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
	
	// �������̵� 
	public String information() {
		return super.information() + ", ������ : " + tire + ", ������ : " + wing;
	}

	@Override
	public void howToMove() {
		System.out.println("������ �����ϸ� �����δ�.");
	}
	
}
