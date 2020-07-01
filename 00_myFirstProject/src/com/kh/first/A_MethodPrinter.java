package com.kh.first;	// 패키지 선언부 : 이 클래스가 어떤 패키지에 속해있는지

public class A_MethodPrinter {
	
	// 기능 == 메소드
	
	public void methodA() {
		System.out.println("메소드 A 출력문");
		methodB();
	}
	
	public void methodB() {
		System.out.println("메소드 B 출력문");
		methodC();
	}
	
	public void methodC() {
		System.out.println("메소드 C 출력문");
		//methodA();
	}
	

}



