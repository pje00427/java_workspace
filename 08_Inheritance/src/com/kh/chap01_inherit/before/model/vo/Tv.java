package com.kh.chap01_inherit.before.model.vo;

public class Tv {
	
	private String brand; // 브랜드
	private String pCode; // 상품코드
	private String pName; // 상품명
	private int price; 	  // 가격
	
	private int inch;	  // 인치
	
	// 기본생성자
	public Tv() {
		
	}

	// 매개변수 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}
	
	// setter
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
	
	public void setInch(int inch) {
		this.inch = inch;
	}


	// getter
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
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode
				+ ", 제품명 : " + pName + ", 가격 : " + price + ", 인치 : " + inch;
	}
}
