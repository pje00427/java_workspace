package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {
	
	public static void main(String[] args) {
		
		// 1. 기본생성자로 생성한 후에 각 필드에 setter메소드를 통해 일일히 초기화
		User u1 = new User();
		// 단지 생성만 하고 출력해보면 JVM의 기본값들이 담겨있는거 확인 가능
		System.out.println(u1.information());
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		
		System.out.println(u1.information());
		
		System.out.println("==================================");
		
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02", "pass02", "강보람");
		// 생성과 동시에 userId, userPwd, userName에 초기화됨
		// 뭘로? 내가 전달한 값으로!
		System.out.println(u2.information());
		
		
		System.out.println("==================================");
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		User u3 = new User("user03", "pass03", "김말똥", 10, 'M');
		System.out.println(u3.information());
		
		u3.setAge(20);
		System.out.println(u3.information());
	}

}







