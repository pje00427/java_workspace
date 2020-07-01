package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// ����ڰ� Ű����� �Է��� ���� ���������� �� �� ����� Ŭ����
	// java.util.Scanner Ŭ�������� �����ϴ� �޼ҵ带 ���ؼ� �Է��� �� ������ �� ����
	
	public void inputScanner1() {
		
		// ������� ���������� �Է¹��� �� ���
		
		// Ŭ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �ް��� �� �� ���Ǵ� �޼ҵ� (sc.next(), sc.nextLine())
		String name = sc.nextLine();
		// sc.next() : ���� ���������� ���� ������
		// sc.nextLine() : ���ͱ��� �� ������ (�� �ٴ����� ��°�� ������)
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		// ����ڰ� �Է��� ���� ���������� ���������� �Ҷ� (sc.nextInt())
		int age = sc.nextInt();
		
		System.out.print("����� Ű�� ���Դϱ� (cm������ �Ҽ��� ù° �ڸ����� �Է��Ͻÿ�) : ");
		// ����ڰ� �Է��� ���� �Ǽ������� ���������� �� �� (sc.nextDouble())
		double height = sc.nextDouble();
		
		// ȫ�浿���� 19�� �̸�, 162.3cm�Դϴ�.
		System.out.println(name + "���� " + age + "�� �̸�, " + height + "cm�Դϴ�.");
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : ���ۿ��� '����'������ ��� ���� ������ (��, ���Ͱ������)
		 *    �� ���� �޼ҵ� : ���ۿ��� '����' ���������� ���� ������ (��, ���͸� �����������)
		 */
		sc.nextLine(); // �ذ��� : ���ۿ� �����ִ� '����'�� ����ָ� ��
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		// xxx���� xx���̸�, ��°��� xxx�̰�, Ű�� xxxcm �Դϴ�. 
		System.out.println(name + "���� " + age + "���̸�, ��°��� " + 
						   address + "�̰�, Ű�� " + height + "cm �Դϴ�.");
		System.out.printf("%s���� %d���̸�, ��°��� %s�̰�, Ű�� %.2fcm�Դϴ�.", name, age, address, height);
		
		
		// ��� : nextXXX() �޼ҵ� �ڿ� nextLine()�� �;ߵǴ� ���
		//       ���ۿ� �����ִ� '����'�� ����ֱ� ���� ���̿� sc.nextLine()�� ȣ��������
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է¹��� �� => sc.nextLine();
		// �������� �Է¹��� �� => sc.nextInt();
		// �Ǽ����� �Է¹��� �� => sc.nextDouble();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		//				  "Male".charAt(0) --> 'M'
		
		System.out.print("���� : ");  
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine(); // String address= "";
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		
	}
	
	
	

}







