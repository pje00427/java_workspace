package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.part01_methodTest.controller.MethodTest2;

public class Run {
	
	public static void main(String[] args) {
		
		// -------- MethodTest1 --------
		/*
		MethodTest1 m1 = new MethodTest1();
		
		// method1ȣ��
		m1.method1();
		
		//System.out.println(m1.method1());
		
		
		// method2ȣ��
		//String str = m1.method2();
		//System.out.println(str);
		
		System.out.println(m1.method2());
		
		
		// method3 ȣ��
		m1.method3(10, 5);
		
		// method4 ȣ��
		//int result = m1.method4(5, 2);
		//System.out.println(result);
		System.out.println(m1.method4(5, 2));
		
		
		User u = new User("user01", "pass01", "ȫ�浿");
		System.out.println("������ u - " + u.information());
		
		m1.test(u);
		System.out.println(u.information());
		
		
		int[] arr = new int[4];
		
		m1.test2(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		// ------------ MethodTest2 ------------
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("������");
		
		String str = MethodTest2.method4("������");
		System.out.println(str);
		
		// public static �޼ҵ� ȣ���
		// Ŭ������.�޼ҵ��([���ް�]);
		
		System.out.println(Math.random());
		
		//Math m = new Math();  // Math Ŭ���� ���� �� public static
								// ��, Ŭ������. ���� ���� ���� == ��ü������ �ʿ� ����
								// �ƽθ� ������ �ȵǰԲ� �⺻�������� ���������ڸ� private���� �س���!!
		
		System.out.println();
		
		
		//Scanner sc = new Scanner(System.in);
	}

}







