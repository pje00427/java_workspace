package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.part01_methodTest.controller.MethodTest2;

public class Run {
	
	public static void main(String[] args) {
		
		// -------- MethodTest1 --------
		/*
		MethodTest1 m1 = new MethodTest1();
		
		// method1호출
		m1.method1();
		
		//System.out.println(m1.method1());
		
		
		// method2호출
		//String str = m1.method2();
		//System.out.println(str);
		
		System.out.println(m1.method2());
		
		
		// method3 호출
		m1.method3(10, 5);
		
		// method4 호출
		//int result = m1.method4(5, 2);
		//System.out.println(result);
		System.out.println(m1.method4(5, 2));
		
		
		User u = new User("user01", "pass01", "홍길동");
		System.out.println("현재의 u - " + u.information());
		
		m1.test(u);
		System.out.println(u.information());
		
		
		int[] arr = new int[4];
		
		m1.test2(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		// ------------ MethodTest2 ------------
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("강보람");
		
		String str = MethodTest2.method4("강보람");
		System.out.println(str);
		
		// public static 메소드 호출시
		// 클래스명.메소드명([전달값]);
		
		System.out.println(Math.random());
		
		//Math m = new Math();  // Math 클래스 모든게 다 public static
								// 즉, 클래스명. 으로 접근 가능 == 객체생성할 필요 없음
								// 아싸리 생성이 안되게끔 기본생성자의 접근제한자를 private으로 해놓음!!
		
		System.out.println();
		
		
		//Scanner sc = new Scanner(System.in);
	}

}







