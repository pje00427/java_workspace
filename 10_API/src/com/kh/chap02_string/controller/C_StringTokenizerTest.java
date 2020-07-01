package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "JAVA,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �̿��Ͽ� ���ڿ��� �и�
		
		// ���1. �и��� ���ڿ����� �迭�� ��Ƽ� �����ϰ� ���� �� (String --> String[])
		//		 String Ŭ������ split �޼ҵ�
		//       ���ڿ�.split(String regex ������) : String[]
		String[] arr = str.split(",");
		
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// ���2. �и��� ���ڿ����� ��ū ��ü�� ����ϰ� ���� �� 
		//       java.util.StringTokenizer Ŭ���� �̿� ��ü ����
		//       StringTokenizer stn = new StringTokenizer("�и���Ű�����ϴ¹��ڿ�", "������");
		//       �и��� ���ڿ� == ��ū 
		//       ��ū���� stn�̶�� ������ �� ����ִ�
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// stn.countTokens() : int
		// ��ū �� �ľ��ϱ� �޼ҵ�
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		
		// stn.nextToken() : String
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0  i<6  true  ��¹�("JAVA");  i++
		// i=1  i<5  true  ��¹�("Oracle"); i++
		// i=2  i<4  true  ��¹�("JDBC");  i++
		// i=3  i<3  false  �ݺ��� ��������!
		
		
		/* �ذ���1
		int count = stn.countTokens();  // count = 6
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// �ذ���2
		// stn.hasMoreTokens() : boolean
		// stn ������ token���� �����ִ��� ���� �Ǵ� (���������� true, �װ� �ƴϸ� false)
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}

}








