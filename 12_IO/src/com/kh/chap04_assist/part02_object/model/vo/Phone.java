package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // ����ȭ
	
	// ����ȭ �����ؾߵ�!! (��ü ��ü�� ����� �ϰ��� �Ѵٸ�)
	
	// �ʵ��
	private String brand;
	private String name;
	private int price;
	
	// �����ں�
	public Phone() {
		
	}
	
	public Phone(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	// �޼ҵ��
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	

}
