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
		// books�� �ڷ��� : Book[]
		// => ���۷���(����)����
		// => �ּҰ��� ������ ����
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		// books[index]�� �ڷ��� : Book
		// => ���۷���(����)����
		// => �ּҰ��� ������ ����
		
		System.out.println(books);
		System.out.println(books[0]);
		System.out.println(books[0].getPrice());
		*/
		
		Book[] books = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 1. ��ü ���� ������ �Է��ϴ� ���
		for(int i=0; i<books.length; i++) {
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher); 
			
		}
		
		// 2. ��ü ���� ���� ��ȸ�ϱ� ���
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 3. ���� ���� �˻��ϱ� ���
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		int count = 0; // �˻��� ���� ���� ����� ����
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++;
			}
		}
		
		if(count == 0) { // �˻��� ������ ���� ���
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
		
		
		
	}

}








