package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	// break : ���� �� ������ ����� �ݺ����� ���������� ����
	//		   ��, switch��  ���� break�� switch���� ���������� ���� 
	
	public void method1() {
		// ����ڿ��� ���ڿ��� �Է¹ް� �� �Է¹��� ���ڿ��� ����ϱ� (�ݺ������� ����)
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ��� �����ϰԲ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
		
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println("str : " + str);
			System.out.println("str�� ���� : " + str.length());
			
		}
		
		System.out.println("���α׷��� �����մϴ�.!");
		// ���ѹݺ� �ȿ� break�� ���� ��� unreachable code �߻�! (���� ����ɼ� ���� �ڵ���)
		
	}
	
	public void method2() {
		// �ݺ������� ������(1~50) �߻���Ų �� ���
		// ��, �� �������� Ȧ���� ��� ������� �ʰ� �ݺ����� ����ǰԲ�
		
		while(true) {
			
			int random = (int)(Math.random() * 50 + 1);
			
			if(random % 2 == 1) {
				break;
			}
			
			System.out.println("������ : " + random);
			
		}
		
	}
	
	
	public void method3() {
		
		// ����ڿ��� ���� �ΰ��� �����ȣ(+ -)�� �Է¹ް�
		// �׿� �ش��ϴ� ���� ����� ��� (�ݺ������� ����)
		// ��, ���õ� �����ȣ�� �Է����� �ʰ� �ٸ� ���ڸ� �Է����� ��� 
		// �������� ��� �� �ݺ��� ���������Բ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("���� 2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("�����ȣ(+ or -)  : ");
			char op = sc.nextLine().charAt(0);
			
			int result = 0; // ���� ����� ������ ����
			
			if(op == '+') {
				result = num1 + num2;
			}else if(op == '-') {
				result = num1 - num2;
			}else { // �����ȣ�� �߸� �Է����� ���
				System.out.println("�����ȣ�� �߸��Է��߽��ϴ�.");
				break;
			}
			
//			System.out.println(num1 + " " + op + " " + num2)
			System.out.printf("%d %c %d = %d\n\n", num1, op, num2, result);
			
		}
		
	}
	
	

}







