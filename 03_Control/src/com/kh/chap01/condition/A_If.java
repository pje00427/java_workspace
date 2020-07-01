package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 프로그램 진행은 기본적으로 순차적으로 진행됨
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 "제어문"이라는 걸 통해서 직접 제어가능
	 * 
	 * 선택적으로 실행하고자 한다면 => 조건문
	 * 반복적으로 실행하고자 한다면 => 반복문
	 * 그 외의 흐름 제어 			=> 분기문
	 * 
	 * < 조건문 > 
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 
	 * 해당 조건이 참일경우 그에 해당하는 실행문을 실행
	 * 
	 * --> 조건식의 결과 true/false 여야됨
	 * --> 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||), 논리부정연산자(!)
	 * 
	 * 조건문 크게 if문과 switch문으로 나뉜다.
	 * 
	 * 그 중 if문에서는 크게 3가지로 나뉨
	 * 1. 단독 if문 
	 * 2. if-else문 
	 * 3. if-else if문
	 * 
	 * 
	 * * 단독 if문
	 * 
	 * if(조건식) {
	 * 		실행할 코드 ... ;
	 * }
	 * 
	 * --> 조건식이 true일 경우 중괄호 안의 코드 실행
	 * --> 조건식이 false일 경우 중괄호 안의 코드 무시하고 건너뜀
	 * 
	 */
	
	public void method1() {
		// 실습문제 1번, 2번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		if(num == 0) {
			System.out.println("0이다.");
		}
		if(num < 0) {
			System.out.println("음수다");
		}
		
	}
	
	public void method2() {
		// 실습문제 3번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}
		if(num % 2 == 1) {
			System.out.println("홀수다");
		}
	}
	
	public void method3() {
		// 실습문제 5
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리 까지) : ");
		double score = sc.nextDouble();
		
		String student = ""; // 지역변수를 셋팅해놓을 때 반드시 초기화하는 습관들이기
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}
		
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못입력하셨습니다!!");
			
			return; // 해당 메소드 자체를 빠져나가는 구문 (즉, 이메소드를 호출했던 곳으로 돌아감)
		}
		
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + 
						   name + " " + student + "의 성적은 " + score + "이다.");
		
		
	}
	
	public void method4() {
		// 실습문제 6
		// 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		}
		if(age > 13 && age <= 19) {
			System.out.println("청소년");
		}
		if(age > 19) {
			System.out.println("성인");
		}
		
	}
	
	public void method5() {
		// 새로운 예시
		// 이름 입력 받은 후 본인이 맞는지 확인하는 메소드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		/*
		// name에 담긴값이 "강보람"과 일치할 경우 => "본인입니다."
		if(name == "강보람") {
			System.out.println("본인입니다.");
		}
		
		// name에 담긴값이 "강보람"과 일치하지 않을 경우 => "본인이 아닙니다."
		if(name != "강보람") {
			System.out.println("본인이 아닙니다.");
		}
		*/
		
		/*
		 * 위의 내용들 제대로 실행 X
		 * 기본자료형들끼리 비교시에 ==, != 과 같은 동등비교 사용 가능
		 * 
		 * 단, String 기본자료형이 아닌 참조자료형
		 * 
		 * 그래서 String 문자열간에 비교에 있어서는 .equals(비교할 값) 메소드 활용
		 */
		
		// name == "강보람"
		if(name.equals("강보람")) {
			System.out.println("본인입니다.");
		}
		
		// name != "강보람"
		if(!name.equals("강보람")) {
			System.out.println("본인이 아닙니다.");
		}
		
	}
	
	
	
}






