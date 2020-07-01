package com.kh.chap01_math.run;

// import java.lang.*;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  * API (Application Programming Interface)
		 *  - 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻함
		 */
		
		// Math : 상수필드(public static final) + static 메소드
		//        객체 생성할 필요 없이 Math. 으로 접근해서 가져다 쓸 수 있음!!
		
		//		  ==> 싱글톤패턴이라는 개념
		//			    애플리케이션이 시작될 때 최초 단 한번만 메모리(static)에 할당하고 공유(재사용)
		
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절댓값 알고 싶을 때 --> abs
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 --> ceil
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 반올림 --> round
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림 --> floor
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수값 --> rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) --> sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 --> pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		
		
		int[] arr = new int[5];
		System.out.println(arr[10]);
		
		System.out.println("안녕하세요");
		
		
		
		
		
		
		
		

	}

}



