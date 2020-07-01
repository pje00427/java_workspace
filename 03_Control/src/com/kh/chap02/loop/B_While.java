package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * for문 * 
	 * 
	 * for(초기식;조건식;증감식){
	 * 		반복적으로 실행할 코드;
	 * }	 
	 * 
	 * * while문 *
	 * 
	 * 초기식;
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }
	 * 
	 */
	
	public void method1() {
		// "안녕하세요" 5번 출력
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println("i : " + i);
		
		// 1 2 3 4 5
		i = 1;
		while(i <= 5) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		i = 5;
		while(i >= 1) {
			System.out.print(i-- + " ");
			//i--;
		}
	}
	
	public void method2() {
		
		// 1에서 10 사이의 홀수만 출력
		// 1 3 5 7 9
		
		int i = 1;
		
		while(i <= 10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		// 두번째 방법
		i = 1;
		
		while(i <= 10) {
			
			System.out.print(i + " ");
			
			i+=2;
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10)까지 출력 및 총 합계
		
		int random = (int)(Math.random() * 10 + 1);
		
		// sum += 1;
		// sum += 2;
		// ...
		// sum += random;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		
		//System.out.println();
		System.out.println("\n1부터 " + random + "까지의 총 합계 : " + sum);
		
	}
	
	public void method4() {
		// 사용자가 입력한 단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 잘 입력했을 경우 --> 단 출력
			
			int i = 1;
			while(i <= 9) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				i++;
			}
			
		}else { // 잘못 입력했을 경우 --> "잘못입력했습니다." 출력
			System.out.println("잘못입력했습니다.");
		}
		
	}
	
	public void method5() {
		// 사용자에게 문자열 입력받은 후 각 인덱스별 문자 뽑아 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		
		while(i < str.length()) {
			
			System.out.println(str.charAt(i));
			
			i++;
		}
		
	}
	

}







