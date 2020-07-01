package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	/**
	 *  문제1. 사용자에게 한 개의 정수를 입력받고
	 *        1부터 입력받은 수까지 홀수인지 짝수인지 판별 후 
	 *        홀수면 "박", 짝수면 "수" 출력하게끔
	 *        (단, 입력받은 수가 양수가 아니면 "양수가 아닙니다" 출력)
	 *        
	 *  예시 ) 4 입력시  -->  "박수박수" 출력
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
			
			for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
				
				if(i % 2 == 1) {	// 홀수일 경우
					System.out.print("박");
					
				} else {			// 짝수일 경우
					System.out.print("수");
					
				}
			}
			
		} else {	// 입력 받은 수가 양수가 아닐 경우 (잘 못 입력하였을 경우)
			
			System.out.println("양수가 아닙니다.");
		}
	}
	
	
	/**
	 *  문제2. 위의 1번 문제에서 만약 양수가 아닐경우 다시 입력받을 수 있게끔
	 *        잘 입력했다면 그 해당 출력문만 실행하고 반복은 종료되게끔
	 */
	public void method2() {
		// 위의 method1에서 양수가 아닐 경우 다시 입력받도록 반복 수행
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) { // 우선 무한 반복으로 수행하고
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
				
				for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
					
					if(i % 2 == 1) {	// 홀수일 경우
						System.out.print("박");
						
					} else {			// 짝수일 경우
						System.out.print("수");
						
					}
				}
				
				// 양수일 경우 제대로 출력되고 무한반복문을 빠져나가자
				break;
				
			} else {	// 입력 받은 수가 양수가 아닐 경우 (잘못 입력하였을 경우)
				
				System.out.println("양수가 아닙니다.");
				
				// 양수가 아닐 경우 다시 반복문의 처음으로 돌아가 정수를 입력받게 될거다.
			}
			
		}
	}
	
	
	/**
	 *  문제 3. 사용자에게 문자열과 그 문자열에서 검색하고자 하는 문자를 입력받은 후 
	 *         그 문자열에서 검색하고자 하는 문자가 총 몇개 있는지 출력
	 *         
	 *  예시 ) "apple" 이라는 문자열과 'a'라는 문자를 입력받게 되면 총갯수로 3을 출력하도록
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// 검색된 문자의 갯수를 담을 변수
		
		for(int i=0; i<str.length(); i++) { // 0부터 문자열의 길이-1 만큼 1씩 증가하는 동안 반복
			
			if(ch == str.charAt(i)) { // 입력받은 문자와 문자열의 각 인덱스 값이 같을 경우
				count++; // 동일한 문자라고 판단하여 count 1 증가
			}
			
		}
		
		System.out.println("포함된 갯수 : " + count);
		
	}
	
	
	/**
	 *  문제 4. 아래와 같은 출력이 진행되게끔 하시오
	 *  
	 *  *
	 *  **
	 *  ***
	 *  ****
	 */
	public void method4() {
		
		for(int i=1; i<=4; i++) { // 4개의 행 반복
			for(int j=1; j<=i; j++) { // 1~i까지 1씩 증가하면서 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	

}
