package com.kh.exception;

import java.util.Scanner;

public class A_UnCheckedException {
	
	/*
	 *  * RuntimeException
	 *  - 프로그램 실행 시 발생되는 예외들 (문법적으로 문제되지 않음! => 예외처리가 필수는 아님!)
	 *  - 사용자의 실수이거나 예측가능한 경우에 대해 제대로 처리 못한 개발자의 실수일수도!!
	 *  
	 *  * RuntimeException 후손 클래스
	 *  
	 *  - ArrayIndexOutOfBoundsException : 배열에 잘못된 인덱스 값을 제시했을 경우!
	 *  - ClassCastException : 허용할 수 없는 형변환이 진행되는 경우
	 *  - NegativeArraySizeException : 배열의 크기를 음수로 지정하는 경우 
	 *  - NullPointerException : 참조변수가 null 초기화된 상황에서 메소드를 호출하는 경우
	 *  - ArithmeticException : 나누기 연산에서 0으로 나눴을 경우
	 *  
	 *  => 위의 내용들은 예측가능한 상황들이 대부분! 
	 *     즉, 충분히 예측 가능한 상황에 있어서 아예 애초에 예외가 발생안되게끔 if문 조건으로 충분히 처리 가능!!
	 *  
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException
		
		// 사용자에게 두개의 정수값 입력받은 후 나눗셈 연산한 결과 출력하기!
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 예측 가능한 상황이므로 애초에 예외가 발생 안되게 if문으로 조건검사하자!  => 예외처리 X
		/*
		int result = 0;
		
		if(num2 != 0) {
			result = num1 / num2;			
		}
		
		System.out.println("결과 : " + result);
		*/
		
		
		// 예외처리 : 예외가 발생했을 때 처리하는 구문을 작성해놓는것!
		/*
		 * 1. try{} catch() {} 방법
		 * 
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 * 
		 * }catch(발생될예외클래스 변수명) {
		 * 		해당 예외가 발생되는 경우 처리할 구문;
		 * 
		 * }
		 * 
		 */
		
		int result = 0;
		try {
			result = num1 / num2;
			
			System.out.println("안녕하세요"); // 위쪽에서 예외가 발생했을 경우 실행되지 않음!!
			
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			
		}
		
		System.out.println("결과 : " + result);
		
		
	}
	
	
	public void method2() {
		
		// NegativeArraySizeException
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		/*
		if(size > 0) {
			int[] arr = new int[size];
			System.out.println(arr[0]);
			
		}else {
			System.out.println("양수를 입력해주세요");
		}	
		*/
			
		
		/*
		try {
			
			int[] arr = new int[size];	// NegativeArraySizeException
			System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
			
		// 다중 캐치 가능함!!
		}catch(NegativeArraySizeException e) {
			System.out.println("양수를 입력해주세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스를 제시했습니다.");
		}
		*/
		
		try {
			
			int[] arr = new int[size];	// NegativeArraySizeException
			System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
			
		}catch(RuntimeException e) { // 부모타입의 예외클래스 제시시 다 받아준다! (다형성적용)
			System.out.println("예외가 발생했어요!");
		}/*catch(NegativeArraySizeException e) {
			// 여러개 catch구문 작성하고자 한다면
			// 자손클래스 다음에 부모클래스 기입해야됨!!
		}*/
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	/*
	 *  * 런타임 에러 (RuntimeException)
	 *  - 프로그램 실행시 문제가 발생됨!
	 *  - 충분히 예측가능한 상황에 있어서는 애초에 예외가 발생안되게끔 if문으로 핸들링해주는게 권장사항! (예외처리)
	 *  - 예외처리방법으로도 처리가능하긴 하다! 
	 *    => 개발자 케바케 , 예외처리가 필수는 아님!! => UnCheckedException
	 */

}










