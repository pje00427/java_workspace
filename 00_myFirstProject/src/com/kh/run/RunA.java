package com.kh.run;

import com.kh.first.*;

// 실행을 담당 하는 클래스
public class RunA {
	
	public static void main(String[] args) {
		
		// 다른 클래스에 있는 메소드를 실행(호출)시키고 할 때 방법
		// 1) 실행하고자 메소드가 있는 클래스를 생성(new) 이라는 걸 해라!
		// [표현법] 클래스명 사용할이름 = new 클래스명();
		//A_MethodPrinter a = new A_MethodPrinter();
		// 위쪽 구문 빨간줄 뜨는 이유 : 같은패키지 내의 클래스가 아닌 다른패키지에 있는 클래스를 사용하려고 하기 때문!!
		
		// 해결방법1. 해당 클래스가 어떤 패키지에 속해있는지 풀클래스명을 사용하는 방법
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// 해결방법2. 단지 클래스명만으로 생성하긴 하되 이클래스가 어느패키지에 속해있는지 단 한번 선언(import)해놓기
		A_MethodPrinter a = new A_MethodPrinter();
		
		// 2) 생성 후 해당 메소드 실행(호출)
		// [표현법] 사용할이름.실행시키고자하는메소드명();
		a.methodA();
		//a.methodB();
		//a.methodC();
		
	}

}





