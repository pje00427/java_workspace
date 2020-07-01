package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	// CheckedException : �ݵ�� ����ó���� �ؾߵǴ� Ŭ������
	// �����Ұ��� ������ ������ �߻��ϱ� ������ �̸� ����ó���� �س��ߵ�!! (�ʼ���!)
	// �ַ� �ܺ� �Ű�ü�� � ������� �Ͼ �� �߻�!!
	
	public void method1() throws IOException {
		
		// 1. try~catch : ���⼭ ��¥ ó���ϴ� ���
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�!");
		}
		*/
		
		// 2. throws : ���ѱ��
		method2();
	}
	
	public void method2() throws IOException {
		
		//Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		
		// ������ ����ڿ��� ���� �Է¹޾��� ���� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �Է� : ");
		
		// BufferedReader ���� ��� Scanner�ʹ� �ٸ��� ���� �Է¹��� �� �ִ� �޼ҵ� �� �ϳ� readLine() : String
		//int num = Integer.parseInt(br.readLine()); // "10" --> 10
		
		// 1. try~catch��� : ���⼭ �ٷ� ���ܸ� ó���ϰڴ�! ��� �� �ǹ�
		// try { ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�; }
		// catch(����Ŭ������ �Ű�������) { try���������� �ش� ���ܰ� �߻����� ��� ó���� ����; }
		
		/*
		String num = "";
		try {
			num = br.readLine();
			
		}catch(IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�!");
		}
		
		System.out.println(num);
		*/
		
		// 2. throws : ���� ���⼭ ���ܸ� ó������ �ʰ� ���� �̸޼ҵ带 ȣ���� ������ ���ѱ�ڴ�! �����ϰڴ�.
		String num = br.readLine();
	}
	
	//					   ���� �߻� ����					����ó��
	// RuntimeE			���α׷������(��Ÿ�ӿ���)	     ����(�ɹ���)	--> uncheckedException
	// RuntimeE �� ��		      �����Ͻ�(�����Ͽ���)			  �ʼ�		--> checkedException
	

}













