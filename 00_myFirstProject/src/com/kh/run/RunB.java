package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {
	
	public static void main(String[] args) {
		
		// 다른 클래스에 있는 메소드 호출 하고자 할때 지켜야 할 순서
		// 1) 사용하고자 하는 클래스 생성 (new) 해야만 함
		//    [표현법] 클래스명 사용할이름 = new 클래스명();
		B_ValuePrinter b = new B_ValuePrinter();
		
		// 2) 실행하고자 하는 메소드 호출
		//	  [표현법] 사용할이름.실행할메소드명();
		//b.printValue();
		b.sumStringNumber();
		
	}

}




