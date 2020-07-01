package com.kh.operator;

// 비교연산자 (관계연산자)
public class D_Comparison {
	
	/*
	 * * 비교연산자
	 * - 두 값을 비교하는 연산자
	 * - 비교 조건을 만족하면 true(참), false(거짓)
	 * 
	 * <대소비교연산>
	 * a < b 	: a가 b보다 작습니까?
	 * a > b	: a가 b보다 큽니까?
	 * a <= b	: a가 b보다 작거나 같습니까?
	 * a >= b	: a가 b보다 크거나 같습니까?
	 * 
	 * <동등비교연산>
	 * a == b	: a랑 b가 같습니까?
	 * a != b	: a랑 b가 틀립니까?
	 * !(a==b) 
	 * 
	 */
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		boolean result = (a != b);
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		
		// a랑 b를 더한값이 100보다 큽니까?
		System.out.println((a + b) > 100);
		
		System.out.println("a는 짝수인가 : " + (a % 2 == 0));
		System.out.println("a는 홀수인가 : " + !(a % 2 == 0));
		System.out.println("a는 홀수인가 : " + (a % 2 != 0));
		System.out.println("a는 홀수인가 : " + (a % 2 == 1));
		
		
	}
	
	
}





