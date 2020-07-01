package run;

import java.util.Scanner;

import controller.BookController;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BookController bc = new BookController();	// BookController�� �޼ҵ带 �����ϱ� ���� bc��� ���۷��� ����
		
		
		// 1. ���� ��ü ���
		System.out.println("-----------1. ������ ��ü ���� �߰�---------");
		bc.printAll();
		System.out.println();
		
		
		// 2_1. �߰��� ���� �Է� �ޱ� ---> �� String���� ��������
		System.out.println("-----------2. ���ο� ���� �߰�----------");
		System.out.print("�������� �Է��Ͻÿ� : ");
		String newTitle = sc.nextLine();
		
		System.out.print("���ڸ��� �Է��Ͻÿ� : ");
		String newAuthor = sc.nextLine();
		
		System.out.print("���ǻ���� �Է��Ͻÿ�  : ");
		String newPublisher = sc.nextLine();
		
		System.out.print("������ (2011-12-01 �� ���� '-'�����ڸ� �̿��Ͽ� �Է��Ͻÿ�) : ");
		String newDate = sc.nextLine();	// ��¥�� ���� ���ڿ��� �ޱ�
		
		System.out.print("������ �Է��Ͻÿ� : ");
		String newPrice = sc.nextLine();
		
		// 2_2. �Է¹��� ������ BookController�� insertBook() �޼ҵ�� ����
		bc.insertBook(newTitle, newAuthor, newPublisher, newDate, newPrice);
		
	
		
		// 3. 5��° ���� �Ⱓ�� ���
		System.out.println("---------3. 5��° ���� �Ⱓ�� ���---------");
		bc.printBookPublishDate();
		
		System.out.println();
		
		
		
		// 4_1. �˻��� ������ �Է� (Ű����)
		System.out.print("�˻��� �������� �Է��Ͻÿ� : ");
		String searchTitle = sc.nextLine();
		
		// 4_2. �Է¹��� �˻����� BookController�� searchBook() �޼ҵ�� ����
		bc.searchBook(searchTitle);
		
		
	}

}
