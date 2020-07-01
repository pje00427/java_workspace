package com.kh.chap03_wrapper.controller;

public class B_primitiveStringTest {
	
	/*
	 * �⺻�ڷ���     WrapperŬ����
	 *  int   <--> Integer
	 *  
	 * 
	 * �⺻�ڷ��� <--> StringŬ����
	 *   int   <-->  String
	 *    1    <-->  "1"
	 *    
	 */
	
	public void method1() {
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // ���ڿ��� �۾��� �ȴ�!! --> ���������ϰ� ������ ���ڷ� �ٲ��� �Ŀ� �ؾߵ�!!
		
		// 1. String --> �⺻�ڷ��� (�Ľ��Ѵ�!)
		//    �ش�WrapperŬ����.parseXXX(��ȯ��Ű�����ϴ� ���ڿ�)
		
		// "10" --> 10
		int i = Integer.parseInt(str1);
		
		// "15.3" --> 15.3
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		
		// �ݴ��� ���
		// �⺻�ڷ��� --> String
		// String.valueOf(��ȯ�ϰ��� �ϴ� �⺻�ڷ���) : String
		
		// i --> ���ڿ�
		String strI = String.valueOf(i); // 10 --> "10"
		
		String strD = String.valueOf(d); // 15.3 --> "15.3"
		
		System.out.println(strI + strD);
		
		
		
	}

}







