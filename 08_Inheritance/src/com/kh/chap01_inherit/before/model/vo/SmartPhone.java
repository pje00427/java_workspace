package com.kh.chap01_inherit.before.model.vo;

public class SmartPhone {
	
	private String brand; // 브랜드
	private String pCode; // 상품코드
	private String pName; // 상품명
	private int price;    // 가격
	
	private String mobileAgency; // 통신사
	
	// 기본 생성자
	public SmartPhone() {
		
	}

	// 매개변수 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
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
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode
				+ ", 제품명 : " + pName + ", 가격 : " + price + ", 통신사 : " + mobileAgency;
	}
}
