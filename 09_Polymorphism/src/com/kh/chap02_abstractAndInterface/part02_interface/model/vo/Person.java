package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int health;
	
	// 기본생성자
	public Person() {
		
	}
	
	// 매개변수생성자
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// setter/getter메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	// toString메소드
	@Override
	public String toString() {
		return "이름 : " + name + ", 몸무게 : " + weight + ", 건강도 : " + health;
	}
	
	// 추상메소드
	//public abstract void eat();
	//public abstract void sleep();
}




