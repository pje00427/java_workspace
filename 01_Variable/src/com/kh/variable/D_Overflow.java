package com.kh.variable;

public class D_Overflow {
	
	public void overflow() {
		// byte 자료형 변수 저장 가능한 값 범위 : -128 ~ 127
		
		//byte bNum = 128;
		
		byte bNum = 127; // -128 -127 -126 ..... 126 127 -128
		
		bNum++; // bNum에 담긴값 1증가시키겟다.  
		bNum++;
		
		System.out.println("bNum : " + bNum);
		
		
		// int형 저장 가능 값 범위 : -21억xxx ~ 21억xxx
		
		int num1 = 1000000; // 100만
		int num2 = 700000;  // 70만
		
		//int result = num1 * num2;
		
		//long result = num1 * num2; // 아싸리 곱셈연산 하는 순간 int형값이기 때문에 이미 오버플로우가 발생해버림
		long result = (long)num1 * /*(long)*/num2;
		
		System.out.println("result : " + result);
		
		
		result = 10;
		
	}

}





