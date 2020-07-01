package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class BasketBall extends Sports {

	@Override
	public void rule() {
		System.out.println("발이 아닌 손으로 공을 던져 링에 넣어야된다.");
	}
	
}
