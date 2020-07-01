package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

public class Run {
	
	public static void main(String[] args) {
		
		// Desktop 객체 생성
		/*
		Desktop d = new Desktop();
		d.setBrand("삼성");
		d.setpCode("d-01");
		d.setpName("짱짱데스크탑");
		d.setPrice(1000000);
		d.setAllInOne(true);
		*/
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1000000, true);
		
		SmartPhone s = new SmartPhone("사과", "s-01", "아이폰", 1300000, "SK");
		
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 58);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		
		/*
		 *  * 상속의 장점
		 *  - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 *  - 공통적인 코드들을 하나의 클래스로 관리하기 때문에 새로운 코드를 추가하거나 변경에 용이 
		 *    => 유지보수에 좋음! 생산성 향상
		 *    
		 *  * 상속의 특징
		 *  - 클래스간의 상속은 다중 상속 불가능!!(단일 상속만 가능 즉, 부모는 하나여야됨!)
		 *  - 모든 클래스들은 명시되어 있진 않지만 Object 클래스의 후손이다. 
		 *    => 즉, Object 클래스가 제공하는 메소드들을 오버라이딩해서 재정의 할 수 있음!!
		 *  
		 */
		
		System.out.println(d);
		System.out.println(d.toString());
		
		// 출력문 안에 레퍼런스 변수만 제시했을 때
		// JVM이 해당 레퍼런스변수.toString() 호출한 결과를 사실상 출력했던것!!
		
		
	}

}





