package com.kh.run;

import java.io.IOException;

import com.kh.exception.A_UnCheckedException;
import com.kh.exception.B_CheckedException;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * * 에러종류
		 * 1. 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드 해결안됨 --> 심각한 에러
		 * 2. 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 알려줌 
		 * 3. 런타임 에러 : 코드 상으로는 문제는 없는데 프로그램 실행하고 나서 발생하는 에러 (사용자의 실수일수도 있고 예측가능한 경우를 제대로 처리 못한 개발자의 실수일수도..)
		 * 
		 * 번외. 논리 에러 : 문법적으로 문제없고 프로그램 실행할때도 문제는 없지만 프로그램 의도상 맞지 않는 것
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러 같은 비교적 덜 심각한 것(소스코드로 해결 가능)들을 작업!
		 * 이런 것들을 "예외"라고 함!!  --> Exception
		 * 
		 * 이런 "예외들이 발생" 했을 경우 "처리" 하는 방법을 "예외처리"
		 * 
		 * * 예외 처리 방법
		 * 1. try~catch문
		 * 2. throws를 이용 (위임)
		 * 3. try~with~resource
		 */
		
		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		
		B_CheckedException b = new B_CheckedException();
		b.method1(); // try~catch하지 않고 여기서 마저도 떠넘기는 순간 JVM이 처리해버림!! (권장사항X)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
