package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * * switch문 (조건문)
	 * 
	 * if문과의 차이점 : if문은 조건에 범위를 지정할수 있었다고 한다면
	 * 				 switch문은 확실값의 조건이다. (동등비교와 같다)
	 * 
	 * switch(비교할대상자) {
	 * case 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * case 값3 : 실행코드3; break;
	 * ....
	 * default : 위의 조건에 다 만족하지 않을 경우 실행할코드;
	 * }
	 * 
	 * 비교대상자==값1 의 조건이 true일 경우 실행코드1 수행되고 break만나 빠져나감
	 * switch문은 if-else if문과 달리 실행코드만을 실행하고 자동으로 빠져나가지 못함..
	 * 직접 break를 걸어줘야됨
	 */
	 
	public void method1() {
		// 사용자에게 1~3사이의 정수를 입력받아 그 정수값
		// 1일 경우 "빨간색입니다."
		// 2일 경우 "파란색입니다."
		// 3일 경우 "초록색입니다."
		// 잘못입력했을 경우 "잘못입력했습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3사이의 정수 : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
			System.out.println("빨간색입니다.");
		}else if(num == 2) {
			System.out.println("파란색입니다.");
		}else if(num == 3) {
			System.out.println("초록색입니다.");
		}else {
			System.out.println("잘못입력하였습니다.");
		}
		*/
		
		String color = "";
		
		switch(num) {
		case 1: color = "빨간색"; break;
		case 2: color = "파란색"; break;
		case 3: color = "초록색"; break;
		default: System.out.println("잘못입력하였습니다."); return;
		}
		
		System.out.println(color + "입니다.");
		
	}
	
	public void method2() {
		// 사용자에게 과일을 입력받은 후 그에 해당하는 가격 출력
		// xxx의 가격은 xxx원 입니다.
		
		// 사과 : 1000원
		// 바나나 : 3000원
		// 키위 : 5000원
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일(사과/바나나/키위) : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과": price = 1000; break;
		case "바나나": price = 3000; break;
		case "키위": price = 5000; break;
		default: System.out.println("잘못입력하였습니다."); return;
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
		System.out.printf("%s의 가격은 %d원입니다.", fruit, price);
		
	}
	
	// break 없는 switch문 예시
	public void method3() {
		
		// 등급(1,2,3)별 권한
		
		// 3등급 : 관리 권한, 글쓰기 권한, 읽기 권한
		// 2등급 : 글쓰기 권한, 읽기 권한
		// 1등급 : 읽기 권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(1,2,3) 입력 : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("나 관리 권한있어");
		case 2: System.out.println("나 글쓰기 권한있어");
		case 1: System.out.println("나 읽기 권한있어"); break;
		default:System.out.println("잘못입력했습니다.");
		}
	}
	
	public void method4() {
		// 1 ~ 12월까지 입력받아 해당하는 달의 마지막 날짜를 출력
		
		// 1, 3, 5, 7, 8, 10, 12	=> "입력하신 월은 31일까지 입니다."
		// 4, 6, 9, 11				=> "입력하신 월은 30일까지 입니다."
		// 2 						=> "입력하신 월은 28일 또는 29일까지 입니다."
		// 잘못입력했을 경우				=> "반드시 1월~12월까지를 입력해야됩니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력하세요(숫자) : ");
		int month = sc.nextInt();
		
		/*
		if(month == 1 || month == 3 || 
				month == 5 || month == 7 || 
					month == 8 || month == 10 || month == 12) {
			
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			
		}else if(month == 2) {
			
		}else {
			
		}*/
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("입력하신 월은 30일까지 입니다."); break;
		case 2: System.out.println("입력하신 월은 28일 또는 29일까지 입니다."); break;
		default: System.out.println("반드시 1월 ~ 12월까지 입력해야됩니다.");
		}
		
		
		
	}
	
	
	
	
	 

}




