package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {

		// 기억해둘 것!!  왼쪽 '=' 오른쪽		왼쪽과 오른쪽 양 옆 자료형(타입)은 같아야된다
		
		// 1. 부모 타입 레퍼런스로 부모 객체 다루는 경우
		System.out.println("1. 부모타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		//((Child1)p1).printChild1();
		// p1레퍼런스로는 Parent에만 접근 가능
		
		// 2. 자식 타입 레퍼런스로 자식 객체 다루는 경우
		System.out.println("2. 자식타입 레퍼런스로 자식 객체 다루는 경우");                                                              
		Child1 c1 = new Child1();
		c1.printChild1();
		(/*(Parent)*/c1).printParent();
		// c1레퍼런스로는 Parent, Child1 둘 다 접근 가능
		c1.print();
		
		
		// 지금 부터 다형성 적용되는 내용
		// 3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우
		System.out.println("3. 부모타입 레퍼런스로 자식 객체 다루는 경우");
		Parent p2 = /*(Parent)*/new Child1();
		p2.printParent();
		// p2레퍼런스로는 Parent에만 접근 가능
		// 만약 Child1에 접근하고 싶으면 강제형변환을 하면됨!!
		((Child1)p2).printChild1();
		
		/*
		 *  * 클래스간의 형변환 가능 (단, 상속 구조일때만!!)
		 *  
		 *  1. UpCasting
		 *  자식 타입 --> 부모 타입으로 형변환
		 *  생략 가능 (자동형변환됨)
		 *  
		 *  ex) 부모타입 = 자식객체;
		 *      자식.부모메소드(); 
		 *      
		 *  2. DownCasting
		 *  부모 타입 --> 자식 타입으로 형변환
		 *  생략 불가 (강제형변환 해야됨! -> 명시적으로 작성해야됨!)
		 *  
		 *  ex) ((자식)부모).자식메소드();
		 *  
		 */
		
		//Parent p3 = new Child2();
		
		
		// 왜 다형성을 써야되?
		// 만약 Child1객체 2개 필요하고, Child2객체 2개필요함..
		
		// 다형성 적용 전 ---
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// 다형성 적용 후 --- 
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 3);
		arr[1] = new Child1(2, 3, 5);
		arr[2] = new Child2(2, 1, 5);
		arr[3] = new Child2(5, 7, 2);
		// 하나의 부모 타입으로 다양한 자식객체들을 수용할 수 있다. 
		// 각각의 자식객체들에 접근할 때 하나의 부모타입으로 접근 가능 --> 편리하다. 코드 길이가 감소. 유연한 코딩 가능
		
		// 배열[인덱스] 자료형 : Parent
		
		System.out.println("=== 다형성 접목해서 객체 배열 ===");
		
		// 각각의 메소드 실행!
		((Child1)arr[0]).printChild1();
		//((Child2)arr[1]).printChild2(); // 실제로 담겨있는 자식객체의 타입으로 형변환해야만 함!!
		((Child1)arr[1]).printChild1();
		((Child2)arr[2]).printChild2();
		((Child2)arr[3]).printChild2();
		
		System.out.println("=== 반복문을 이용해서 출력 ===");
		
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자
			 * 현재 레퍼런스가 실제로 어떤 클래스타입의 주소를 참조하고 있는지 확인 할 때 사용
			 * 
			 * 레퍼런스 instanceof 클래스타입
			 * 
			 * 해당 레퍼런스와 클래스 타입이 일치하면 true, 아니면 false 반환
			 */
			
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			
			// 동적바인딩 : 프로그램 실행 전에는 해당 레퍼런스 타입의 메소드로 찾아가지만
			//			  프로그램 실행 되면서 실제 참조하고 있는 클래스에 오버라이딩 되어있을 경우
			//			  해당 오버라이딩 된 메소드를 찾아가서 실행되는 개념
			
		}
		
		
		
		
		Object[] obj = new Object[3];
		obj[0] = new Parent();
		obj[1] = new Child1();
		obj[2] = new Child2();
		
		
		
		
		
		
		
		
		
		
	}

}
