package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * * do-while문
	 * 
	 * 초기식;
	 * 
	 * do {
	 * 		반복적으로 실행할 코드;
	 * 
	 * 		증감식;
	 * 
	 * }while(조건식);
	 * 
	 * 초기식 --> 무조건 한번은 실행 --> 증감식 -->
	 * 조건식 --> true면 실행	--> 증감식 -->
	 * 조건식 --> false일 경우 반복문 빠져나감
	 * 
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("안녕하세요");
		}while(num == 0);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			
			System.out.print(i++ + " ");
			
		}while(i <= 5);
		
		/*
		 * i=1    무조건 1출력    i++
		 * i=2 true  2출력    i++
		 * i=3 true  3출력    i++
		 * i=4 true  4출력    i++
		 * i=5 true  5출력    i++
		 * i=6 false 반복문 빠져나감 
		 */
		
	}
	
	public void method3() {
		// 1에서부터 랜덤값(1~100)까지의 총 합계
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		do {
			
			//sum += i;
			//i++;
			sum += i++;
			
		}while(i <= random);
		
		System.out.println("1부터 " + random + "까지의 총 합계 : " + sum);
		
		
	}
	

}







