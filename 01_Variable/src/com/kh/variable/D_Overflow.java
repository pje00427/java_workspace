package com.kh.variable;

public class D_Overflow {
	
	public void overflow() {
		// byte �ڷ��� ���� ���� ������ �� ���� : -128 ~ 127
		
		//byte bNum = 128;
		
		byte bNum = 127; // -128 -127 -126 ..... 126 127 -128
		
		bNum++; // bNum�� ��䰪 1������Ű�ٴ�.  
		bNum++;
		
		System.out.println("bNum : " + bNum);
		
		
		// int�� ���� ���� �� ���� : -21��xxx ~ 21��xxx
		
		int num1 = 1000000; // 100��
		int num2 = 700000;  // 70��
		
		//int result = num1 * num2;
		
		//long result = num1 * num2; // �ƽθ� �������� �ϴ� ���� int�����̱� ������ �̹� �����÷ο찡 �߻��ع���
		long result = (long)num1 * /*(long)*/num2;
		
		System.out.println("result : " + result);
		
		
		result = 10;
		
	}

}





