package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		// 1. if-else if문 이용하는 방법
		/*
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
			
		}else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
			
		}else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
			
		}else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
			
		}else if(menu == 9) {
			System.out.println("프로그램이 종료됩니다.");
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		// 2. switch문 이용하는 방법
		/*
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 9 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("잘못입력하셨습니다."); break;
		}
		*/
		
		// 3. switch문 이용할 때 String 변수 이용하는 방법
		String str = "";
		
		switch(menu) {
		case 1 : str = "입력"; break;
		case 2 : str = "수정"; break;
		case 3 : str = "조회"; break;
		case 4 : str = "삭제"; break;
		case 9 : System.out.println("프로그램이 종료됩니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
		System.out.println(str + " 메뉴입니다.");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		
		/*if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다.");
			
		}else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다.");
			
		}else {
			System.out.println("양수만 입력해주세요.");
		}*/
		
		
		if(num > 0) { // 공통된 조건을 먼저 수행한 후 
			
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
			
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		// 1. 이런 방식
		/*switch(num) {
		case 12:
		case 1:
		case 2:
				System.out.println(num + "월은 겨울입니다.");
				break;
		case 3:
		case 4:
		case 5: 
				System.out.println(num + "월은 봄입니다.");
				break;
		case 6:
		case 7:
		case 8:
				System.out.println(num + "월은 여름입니다.");
				break;
		case 9:
		case 10:
		case 11:
				System.out.println(num + "월은 가을입니다.");
				break;
		default : 
				System.out.println(num + "월은 잘못 입력된 달입니다.");
				break;
		}*/
		
		
		// 2. String 변수 사용해서 출력문은 한번만
		String season = null;
		
		switch(num) {
		case 12:
		case 1:
		case 2:
				season = "겨울";
				break;
		case 3:
		case 4:
		case 5: 
				season = "봄";
				break;
		case 6:
		case 7:
		case 8:
				season = "여름";
				break;
		case 9:
		case 10:
		case 11:
				season = "가을";
				break;
		default : 
				season = "잘못 입력된 달";
				break;
		}
		
		System.out.println(num + "월은 " + season + "입니다.");
	}
	
	public void practice5() {
		
		String userId = "boram";
		String userPwd = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("로그인 성공");
			
		}else if(userId.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다.");
			
		}else if(userPwd.equals(pwd)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		switch(sc.nextLine()) { // 이렇게 바로 입력한 값을 가지고도 비교할 수도..
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원"  : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break해야 default문까지 넘어가지 않는다.
		default : System.out.println("잘못 입력하셨습니다."); 
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
			
		}else if(bmi < 23) {
			System.out.println("정상체중");
			
		}else if(bmi < 25) {
			System.out.println("과체중");
			
		}else {
			System.out.println("비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		
		// 1. if-else if문 이용해서
		/*if (num1 > 0 && num2 > 0 && ch == '+') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 + num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '-') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 - num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '*') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 * num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '/') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 / num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '%') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 % num2));
			
		} else {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}*/
		
		
		/*if(num1 > 0 && num2 > 0) { // 공통된 조건
			
			if(ch == '+') {
				
			}else if(ch == '-') {
				
			}else if(ch == '*') {
				
			}else if(ch == '/') {
				
			}else if(ch == '%') {
				
			}else {
				// 양수긴 하지만 연산기호를 잘못 입력했을 경우
			}
			
		}else {
			// 양수가 아닌 값을 입력한 경우
			 
		}*/
		
		int result=0;
		
		if(num1 > 0 && num2 > 0) { // 공통된 조건
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
			
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); return;
		
		}
		
		System.out.printf("%d %s %d = %d", num1, ch, num2, result);

	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();

		System.out.print("과제  점수 : ");
		int homework = sc.nextInt();

		System.out.print("출석 회수 : ");
		int attendance = sc.nextInt();
		
		double mid = midTerm * 0.2;
		double fin = finalTerm * 0.3;
		double hw = homework * 0.3;
		double at = attendance;
		
		double sum = mid + fin + hw + at;
		
		System.out.println("===========결과==========");
		
		if(sum >= 70 && at >= 20 * 0.7) { // 1_1. 총점이 70점 이상이면서 전체 강의의 70% 이상 출석했을 경우
			
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + fin);
			System.out.println("과제 점수       (30) : " + hw);
			System.out.println("출석 점수       (20) : " + at);
			
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		}else { // 1_2. 그게 아닐 경우 (총점이 70점이 안되거나, 전체강의 출석률이 저조하거나, 둘다 안되거나)
			
			if(at < 20 * 0.7) { // 2. 출석 횟수가 부족했을 경우
				System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
			}
			
			if(sum < 70) { // 3. 총점이 미달되었을 경우
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");

		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch (menu) { 
		case 1:	practice1(); break;
		case 2:	practice2(); break;
		case 3:	practice3(); break;
		case 4:	practice4(); break;
		case 5:	practice5(); break;
		case 6:	practice6(); break;
		case 7:	practice7(); break;
		case 8:	practice8(); break;
		case 9:	practice9(); break;
		default:System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
