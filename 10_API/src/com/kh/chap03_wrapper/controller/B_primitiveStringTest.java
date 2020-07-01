package com.kh.chap03_wrapper.controller;

public class B_primitiveStringTest {
	
	/*
	 * 기본자료형     Wrapper클래스
	 *  int   <--> Integer
	 *  
	 * 
	 * 기본자료형 <--> String클래스
	 *   int   <-->  String
	 *    1    <-->  "1"
	 *    
	 */
	
	public void method1() {
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 문자열로 작업이 된다!! --> 덧셈연산하고 싶으면 숫자로 바꿔준 후에 해야됨!!
		
		// 1. String --> 기본자료형 (파싱한다!)
		//    해당Wrapper클래스.parseXXX(변환시키고자하는 문자열)
		
		// "10" --> 10
		int i = Integer.parseInt(str1);
		
		// "15.3" --> 15.3
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		
		// 반대의 경우
		// 기본자료형 --> String
		// String.valueOf(변환하고자 하는 기본자료형) : String
		
		// i --> 문자열
		String strI = String.valueOf(i); // 10 --> "10"
		
		String strD = String.valueOf(d); // 15.3 --> "15.3"
		
		System.out.println(strI + strD);
		
		
		
	}

}







