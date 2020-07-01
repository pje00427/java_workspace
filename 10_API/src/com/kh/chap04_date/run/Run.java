package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
	
	/*
	 * Date(java.util)
	 * - 자바 초창기 개발할 당시 급하게 만들다 보니 완성도가 높진 않음! 다국적으로 쓰기에도 적합 하지 않음
	 */
	
	public static void main(String[] args) {
		
		// 기본생성자를 통해 Date 객체 생성
		Date today = new Date();
		
		System.out.println("기본 생성자 (현재날짜) : " + today); // 시스템 날짜가 저장되는거임!!
		System.out.println();
		
		// 매개변수생성자를 통해 직접 날짜 셋팅하기!
		// 2020년 5월 21일
		System.out.println("----- 2020년 5월 21일로 셋팅하기 -----");
		//Date date1 = new Date(2020, 5, 21); // 내부적으로 내가 전달한 "년도 + 1900"을하고 내가 전달한 "월 + 1"을 진행함!!
		Date date1 = new Date(120, 4, 21, 6, 10, 30);
		
		System.out.println("1. 매개변수 생성자 : " + date1);
		
		// 기본생성자로 생성 후 setter메소드로 변경하는 방법
		Date date2 = new Date(); // 현재날짜 년월일시분초
		date2.setYear(2020-1900); // 120
		date2.setMonth(5-1); // 4
		date2.setDate(21);
		
		System.out.println("2. setter메소드로 변경 : " + date2);
		
		System.out.println();
		
		// getter메소드 있음
		System.out.println(date2.getYear() + 1900 + "년");
		System.out.println(date2.getMonth() + 1 + "월");
		System.out.println(date2.getDate() + "일");
		System.out.println(date2.getDay());
		System.out.println(date2.getHours() + "시");
		// getMinutes, getSeconds
		
		// 2020년 05월 21일 11시 11분 12초
		
		// 특정 포맷(형식)을 지정한 채로 출력되게끔!! --> SimpleDateFormat클래스
		
		// SimpleDateFormat 매개변수 생성자로 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// today --> String
		String todayStr = sdf.format(today);
		System.out.println(todayStr);
		
		
		
		
	}

}
