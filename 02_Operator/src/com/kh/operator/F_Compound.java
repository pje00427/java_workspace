package com.kh.operator;

public class F_Compound {
	
	/*
	 * * 복합대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * a = a + 3;	=>	a += 3;
	 * a = a - 3;	=>  a -= 3;
	 * a = a * 3;	=>  a *= 3;
	 * a = a / 3;	=>  a /= 3;
	 * a = a % 3; 	=>  a %= 3;
	 *  
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("기존 num : " + num); // 12
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3증가시킨 값 : " + num); // 15
		
		// num을 또 3 증가시키기
		//num =+ 3;	// 양수값3 대입되는 형식
		num += 3;
		System.out.println("또 3증가시킨 값 : " + num); // 18
		
		// num을 5 감소시키기
		num -= 5;
		System.out.println("5 감소시킨 값 : " + num); // 13
		
		// num을 6배 증가시키기
		num *= 6;
		System.out.println("6배 증가시킨 값 : " + num); // 78
		
		// num을 2배 감소시키기
		num /= 2;
		System.out.println("2배 감소시킨 값 : " + num); // 39
		
		// num을 4로 나눴을때의 나머지값으로 바꾸기
		num %= 4;
		System.out.println("num을 4로 나눈 나머지 : " + num); // 3
		
		
	}

}









