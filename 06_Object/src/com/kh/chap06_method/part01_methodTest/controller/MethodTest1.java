package com.kh.chap06_method.part01_methodTest.controller;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest1 {
	
	// �ʵ��
	// �����ں�
	
	// �޼ҵ��
	/*
	 * - ǥ����
	 * ���������� [�����] ��ȯ�ϰ����ϴ��ڷ��� �޼ҵ��([�Ű�����, �Ű�����, ..]) {
	 * 		
	 * 		�����Ű���� �ϴ� �ڵ�... ;
	 * 
	 * 		[return ��ȯ�ϰ����ϴ°�;]
	 * 
	 * }
	 */
	
	// 1. �Ű����� ���� ��ȯ�� ���� ���� �޼ҵ�
	public void method1() {
		
		System.out.println("�Ű������� ���� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		
		//return; // ������� ������ JVM�� �ڵ� ����
	}
	
	// 2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
	public String method2() {
		
		System.out.println("�Ű����� ���� ��ȯ���� �ִ� �޼ҵ��Դϴ�.");
		
		//String name = "������";
		//return name;
		
		return "������";
		
	}
	
	// 3. �Ű����� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		
		// 10 + 3 = 13
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
	}
	
	// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		return num1 * num2;
	}
	
	
	// ** �߰� **
	public void test(User user) { // User user = u; // �ּҰ� ����
		
		user.setGender('M');
		
	}
	
	public void test2(int[] a) {
		a[1] = 10;
	}
	
	

}











