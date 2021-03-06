package com.kh.chap04_field.model.vo;

/*
 * 클래스 구조 {"필드"부 + 생성자부 + 메소드부}
 * 
 * - 전역변수 : 클래스영역에서 선언하는 변수 --> 클래스 내 어디서든 사용 가능
 * - 지역변수 : 클래스영역을 제외한 특정 구역({})에서 선언하는 변수 --> 그 지역에서만 사용 가능 
 * 			  메소드, 제어문(if, for) 
 * 
 * 1. 전역변수
 * - 멤버변수 (인스턴스 변수)
 * 	  생성시점 : new 연산자를 통해 객체 생성 시 메모리 영역에 할당 
 * 	  소멸시점 : 객체 소멸 시 같이 소멸
 * 
 * - 클래스변수 (static변수) : static 키워드를 붙인 변수
 * 	  생성시점 : 프로그램 실행(객체생성을 안해도)과 동시에 무조건 메모리 영역(static)에 할당
 *   소멸시점 : 프로그램이 종료될 때 소멸
 * 
 * 2. 지역변수 
 * 	  생성시점 : 특정한 구역({}) 실행(호출)시 메모리 영역에 할당 (ex. 메소드 실행시)
 * 	  소멸시점 : 특정한 구역({}) 종료시 소멸  (ex. 메소드 종료시)
 * 
 */

// 변수 선언 위치에 따른 구분 (전역, 지역(매개변수))
public class FieldTest1 { // FieldTest1 클래스영역 시작
	
	// 멤버변수 (인스턴스변수) == 필드
	private int global; // 전역변수
	
	
	public void test(int num) { // test 메소드영역 시작
		
		// 지역변수 (특정 구역에서 선언한 변수)
		int local = 10;
		
		// 위 num 매개변수 또한 지역변수 (num또한 이 영역에서만 사용 가능)
		
		// 멤버변수 출력 --> 객체생성시 JVM이 기본값을 초기화 진행함
		System.out.println(global);
		
		// 지역변수 출력 --> 지역변수는 반드시 초기화해야됨 (자동으로 기본값이 초기화 되지 않음)
		System.out.println(local);
		
		// 매개변수(지역변수) 출력 --> test메소드 호출시 무조건 정수값이 넘어오기 때문에 그 값으로 초기화 될꺼임
		System.out.println(num);
		
		
	} // test 메소드영역 끝
	
	
	
} // FieldTest1 클래스영역 끝










