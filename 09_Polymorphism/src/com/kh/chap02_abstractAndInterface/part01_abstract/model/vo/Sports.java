package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

// 부모 클래스
public abstract class Sports {
	
	// 참여하는 사람 수
	private int personCount;
	
	public Sports() {
		
	}
	
	public Sports(int personCount) {
		this.personCount = personCount;
	}
	
	public int getPersonCount() {
		return personCount;
	}
	
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}
	
	@Override
	public String toString() {
		return "사람수 : " + personCount;
	}
	
	public abstract void rule();
	
	/*
	 * * 추상메소드 (미완성된 메소드 == 내용구현이 되어있지 않은 메소드)
	 * => {} 몸통부가 아직 구현되어있지 않은 상태
	 * => 미완성된 추상메소드를 가지고 있다는 소리는 이 클래스 또한 미완성된 클래스임!! => 추상클래스로 해야됨!! 
	 * 
	 */

}
