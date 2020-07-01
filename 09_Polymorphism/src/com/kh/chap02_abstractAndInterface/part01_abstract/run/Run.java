package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 * * 추상클래스 
		 * - 미완성 클래스
		 * - 추상메소드를 포함한 클래스 (즉, 일반필드 + 일반메소드 + [추상메소드])
		 *   --> 추상메소드를 가진 클래스는 반드시 추상클래스 명시해야됨
		 *   --> 단, 추상메소드가 궂이 없어도 추상클래스 명시할 수 있음!!
		 *   	 --> 어쩔때? 클래스가 아직 여전히 미완성된 상태인것 같을 때 (객체 생성이 불가하게끔)
		 * 
		 * - 미완성된 클래스기 때문에 new를 통해 객체 생성 불가!! 
		 *   --> 단, 레퍼런스(참조변수의 타입)로는 사용 가능
		 *       --> 다형성 적용해서 부모타입 레퍼런스로 자식 객체 다루는건 가능! 
		 *       
		 * * 추상메소드 
		 * - 미완성된 메소드로 몸통부({})가 구현되어있지 않은 메소드
		 * - 추상클래스를 상속받는 자식 클래스에서는 반드시 오버라이딩 해야됨! (강제성 부여)
		 * 	 --> 오버라이딩 해주지 않으면 에러 발생
		 *   --> 메소드 사용의 통일성 확보 목적
		 *   --> 표준화된 틀을 제공할 목적으로 사용
		 *   
		 */
		
		//Sports s = new Sports(); // 추상클래스로 객체 생성 불가!! 왜? 미완성 클래스니깐!!
		Sports s; // 객체 생성이 안될뿐이지 레퍼런스로는 사용가능!! 
		
		// 다형성 적용해서 자식 객체 생성해서 받아줄 순 있다!!
		s = new FootBall();
		s = new BasketBall();
		
		
		Sports[] arr = new Sports[2];
		arr[0] = new FootBall();
		arr[1] = new BasketBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		// 추상클래스의 추상메소드를 이용해서 자식클래스에 강제성을 부여할 수 있음 (추상메소드 --> 강제 오버라이딩)
		
	}

}
