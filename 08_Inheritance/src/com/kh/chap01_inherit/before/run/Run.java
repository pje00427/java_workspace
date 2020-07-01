package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		// Desktop객체 생성
		// 브랜드명, 상품코드, 상품명, 가격, 일체여부
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1000000, true);
		
		// SmartPhone 객체 생성
		// 브랜드명, 상품코드, 상품명, 가격, 통신사
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		// Tv 객체 생성
		// 브랜드명, 상품코드, 상품명, 가격, 인치
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 60);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// 이 세 개의 클래스에는 공통적인 필드, 메소드 존재함
		// 이런 중복된 코드들 부모 클래스로 한번만 정의를 해두고
		// 그 부모꺼 가져다 쓰겠다라는 개념의 상속을 배워볼꺼임!!
		
		// --> 나중에 유지보수를 하게될 때 일일히 찾아가서 수정할 필요없이
		//     부모클래스만 수정해주면 모든 곳에 반영됨
		
		// 세 클래스가 가지고 잇는 공통적인 필드
		// brand, pCode, pName, price
		// 세 클래스가 가지고 있는 공통적인 메소드
		// 위의 공통적인 필드때문에 작성된 set/getter메소드, information메소드
		
		// --> Product 부모 클래스로 단 한번만 정의 해두겟음!!
		
	}

}




