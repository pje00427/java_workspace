package com.kh.chap06_method.part01_methodTest.controller;

// static �޼ҵ�
public class MethodTest2 {
	
	public static int num1 = 10;
	public static int num2 = 20;
	
	
	// 1. �Ű�����x ��ȯ��x �޼ҵ�
	public static void method1() {
		System.out.println(num1 + num2); // 30
		num2++;
	}
	
	// 2. �Ű�����x ��ȯ��o �޼ҵ�
	public static int method2() {
		return num1 + num2;
	}
	
	// 3. �Ű�����o ��ȯ��x �޼ҵ�
	public static void method3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�.");
	}
	
	// 4. �Ű�����o ��ȯ��o �޼ҵ�
	public static String method4(String name) {
		return name + "�� �ȳ���������!";
	}
	

}





