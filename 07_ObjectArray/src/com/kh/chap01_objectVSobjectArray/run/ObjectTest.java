package com.kh.chap01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01_objectVSobjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		
		
		//Book bk1 = new Book();
		
		//Book bk1 = new Book("�ڹ�������", "������", 10000, "KH");      
		
		Scanner sc = new Scanner(System.in);
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 1. ��ü ���� ���� �Է¹޴� ���
		for(int i=0; i<3; i++) { // 0���� 2���� 1�� �����ϴµ��� �ݺ� (3��)
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			// �� ��ü�� �����ϰ��� �Ҷ� ������ ���� ���ǹ��� ����ؾߵǴ� ���ŷο�����!!
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);				
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);				
			}else {
				bk3 = new Book(title, author, price, publisher);				
			}		
			
		}
		
		// 2. ��ü ���� ���� ��ȸ�ϱ� ���
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		// �ݺ��� Ȱ�� ����!! ���ŷο�..
		
		// 3. ���� ���� �˻��ϱ� ���
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine(); // �˻��� 
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
			
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
			
		}else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
			
		}else {
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
		
		
		
		
		
	}
	
}





