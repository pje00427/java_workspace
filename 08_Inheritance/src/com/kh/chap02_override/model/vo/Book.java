package com.kh.chap02_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	// 기본생성자
	public Book() {
		
	}
	
	// 매개변수생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// setter/getter 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 모든 필드 하나의 문자열로 합쳐서 반환하는 메소드
	/*
	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/
	
	/*
	 * 
	 *  * 오버라이딩
	 *  - 자식클래스가 상속 받은 부모 클래스의 메소드를 재정의(재작성) 하는것
	 *  - 즉, 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 *    자식 객체를 통해 실행 시 자식메소드가 우선권을 가짐
	 *    
	 *  * 오버라이딩 성립 조건
	 *  - 부모클래스의 메소드와 메소드명 동일
	 *  - 매개변수 갯수, 자료형, 순서 동일
	 *  - 반환형 동일 (jdk 버전업 되면서 부모메소드 반환형의 자식 자료형은 가능)
	 *  - 부모메소드의 접근제한자보다 범위가 같거나 커야된다. 
	 *  
	 *  --> 규약의 개념이 들어가있음!! (재정의 하고싶으면 이정도의 규칙은 지켜줘!!)
	 * 
	 *  * @Override 어노테이션
	 *  - 명시를 안해줘도 크게 상관은 없음 (명시안해도 부모메소드랑 똑같이 작성하는 순간 오버라이딩 된 상태)
	 *  - 하지만 어노테이션을 붙이는 이유
	 *    --> 부모쪽의 메소드 수정(변경)된 경우 오류 발생 --> 찾아보기 쉽다
	 *    --> 자식쪽의 메소드를 잘못 기입했을 경우 오류 발생 --> 찾아보기 쉽다
	 *    --> 이 메소드가 오버라이딩 된 메소드라는걸 명시하고 싶어서
	 * 
	 */
	
	// toString 오버라이딩 : 실제 담겨있는 필드값들을 하나의 문자열로 합쳐서 반환해주는 메소드
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price; 
	}
	
	// equals 오버라이딩 : 주소값 비교가 아닌 실제 담겨있는 필드값들이 모두 일치할 경우 true가 반환될 수있게끔 재정의
	@Override
	public boolean equals(Object obj) {
		// bk1.equals(bk3);
		
		//   this (현 객체)  vs   obj (전달받은 비교할 대상 객체)
		//     Book					Object
		
		// 편의를 위해서 자료형좀 일치 시켜줄 꺼임
		Book other = (Book)obj; // 상속 구조간에는 클래스로 형변환 가능함!! Object --> Book
		
		//   this (현 객체)  vs   other (전달받은 비교할 대상 객체)
		//      Book				Book
		
		// this.title == other.title 그리고
		// this.author == other.author 그리고
		// this.price == other.price 
		
		if(this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// hashCode 오버라이딩 : 주소값이 아닌 필드값들을 가지고 동일한 hashCode가 반환될 수 있게 재정의
	@Override
	public int hashCode() {
		// 해당 객체의 필드값들을 하나의 문자열로 합쳐서 해당 문자열의 해쉬코드값을 리턴
		return (title + author + price).hashCode();
				// "수학의 정석나수학10000".hashCode();
	}

}




