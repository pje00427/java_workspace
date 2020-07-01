package com.kh.chap01_inherit.before.model.vo;

public class Desktop {
	
	private String brand; // 브랜드
	private String pCode; // 상품코드
	private String pName; // 상품명
	private int price;	  // 가격
	
	private boolean allInOne; // 일체여부
	
	// 기본 생성자
	public Desktop() {
		
	}
	
	// 매개변수 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	
	// boolean 자료형 필드의 getter메소드명 : isXXX
	public boolean isAllInOne() {
		return allInOne;
	}
	
	
	public String information() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode 
				+ ", 제품명 : " + pName + ", 가격 : " + price + ", 일체여부 : " + allInOne;
	}

}
