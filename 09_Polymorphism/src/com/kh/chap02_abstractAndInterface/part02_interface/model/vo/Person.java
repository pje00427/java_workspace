package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int health;
	
	// �⺻������
	public Person() {
		
	}
	
	// �Ű�����������
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// setter/getter�޼ҵ�
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
	
	// toString�޼ҵ�
	@Override
	public String toString() {
		return "�̸� : " + name + ", ������ : " + weight + ", �ǰ��� : " + health;
	}
	
	// �߻�޼ҵ�
	//public abstract void eat();
	//public abstract void sleep();
}




