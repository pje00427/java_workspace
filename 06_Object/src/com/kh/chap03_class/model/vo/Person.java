package com.kh.chap03_class.model.vo;

public class Person {
	
	// 필드부 
	// 접근제한자 [예약어] 자료형 변수명;
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// 생성자부
	// 접근제한자 클래스명() { }
	public Person() { // 기본생성자 ==> 작성안했을 시 JVM이 자동으로 만들어줌
		
	}
	
	// 메소드부
	// 접근제한자 반환형 메소드명([매개변수, 매개변수, ...]) {  }
	
	// setter메소드 : 호출시 전달되는 값 받아서 해당 필드에 대입(초기화)시켜주는 역할 (값 변경)
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// getter메소드 : 호출시 해당 필드에 담긴값을 반환시켜주는 역할 (값 조회)
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	// information메소드 : 모든 필드값들을 하나의 문자열로 합쳐서 반환시켜주는 역할
	public String information() {
		
		return id + " " + name + " " + pwd + " " + phone + " " + age + " " + email + " " + gender;
	}

}




