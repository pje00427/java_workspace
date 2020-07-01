package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {
	
	public static void main(String[] args) {
		Circle[] cir = new Circle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		
		
		Rectangle[] rec = new Rectangle[2];
		
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle c : cir) {
			c.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rec) {
			r.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
		
		
		/*
		 * * 상속의 장점
		 * 1. 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 2. 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
		 * 3. 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여
		 * 
		 * * 상속의 특징
		 * - 클래스를 상속 받을 때는 단일 상속만 가능하다 (부모는 하나!)
		 * - 명시되어있진 않지만 모든 클래스는 Object 클래스의 후손이다. 
		 *   --> 즉, Object 클래스가 제공하는 메소드들을 사용할 수 있고
		 *       오버라이딩하여 메소드 재작성도 가능하다는 말씀!
		 * - 부모클래스의 생성자, 초기화블록은 상속이 안된다. (자식클래스 생성시, 부모 클래스 생성자가 먼저 실행)
		 * - 부모의 private 멤버(필드,메소드)는 상속은 되지만 직접 접근 불가하다. (단, protected로 하게되면 후손클래스가 직접 접근 가능)
		 * - --> setter/getter를 이용하여 접근
		 */
		
		
	}

}
