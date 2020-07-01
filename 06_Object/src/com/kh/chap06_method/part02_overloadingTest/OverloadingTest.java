package com.kh.chap06_method.part02_overloadingTest;

public class OverloadingTest {
	
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	
	// x.test();
	public void test() {
		
	}
	
	/*
	public void test() {
		
	}
	*/
	
	// x.test(10);
	public void test(int a) {
		
	}
	
	// x.test(10, "강보람");	
	public void test(int a, String s) {
		
	}

	// x.test("강보람", 10);
	public void test(String s, int a) {
		
	}
	
	// x.test(10, 20);
	public void test(int a, int b) {
		
	}
	
	// x.test(20, 10);
	/*
	public void test(int c, int d) {
		
	}
	*/
	// 빨간줄(오버로딩 불가) --> 매개변수명이 달라도 매개변수명과는 상관없이 자료형의 갯수와 순서가 달라야된다!!
	/*
	public void test(String s1, int a1) {
		
	}
	*/
	
	// x.test(10, 20, "강보람");
	public void test(int a, int b, String str) {
		
	}
	
	// x.test(20, 10, "강보람");
	/*
	public int test(int a, int b, String str) {
		return 0;
	}
	*/
	// 빨간줄(오버로딩 불가) --> 반환형이 아무리 다르다고 해도 매개변수가 동일하면 오버로딩되지 않음!
	
	/*
	private void test(int a, int b, String str) {
		
	}
	*/
	// 빨간줄(오버로딩 불가) --> 접근제한자가 아무리 다르다고 해도 매개변수가 동일하면 오버로딩되지 않음!
	
	/*
	 * 
	 * * 결론
	 * 오버로딩 : 한 클래스내에 동일한 메소드명으로 정의하는 것
	 *         단, 접근제한자든 반환형이든 다필요없이 "매개변수의 자료형과 순서, 갯수가 달라야만 한다." 
	 * 
	 */
	
}










