package com.kh.operator;

// �񱳿����� (���迬����)
public class D_Comparison {
	
	/*
	 * * �񱳿�����
	 * - �� ���� ���ϴ� ������
	 * - �� ������ �����ϸ� true(��), false(����)
	 * 
	 * <��Һ񱳿���>
	 * a < b 	: a�� b���� �۽��ϱ�?
	 * a > b	: a�� b���� Ů�ϱ�?
	 * a <= b	: a�� b���� �۰ų� �����ϱ�?
	 * a >= b	: a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * <����񱳿���>
	 * a == b	: a�� b�� �����ϱ�?
	 * a != b	: a�� b�� Ʋ���ϱ�?
	 * !(a==b) 
	 * 
	 */
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		boolean result = (a != b);
		System.out.println("result : " + result);
		
		// ������� + �񱳿���
		
		// a�� b�� ���Ѱ��� 100���� Ů�ϱ�?
		System.out.println((a + b) > 100);
		
		System.out.println("a�� ¦���ΰ� : " + (a % 2 == 0));
		System.out.println("a�� Ȧ���ΰ� : " + !(a % 2 == 0));
		System.out.println("a�� Ȧ���ΰ� : " + (a % 2 != 0));
		System.out.println("a�� Ȧ���ΰ� : " + (a % 2 == 1));
		
		
	}
	
	
}





