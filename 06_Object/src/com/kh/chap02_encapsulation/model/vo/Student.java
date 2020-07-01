package com.kh.chap02_encapsulation.model.vo;

public class Student {
	
	private String name;
	private int age;
	private double height;
	
	
	// setter�޼ҵ�
	// - ȣ��� ���ް��� �� �ʵ忡 ���Խ����ִ� �޼ҵ�
	/*
	public void setName(String newName) { // (�Ű����� == �޼ҵ� ȣ�� �� ���ް��� �޾��ֱ� ���� ����)
		name = newName;
	}
	*/
	
	// ** ������� **
	// setter�޼ҵ� �̸������� setXXX�� ��Ÿǥ��� ��Ųä�� �����ش�. ex) setName, setAge, setHeight
	// setter�޼ҵ��� �Ű��������� ������ �ʵ��� �����ϰ� �����ش�.
	public void setName(String name) {
		//name = name; // �Ű����� name = �Ű����� name;
					 // {}���������� �ش� ������ ������� ������ �켱���� ����
		
		this.name = name;
	}
	
	public void setAge(int age) { // ���̰��� ��������ִ� �޼ҵ�
		this.age = age;
	}
	
	public void setHeight(double height) { // Ű���� ��������ִ� �޼ҵ�
		this.height = height;
		
		//return;
	}
	
	
	// getter�޼ҵ� : �� �ʵ忡 ����ִ� ���� ��ȯ�����ִ� �޼ҵ�
	public String getName() {
		return name; // name �ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ�
	}
	
	public int getAge() {
		return age; // age�ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ�
	}
	
	public double getHeight() {
		return height; // height �ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ�
	}
	
	
	// ��� �ʵ尪���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String information() {
		
		// XXX���� XX���̰�, Ű�� XXXcm�Դϴ�.
		String info = name + "���� " + age + "���̰�, Ű�� " + height + "cm�Դϴ�.";
		return info;
		
	}
	
	
	
}






