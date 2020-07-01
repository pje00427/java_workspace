package com.kh.chap02_encapsulation.model.vo;

public class Student {
	
	private String name;
	private int age;
	private double height;
	
	
	// setter메소드
	// - 호출시 전달값을 각 필드에 대입시켜주는 메소드
	/*
	public void setName(String newName) { // (매개변수 == 메소드 호출 시 전달값을 받아주기 위한 변수)
		name = newName;
	}
	*/
	
	// ** 권장사항 **
	// setter메소드 이름지을때 setXXX로 낙타표기법 지킨채로 지어준다. ex) setName, setAge, setHeight
	// setter메소드의 매개변수명을 지을때 필드명과 동일하게 지어준다.
	public void setName(String name) {
		//name = name; // 매개변수 name = 매개변수 name;
					 // {}영역에서는 해당 영역에 만들어진 변수가 우선권을 가짐
		
		this.name = name;
	}
	
	public void setAge(int age) { // 나이값을 변경시켜주는 메소드
		this.age = age;
	}
	
	public void setHeight(double height) { // 키값을 변경시켜주는 메소드
		this.height = height;
		
		//return;
	}
	
	
	// getter메소드 : 각 필드에 담겨있는 값을 반환시켜주는 메소드
	public String getName() {
		return name; // name 필드에 담긴값을 반환시켜주는 메소드
	}
	
	public int getAge() {
		return age; // age필드에 담긴값을 반환시켜주는 메소드
	}
	
	public double getHeight() {
		return height; // height 필드에 담긴값을 반환시켜주는 메소드
	}
	
	
	// 모든 필드값들을 다 합친 문자열을 반환하는 메소드
	public String information() {
		
		// XXX님은 XX살이고, 키는 XXXcm입니다.
		String info = name + "님은 " + age + "살이고, 키는 " + height + "cm입니다.";
		return info;
		
	}
	
	
	
}






