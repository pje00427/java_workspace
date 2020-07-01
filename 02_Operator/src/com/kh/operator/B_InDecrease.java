package com.kh.operator;

// 증감연산자
public class B_InDecrease {
	
	/*
	 * 	* 증감연산자
	 * 
	 *  ++ : 해당 변수에 담긴 값을 1증가시키는 연산자
	 *  -- : 해당 변수에 담긴 값을 1감소시키는 연산자
	 *  
	 *  (증감연산자)변수 : 전위 연산자		=> 선증감 후처리
	 *  변수(증감연산자) : 후위 연산자	=> 선처리 후증감
	 */
	
	public void method1() {
		
		// 전위 연산 테스트
		int num1 = 10;
		
		System.out.println("기존 num1의 값 : " + num1);			// num1=10  출력
		System.out.println("전위 증가 1회 수행 결과 : " + ++num1);// num1=11로 증가된 후 출력
		System.out.println("전위 증가 2회 수행 결과 : " + ++num1);// num1=12로 증가된 후 출력
		System.out.println("전위 증가 3회 수행 결과 : " + ++num1);// num1=13로 증가된 후 출력
		System.out.println("최종 num1의 값 : " + num1);			// num1=13 출력
		
		System.out.println("=====================");
		
		// 후위 연산 테스트
		int num2 = 10;
		
		System.out.println("기존 num2의 값 : " + num2);			// num2=10 출력
		System.out.println("후위 증가 1회 수행 결과 : " + num2++);// 기존10 출력 후 num2=11로 증가
		System.out.println("후위 증가 2회 수행 결과 : " + num2++);// 기존11 출력 후 num2=12로 증가
		System.out.println("후위 증가 3회 수행 결과 : " + num2++);// 기존12 출력 후 num2=13로 증가
		System.out.println("최종 num2의 값 : " + num2);			// num2=13 출력
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = ++a;	// a=11, b=11
		
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++;   // c=10(11), d=10
		
		System.out.println("c : " + c + ", d : " + d);
		
		System.out.println("==================");
		
		int num1 = 20;
		int result = num1++ * 3; // num1=20(21)  result=20*3=60
		
		System.out.println("num1 : " + num1 + ", result : " + result);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2=21    result2=21*3=63
		
		System.out.println("num2 : " + num2 + ", result2 : " + result2);
		
		
		//++num2; // num2=num2+1;
		
	}
	
	
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11) => 10출력
		// a=11
		System.out.println((++a) + (b++)); // a=12, b=20(21) => 32출력
		// a=12, b=21
		System.out.println((a++) + (--b) + (--c)); // a=12(13), b=20, c=29 =>12+20+29 => 61 출력
		
		// a=13, b=20, c=29
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		
	}
	
	
	

}





