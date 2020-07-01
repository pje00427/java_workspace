package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	// 문제 1. 사용자에게 이름, 나이, 성별, 키를 입력받아 변수에 저장한 후 각 변수에 담긴 값을 문제에서 요구한 출력문 형식대로 출력하기
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // nextInt() 메소드 뒤에 nextLine() 메소드가 올거기 때문에 그 사이에 엔터를 버퍼에서 빼주는 작업을 해줘야된다. 
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		// 첫번째 방법 : 최종으로 출력할 결과물을 String 변수에 저장한 후 출력하기 
		/*
		String result = "키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^";
		System.out.println(result);
		*/
		
		// 두번째 방법 : 바로 출력하기
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}

	
	// 문제 2. 사용자에게 두개의 정수값을 입력받아 변수에 저장한 후 각 변수에 담긴 값을 가지고 덧셈, 뺄셈, 곱셈, 나눗셈 한 결과값을 출력하기
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 첫번째 방법 : 사용자가 입력한 값을 가지고 산술연산 (덧셈, 뺄셈, 곱셈, 나눗셈)한 결과값을 각 변수에 저장한 후 출력하기----------
		/*
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("더하기 결과 : " + plus);
		System.out.println("빼기 결과 : " + minus);	
		System.out.println("곱하기 결과 : " + multiple);		
		System.out.println("나누기 몫 결과 : " + div);
		*/
		// -----------------------------------------------------------------------------------------
		
		
		// 두번째 방법 : 사용자가 입력한 값을 가지고 산술연산한 결과값을 바로 출력하기----------------------------------------
		// 산술 연산 순서 (* / %  =>  + -)
		System.out.println("더하기 결과 : " + (num1 + num2));	// 괄호를 안하게 되면 문자열로 인식하여 숫자 두개가 문자열화 되서 붙어서 나온다.
		System.out.println("빼기 결과 : " + (num1 - num2));		// 마찬가지로 괄호를 안하게되면  '문자열-정수'로 인식하여 오류 발생
		System.out.println("곱하기 결과 : " + num1 * num2);		
		System.out.println("나누기 몫 결과 : " + num1 / num2);
		// -----------------------------------------------------------------------------------------
	}

	// 문제 3. 사용자에게 가로, 세로 길이를 입력받아 변수에 저장한 후 면적과 둘레를 구해 출력하기
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		// 첫번째 방법 : 사용자가 입력한 값을 가지고 면적과 둘레를 구한 결과값을 변수에 저장한 후 출력하기---------------------------
		/*
		double area = width * height; // 면적
		double perimeter = (width + height) * 2; // 둘레
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
		*/
		// -----------------------------------------------------------------------------------------
		
		
		// 두번째 방법 : 사용자가 입력한 값을 가지고 연산한 결과값 바로 출력하기--------------------------------------------
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		// -----------------------------------------------------------------------------------------
	}

	
	// 문제 4. 사용자에게 문자열을 입력받아 변수에 저장한 후 첫번째 문자, 두번째 문자, 세번째 문자를 출력하기
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine(); // 
		
		// 첫번째 방법 : 사용자가 입력한 문자열이 담겨있는 str변수값으로 부터 0번인덱스 값, 1번인덱스 값, 2번인덱스값을 각각 뽑아서 변수에 저장한 후 출력하기
		/*
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		*/
		// ---------------------------------------------------------------------------------------------------
		
		
		// 두번째 방법 : 사용자가 입력한 문자열이 담겨있는 str 변수값으로 부터 각 인덱스별로 뽑은 값을 바로 출력하기------------------------------
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		// ---------------------------------------------------------------------------------------------------
	}

}




