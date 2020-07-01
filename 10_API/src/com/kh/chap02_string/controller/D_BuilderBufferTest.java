package com.kh.chap02_string.controller;

public class D_BuilderBufferTest {
	
	/*
	 * * String (�Һ� Ŭ���� => ���ڸ����� ���� ����Ǵ°� �ƴ�)
	 * => ������ ���� �б⸸ �ϴ� ��� ����
	 * 
	 * * StringBuilder, StringBuffer (���� Ŭ���� => �� �ڸ����� ���� ����)
	 * - ó���� 16���� ���ڸ� ������ �� �ִ� ���۰� ���� ��! 
	 * - �� �� ��� �����ڳ� �޼ҵ���� ����!
	 *   ��, ������ ������ : ����ȭ�� �ǳ� �ȵǳ��� ���� => �ӵ� ����
	 *   
	 *   StringBuffer : ����ȭ ���� O
	 *   StringBuilder : ����ȭ ���� X
	 *   
	 * 	������ : ���� ����
	 * 
	 *  ��Ƽ������(�������� ��ó���� ���ôٹ������� �����ؼ� ����) ȯ�� --> ����ȭ ó���� �� �ɷ� ������ �ؾ� �����ϴ�. --> StringBuffer
	 *  ���Ͻ����� ȯ�� --> ����ȭ ó���� �ʿ� ����! ����ȭ �۾��� �ϰ� �Ǹ� �ӵ� ���ϵǴ� ���� �߻�! --> StringBuilder ��� ����
	 *   
	 */

	public void method1() {
		String str = "������";
		
		// 1. �⺻�����ڷ� ����!! => ���뷮 : �⺻�� 16���� ����
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1�� ���뷮 : " + sb1.capacity());
		System.out.println("sb1�� ���ڿ��� ���� : " + sb1.length());
		
		System.out.println("===========");
		
		// 2. �Ű�����(������)�����ڷ� ���� => ���뷮 : ���������� ������ŭ���� ����
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2�� ���뷮 : " + sb2.capacity());
		System.out.println("sb2�� ���ڿ��� ���� : " + sb2.length());
		
		System.out.println("===========");
		
		// 3. �Ű�����(���ڿ�)�����ڷ� ���� => ���뷮 : �⺻�� 16 + ���������� ���ڿ��� ����
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		System.out.println("sb3�� ���뷮 : " + sb3.capacity()); // �⺻�� 16 + 5
		System.out.println("sb3�� ���ڿ��� ���� : " + sb3.length());
		
	}
	
	public void method2() {
		// �Һ����� �������� �׽�Ʈ
		
		String str = "�ݰ���!";
		System.out.println(System.identityHashCode(str));
		str += "�� String�̾�!!";
		System.out.println(System.identityHashCode(str));
		// �� ���� �� => �ּҰ� ����!! => ���ڸ����� ������ �Ǵ°� �ƴ�! => �Һ�Ŭ����
		
		System.out.println("=========");
		
		StringBuilder sb = new StringBuilder("�ݰ���!"); // ���뷮 : 20, ���� : 4
		
		System.out.println("sb : " + sb); // StringBuilder Ŭ������ toString �޼ҵ� �������̵� �Ǿ�����!!
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		
		// StringBuilder���� ���� �����ϰ��� �� ���� �޼ҵ带 ���ؼ� �۾��ؾߵ�!
		
		// 1. append(String str) : StringBuilder
		//    --> ������ ���ڿ��� ���� ������ ���ڿ� �߰��ϱ�
		sb.append("�ȳ�!");
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		// �ּҰ� ���� ����!! => ���ڸ����� �� ����!! => ���� Ŭ����
		
		// 2. delete(int start, int end) : StringBuilder
		//    start ~ end-1 ���� ���ڿ� ����������
		sb.delete(2, 5);
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "������");
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		
		// 4. reverse() : StringBuilder
		sb.reverse();
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		
		
		StringBuilder sb2 = new StringBuilder("javaProgram");
		sb2.append("API").delete(4, 11).reverse();
		//"javaProgramAPI".delete(4, 11)
		//    		"javaAPI".reverse()
		//        		"IPAavaj"
		System.out.println(sb2);
		
		// �޼ҵ� ü�̴� (�޼ҵ� �̾��)
		
		
		
	}
	
	
	
	
}




