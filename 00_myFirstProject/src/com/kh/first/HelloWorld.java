package com.kh.first;

// 한줄 주석 : 소스코드와 무관한 즉, 코드로 인식안됨 --> 주로 코드에 대한 설명을 작성함

/*
 * 여러줄
 * 주석
 */

public class HelloWorld {
	
	// 프로그램 구동시 제일 먼저 실행되는 메소드 == 메인(실행) 메소드
	public static void main(String[] args) {
		
		// 출력과 관련된 제공되는 메소드 (println, print, printf)
		
		// System.out.println(출력하고자하는값); 
		// --> 해당 출력문 출력 후 "한 줄 띄어주는" 역할
		System.out.println("Hi EveryOne!!");
		
		// System.out.print(출력하고자하는값);
		// --> 해당 출력문 출력만 하고 끝 (한 줄 띄어쓰기 X)
		System.out.print("안녕\n하세요");
		System.out.print("여러분");
		
	}
	
}







