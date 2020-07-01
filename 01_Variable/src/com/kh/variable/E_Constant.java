package com.kh.variable;

public class E_Constant {
	
	public void constant() {
		
		int age = 10;
		System.out.println("age : " + age);
		
		age = 11;
		System.out.println("변경 후 age : " + age);
		
		// 상수명 : 모두 대문자로 이름짓는게 권장사항
		final int AGE = 20;
		System.out.println("AGE : " + AGE);
		
		//AGE = 21; // 상수 : 한번 기록된 값 변경 불가
		
	}

}





