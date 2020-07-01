package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화
	
	// 직렬화 선언해야됨!! (객체 자체를 입출력 하고자 한다면)
	
	// 필드부
	private String brand;
	private String name;
	private int price;
	
	// 생성자부
	public Phone() {
		
	}
	
	public Phone(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	// 메소드부
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
