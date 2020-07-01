package com.kh.chap01_inherit.after.model.vo;

public class Product /* extends Object */{
	
	// �� Ŭ������ ���������� ������ �־��� �ʵ�
	private String brand;		// �귣��
	private String pCode;		// ��ǰ�ڵ�
	private String pName;		// ��ǰ��
	private int price;			// ����
	
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
		return "�귣�� : " + brand + ", ��ǰ�ڵ� : " + pCode + ", ��ǰ�� : " + pName + ", ���� : " + price;
	}
}





