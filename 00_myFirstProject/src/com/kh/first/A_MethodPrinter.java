package com.kh.first;	// ��Ű�� ����� : �� Ŭ������ � ��Ű���� �����ִ���

public class A_MethodPrinter {
	
	// ��� == �޼ҵ�
	
	public void methodA() {
		System.out.println("�޼ҵ� A ��¹�");
		methodB();
	}
	
	public void methodB() {
		System.out.println("�޼ҵ� B ��¹�");
		methodC();
	}
	
	public void methodC() {
		System.out.println("�޼ҵ� C ��¹�");
		//methodA();
	}
	

}



