package com.kh.run;

import com.kh.first.*;

// ������ ��� �ϴ� Ŭ����
public class RunA {
	
	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 ����(ȣ��)��Ű�� �� �� ���
		// 1) �����ϰ��� �޼ҵ尡 �ִ� Ŭ������ ����(new) �̶�� �� �ض�!
		// [ǥ����] Ŭ������ ������̸� = new Ŭ������();
		//A_MethodPrinter a = new A_MethodPrinter();
		// ���� ���� ������ �ߴ� ���� : ������Ű�� ���� Ŭ������ �ƴ� �ٸ���Ű���� �ִ� Ŭ������ ����Ϸ��� �ϱ� ����!!
		
		// �ذ���1. �ش� Ŭ������ � ��Ű���� �����ִ��� ǮŬ�������� ����ϴ� ���
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// �ذ���2. ���� Ŭ���������� �����ϱ� �ϵ� ��Ŭ������ �����Ű���� �����ִ��� �� �ѹ� ����(import)�س���
		A_MethodPrinter a = new A_MethodPrinter();
		
		// 2) ���� �� �ش� �޼ҵ� ����(ȣ��)
		// [ǥ����] ������̸�.�����Ű�����ϴ¸޼ҵ��();
		a.methodA();
		//a.methodB();
		//a.methodC();
		
	}

}





