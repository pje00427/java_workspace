package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth;	// 출산, 입양, 없음
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 출생정보 : " + babyBirth;
	}

	@Override
	public void eat() {
		
		// 엄마가 밥을 먹음 --> 몸무게 10증가 / 건강도 10 감소
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 10);
		
	}

	@Override
	public void sleep() {
		// 엄마가 잠을 잠 --> 건강도 10 증가
		super.setHealth(super.getHealth() + 10);
	}
	
}



