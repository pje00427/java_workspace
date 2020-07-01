package com.kh.chap03_class.model.vo;

// ���������� : public > protected > default(����) > private

// Ŭ���� �տ� ����� �� �ִ� ���������� : public / default(����)
public class Product {

	// �ʵ��
	private String pName;
	private int price;
	private String brand;
	
	// �����ں�
	public Product() { // �⺻������
		
	}
	
	// �޼ҵ��
	/*
	public void setPName(String pName) {
		
	}
	
	public void setPname(String pName) {
		
	}*/
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName + " " + price + " " + brand;
	}
	
}



