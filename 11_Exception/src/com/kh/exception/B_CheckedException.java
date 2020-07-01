package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	// CheckedException : 반드시 예외처리를 해야되는 클래스들
	// 예측불가한 곳에서 문제가 발생하기 때문에 미리 예외처리를 해놔야됨!! (필수로!)
	// 주로 외부 매개체와 어떤 입출력이 일어날 때 발생!!
	
	public void method1() throws IOException {
		
		// 1. try~catch : 여기서 진짜 처리하는 방법
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다!");
		}
		*/
		
		// 2. throws : 떠넘기다
		method2();
	}
	
	public void method2() throws IOException {
		
		//Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		
		// 기존에 사용자에게 값을 입력받았을 때의 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력 : ");
		
		// BufferedReader 같은 경우 Scanner와는 다르게 값을 입력받을 수 있는 메소드 단 하나 readLine() : String
		//int num = Integer.parseInt(br.readLine()); // "10" --> 10
		
		// 1. try~catch방법 : 여기서 바로 예외를 처리하겠다! 라는 걸 의미
		// try { 예외가 발생할 가능성이 있는 코드; }
		// catch(예외클래스명 매개변수명) { try구문내에서 해당 예외가 발생했을 경우 처리할 구문; }
		
		/*
		String num = "";
		try {
			num = br.readLine();
			
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다!");
		}
		
		System.out.println(num);
		*/
		
		// 2. throws : 지금 여기서 예외를 처리하지 않고 현재 이메소드를 호출한 것으로 떠넘기겠다! 위임하겠다.
		String num = br.readLine();
	}
	
	//					   예외 발생 시점					예외처리
	// RuntimeE			프로그램실행시(런타임에러)	     세모(케바케)	--> uncheckedException
	// RuntimeE 그 외		      컴파일시(컴파일에러)			  필수		--> checkedException
	

}













