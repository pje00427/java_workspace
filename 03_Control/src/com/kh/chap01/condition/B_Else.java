package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * * if-else ��
	 * 
	 * if(���ǽ�) {
	 * 		.. �����ڵ� 1 ..;
	 * } else {
	 * 		.. �����ڵ� 2 ..; 
	 * }
	 * 
	 * --> ���ǽ��� ����� true�� ��� �����ڵ�1 ���� �� if-else�� ��������
	 *   	    ��, ����� false�� ��� ������ �����ڵ�2 �����	
	 * 
	 * 
	 * * if-else if��
	 * 
	 * if(���ǽ�1) {
	 * 		.. �����ڵ� 1 ..;
	 * } else if(���ǽ�2) {
	 * 		.. �����ڵ� 2 ..;
	 * } else if(���ǽ�3) {
	 * 		.. �����ڵ� 3 ..;
	 * } [else {
	 * 		.. ���� ���ǵ��� �� false�� ��� �ݵ�� ������ �ڵ� ..;
	 * }]
	 * 
	 * ���ǽ�1�� ����� true�� ��� �����ڵ�1 ���� �ϰ� ��������
	 * ��, ���ǽ�1�� ��� false�� ��� ���ǽ�2 ����
	 *     ���ǽ�2�� ����� true�� ��� �����ڵ�2 ���� �ϰ� ��������
	 *     ��, ���ǽ�2�� ��� false�� ��� �� ���� ���� ... 
	 *    
	 * ��, else���� ���õǾ����� ��� ��� ���ǵ��� �� false�� ���� ���������� else ���� ����
	 * 
	 */
	
	public void method1() {
		// A_If Ŭ������ method2() (¦������ Ȧ������)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦����");
		}else {
			System.out.println("Ȧ����");
		}
		
	}
	
	public void method2() {
		// A_If Ŭ������ method1() (���, 0, ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}else if(num == 0) {
			System.out.println("0�̴�");
		}else {
			System.out.println("������");
		}
			
			
	}
	
	public void method3() {
		// A_If Ŭ������ method3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ� ����) : ");
		double score = sc.nextDouble();
		
		
		String student = "";
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}else if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", 
					      grade, classNum, num, name, student, score);
		
	}
	
	public void method4() {
		// A_If Ŭ������ method4() (���, û�ҳ�, ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("���");
			
		}else if(/*age > 13 && */ age <= 19) {
			System.out.println("û�ҳ�");
			
		}else {
			System.out.println("����");
		}
		
	}
	
	
	public void method5() {
		// ���ο� ����
		// ����ڿ��� ������ �Է¹޾�
		// 90���̻� => A���
		// 90�� �̸� 80�� �̻� => B���
		// 80�� �̸� 70�� �̻� => C���
		// 70�� �̸� 60�� �̻� => D���
		// 60�� �̸� => F���
		
		// "����� ������ xx���̰�, ����� x����Դϴ�."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("����� ������ " + score + "���̰�, ����� " + grade + "����Դϴ�.");
		
		
	}
	
	
	public void method6() {
		// ���� �������� �� ��޺� �߰� ���� �̻��� ��� ��޿� "+"��� ���ڸ� �߰��ؼ� ���
		
		// ��) 95���̻� A+    /  85���̻� B+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				//grade = grade + "+"; // grade = "A" + "+" ;
				grade += "+";
			}
			
		}else if(score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade += "+";
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}else if(score >= 60) {
			grade = "D";
			
			if(score >= 65) {
				grade += "+";
			}
			
		}else {
			grade = "F";
		}
		
		System.out.println("����� ������ " + score + "���̰�, ����� " + grade + "����Դϴ�.");
		
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		if(name.equals("������")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
	}
	
	
	

}




