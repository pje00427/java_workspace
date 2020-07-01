package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/*
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게끔!!
	 * 	
	 * 		캡슐화 : 클래스의 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로 하여 "외부로부터 직접 접근을 막을꺼임!!"
	 * 				대신에 데이터를 간접적으로라도 처리(값을 담거나, 조회한다거나)하는 메소드들을 클래스내부에 만들꺼임!!
	 * 
	 * 		1) 정보은닉 : private
	 * 		2) setter/getter 메소드
	 *    		private을 하는 순간 그 멤버변수에 더이상 접근을 할 수가 없다. 
	 *    		따라서 간접적으로라도 접근해서 값을 담거나(변경한다거나) 
	 *    		그 값을 가져올 수 있는 메소드가 바로 setter/getter 메소드이다. 
	 * 		
	 */

	public static void main(String[] args) {
		
		Student hong = new Student();
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		*/
		// name, age, height 필드 private로 되어있어 직접접근불가!
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(163.5);
		
		System.out.println(hong.getName() + "님은 "
						  + hong.getAge() + "살이고, 키는"
						  + hong.getHeight() + "cm입니다.");
		
		//hong.information();
		System.out.println(hong.information());
		
		
		
	}

}








