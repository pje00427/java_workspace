package com.kh.chap01_objectVSobjectArray.model.vo;

// model : ������ ����
// vo(Value Object) : ������(����)�� ������ Ŭ����
public class Book {
	
	// �ʵ�� (�ʵ� == ������� == �Ӽ�)
	// ǥ���� - ���������� [�����] �ڷ��� ������ [= ��];
	private String title; 		// ������
	private String author;  	// ���ڸ�
	private int price;			// ����
	private String publisher;   // ���ǻ�
	
		
	// �����ں� 
	// ǥ���� 
	// ���������� Ŭ������() { }					 - �⺻������ : ���� �������� ����
	// ���������� Ŭ������(�Ű�����, �Ű�����, ...) { } - �Ű����� ������ : �����Ӹ��ƴ϶� ���ް����� �ʵ忡 �ʱ�ȭ����
	
	// �⺻������ : ���� ������ (��, �ش� �ʵ�� ���� Ȯ������ ����)
	public Book() {
		
	}
	
	// �Ű����������� : ������ ���ÿ� ���ް���� �ش� �ʵ� �ʱ�ȭ�� �� �ִ� ������
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	// �޼ҵ�� (��� == �޼ҵ� == �Լ�)
	// ǥ���� - ���������� [�����] ��ȯ�� �޼ҵ��([�Ű�����, �Ű�����, ...]) { }
	
	// setter �޼ҵ� : ���ް� ���� �� �ش� �ʵ忡 �ʱ�ȭ�� ����
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// getter �޼ҵ� : �ش� �ʵ忡 ��䰪 ��ȯ�� ����
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	// information �޼ҵ� : ��� �ʵ忡 ��䰪���� �ϳ��� ���ڿ��� ���ļ� ��ȯ�� ����
	public String information() {
		return "���� : " + title + ", ���� : " + author + ", ���� : " + price + ", ���ǻ� : " + publisher;
	}
	

}




