package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * * if-else 문
	 * 
	 * if(조건식) {
	 * 		.. 실행코드 1 ..;
	 * } else {
	 * 		.. 실행코드 2 ..; 
	 * }
	 * 
	 * --> 조건식의 결과가 true일 경우 실행코드1 수행 후 if-else문 빠져나감
	 *   	    단, 결과가 false일 경우 무조건 실행코드2 수행됨	
	 * 
	 * 
	 * * if-else if문
	 * 
	 * if(조건식1) {
	 * 		.. 실행코드 1 ..;
	 * } else if(조건식2) {
	 * 		.. 실행코드 2 ..;
	 * } else if(조건식3) {
	 * 		.. 실행코드 3 ..;
	 * } [else {
	 * 		.. 위의 조건들이 다 false일 경우 반드시 실행할 코드 ..;
	 * }]
	 * 
	 * 조건식1의 결과가 true일 경우 실행코드1 수행 하고 빠져나감
	 * 단, 조건식1의 결과 false일 경우 조건식2 실행
	 *     조건식2의 결과가 true일 경우 실행코드2 수행 하고 빠져나감
	 *     단, 조건식2의 결과 false일 경우 그 뒤의 조건 ... 
	 *    
	 * 단, else문이 제시되어있을 경우 모든 조건들이 다 false일 경우는 최종적으로 else 구문 실행
	 * 
	 */
	
	public void method1() {
		// A_If 클래스의 method2() (짝수인지 홀수인지)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		
	}
	
	public void method2() {
		// A_If 클래스의 method1() (양수, 0, 음수)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
			
			
	}
	
	public void method3() {
		// A_If 클래스의 method3
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
		
		
		String student = "";
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}else if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", 
					      grade, classNum, num, name, student, score);
		
	}
	
	public void method4() {
		// A_If 클래스의 method4() (어린이, 청소년, 성인)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
			
		}else if(/*age > 13 && */ age <= 19) {
			System.out.println("청소년");
			
		}else {
			System.out.println("성인");
		}
		
	}
	
	
	public void method5() {
		// 새로운 예시
		// 사용자에게 점수를 입력받아
		// 90점이상 => A등급
		// 90점 미만 80점 이상 => B등급
		// 80점 미만 70점 이상 => C등급
		// 70점 미만 60점 이상 => D등급
		// 60점 미만 => F등급
		
		// "당신의 점수는 xx점이고, 등급은 x등급입니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "등급입니다.");
		
		
	}
	
	
	public void method6() {
		// 위의 문제에서 각 등급별 중간 점수 이상일 경우 등급에 "+"라는 문자를 추가해서 출력
		
		// 예) 95점이상 A+    /  85점이상 B+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				//grade = grade + "+"; // grade = "A" + "+" ;
				grade += "+";
			}
			
		}else if(score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade += "+";
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}else if(score >= 60) {
			grade = "D";
			
			if(score >= 65) {
				grade += "+";
			}
			
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "등급입니다.");
		
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		if(name.equals("강보람")) {
			System.out.println("본인입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		
	}
	
	
	

}




