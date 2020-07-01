package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * * 삼항 연산자 : 3개의 항목을 통해 연산하는 연산자
	 * [표현법] 조건식 ? 조건식이true일 경우 값 : 조건식이 false일경우 값;
	 * 
	 * 조건식에는 반드시 true또는 false가 나오게끔 작성해야됨
	 * 주로 비교연산/논리연산 사용 
	 * 
	 */
	
	public void method1() {
		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		// 조건식 ? 참일경우 값 : 거짓일 경우 값
		//System.out.println(num > 0 ? "양수이다" : "양수가 아니다");
		//System.out.println(num <= 0 ? "양수가 아니다" : "양수이다");
		
		String result = (num > 0) ? "양수이다" : "양수가 아니다";
		// xx은 xxxx
		System.out.println(num + "은 " + result);
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		
		System.out.println(num + "은 " + result);
	}
	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		// "결과가 100이상입니다."
		// "결과가 100보다 작습니다."
		//String result = num1 * num2 >= 100 ? "결과가 100이상입니다." : "결과가 100보다 작습니다.";
		String result = (num1 * num2 < 100) ? "결과가 100보다 작습니다." : "결과가 100이상입니다.";
		
		System.out.println(num1 * num2 + "은(는) " + result);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// "대문자이다."
		// "대문자가아니다."
		//					'A' <= ch <= 'Z'
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다." : "대문자가 아니다.";
		
		System.out.println(ch + "은(는) " + result);
		
	}
	
	public void method5() {
		
		// 사용자가 입력한 값이 양수인지 음수인지, 0인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		// "양수이다."
		// "음수이다."
		// "0이다."
		
		String result = (num > 0) ? ("양수이다.") : ((num == 0) ? "0이다." : "음수이다.");
		
		System.out.println(num + "은(는) " + result);
		
	}
	
	
	public void method6() {
		
		// 두 개의 정수값을 입력받고
		// + 또는 -를 입력받고 알맞는 계산 결과 출력
		// 단, + 또는 - 외의 다른 문자를 입력하는 경우 "잘못 입력하였습니다." 출력
		
		// +를 입력했을 경우 => 덧셈 연산 결과
		// -를 입력했을 경우 => 뺄셈 연산 결과
		// 그 외를 입력했을 경우 => "잘못 입력하였습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		
		String result = (op == '+') ? (num1 + num2 + "") : 
					   ((op == '-') ? (num1 - num2 + "") : ("잘못 입력하였습니다."));
		
		System.out.println("결과 : " + result);
	}
	

}








