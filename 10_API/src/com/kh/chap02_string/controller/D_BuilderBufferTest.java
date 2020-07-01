package com.kh.chap02_string.controller;

public class D_BuilderBufferTest {
	
	/*
	 * * String (불변 클래스 => 그자리에서 값이 변경되는게 아님)
	 * => 변경이 적고 읽기만 하는 경우 용이
	 * 
	 * * StringBuilder, StringBuffer (가변 클래스 => 그 자리에서 값이 변경)
	 * - 처음에 16개의 문자를 저장할 수 있는 버퍼가 생성 됨! 
	 * - 두 개 모두 생성자나 메소드들은 동일!
	 *   단, 유일한 차이점 : 동기화가 되냐 안되냐의 차이 => 속도 차이
	 *   
	 *   StringBuffer : 동기화 제공 O
	 *   StringBuilder : 동기화 제공 X
	 *   
	 * 	스레드 : 일의 단위
	 * 
	 *  멀티스레드(여러개의 일처리를 동시다발적으로 병행해서 수행) 환경 --> 동기화 처리가 된 걸로 실행을 해야 안전하다. --> StringBuffer
	 *  단일스레드 환경 --> 동기화 처리가 필요 없음! 동기화 작업을 하게 되면 속도 저하되는 문제 발생! --> StringBuilder 사용 권장
	 *   
	 */

	public void method1() {
		String str = "강보람";
		
		// 1. 기본생성자로 생성!! => 수용량 : 기본값 16으로 셋팅
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1의 수용량 : " + sb1.capacity());
		System.out.println("sb1의 문자열의 길이 : " + sb1.length());
		
		System.out.println("===========");
		
		// 2. 매개변수(정수값)생성자로 생성 => 수용량 : 내가전달한 정수만큼으로 셋팅
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2의 수용량 : " + sb2.capacity());
		System.out.println("sb2의 문자열의 길이 : " + sb2.length());
		
		System.out.println("===========");
		
		// 3. 매개변수(문자열)생성자로 생성 => 수용량 : 기본값 16 + 내가전달한 문자열의 길이
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("sb3의 수용량 : " + sb3.capacity()); // 기본값 16 + 5
		System.out.println("sb3의 문자열의 길이 : " + sb3.length());
		
	}
	
	public void method2() {
		// 불변인지 가변인지 테스트
		
		String str = "반가워!";
		System.out.println(System.identityHashCode(str));
		str += "난 String이얌!!";
		System.out.println(System.identityHashCode(str));
		// 값 변경 후 => 주소값 변경!! => 그자리에서 변경이 되는거 아님! => 불변클래스
		
		System.out.println("=========");
		
		StringBuilder sb = new StringBuilder("반가워!"); // 수용량 : 20, 길이 : 4
		
		System.out.println("sb : " + sb); // StringBuilder 클래스에 toString 메소드 오버라이딩 되어있음!!
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		// StringBuilder에서 값을 변경하고자 할 때는 메소드를 통해서 작업해야됨!
		
		// 1. append(String str) : StringBuilder
		//    --> 기존의 문자열에 내가 전달한 문자열 추가하기
		sb.append("안녕!");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		// 주소값 변동 없음!! => 그자리에서 값 변경!! => 가변 클래스
		
		// 2. delete(int start, int end) : StringBuilder
		//    start ~ end-1 까지 문자열 삭제시켜줌
		sb.delete(2, 5);
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		// 4. reverse() : StringBuilder
		sb.reverse();
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		
		StringBuilder sb2 = new StringBuilder("javaProgram");
		sb2.append("API").delete(4, 11).reverse();
		//"javaProgramAPI".delete(4, 11)
		//    		"javaAPI".reverse()
		//        		"IPAavaj"
		System.out.println(sb2);
		
		// 메소드 체이닝 (메소드 이어쓰기)
		
		
		
	}
	
	
	
	
}




