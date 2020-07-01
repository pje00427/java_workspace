package com.kh.chap02_personMVC.model.vo;

// Model : 데이터 관련 부분을 처리하는 역할
// VO(Value Object) : 데이터를 담아둘수 있는 용도의 클래스

public class Person {
	
	private String name;	// 이름
	private int age;		// 나이
	private int wealth;		// 재산
	
	// 기본생성자
	public Person() {
		
	}
	
	// 매개변수생성자
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	// setter메소드
	public void setName(String name) {		// 이름 값 변경용 메소드
		this.name = name;
	}
	
	public void setAge(int age) {			// 나이 값 변경용 메소드
		this.age = age;
	}
	
	public void setWealth(int wealth) {		// 재산 값 변경용 메소드
		this.wealth = wealth;
	}
	
	// getter메소드
	public String getName() {		// 이름 값 반환용 메소드
		return name;
	}
	
	public int getAge() { 			// 나이 값 반환용 메소드
		return age;
	}
	
	public int getWealth() {		// 재산 값 반환용 메소드
		return wealth;
	}
	
	// information메소드
	// "이름 : xxx, 나이 : xx, 재산 : xx"
	public String information() {	// 모든 필드값 하나의 문자열로 반환용 메소드
		return "이름 : " + name + ", 나이 : " + age + ", 재산 : " + wealth;
	}

}








