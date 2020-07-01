package com.kh.chap01_inherit.model.vo;

public class Vehicle {
	
	private String name;
	private double mileage;
	private String kind;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String information() {
		return "이름 : " + name + ", 연비 : " + mileage + ", 종류 : " + kind;
	}

	public void howToMove() {
		System.out.println("움직인다");
	}
	
}
