package com.kh.chap02_personMVC.run;

import com.kh.chap02_personMVC.view.PersonView;

public class Run {

	public static void main(String[] args) {
		
		// Run : 단지 프로그램 실행만 시켜주는 스위치 같은 역할을 함
		//		  사용자가 보게될 첫 화면(메인화면)을 띄워만 주는 역할
		//		  사용자가 보게될 메인 메뉴(메소드)를 호출만 해주는 역할 
		
		PersonView pv = new PersonView();
		pv.mainMenu();
		
	}

}





