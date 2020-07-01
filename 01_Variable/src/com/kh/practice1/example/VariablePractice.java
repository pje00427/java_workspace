package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	// ���� 1. ����ڿ��� �̸�, ����, ����, Ű�� �Է¹޾� ������ ������ �� �� ������ ��� ���� �������� �䱸�� ��¹� ���Ĵ�� ����ϱ�
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // nextInt() �޼ҵ� �ڿ� nextLine() �޼ҵ尡 �ðű� ������ �� ���̿� ���͸� ���ۿ��� ���ִ� �۾��� ����ߵȴ�. 
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		// ù��° ��� : �������� ����� ������� String ������ ������ �� ����ϱ� 
		/*
		String result = "Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^";
		System.out.println(result);
		*/
		
		// �ι�° ��� : �ٷ� ����ϱ�
		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");
	}

	
	// ���� 2. ����ڿ��� �ΰ��� �������� �Է¹޾� ������ ������ �� �� ������ ��� ���� ������ ����, ����, ����, ������ �� ������� ����ϱ�
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		// ù��° ��� : ����ڰ� �Է��� ���� ������ ������� (����, ����, ����, ������)�� ������� �� ������ ������ �� ����ϱ�----------
		/*
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("���ϱ� ��� : " + plus);
		System.out.println("���� ��� : " + minus);	
		System.out.println("���ϱ� ��� : " + multiple);		
		System.out.println("������ �� ��� : " + div);
		*/
		// -----------------------------------------------------------------------------------------
		
		
		// �ι�° ��� : ����ڰ� �Է��� ���� ������ ��������� ������� �ٷ� ����ϱ�----------------------------------------
		// ��� ���� ���� (* / %  =>  + -)
		System.out.println("���ϱ� ��� : " + (num1 + num2));	// ��ȣ�� ���ϰ� �Ǹ� ���ڿ��� �ν��Ͽ� ���� �ΰ��� ���ڿ�ȭ �Ǽ� �پ ���´�.
		System.out.println("���� ��� : " + (num1 - num2));		// ���������� ��ȣ�� ���ϰԵǸ�  '���ڿ�-����'�� �ν��Ͽ� ���� �߻�
		System.out.println("���ϱ� ��� : " + num1 * num2);		
		System.out.println("������ �� ��� : " + num1 / num2);
		// -----------------------------------------------------------------------------------------
	}

	// ���� 3. ����ڿ��� ����, ���� ���̸� �Է¹޾� ������ ������ �� ������ �ѷ��� ���� ����ϱ�
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		// ù��° ��� : ����ڰ� �Է��� ���� ������ ������ �ѷ��� ���� ������� ������ ������ �� ����ϱ�---------------------------
		/*
		double area = width * height; // ����
		double perimeter = (width + height) * 2; // �ѷ�
		
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + perimeter);
		*/
		// -----------------------------------------------------------------------------------------
		
		
		// �ι�° ��� : ����ڰ� �Է��� ���� ������ ������ ����� �ٷ� ����ϱ�--------------------------------------------
		System.out.println("���� : " + width * height);
		System.out.println("�ѷ� : " + (width + height) * 2);
		// -----------------------------------------------------------------------------------------
	}

	
	// ���� 4. ����ڿ��� ���ڿ��� �Է¹޾� ������ ������ �� ù��° ����, �ι�° ����, ����° ���ڸ� ����ϱ�
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine(); // 
		
		// ù��° ��� : ����ڰ� �Է��� ���ڿ��� ����ִ� str���������� ���� 0���ε��� ��, 1���ε��� ��, 2���ε������� ���� �̾Ƽ� ������ ������ �� ����ϱ�
		/*
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("ù ��° ���� : " + ch1);
		System.out.println("�� ��° ���� : " + ch2);
		System.out.println("�� ��° ���� : " + ch3);
		*/
		// ---------------------------------------------------------------------------------------------------
		
		
		// �ι�° ��� : ����ڰ� �Է��� ���ڿ��� ����ִ� str ���������� ���� �� �ε������� ���� ���� �ٷ� ����ϱ�------------------------------
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
		// ---------------------------------------------------------------------------------------------------
	}

}




