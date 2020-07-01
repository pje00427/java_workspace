package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Basic {
	
	// 추상클래스 --> 일반 멤버(필드 + 메소드) + [추상메소드]
	// 인터페이스 --> 상수필드 + 추상메소드
	
	/* public static final */ int NUM = 10; // interface로 명시되어있을 경우 생략 가능 (알아서 상수필드로 인식)
	
	/* public abstract */ void eat();

	/* public abstract */ void sleep();	// 생략가능 (알아서 추상메소드로 인식)
	
	
	
}
