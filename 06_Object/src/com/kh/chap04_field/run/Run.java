package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		
		// ------- FieldTest1 --------
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.test(5);
		*/
		
		
		// ------- FieldTest2 --------
		/*
		FieldTest2 f2 = new FieldTest2();
		
		// public --> 어디서든 직접 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은패키지 내에서 접근가능, 단, 다른패키일 경우 상속구조에서만 가능
		//System.out.println(f2.pro);
		
		// default --> 오로지 같은패키지에서만 접근 가능, 다른 패키지에서는 절대 불가
		//System.out.println(f2.def);
		
		// private --> 오로지 그 클래스에서만 접근 가능
		//System.out.println(f2.pri);
		
		*/
		
		// -------- FieldTest3 --------
		// static 예약어가 붙은 순간 해당 클래스로 궂이 객체생성 안해도
		// 프로그램 구동과 동시에 static메모리영역에 변수가 할당
		
		// 해당 public static 변수에 접근하고자 한다면
		// 클래스명.변수명
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		
		FieldTest2.sta = "sss";
		
		//FieldTest4.NUM = 10;
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
		
		
	}

}









