package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Mother;

public class Run {
	
	public static void main(String[] args) {
		
		//Person p = new Person(); // 추상클래스로는 절대 생성이 불가 (레퍼런스로는 사용 가능)
		/*
		Person p1 = new Mother("강엄마", 50, 70, "출산");
		Person p2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// 엄마와 아기가 밥을 먹는다.
		p1.eat();	// 엄마 : 몸무게 +10 / 건강도 -10
		p2.eat();	// 아기 : 몸무게 +3  / 건강도 +1
		
		// 엄마와 아기가 잠을 잔다
		p1.sleep();	// 엄마 : 건강도 +10
		p2.sleep(); // 아기 : 건강도 +3
		
		System.out.println("=== 다음날 ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		
		//Person p = new Person();
		//Basic b = new Basic(); // 인터페이스도 미완성된 상태기때문에 객체 생성 불가!!
		
		Basic b1 = new Mother("강엄마", 50, 70, "출산");
		Basic b2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 *  일반클래스 상속   -->  추상클래스 상속  -->  인터페이스 구현
		 *  		------------------------------>
		 *  		 강제성이 더 짙어짐 (규약이 더 쎄짐)
		 *  
		 *  
		 *  클래스간 상속 			: 클래스 extends 클래스 				(단일상속)
		 *  클래스 인터페이스간 구현	: 클래스 implements 인터페이스, 인터페이스 (다중상속 가능)
		 *  인터페이스간			: 인터페이스 extends 인터페이스, 인터페이스 
		 *  
		 */
		
		
	}

}










