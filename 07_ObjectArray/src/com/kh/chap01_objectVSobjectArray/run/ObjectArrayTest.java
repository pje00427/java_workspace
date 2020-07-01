package com.kh.chap01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01_objectVSobjectArray.model.vo.Book;

public class ObjectArrayTest {
	
	public static void main(String[] args) {
		/*
		int[] arr = new int[3];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		*/
		
		/*
		Book[] books = new Book[3];
		// books의 자료형 : Book[]
		// => 레퍼런스(참조)변수
		// => 주소값을 가지는 변수
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		// books[index]의 자료형 : Book
		// => 레퍼런스(참조)변수
		// => 주소값을 가지고 있음
		
		System.out.println(books);
		System.out.println(books[0]);
		System.out.println(books[0].getPrice());
		*/
		
		Book[] books = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 전체 도서 정보를 입력하는 기능
		for(int i=0; i<books.length; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher); 
			
		}
		
		// 2. 전체 도서 정보 조회하기 기능
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 3. 도서 제목 검색하기 기능
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		int count = 0; // 검색된 도서 수를 담아줄 변수
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++;
			}
		}
		
		if(count == 0) { // 검색된 도서가 없을 경우
			System.out.println("검색되는 도서가 없습니다.");
		}
		
		
		
	}

}








