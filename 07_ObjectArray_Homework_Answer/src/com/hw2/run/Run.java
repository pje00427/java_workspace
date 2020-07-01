package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Student[] sArr = new Student[10];
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			sArr[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			/*
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				break;
			}
			*/
			char ch = sc.nextLine().toUpperCase().charAt(0); // 아예 사용자가 입력한 문자열을 "대문자"로 변환한 뒤 0번인덱스 추출하기
			
			if(ch == 'N') {
				break;
			}
		}
		
		// 방법1. 현재 추가된 학생 객체만 출력되게끔 count 수만큼 반복
		/*
		for(int i=0; i<count; i++) {
			System.out.println(sArr[i].information());
		}
		*/
		
		// 아래와 같이 배열의 마지막인덱스 까지 순차적으로 접근하면서 출력시
		// NullPointerException 발생할 수 있음!!
		// 왜? 만일 3명의 학생만 추가되었을 경우
		// sArr[0], sArr[1], sArr[2]까지만 담겨있고 sArr[3] ~ sArr[마지막]은 null인 상태일 것
		// null.xxx() 메소드 호출 시 NullPointerException 발생!!
		/*
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].information());
		}
		*/
		
		// 방법2. 만약 정 위의 반복문을 쓰고 싶다면
		for(int i=0; i<sArr.length; i++) {
			// 바로 출력하기 전 해당 객체가 null이 아닐 경우만 출력하게끔 조건 검사 하면됨
			if(sArr[i] != null) {
				System.out.println(sArr[i].information());
			}
		}
	}
	
}
