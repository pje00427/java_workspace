package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * * ���� ������ : 3���� �׸��� ���� �����ϴ� ������
	 * [ǥ����] ���ǽ� ? ���ǽ���true�� ��� �� : ���ǽ��� false�ϰ�� ��;
	 * 
	 * ���ǽĿ��� �ݵ�� true�Ǵ� false�� �����Բ� �ۼ��ؾߵ�
	 * �ַ� �񱳿���/������ ��� 
	 * 
	 */
	
	public void method1() {
		// �Է¹��� �������� ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		// ���ǽ� ? ���ϰ�� �� : ������ ��� ��
		//System.out.println(num > 0 ? "����̴�" : "����� �ƴϴ�");
		//System.out.println(num <= 0 ? "����� �ƴϴ�" : "����̴�");
		
		String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
		// xx�� xxxx
		System.out.println(num + "�� " + result);
		
	}
	
	public void method2() {
		
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		
		System.out.println(num + "�� " + result);
	}
	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		// "����� 100�̻��Դϴ�."
		// "����� 100���� �۽��ϴ�."
		//String result = num1 * num2 >= 100 ? "����� 100�̻��Դϴ�." : "����� 100���� �۽��ϴ�.";
		String result = (num1 * num2 < 100) ? "����� 100���� �۽��ϴ�." : "����� 100�̻��Դϴ�.";
		
		System.out.println(num1 * num2 + "��(��) " + result);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// "�빮���̴�."
		// "�빮�ڰ��ƴϴ�."
		//					'A' <= ch <= 'Z'
		String result = (ch >= 'A' && ch <= 'Z') ? "�빮���̴�." : "�빮�ڰ� �ƴϴ�.";
		
		System.out.println(ch + "��(��) " + result);
		
	}
	
	public void method5() {
		
		// ����ڰ� �Է��� ���� ������� ��������, 0���� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		// "����̴�."
		// "�����̴�."
		// "0�̴�."
		
		String result = (num > 0) ? ("����̴�.") : ((num == 0) ? "0�̴�." : "�����̴�.");
		
		System.out.println(num + "��(��) " + result);
		
	}
	
	
	public void method6() {
		
		// �� ���� �������� �Է¹ް�
		// + �Ǵ� -�� �Է¹ް� �˸´� ��� ��� ���
		// ��, + �Ǵ� - ���� �ٸ� ���ڸ� �Է��ϴ� ��� "�߸� �Է��Ͽ����ϴ�." ���
		
		// +�� �Է����� ��� => ���� ���� ���
		// -�� �Է����� ��� => ���� ���� ���
		// �� �ܸ� �Է����� ��� => "�߸� �Է��Ͽ����ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է�(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		
		String result = (op == '+') ? (num1 + num2 + "") : 
					   ((op == '-') ? (num1 - num2 + "") : ("�߸� �Է��Ͽ����ϴ�."));
		
		System.out.println("��� : " + result);
	}
	

}








