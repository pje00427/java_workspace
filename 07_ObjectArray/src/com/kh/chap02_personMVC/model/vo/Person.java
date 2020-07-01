package com.kh.chap02_personMVC.model.vo;

// Model : ������ ���� �κ��� ó���ϴ� ����
// VO(Value Object) : �����͸� ��ƵѼ� �ִ� �뵵�� Ŭ����

public class Person {
	
	private String name;	// �̸�
	private int age;		// ����
	private int wealth;		// ���
	
	// �⺻������
	public Person() {
		
	}
	
	// �Ű�����������
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	// setter�޼ҵ�
	public void setName(String name) {		// �̸� �� ����� �޼ҵ�
		this.name = name;
	}
	
	public void setAge(int age) {			// ���� �� ����� �޼ҵ�
		this.age = age;
	}
	
	public void setWealth(int wealth) {		// ��� �� ����� �޼ҵ�
		this.wealth = wealth;
	}
	
	// getter�޼ҵ�
	public String getName() {		// �̸� �� ��ȯ�� �޼ҵ�
		return name;
	}
	
	public int getAge() { 			// ���� �� ��ȯ�� �޼ҵ�
		return age;
	}
	
	public int getWealth() {		// ��� �� ��ȯ�� �޼ҵ�
		return wealth;
	}
	
	// information�޼ҵ�
	// "�̸� : xxx, ���� : xx, ��� : xx"
	public String information() {	// ��� �ʵ尪 �ϳ��� ���ڿ��� ��ȯ�� �޼ҵ�
		return "�̸� : " + name + ", ���� : " + age + ", ��� : " + wealth;
	}

}








