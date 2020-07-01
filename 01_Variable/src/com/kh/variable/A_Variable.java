package com.kh.variable;

// 다른 패키지라면 같은 클래스명으로 만드는 것 허용
public class A_Variable { // 클래스 시작
	
	/*
	 * * 학습목표
	 * 1. 변수라는게 어떤건지
	 * 2. 변수를 왜 사용하는지
	 * 3. 변수를 사용하는 방법
	 * 4. 변수명을 어떻게 지으면 되는지
	 */
	
	public void printVariable() { // printVariable 메소드 시작
		
		System.out.println("===변수 사용 전===");
		System.out.println(200 + 10);
		System.out.println((200 + 10) * 10);
		System.out.println(((200 + 10) * 10) - 10);
		// 결과물은 잘 출력되지만 무슨의미인지 알 수 없음
		
		// 1. 변수란 ? --> 어떠한 값을 메모리에 기록하기 위한 공간(박스와도 같은 개념)
		
		int point = 200;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println("===변수 사용 후 ===");
		System.out.println(point + bonus); 
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		/*
		 * 2. 변수를 사용하는 이유
		 * -  변수는 우선적으로 값에 의미를 부여하기 위한 목적으로 사용 (가독성이 좋아짐)
		 * -  한번 값을 저장해두고 계속 사용할 목적으로 사용
		 * -  유지보수를 쉽게 하기 위한 목적
		 */
		
	} // printVariable 메소드 끝
	
	
	public void declareVariable() { // declareVariable 메소드 시작
		
		/*
		 * * 변수 선언 (변수를 메모리 공간에 확보해놓는 과정) == 박스만들겠다!!
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤값을 담을건지, 어떤크기의 값을 담을건지에 따라 변수(박스)의 크기 및 모양을 정하는 부분
		 * 변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여)
		 * 
		 * * 주의할 점
		 * - 변수명은 반드시 첫 문자가 소문자여야한다.
		 * - 여러단어로 조합된 경우 낙타표기법 지키기 (testVariable) 
		 * - 같은 영역내에 동일한 변수명으로 선언 불가
		 * - 해당 영역({})에 선언한 변수는 해당 영역안에서만 꺼내 쓸 수 있다. (지역변수)
		 * 
		 */
		
		// --- 자료형에 대한 개념 ---
		
		// 1. 논리형 
		boolean isTrue;			// 1byte
		
		// 2. 숫자형
		// 2_1. 정수형 (4종류)
		byte bNum;				// 1byte
		short sNum;				// 2byte
		int iNum;				// 4byte --> 정수형중에 가장 대표적인 자료형(기본형)
		long lNum;				// 8byte
		
		// 2_2. 실수형 (2종류)
		float fNum;				// 4byte
		double dNum;			// 8byte --> 실수형 중에 가장 대표적인 자료형(기본형)
		
		// 3. 문자(한글자)형
		char ch;				// 2byte
		
		// ---------- 위에 까지 기본 자료형(8개) -----------
		
		// 4. 문자열 (참조자료형)
		String str;
		
		
		/*
		 * * 변수에 값 대입(담기)
		 * 
		 * [표현법] 변수명 = 담고자하는 값;
		 */
		
		isTrue = true;		// 논리형 변수에는 true/false 값만 저장가능
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;	// long형 변수에는 숫자값 뒤에 l 또는 L을 붙이는게 권장사항 
		
		fNum = 4.0f; // 반드시 f를 붙여야 함 
		dNum = 8.0;
		
		ch = 'A';
		ch = '강';
		
		str = "ABC";
		str = "A";
		
		// * 변수에 값이 잘 담겼는지 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
	} // declareVariable 메소드 끝
	
	
	public void initVariable() {
		
		// * 변수 선언과 동시에 초기화
		// [표현법] 자료형 변수명 = 값;
		
		// 1. 논리형
		boolean isTrue = false; // 1byte
		// 2_1. 정수형
		byte bNum = 1;		// 1byte
		short sNum = 2;		// 2byte
		int iNum = 4;		// 4byte	--> 기본형
		long lNum = 8L;		// 8byte
		// 2_2. 실수형
		float fNum = 4.0f;	// 4byte
		double dNum = 8.0;	// 8byte	--> 기본형
		// 3. 문자형
		char ch = '가';		// 2byte 
		
		// ----- 기본자료형(8개) ----
		
		// ----- 참조자료형 -----
		String str = "안녕하세요";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
		
		// 4. 변수 명명 규칙
		int number;
		
		// 1) 변수명이 중복되서는 안됨 (다른자료형이여도 안됨)
		//	   단, 대소문자는 구분함
		//double number;
		int numBer;
		
		// 2) 예약어(이미 자바에서 사용되고 있는 키워드) 사용이 불가
		//int public;
		//int void;
		//int abstract;
		//int true;
		
		// 3) 숫자 사용 가능 (단, 숫자로 시작하는 건 안됨)
		int age1;
		//int 1age;
		
		// 4) _ 또는 $ 특수 문자 사용 가능 (그 외의 특수문자 사용 불가)
		int number_1;
		int number$1;
		//int number#1;
		
		
		// * 낙타표기법 지키는게 권장사항
		String username;
		String userName;
		
		// * 한글을 사용하지 않는게 권장사항
		String 이름;
		
	}
	
	
	
} // 클래스 끝










