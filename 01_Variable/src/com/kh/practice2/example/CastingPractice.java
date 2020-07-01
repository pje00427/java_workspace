package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		// ù��° ��� : ����ڿ��� �Է¹޾� ��ϵ� ���ڰ��� int�� ������ �Ű� ���� �� ����ϱ�
		/*
		int num = ch; // ch�� ��� ���ڰ� int�� ������ ���� ���� �� ������ ������ �����ڵ尪(����)�� ���
		System.out.println(ch + " unicode : " + num);
		*/
		
		// �ι�° ��� : ����ڿ��� �Է¹޾� ��ϵ� ���ڰ��� ������ int������ ��������ȯ�ؼ� �ٷ� ����ϱ�
		System.out.println(ch + " unicode : " + (int)ch);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		// ù��° ��� : ����ڰ� �Է��� ����, ����, ���� ���� ������ ����, ����� ���� �� ������ ���� �� ����ϱ�
		/*
		int sum = (int)(kor + eng + math); // kor+eng+math ������ ��� �ڷ����� ���������� double���� int���� ���� �� ���� ������ ��������ȯ�ؾߵ�
		int avg = sum / 3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		*/
		
		// �ι�° ��� : ����ڰ� �Է��� ����, ����, ���� ���� ������ ����, ����� ���� ���� �ٷ� ����ϱ�
		System.out.println("���� : " + (int)(kor + eng + math));
		//System.out.println("��� : " + (int)((kor + eng + math) / 3)); // ���1. �� ���ϰ� �� �� ���������� �� ����� ������ int�� ��������ȯ
		System.out.println("��� : " + (int)(kor + eng + math) / 3); // ���2. �� ���Ѱ��� ������ int�� ��������ȯ�� �� 3���� ������ 
		
		
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); 		// 10 / 4  		=> 2 (������� int�� ����)
		System.out.println((int)dNum); 			// (int)2.5  	=> 2 (�Ҽ��� �Ʒ� ��������)	
		
		System.out.println((double)iNum1); 		// (double)10  	=> 10.0 
		System.out.println(iNum2 * dNum); 		// 4.0 * 2.5  	=> 10.0 (iNum2�� double�� �ڵ�����ȯ �� �� ����, ������� double��)

		System.out.println(dNum); 				// 2.5
		System.out.println((double)iNum1/iNum2);// (double)10 / 4 => 10.0 / 4.0 => 2.5 (�� �߿� �ϳ��� double������ ��������ȯ �ϸ� �������� �ڵ�����ȯ���� double�� �ǰ� ����, ������� double��)
		
		System.out.println((int)fNum); 			// (int)3.0		=> 3 (�Ҽ��� �Ʒ� ��������)
		System.out.println(iNum1/(int)fNum); 	// 10 / (int)3.0 => 10 / 3 => 3
		
		System.out.println(iNum1/fNum); 		// 10.0 / 3.0   => 3.3333333
		System.out.println(iNum1/(double)fNum); // 10 / (double)3.0 => 10.0 / 3.0 => 3.33333333333333335
		
		System.out.println(ch); 				// 'A'
		System.out.println((int)ch); 			// (int)'A'		=> 65
		System.out.println(ch + iNum1); 		// 'A' + 10 	=> 65 + 10	=> 75
		System.out.println((char)(ch + iNum1)); // (char)('A' + 10) => (char)75	=> 'K'
	}

}
