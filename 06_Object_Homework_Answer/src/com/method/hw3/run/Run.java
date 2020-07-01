package com.method.hw3.run;

import com.method.hw3.sample.StaticSample;

public class Run {
	
	public static void main(String[] args) {
		
		// StaticSample 클래스의 필드인 value를 "Java"로 초기화 후 출력
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper 메소드 실행 --> 출력
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		// valueLength 메소드 실행 --> 출력
		System.out.println("길이 : " + StaticSample.valueLength());
		
		// valueConcat 메소드 실행 --> 출력
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
		// setChar 메소드 실행 --> 출력
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());
		
	}

}
