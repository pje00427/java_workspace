package com.kh.chap01_objectVSobjectArray.model.vo;

// model : 데이터 관련
// vo(Value Object) : 데이터(정보)를 보관할 클래스
public class Book {
	
	// 필드부 (필드 == 멤버변수 == 속성)
	// 표현식 - 접근제한자 [예약어] 자료형 변수명 [= 값];
	private String title; 		// 도서명
	private String author;  	// 저자명
	private int price;			// 가격
	private String publisher;   // 출판사
	
		
	// 생성자부 
	// 표현식 
	// 접근제한자 클래스명() { }					 - 기본생성자 : 단지 생성만이 목적
	// 접근제한자 클래스명(매개변수, 매개변수, ...) { } - 매개변수 생성자 : 생성뿐만아니라 전달값들을 필드에 초기화까지
	
	// 기본생성자 : 단지 생성만 (즉, 해당 필드들 공간 확보만이 목적)
	public Book() {
		
	}
	
	// 매개변수생성자 : 생성과 동시에 전달값들로 해당 필드 초기화할 수 있는 생성자
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	// 메소드부 (기능 == 메소드 == 함수)
	// 표현식 - 접근제한자 [예약어] 반환형 메소드명([매개변수, 매개변수, ...]) { }
	
	// setter 메소드 : 전달값 받은 후 해당 필드에 초기화할 목적
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// getter 메소드 : 해당 필드에 담긴값 반환할 목적
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	// information 메소드 : 모든 필드에 담긴값들을 하나의 문자열로 합쳐서 반환할 목적
	public String information() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + ", 출판사 : " + publisher;
	}
	

}




