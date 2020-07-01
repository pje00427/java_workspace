package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "JAVA,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 이용하여 문자열들 분리
		
		// 방법1. 분리된 문자열들을 배열로 담아서 관리하고 싶을 때 (String --> String[])
		//		 String 클래스의 split 메소드
		//       문자열.split(String regex 구분자) : String[]
		String[] arr = str.split(",");
		
		System.out.println("분리 후 문자열의 갯수 : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// 방법2. 분리된 문자열들을 토큰 객체로 취급하고 싶을 때 
		//       java.util.StringTokenizer 클래스 이용 객체 생성
		//       StringTokenizer stn = new StringTokenizer("분리시키고자하는문자열", "구분자");
		//       분리된 문자열 == 토큰 
		//       토큰들이 stn이라는 공간에 다 담겨있다
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// stn.countTokens() : int
		// 토큰 수 파악하기 메소드
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens());
		
		// stn.nextToken() : String
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0  i<6  true  출력문("JAVA");  i++
		// i=1  i<5  true  출력문("Oracle"); i++
		// i=2  i<4  true  출력문("JDBC");  i++
		// i=3  i<3  false  반복문 빠져나옴!
		
		
		/* 해결방법1
		int count = stn.countTokens();  // count = 6
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2
		// stn.hasMoreTokens() : boolean
		// stn 공간에 token들이 남아있는지 유무 판단 (남아있으면 true, 그게 아니면 false)
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}

}








