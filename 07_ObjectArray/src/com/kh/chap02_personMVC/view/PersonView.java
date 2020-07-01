package com.kh.chap02_personMVC.view;

import java.util.Scanner;

import com.kh.chap02_personMVC.controller.PersonController;
import com.kh.chap02_personMVC.model.vo.Person;

// View : 사용자(클라이언트)의 시각적인 부분(화면)을 담당 (출력, 입력)
//		    여기서 보여지는 화면(메뉴)을 통해서 요청이라는걸 하게됨
//		    요청을 한다는건 "Controller 클래스의 메소드를 호출"한다는 의미

public class PersonView {
	
	// 사용자에게 값을 입력받기 위한 Scanner 객체 전역변수로 생성해놓음
	private Scanner sc = new Scanner(System.in);
	// 사용자의 요청을 처리할 Controller 클래스 객체 전역변수로 생성해놓음
	private PersonController pc = new PersonController();
	
	
	
	// 프로그램 실행과 동시에 제일 먼저 보여지는 메인화면
	public void mainMenu() {
		
		// 메인메뉴 반복적으로 출력
		// 사용자가 종료하겠다는 의사를 밝힐 때 까지
		while(true) {
			
			System.out.println("\n==== 메인 메뉴 ====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();			
			
			switch(menu) {
			case 1: insertPerson(); break;
			case 2: printPerson(); break;
			case 3: searchPerson(); break;
			case 4: avgWealth(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력했습니다. 다시입력해주세요");
			}
			
		}
	}
	
	
	/**
	 * 메뉴1. 회원 정보를 입력받은 후 입력받은 정보들로 "회원 추가 요청"하는 화면
	 */
	public void insertPerson() {
		
		System.out.println("\n=== 회원 정보 입력 ===");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		
		// 입력한 정보들을 가지고 회원 추가 요청할꺼임!! 
		// Controller에 있는 메소드 호출하겠다.
		int result = pc.insertPerson(name, age, wealth);
		
		if(result == 1) { // 회원 추가 성공
			System.out.println("회원 추가 성공했습니다!!");
		}else { // 회원 추가 실패
			System.out.println("회원 추가 실패했습니다ㅠㅠ");
		}
		
	}
	
	
	/**
	 * 메뉴2. 현재 추가되어있는 회원 전체 조회 요청하는 화면
	 */
	public void printPerson() {
		
		System.out.println("\n=== 회원 정보 조회 ===");
		
		// 현재 회원 수 몇명인지 조회 요청!!
		// Controller의 메소드 호출하겠다!!
		int count = pc.selectCount();
		
		if(count == 0) { // 현재 추가된 회원 없음
			
			System.out.println("현재 추가된 회원이 없습니다.");
			
		}else { // 추가된 회원이 한명이라도 있다란 소리
			
			// 회원 전체 조회 요청!!
			// Controller 메소드 호출!!
			Person[] people = pc.selectPeople();
			
			for(int i=0; i<count; i++) { // 현재 추가된 회원 수만큼 반복 해야됨
				System.out.println(people[i].information());
			}
			
		}
		
	}
	
	
	/**
	 * 메뉴3. 회원 이름으로 검색 요청을 하는 화면
	 */
	public void searchPerson() {
		
		System.out.println("\n=== 회원 정보 검색 ===");
		
		System.out.print("검색할 이름 : ");
		String search = sc.nextLine();
		
		// 검색 요청할꺼임!! 
		// Controller 메소드 호출
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) { // 검색된 회원이 없을 경우
			
			System.out.println("검색된 회원이 없습니다.");
			
		}else { // 검색된 회원이 있을 경우
			
			System.out.println(searchPerson.information());
			
		}
		
	}
	
	
	/**
	 * 메뉴4. 현재 추가된 회원들의 평균 재산 조회요청하는 메소드
	 */
	public void avgWealth() {
		
		System.out.println("\n== 회원 평균 재산 조회 ==");
		
		// 현재 회원 수 몇명인지 조회요청
		int count = pc.selectCount();
		
		if(count == 0) { // 현재 추가된 회원 없음
			
			System.out.println("현재 추가된 회원이 없습니다.");
			
		}else { // 추가된 회원 있음!
			
			// 전체 회원 평균 재산 조회요청!!
			// Controller 메소드 호출
			
			//int avgWealth = pc.selectAvgWealth();
			//System.out.println("평균 재산 : " + avgWealth);
			
			System.out.println("평균 재산 : " + pc.selectAvgWealth());
			
		}
		
	}

}















