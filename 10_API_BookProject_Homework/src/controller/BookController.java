package controller;

import java.util.Date;
import java.util.GregorianCalendar;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public void printAll() {
		
		// list �迭 ��ü ���
		
	}
	
	
	
	
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾�
		
		//      ���� �ۼ�
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>       String --> Date�� ��ȯ �۾�
		//	  '-'�� �����ڷ� StringTokenizer�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
	
		//      ���� �ۼ�
		
		
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� ������
		//	  �Ű����� �����ڸ� ���� ������ �� 4�� �ε����� ����
		list[4] = new Book(/* ���� �ۼ� */);
		
	
	}
	
	
	// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
	public void printBookPublishDate() {
		// ������ ������ �Ⱓ�� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ���
		
		// SimpleDateFormat�� �̿��Ͽ� ���
		
		//		���� �ۼ�
		
		
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public void searchBook(String searchTitle) {
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻����� ������!! ������ ���
		
	
		
	}
	
	
	

}
