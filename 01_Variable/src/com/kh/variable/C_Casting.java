package com.kh.variable;

public class C_Casting {
	
	// 형변환 : 값의 자료형을 바꾸는 거
	
	/*
	 * * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 * 1. 대입연산자를 기준으로 해서 왼쪽 자료형과 오른쪽 자료형이 일치해야됨
	 *    --> 같은 자료형에 해당하는 값만이 대입됨
	 *    --> 다른 자료형의 값을 대입하고자 한다면 대입하고자하는 그 값에 형변환이 필수
	 * 
	 * 2. 같은 자료형끼리만 계산이 가능 --> 그 결과값 마저도 같은 자료형 
	 *    int 변수 = int값 + double값
	 *    
	 * * 형변환 종류
	 * - 자동형변환 : 자동으로 형변환되서 알아서 연산(대입,산술)되기 때문에 형변환을 직접 할 필요 없음
	 * - 강제(명시적)형변환 : 자동으로 형변환이 되지 않는 경우 직접 형변환을 해줘야됨
	 *   [표현법] (바꿀자료형)값
	 */
	
	// 자동형변환 (작은자료형의 값이 자동으로 큰자료형의 값으로 변환)
	public void rule1() {
		
		// 1) int(4byte) --> double(8byte)
		// > 대입 연산
		int i1 = 12;
		double d1 = /*(double)*/i1;   // double d1 = 12.0;
		
		System.out.println("d1 : " + d1);
		
		// > 산술 연산
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // double result = 12.0 + 3.3;
		
		System.out.println("result : " + result);
		
		// 2) int(4byte) --> long(8byte)
		// > 대입연산
		int i3 = 2222;
		long l3 = /*(long)*/i3;   // long l3 = 2222L;
		
		// > 산술연산
		int i4 = 2147483000;
		long l4 = 1000000000L;
		
		long result2 = /*(long)*/i4 + l4;
		
		System.out.println("result2 : " + result2);
		
		
		// 3) float(4byte) --> double(8byte)
		// > 대입연산
		float f5 = 1.0f;
		double d5 = /*(double)*/f5;
		
		double result3 = /*(double)*/f5 + d5;
		
		
		// ** 특이 케이스 **
		// 1) long(8byte) --> float(4byte)
		// > 대입연산
		long l6 = 1000000000L;
		float f6 = /*(float)*/l6;
		// float 실수형이 4byte라고 해도 long 정수형보다 표현 가능한 수의 범위가 훨씬 더 크기때문에 자동형변환발생!
		
		System.out.println("f6 : " + f6);
		
		// 2) char(2byte) <-> int(4byte)
		int num = 'A'; // 해당 문자의 유니코드 값이 담김
		System.out.println("num : " + num);
		
		char ch = 65; // 음수값은 불가
		System.out.println("ch : " + ch);
		
		// 유니코드 표 참고 (0~65535) --> 한글까지 표현
		// 그 중 일부분이 아스키코드  --> 영문자, 숫자, 특수기호
		
		
		// 3) byte, short 간의 연산 --> 무조건 int형으로 취급
		byte b1 = 1;
		byte b2 = 10;
		
		//byte result4 = b1 + b2; // 에러 발생
		// --> 산술연산한 결과값을 강제로 형변환 하면 해결 가능
		byte result4 = (byte)(b1 + b2);
		
		System.out.println("result4 : " + result4);
		
	}
	
	// 강제형변환 (큰 자료형을 작은 자료형으로 변환할 때)
	public void rule2() {
		
		// 1) double(8byte) --> float(4byte)
		// > 대입연산
		double d = 8.0;
		float f = (float)d;
		
		float f1 = 5.0f;
		
		// 2) double(8byte) --> int(4byte)
		// > 대입 연산
		double d2 = 5.89;
		int i = (int)d2; // int i = 5;
		
		System.out.println("i : " + i);
		
		int i2 = 10;
		
		//int iSum = d2 + /*(double)*/i2; // int iSum = 5.89 + 10.0
		
		// 에러 해결 방법 
		// 방법1. 산술연산한 결과값(double자료형)을 int형으로 강제형변환 한 후 담기
		int iSum = (int)(d2 + i2); // int iSum = (int)15.89 --> 15
		System.out.println("iSum : " + iSum);
		// 실수=>정수 형변환 하게 되면 소수점 아래는 버림 (데이터 손실 발생)
		
		// 방법2. 산술연산시 double형 값을 int형으로 강제형변환 한 후 담기
		int iSum2 = (int)d2 + i2; // int iSum2 = (int)5.89 + 10 => 5 + 10
		System.out.println("iSum2 : " + iSum2);
		
		// 방법3. 연산 결과값을 아싸리 double형에 담기
		double dSum = d2 + i2; // double dSum = 5.89 + 10.0 => 15.89
		System.out.println("dSum : " + dSum);
		
		
		
		// byte와 short 간의 연산 --> 무조건 int형으로 취급
		byte b1 = 1;
		short s1 = 2;
		
		//byte bSum = b1 + s1;
		//short sSum = b1 + s1;
		// 해결방법1. 연산 결과를 byte 또는 short로 강제형변환 한 후 해당 변수에 담기
		byte bSum = (byte)(b1 + s1); // 3
		short sSum = (short)(b1 + s1); // 3
		
		// 해결방법2. 연산 결과를 아싸리 int형 변수에 담기
		int sum = b1 + s1; // 3
		
	}
	
	

}





