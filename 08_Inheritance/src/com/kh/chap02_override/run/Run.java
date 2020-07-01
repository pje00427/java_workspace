package com.kh.chap02_override.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;
import com.kh.chap01_inherit.model.vo.Vehicle;
import com.kh.chap02_override.model.vo.Book;

//import java.lang.*;

public class Run {
	
	// 모든 클래스는 Object의 후손이다. 즉, 최상위클래스는 항상 Object
	// 그말인 즉슨 Object에 있는 메소드들 다 갖다 쓸 수 있다!
	// 또다른 말로는 Object에 있는 메소드들 재정의 가능! (오버라이딩 가능!)
	
	public static void main(String[] args) {
		
		/*
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr.hashCode());
		*/
		
		Book bk1 = new Book("수학의 정석", "나수학", 10000);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 20000);
		
		//System.out.println(bk1.information());
		//System.out.println(bk2.information());
		
		
		// 1. toString() ---------------------------------------------
		// 오버라이딩 전 : Object클래스의 toString() 실행 		--> "풀패키지명 + @ + 객체의 해쉬코드 16진수 값" 리턴
		// 오버라이딩 후 : Book클래스의 toString() 실행		--> "해당 객체가 가지고있는 필드값들을 하나의 문자열" 리턴
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		// 출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 호출해준다.
		// 즉, 레퍼런스.toString()를 명시적으로 제시할 필요 없음!!
		
		System.out.println(bk1);
		System.out.println(bk2);
		
		System.out.println("======================================");
		
		// ------------------- equals()랑 hashCode()를 가지고 작업!! -----------------
		
		// 2. equals() ----------------------------------------------------------
		// 오버라이딩 전 : Object 클래스의 equals() 메소드 실행 		--> 현객체와 전달한 객체의 두 "주소값만을 가지고 비교"
		// 오버라이딩 후 : Book 클래스의 equals() 메소드 실행		--> 두 객체의 주소값 비교가 아닌 "실제 필드 값들이 모두 일치하면 true 반환"
		
		Book bk3 = new Book("수학의 정석", "나수학", 10000); // bk1과 동일한 필드값을 가진 bk3객체 생성
		
		System.out.println("bk1과 bk3가 같은 책입니까? : " + (bk1 == bk3)); // false
		System.out.println("bk1과 bk3가 같은 책입니까? : " + bk1.equals(bk3)); // false --> 오버라이딩 후 true
		
		// 동일객체 : 실제 필드값들도 같고 (equals()) 해쉬코드값도 같은 경우 
		
		// 3. hashCode() ---------------------------------------------------------
		// 오버라이딩 전 : Object 클래스의 hashCode() 메소드 실행		--> 해당 객체의 실제 주소값을 10진수로 계산한 결과값
		// 오버라이딩 후 : Book 클래스의 hashCode() 메소드 실행			--> 실제 주소값을 가지고 계산을 하는게 아닌 필드값들을 가지고 해쉬코드를 계산한 결과
		System.out.println("bk1의 해쉬코드 : " + bk1.hashCode());
		System.out.println("bk2의 해쉬코드 : " + bk2.hashCode());
		System.out.println("bk3의 해쉬코드 : " + bk3.hashCode());
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); // String 클래스에 이미 오버라이딩 되어있는 메소드 호출
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.toString());
		
		Object bk4 = new Book();
		Object a = new Airplane();
		Vehicle v = new Car();
		Vehicle v2 = new Ship();
		
		Car c = new Car();
		
		
	}

}







