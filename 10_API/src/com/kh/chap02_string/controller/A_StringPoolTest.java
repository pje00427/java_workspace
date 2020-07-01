package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		/*
		 * String Ŭ���� : �Һ�Ŭ���� --> ������ �ʴ� Ŭ����
		 * 				  �ѹ� ���� �����ϰ� �����ϰ� �Ǹ� ���ڸ����� �����Ǵ� ���� X
		 * 				  ������ ���� �ѹ� ���� �� �� �б⸸ ���� ��� �����ϰ� ����
		 */
		
		// 1. �����ڸ� ���� ���ڿ� ���� 
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1/* .toString() */);
		System.out.println(str2/* .toString() */);
		// toString() --> String Ŭ������ �̹� �������̵� �Ǿ�����
		
		System.out.println(str1.equals(str2));
		// equals() --> String Ŭ������ �̹� �������̵� �Ǿ�����
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() --> String Ŭ������ �̹� �������̵� �Ǿ�����
		
		// ���࿡ ������ �ּҰ��� ���ؼ� �˰��� �Ѵٸ�
		// System.identityHashCode(�˰��� �ϴ� ��);
		
		System.out.println("== ��¥ �ּҰ� ==");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	
	public void method2() {
		
		// 2. ���ڿ��� ���ͷ��� ����
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		
		str2 = "hello";
		System.out.println(System.identityHashCode(str2));
		
		str2 = new String("������");
		
		// String Ŭ���� (�Һ�Ŭ����)
		// --> ��� ���� �����ϴ� ��� ������ �÷���(GC)�� ��� ������ �Ǵ� ���� ����
		// --> ������ ���� �б⸸ �ϴ� ��� String Ŭ������ ����
		
		
	}
	

}





