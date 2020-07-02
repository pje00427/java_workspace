package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.BookManager;
import model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
			
	public void mainMenu() {
		
		while(true) {
			System.out.println("== �������� ���α׷� ==");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ���� ��ü ���");
			System.out.println("0. ������");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: selectList(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
		
	}
	
	public void insertBook() {
		
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �帣 (1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���ڸ� : ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		
		bm.insertBook(book);
	}
	
	public void deleteBook() {
		
		selectList();
		
		System.out.print("������ȣ : ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("���������� ����");
		}else {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
		
	}
	
	public void searchBook() {
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	public void selectList() {
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("���� ����� �������� �ʽ��ϴ�.");
		}else {
			for(Book bk : bookList) {
				System.out.println(bk);
			}
		}
	}

}
