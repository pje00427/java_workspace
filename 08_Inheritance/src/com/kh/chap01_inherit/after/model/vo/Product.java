package com.kh.chap01_inherit.after.model.vo;

public class Product /* extends Object */{
	
	// 세 클래스가 공통적으로 가지고 있었던 필드
	private String brand;		// 브랜드
	private String pCode;		// 상품코드
	private String pName;		// 상품명
	private int price;			// 가격
	
	public Product() {
		
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}

	public String information() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode + ", 제품명 : " + pName + ", 가격 : " + price;
	}
}





