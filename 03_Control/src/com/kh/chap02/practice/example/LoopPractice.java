package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	/**
	 * 실습문제1. 사용자에게 1이상의 숫자를 입력받은 후 1에서부터 사용자가 입력한 수까지 1씩 증가하는 값 출력하시오
	 * 			(단, 1이상의 숫자를 입력하지 않았을 경우 "1 이상의 숫자를 입력해주세요."라는 구문이 출력되게)
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 사용자가 입력한 수가 1이상일 경우	-> 반복문을 통해 1~사용자가입력한수 까지 반복적으로 출력
			
			for (int i=1; i<=user; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. 그게 아닐 경우 (사용자가 입력한 수가 1미만일 경우) -> "1 이상의 숫자를 입력해주세요." 출력
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	/**
	 * 실습문제2. 위의 문제1에서 잘못 입력했을 경우 다시 입력받을 수 있도록
	 * 		   (정상적으로 입력했을 경우 그에 해당하는 구문 출력 후 반복종료)
	 */
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		while (true) { // 지속적으로 입력받고 출력이 가능하게끔 무한반복문
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) {// 1_1. 사용자가 입력한 수가 1이상일 경우	-> 반복문을 통해 1~사용자가입력한수 까지 반복적으로 출력 후 반복문 빠져나가기
				
				for (int i=1; i<=user; i++) {
					System.out.print(i + " ");
				}
				
				break; // 반복문 빠져나가기 위한 구문 
				
			} else {// 1_2. 그게 아닐 경우 (사용자가 입력한 수가 1미만일 경우) -> "1 이상의 숫자를 입력해주세요." 출력 
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}

	/**
	 * 실습문제3. 사용자에게 1이상의 숫자를 입력받은 후 사용자가 입력한 수에서 1까지 1씩 감소하는 값 출력하시오
	 *          (단, 1이상의 숫자를 입력하지 않았을 경우 "1 이상의 숫자를 입력해주세요."라는 구문이 출력되게)
	 */
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 사용자가 입력한 수가 1이상일 경우	-> 반복문을 통해 사용자가입력한수~1 까지 반복적으로 출력 
			
			for (int i=user; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. 그게 아닐 경우 (사용자가 입력한 수가 1미만일 경우) -> "1 이상의 숫자를 입력해주세요." 출력 
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	/**
	 * 실습문제4. 위의 문제3에서 잘못 입력했을 경우 다시 입력받을 수 있도록
	 * 		   (정상적으로 입력했을 경우 그에 해당하는 구문 출력 후 반복종료)
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) { // 지속적으로 입력받고 출력이 가능하게끔 무한반복문
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) {// 1_1. 사용자가 입력한 수가 1이상일 경우	-> 반복문을 통해 사용자가입력한수~1 까지 반복적으로 출력 후 반복문 빠져나가기
				
				for (int i=user; i>=1; i--) {
					System.out.print(i + " ");
				}
				
				break; // 반복문 빠져나가기 위한 구문 
				
			} else { // 1_2. 그게 아닐 경우 (사용자가 입력한 수가 1미만일 경우) -> "1 이상의 숫자를 입력해주세요." 출력 
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}
	
	/**
	 * 실습문제5. 사용자에게 정수한개를 입력받고 1에서부터 그 입력받은 값 까지의 합계를 구하시오
	 * 		   (단, 문제에서 요구한대로 출력되게 하시오)
	 * 
	 * 예시 ) 8 입력시  =>  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		// for문 방법
		for(int i=1; i<=num; i++) {
			
			sum += i;
			
			if(i < num) { // i에 담긴 값이 num값 미만일 때 까지는 + 붙여서 출력 
				System.out.print(i + " + ");
				
			}else {	// 단 i에 담긴 값이 num값과 일치해지는 순간 = 붙여서 마지막에 출력
				System.out.print(i + " = ");
			}
			
		}
		
		System.out.println(sum); // = 뒤에 마지막으로 총 합계 출력
	}
	
	/**
	 * 실습문제6. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 *		        단, 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요
	 */
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 두개의 정수 입력받기
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		// 2. 사용자가 입력한 두개의 정수가 모두 1이상인지 아닌지 판별
		if(num1 >= 1 && num2 >= 1) {
			// 2_1. 사용자가 입력한 두개의 정수 모두 1이상인 경우 (정상입력)
			//		- 사용자가 입력한 두개의 정수로 최소값 / 최대값 판별하기
			
			/*
			int min = 0; // 두 수 중에서 작은 수 기록할 공간
			int max = 0; // 두 수 중에서 큰 수 기록할 공간
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else { // num2가 num1보다 큰 경우, num1이랑 num2가 같을 경우
				max = num2;
				min = num1;
			}
			*/
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			//		- 최소값(min)에서부터 최대값(max)까지 1씩 증가하는 값 출력 (반복문)
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
			
			
		}else {
			// 2_2. 그게 아닐 경우 (둘 중에 하나라도 1이상의 수를 입력하지 않았을 경우) (잘못입력)
			//		- "1이상의 숫자만을 입력해주세요" 출력
			System.out.println("1이상의 숫자만을 입력해주세요");
		}
		
	}
	
	/**
	 * 실습문제7. 위의 문제6에서 잘못 입력했을 경우 다시 입력받을 수 있도록
	 * 		   (정상적으로 입력했을 경우 그에 해당하는 구문 출력 후 반복종료)
	 */
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) {// 1_1. 두개의 정수값 모두 1 이상일 경우 (정상입력)
				
				// 최소값 최대값을 판별하기 위한 과정 
				int max = Math.max(num1, num2);
				int min = Math.min(num1, num2);
				
				// min값 에서부터 max값까지 1씩 증가시키면서 반복적으로 출력
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}	
				
				// 정상적으로 실행됐으면 반복문 빠져나가기!
				break;
				
			} else {// 1_2. 그게 아닐 경우 (잘못입력)
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}
	
	
	/**
	 * 실습문제8. 사용자에게 입력받은 숫자 단 출력하기
	 */
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i=1; i<10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}
	
	/**
	 * 실습문제9. 사용자가 입력한 숫자 단 부터 9단까지 출력하기
	 * 			(단, 2~9사이의 숫자가 아닌 경우 "2~9사이의 숫자만 입력해주세요." 출력)
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { // 1_1. 사용자가 입력한 숫자가 2 이상 9이하인 경우 (정상입력)
			
			for(int dan=num; dan<=9; dan++) {					// 단을 지정하는 for문 (num에서부터 9까지 1씩 증가)	
				
				System.out.printf("===== %d단 =====\n", dan);
				
				for(int su=1; su<=9; su++) {					// 곱해지는 수를 지정하는 for문(1에서부터 9까지 1씩 증가)
					System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
				}
				
				System.out.println(); // 한개의 단 다끝난 후 개행
			}		
			
		} else { // 1_2. 그게 아닌경우 즉, 사용자가 입력한 숫자가 2 이상 9이하가 아닌경우 (잘못입력)
			System.out.println("2~9사이의 숫자만 입력해주세요.");
			
		}
	}
	
	/**
	 * 실습문제10. 위의 문제9에서 잘못 입력했을 경우 다시 입력받을 수 있도록
	 * 		     (정상적으로 입력했을 경우 그에 해당하는 구문 출력 후 반복종료)
	 */
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { // 1_1. 사용자가 입력한 숫자가 2 이상 9이하인 경우 (정상입력)
				
				for(int i = num; i <= 9; i++) {					// 단을 지정하는 for문 (num에서부터 9까지 1씩 증가)	
					
					System.out.printf("===== %d단 =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				// 곱해지는 수를 지정하는 for문(1에서부터 9까지 1씩 증가)
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
						
					}
					
					System.out.println(); // 한개의 단 다끝난 후 개행
				}
				
				// 정상적으로 다 실행 한 후 반복문 빠져나가기
				break;
				
			} else {// 1_2. 그게 아닌경우 즉, 사용자가 입력한 숫자가 2 이상 9이하가 아닌경우 (잘못입력)
				
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	/**
	 * 실습문제11. 사용자에게 시작 숫자와 공차를 입력받아  일정한 값으로 
	 * 			  숫자가 커지거나 작아지는 프로그램을 구현하세요.
	 *			 (단, 출력되는 숫자는 총 10개)
	 */
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		/*
		for(int i=1; i<=10; i++) { // 1에서 부터 10까지 1씩 증가하는 동안 반복 (10번 반복)
			System.out.print(start + " ");
			start += num;
		}
		*/
		
		int count = 0; // 반복횟수를 담기위한 변수
		for(int i=start; ; i+=num) {
			System.out.print(i + " ");
			count++;
			
			if(count == 10) {
				break;
			}
		}
		
	}
	
	
	/**
	 * 실습문제12. 정수 두 개와 연산자(문자열로 입력 받고) 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	 *			 (단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복)
	 *
	 *		 	  첫번째 경우 : exit가 들어오면 "프로그램을 종료합니다."를 출력하고 종료합니다.
	 *
	 *			  두번째 경우 : 연산자가 만약 나누기이면서 두 번째 정수가 0으로 들어오면 
	 *			 		   "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며,
	 *
	 *			  세번째 경우 : 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력
	 *
	 *			  위의 두번째, 세번째 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	 */
	public void practice12() {
		
		
		// 무한 반복문 안에서 진행해야될 순서
		
		// 1. 연산자 입력 받고
		
		// >> 해당 연산기호가 exit일 경우 (조건문) --> 프로그램 종료 구문 출력 후 반복문 종료

		// 2. 정수 두개를 입력받기
		
		// >> 연산기호가 / 면서 두번째 정수가 0일 경우 (조건문) --> 오류문구 출력 후 반복문 다시 시작
		
		// >> 연산기호에 따라(조건문) 해당 산술 연산 진행 (단, 없는 연산자 같은 경우 --> 오류문구 출력 후 반복문 다시 시작)
		
		// 3. 연산 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			// 1. 연산자 입력받기
			System.out.print("연산자(+, -, *, /, %, exit) : ");
			String op = sc.nextLine();
			
			// >> 해당 연산자가 "exit"일 경우 => "프로그램을 종료합니다." 출력 후 반복문 빠져나가기
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 2. 두개의 정수 입력받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // 버퍼에 남아있는 엔터 빼주는 과정
			
			
			// >> 연산기호가 / 이고 그리고 두번째 정수가 0일 경우 => "0으로 나눌 수 없습니다. 다시입력해주세요" 출력 후 반복문 다시 실행
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.\n");
				continue;
			}
			
			// 3. 연산 결과 출력
			int result = 0; // 산술연산한 결과 기록할 변수
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			// >> 연산기호가 잘못입력 됐을 경우  => "없는 연산자입니다. 다시입력해주세요." 출력 후 반복문 다시 실행
			default : System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			}
			
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
		}
		
		
		
		
	}
	
}






