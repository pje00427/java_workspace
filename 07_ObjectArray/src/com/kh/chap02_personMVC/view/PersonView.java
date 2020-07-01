package com.kh.chap02_personMVC.view;

import java.util.Scanner;

import com.kh.chap02_personMVC.controller.PersonController;
import com.kh.chap02_personMVC.model.vo.Person;

// View : �����(Ŭ���̾�Ʈ)�� �ð����� �κ�(ȭ��)�� ��� (���, �Է�)
//		    ���⼭ �������� ȭ��(�޴�)�� ���ؼ� ��û�̶�°� �ϰԵ�
//		    ��û�� �Ѵٴ°� "Controller Ŭ������ �޼ҵ带 ȣ��"�Ѵٴ� �ǹ�

public class PersonView {
	
	// ����ڿ��� ���� �Է¹ޱ� ���� Scanner ��ü ���������� �����س���
	private Scanner sc = new Scanner(System.in);
	// ������� ��û�� ó���� Controller Ŭ���� ��ü ���������� �����س���
	private PersonController pc = new PersonController();
	
	
	
	// ���α׷� ����� ���ÿ� ���� ���� �������� ����ȭ��
	public void mainMenu() {
		
		// ���θ޴� �ݺ������� ���
		// ����ڰ� �����ϰڴٴ� �ǻ縦 ���� �� ����
		while(true) {
			
			System.out.println("\n==== ���� �޴� ====");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ȸ�� �̸� �˻�");
			System.out.println("4. ȸ�� ��� ��� ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();			
			
			switch(menu) {
			case 1: insertPerson(); break;
			case 2: printPerson(); break;
			case 3: searchPerson(); break;
			case 4: avgWealth(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���");
			}
			
		}
	}
	
	
	/**
	 * �޴�1. ȸ�� ������ �Է¹��� �� �Է¹��� ������� "ȸ�� �߰� ��û"�ϴ� ȭ��
	 */
	public void insertPerson() {
		
		System.out.println("\n=== ȸ�� ���� �Է� ===");
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		
		// �Է��� �������� ������ ȸ�� �߰� ��û�Ҳ���!! 
		// Controller�� �ִ� �޼ҵ� ȣ���ϰڴ�.
		int result = pc.insertPerson(name, age, wealth);
		
		if(result == 1) { // ȸ�� �߰� ����
			System.out.println("ȸ�� �߰� �����߽��ϴ�!!");
		}else { // ȸ�� �߰� ����
			System.out.println("ȸ�� �߰� �����߽��ϴ٤Ф�");
		}
		
	}
	
	
	/**
	 * �޴�2. ���� �߰��Ǿ��ִ� ȸ�� ��ü ��ȸ ��û�ϴ� ȭ��
	 */
	public void printPerson() {
		
		System.out.println("\n=== ȸ�� ���� ��ȸ ===");
		
		// ���� ȸ�� �� ������� ��ȸ ��û!!
		// Controller�� �޼ҵ� ȣ���ϰڴ�!!
		int count = pc.selectCount();
		
		if(count == 0) { // ���� �߰��� ȸ�� ����
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else { // �߰��� ȸ���� �Ѹ��̶� �ִٶ� �Ҹ�
			
			// ȸ�� ��ü ��ȸ ��û!!
			// Controller �޼ҵ� ȣ��!!
			Person[] people = pc.selectPeople();
			
			for(int i=0; i<count; i++) { // ���� �߰��� ȸ�� ����ŭ �ݺ� �ؾߵ�
				System.out.println(people[i].information());
			}
			
		}
		
	}
	
	
	/**
	 * �޴�3. ȸ�� �̸����� �˻� ��û�� �ϴ� ȭ��
	 */
	public void searchPerson() {
		
		System.out.println("\n=== ȸ�� ���� �˻� ===");
		
		System.out.print("�˻��� �̸� : ");
		String search = sc.nextLine();
		
		// �˻� ��û�Ҳ���!! 
		// Controller �޼ҵ� ȣ��
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) { // �˻��� ȸ���� ���� ���
			
			System.out.println("�˻��� ȸ���� �����ϴ�.");
			
		}else { // �˻��� ȸ���� ���� ���
			
			System.out.println(searchPerson.information());
			
		}
		
	}
	
	
	/**
	 * �޴�4. ���� �߰��� ȸ������ ��� ��� ��ȸ��û�ϴ� �޼ҵ�
	 */
	public void avgWealth() {
		
		System.out.println("\n== ȸ�� ��� ��� ��ȸ ==");
		
		// ���� ȸ�� �� ������� ��ȸ��û
		int count = pc.selectCount();
		
		if(count == 0) { // ���� �߰��� ȸ�� ����
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else { // �߰��� ȸ�� ����!
			
			// ��ü ȸ�� ��� ��� ��ȸ��û!!
			// Controller �޼ҵ� ȣ��
			
			//int avgWealth = pc.selectAvgWealth();
			//System.out.println("��� ��� : " + avgWealth);
			
			System.out.println("��� ��� : " + pc.selectAvgWealth());
			
		}
		
	}

}















