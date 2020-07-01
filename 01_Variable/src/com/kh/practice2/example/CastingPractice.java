package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 첫번째 방법 : 사용자에게 입력받아 기록된 문자값을 int형 변수에 옮겨 담은 후 출력하기
		/*
		int num = ch; // ch에 담긴 문자가 int형 변수에 담기는 순간 그 문자의 고유한 유니코드값(숫자)이 담김
		System.out.println(ch + " unicode : " + num);
		*/
		
		// 두번째 방법 : 사용자에게 입력받아 기록된 문자값을 강제로 int형으로 강제형변환해서 바로 출력하기
		System.out.println(ch + " unicode : " + (int)ch);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		// 첫번째 방법 : 사용자가 입력한 국어, 영어, 수학 값을 가지고 총점, 평균을 구해 각 변수에 담은 후 출력하기
		/*
		int sum = (int)(kor + eng + math); // kor+eng+math 연산한 결과 자료형은 최종적으로 double형임 int형에 담을 수 없기 때문에 강제형변환해야됨
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		*/
		
		// 두번째 방법 : 사용자가 입력한 국어, 영어, 수학 값을 가지고 총점, 평균을 구한 값을 바로 출력하기
		System.out.println("총점 : " + (int)(kor + eng + math));
		//System.out.println("평균 : " + (int)((kor + eng + math) / 3)); // 경우1. 다 더하고 난 후 나눗셈까지 한 결과를 가지고 int로 강제형변환
		System.out.println("평균 : " + (int)(kor + eng + math) / 3); // 경우2. 다 더한값을 가지고 int로 강제형변환한 후 3으로 나누기 
		
		
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); 		// 10 / 4  		=> 2 (결과값도 int형 정수)
		System.out.println((int)dNum); 			// (int)2.5  	=> 2 (소수점 아래 버려버림)	
		
		System.out.println((double)iNum1); 		// (double)10  	=> 10.0 
		System.out.println(iNum2 * dNum); 		// 4.0 * 2.5  	=> 10.0 (iNum2가 double로 자동형변환 한 후 연산, 결과값도 double형)

		System.out.println(dNum); 				// 2.5
		System.out.println((double)iNum1/iNum2);// (double)10 / 4 => 10.0 / 4.0 => 2.5 (둘 중에 하나만 double형으로 강제형변환 하면 나머지는 자동형변환으로 double로 되고 연산, 결과값도 double형)
		
		System.out.println((int)fNum); 			// (int)3.0		=> 3 (소수점 아래 버려버림)
		System.out.println(iNum1/(int)fNum); 	// 10 / (int)3.0 => 10 / 3 => 3
		
		System.out.println(iNum1/fNum); 		// 10.0 / 3.0   => 3.3333333
		System.out.println(iNum1/(double)fNum); // 10 / (double)3.0 => 10.0 / 3.0 => 3.33333333333333335
		
		System.out.println(ch); 				// 'A'
		System.out.println((int)ch); 			// (int)'A'		=> 65
		System.out.println(ch + iNum1); 		// 'A' + 10 	=> 65 + 10	=> 75
		System.out.println((char)(ch + iNum1)); // (char)('A' + 10) => (char)75	=> 'K'
	}

}
