package com.kh.chap03.branch;

public class B_Continue {
	
	// continue : 나와 가장 가까운 반복문으로 올라가라는 의미
	
	public void method1() {
		
		// 1부터10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		/*
		for(int i=1; i<=10; i++) { // 1에서부터 10까지 1씩 증가하는 동안 반복
			if(i % 2 == 1) { // i가 홀수일 경우만 
				System.out.print(i + " "); // 출력
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) { // 짝수일 경우
				continue; 	 // 뒤의 실행문은 건너뛰고 반복문 위로 올라가라!! (증감식)
			}
			
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1~ 100까지의 정수값의 총 합계
		// 단, 6의 배수값은 빼고 덧셈연산 
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) { // 6의 배수일 경우
				continue;
			}
			sum += i;
		}
		
		System.out.println("총 합계 : " + sum);
		
	}
	
	public void method3() {
		// 2 ~ 9단까지의 구구단 출력 중
		// 4의 배수단은 빼고 출력
		
		// 단 수 : 2~9까지 1씩 증가 				=> 바깥쪽 for문 
		// 곱해지는 수 : 매 단마다 1~9까지 1씩 증가	=> 안쪽 for문
		
		
		for(int dan=2; dan<=9; dan++) {
			
			if(dan % 4 == 0) {
				continue;
			}
			
			System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<=9; su++) {
				
				// 3의 배수 수는 건너띄고 곱하겠다.
				if(su % 3 == 0) {
					continue;
				}
				
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println("==========");
			
		}
		
		
	}
	
	

}






