package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		/*
		 * String 클래스 : 불변클래스 --> 변하지 않는 클래스
		 * 				  한번 값을 저장하고 수정하게 되면 그자리에서 수정되는 개념 X
		 * 				  변경이 적고 한번 저장 한 후 읽기만 많은 경우 유용하게 사용됨
		 */
		
		// 1. 생성자를 통한 문자열 생성 
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1/* .toString() */);
		System.out.println(str2/* .toString() */);
		// toString() --> String 클래스에 이미 오버라이딩 되어잇음
		
		System.out.println(str1.equals(str2));
		// equals() --> String 클래스에 이미 오버라이딩 되어있음
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() --> String 클래스에 이미 오버라이딩 되어있음
		
		// 만약에 정말로 주소값에 대해서 알고자 한다면
		// System.identityHashCode(알고자 하는 값);
		
		System.out.println("== 진짜 주소값 ==");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	
	public void method2() {
		
		// 2. 문자열을 리터럴로 생성
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		
		str2 = "hello";
		System.out.println(System.identityHashCode(str2));
		
		str2 = new String("강보람");
		
		// String 클래스 (불변클래스)
		// --> 계속 값을 변경하는 경우 가비지 컬렉터(GC)가 계속 지워야 되는 단점 있음
		// --> 변경이 적고 읽기만 하는 경우 String 클래스가 용이
		
		
	}
	

}





