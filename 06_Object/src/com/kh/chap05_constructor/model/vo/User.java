package com.kh.chap05_constructor.model.vo;

public class User {
	
	
	// 아이디, 비밀번호, 이름, 나이, 성별
	
	// 필드부
	private String userId;		// 회원아이디
	private String userPwd;		// 회원비밀번호
	private String userName;	// 회원이름
	private int age;			// 회원나이
	private char gender;		// 회원성별
	
	
	// 생성자부
	/*
	 * 	* 표현법
	 * 	public 클래스명([매개변수, 매개변수, ...]) {
	 * 
	 *  }
	 *  
	 *  * 생성자를 작성하는 목적
	 *  1. 객체를 생성해주기 위한 목적
	 *  2. 매개변수로 전달된 값들을 해당 필드에 바로 초기화하면서 생성할 목적
	 *  
	 *  * 생성자 작성시 주의할 점
	 *  1. 반환형 없어야됨 (메소드와 유사해서 헷갈릴 수 있음)
	 *  2. 반드시 생성자명은 클래스명과 일치해야됨 
	 *  3. 매개변수 생성자를 명시적으로 기술한 순간 JVM이 자동으로 기본생성자를 만들어주지않음!!
	 *  	즉, 기본생성자는 항상 작성하는 습관을 기르자!!
	 */
	public User() {
		// 기본생성자
		// 단지 객체 생성만을 목적으로 함
		// 기술하지 않으면 JVM이 기본적으로 만들어줌(단, 매개변수생성자 작성시 자동으로 안만들어줌)
	}
	
	/*
	public User(String userPwd, String userId, String userName) {
		
	}
	*/
	
	// 매개변수 3개짜리 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// age, gender 필드 만들어지긴 함!! 단, 기본값으로 초기화 되어있을 거임!!
	}
	
	// 매개변수 5개짜리 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId, userPwd, userName); // this() : 또다른 생성자 호출
		// 주의할점 : 제일 첫 줄에 기입해야됨!!
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
	// 메소드부
	// setter메소드 : 전달되는 값 받아서 해당 필드에 초기화(대입)시켜주는 메소드 (값 변경)
	// public void setXXX(각필드의자료형 필드명) { }
	public void setUserId(String userId) {
		this.userId = userId;
		// this == 해당 객체의 주소값
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// getter메소드 : 해당 필드에 담긴 값을 반환시켜주는 메소드 (값 조회)
	// public 각필드의자료형 메소드명() { }
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	
	// information메소드 : 해당 필드에 담긴값들을 하나의 문자열로 합쳐서 반환시켜주는 메소드
	public String information() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 이름 : " + userName 
					+ ", 나이 : " + age + ", 성별 : " + gender;
	}

	
	// 필드 + (기본생성자 + 모든필드초기화 할수있는 매개변수생성자) + (set/getter메소드 + information메소드)
}







