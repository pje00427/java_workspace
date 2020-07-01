package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;


public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("******** ȯ���մϴ� *******");
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.next();
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		
		
		lm.insertMember(new Member(name, age, gender));
		
		while(true) {
			System.out.println("======= �޴� ======");
			System.out.println("1. ����������");		// lm�� myPage()
			System.out.println("2. ���� ��ü ��ȸ");		// selectAll()
			System.out.println("3. ���� �˻�");			// searchBook()
			System.out.println("4. ���� �뿩�ϱ�");		// rentBook()
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1: System.out.println(lm.myPage()); break;
				case 2: selectAll(); break;
				case 3: searchBook(); break;
				case 4: rentBook(); break;
				case 9: System.out.println("���α׷��� �����մϴ�. "); return;
				default: System.out.println("�ٽ� �Է����ּ���."); break;
			}
		}
	}
	
	// ��ü��ȸ �޼ҵ�
	public void selectAll() {
		// lm�� selectAll()�޼ҵ带 ���� ��ü ���� ��� �޾ƿ���
		Book[] bList = lm.selectAll();
		
		System.out.println("===== ���� ��� =====");
		// for���� �̿��Ͽ� ��� + i�� �̿��Ͽ� �ε����� ���� ���
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "�� ���� : " + bList[i].toString()); // �������̵��̱� ������ �������ε����� ����
		}
	}
	
	// �����˻� �޼ҵ�
	public void searchBook() {
		System.out.print("�˻��� ���� �Է� : ");
		String title = sc.next();
		
		// �Է¹��� �˻� ������ lm�� searchTitle()�޼ҵ�� ����, �� �˻� ��� �˻��� ��������� �޾ƿ�
		Book[] searchList = lm.searchBook(title);
		
		// ���� for��(for each��)�� �̿��Ͽ� ���
		int count = 0;
		for(Book bk : searchList) {
			if(bk != null) {
				System.out.println(bk);
				count++;	// ������ ��� count 1����
			}
		}
		
		if(count == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
	
	// �����뿩 �޼ҵ�
	public void rentBook() {
		
		selectAll();
		
		System.out.print("�뿩 �� ���� ���� : ");
		int index = sc.nextInt();
		
		// �뿩�� ���� �ε��� ��ȣ�� lm�� rentBook()�޼ҵ�� �����ϰ� �� ��� ���� �޾ƿ�
		int result = lm.rentBook(index);
		
		// ������ �ش��ϴ� ��¹��� ����ϱ� ���� result �޾���
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}else if(result == 1) {
			System.out.println("������������ �뿩 �Ұ��� �Դϴ�.");
		}else if(result == 2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�.");
		}
	}

}
