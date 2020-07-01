package com.kh.chap06_method.part01_methodTest.controller;

// static 메소드
public class MethodTest2 {
	
	public static int num1 = 10;
	public static int num2 = 20;
	
	
	// 1. 매개변수x 반환값x 메소드
	public static void method1() {
		System.out.println(num1 + num2); // 30
		num2++;
	}
	
	// 2. 매개변수x 반환값o 메소드
	public static int method2() {
		return num1 + num2;
	}
	
	// 3. 매개변수o 반환값x 메소드
	public static void method3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	// 4. 매개변수o 반환값o 메소드
	public static String method4(String name) {
		return name + "님 안녕히가세요!";
	}
	

}





