package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * ���α׷� ������ �⺻������ ���������� �����
	 * ��, �� �������� �帧�� �ٲٰ��� �Ѵٸ� "���"�̶�� �� ���ؼ� ���� �����
	 * 
	 * ���������� �����ϰ��� �Ѵٸ� => ���ǹ�
	 * �ݺ������� �����ϰ��� �Ѵٸ� => �ݺ���
	 * �� ���� �帧 ���� 			=> �б⹮
	 * 
	 * < ���ǹ� > 
	 * ���ǽ��� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� 
	 * �ش� ������ ���ϰ�� �׿� �ش��ϴ� ���๮�� ����
	 * 
	 * --> ���ǽ��� ��� true/false ���ߵ�
	 * --> ���ǽĿ����� �񱳿�����(���, ����), ��������(&&, ||), ������������(!)
	 * 
	 * ���ǹ� ũ�� if���� switch������ ������.
	 * 
	 * �� �� if�������� ũ�� 3������ ����
	 * 1. �ܵ� if�� 
	 * 2. if-else�� 
	 * 3. if-else if��
	 * 
	 * 
	 * * �ܵ� if��
	 * 
	 * if(���ǽ�) {
	 * 		������ �ڵ� ... ;
	 * }
	 * 
	 * --> ���ǽ��� true�� ��� �߰�ȣ ���� �ڵ� ����
	 * --> ���ǽ��� false�� ��� �߰�ȣ ���� �ڵ� �����ϰ� �ǳʶ�
	 * 
	 */
	
	public void method1() {
		// �ǽ����� 1��, 2��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}
		if(num == 0) {
			System.out.println("0�̴�.");
		}
		if(num < 0) {
			System.out.println("������");
		}
		
	}
	
	public void method2() {
		// �ǽ����� 3��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦����");
		}
		if(num % 2 == 1) {
			System.out.println("Ȧ����");
		}
	}
	
	public void method3() {
		// �ǽ����� 5
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
		
		String student = ""; // ���������� �����س��� �� �ݵ�� �ʱ�ȭ�ϴ� �������̱�
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}
		
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("�߸��Է��ϼ̽��ϴ�!!");
			
			return; // �ش� �޼ҵ� ��ü�� ���������� ���� (��, �̸޼ҵ带 ȣ���ߴ� ������ ���ư�)
		}
		
		System.out.println(grade + "�г� " + classNum + "�� " + num + "�� " + 
						   name + " " + student + "�� ������ " + score + "�̴�.");
		
		
	}
	
	public void method4() {
		// �ǽ����� 6
		// ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("���");
		}
		if(age > 13 && age <= 19) {
			System.out.println("û�ҳ�");
		}
		if(age > 19) {
			System.out.println("����");
		}
		
	}
	
	public void method5() {
		// ���ο� ����
		// �̸� �Է� ���� �� ������ �´��� Ȯ���ϴ� �޼ҵ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		/*
		// name�� ��䰪�� "������"�� ��ġ�� ��� => "�����Դϴ�."
		if(name == "������") {
			System.out.println("�����Դϴ�.");
		}
		
		// name�� ��䰪�� "������"�� ��ġ���� ���� ��� => "������ �ƴմϴ�."
		if(name != "������") {
			System.out.println("������ �ƴմϴ�.");
		}
		*/
		
		/*
		 * ���� ����� ����� ���� X
		 * �⺻�ڷ����鳢�� �񱳽ÿ� ==, != �� ���� ����� ��� ����
		 * 
		 * ��, String �⺻�ڷ����� �ƴ� �����ڷ���
		 * 
		 * �׷��� String ���ڿ����� �񱳿� �־�� .equals(���� ��) �޼ҵ� Ȱ��
		 */
		
		// name == "������"
		if(name.equals("������")) {
			System.out.println("�����Դϴ�.");
		}
		
		// name != "������"
		if(!name.equals("������")) {
			System.out.println("������ �ƴմϴ�.");
		}
		
	}
	
	
	
}






