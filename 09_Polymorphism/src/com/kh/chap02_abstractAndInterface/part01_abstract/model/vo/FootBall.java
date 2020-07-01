package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class FootBall extends Sports {
	
	// 상속받는 클래스에 미완성된 메소드(추상메소드)가 존재할 경우
	// 강제로 해당 메소드 오버라이딩 해야됨!!
	// 왜? 부모에서 미완성된 상태니깐 자식인 너가 완성해라는 거임
	
	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야된다.");
	}
	
}


