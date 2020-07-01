package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		// 필드에 값 초기화
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("강보람");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		
		System.out.println("이름 : " 
					+ p.getName());
		System.out.println("나이 : "
					+ p.getAge());
		
		System.out.println(p.information());
		
		
		Product pro1 = new Product();
		
		pro1.setpName("갤럭시");
		pro1.setPrice(900000);
		pro1.setBrand("삼성");
		
		/*
		System.out.println(pro1);
		
		int[] arr = new int[4];
		System.out.println(arr);
		*/
		
		Product pro2 = new Product();
		pro2.setpName("아이폰");
		pro2.setPrice(1300000);
		pro2.setBrand("애플");
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		// 1년이 흘렀습니다.. 가격이 기존가격보다 100000원 감소..
		//pro1.setPrice(800000);
		pro1.setPrice(pro1.getPrice() - 100000);
		pro2.setPrice(pro2.getPrice() - 100000);
		
		System.out.println("==== 1년 후.. ====");
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		// 클래스 앞에 public : 어디서든 다 쓸 수있음
		// 클래스 앞에 default : 같은 패키지안에 있는 클래스에서만 쓸 수 있음 (다른패키에서는 사용 불가)
		
	}

}







