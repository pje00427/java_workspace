package com.kh.chap01_objectVSobjectArray.model.vo;

public class Product {
	
	private String name;		// 제품명
	private String brand;		// 브랜드명
	private int price;			// 가격
	
	// 기본생성자
	public Product() {
		
	}
	
	// 매개변수생성자
	public Product(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	// setter메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter메소드
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	// information메소드
	public String information() {
		return "Product[name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}









