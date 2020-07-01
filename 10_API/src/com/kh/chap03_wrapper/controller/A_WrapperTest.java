package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	
	/*
	 *  * Wrapper 클래스
	 *  
	 *  - 기본자료형을 객체로 포장해주는 클래스들을 래퍼(Wrapper) 클래스이다.
	 *  
	 *    기본자료형		 Wrapper클래스
	 *    
	 *    boolean  <-->   Boolean
	 *      char   <-->  Character
	 *      byte   <-->     Byte
	 *     short   <-->    Short
	 *      int    <-->   Integer
	 *      long   <-->     Long
	 *     float   <-->    Float
	 *    double   <-->    Double
	 *  
	 *  - 기본 타입을 객체로 취급해야 되는 경우가 있음
	 *    ex) 메소드의 매개변수로 객체 타입만이 요구될 때
	 *        다형성을 적용하고 싶을 때
	 *        클래스에서 제공하는 메소드를 사용하고 싶을 때
	 */
	
	// 기본자료형 --> Wrapper 클래스 자료형으로 바꿔보기!
	public void method1() {
		
		// Boxing : 기본자료형-->Wrapper클래스
		int num1 = 10;
		int num2 = 15;
		// int == Integer
		//num1.equals(num2);
		
		// 1. 객체 생성을 통해 하는 방법
		Integer i1 = new Integer(num1); // num1 --> i1
		Integer i2 = new Integer(num2); // num2 --> i2
		
		System.out.println(i1/* .toString() */);
		System.out.println(i2);
		// Integer 말고도 모든 Wrapper 클래스에는 toString 오버라이딩 되어있음!
		
		// 객체화 시킨 순간 메소드 이용 가능
		System.out.println(i1.equals(i2));
		// equals 오버라이딩 되어있음! 주소값 비교가 아닌 실제값 비교로!
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0반환하는 메소드
		
		// 객체화 시킨 순간 다형성 적용 가능
		Object o = num1; // int --> Integer --> UpCasting(자식 --> 부모) 생략 가능 --> Object
		Object o2 = i1;
		
		// 2. 객체 생성하지 않고 바로 대입 방법 (AutoBoxing)
		Integer i3 = num2; // 바로 대입 가능.. (단, 같은 타입으로만)
		
		// 언제 객체생성을 해서 Boxing합니까?
		// 단, 객체 생성을 통해 Boxing 하게 되면 문자열도 넣을 수 있다!! --> 문자열을 숫자화 시켜줌!! (문자열에 숫자만 있어야됨!!)
		Integer i4 = new Integer("123"); // "123" --> 123
		//Integer i5 = "123";
		System.out.println(i4);
		
		
		
		// UnBoxing : Wrapper 클래스 --> 기본자료형으로 바꾸는 거
		
		// 1. 래퍼클래스에서 제공하는 xxxValue() 메소드를 통해
		
		// i1 --> num3
		int num3 = i1.intValue(); // 10
		int num4 = i2.intValue(); // 15
		
		System.out.println(num3 + ", " + num4);
		
		// 2. 메소드따위 사용하지 않고 바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i3;
		
		
		// Auto로 해주는 기능들이 많은데 궂이 객체생성을 통해 Boxing을 한다거나 xxxValue메소드를 통해서 UnBoxing을 하냐?
		// 그래서 9버전 이후부터는 해당 기능을 안쓰도록 Deprecated 되어있다.
		
	}
	

}





