package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// view : �ð����� ��� (��� �� �Է�)
public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	/**
	 * ���θ޴� : ���α׷� ����� ���� ó�� �������� ȭ��
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome ���� ==");
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� ���� �ϱ�");
			System.out.println("0. ���α׷�����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectList(); break;
			case 3: searchMusic(); break;
			case 4: deleteMusic(); break;
			case 5: updateMusic(); break;
			case 6: sortMusic(); break;
			case 0: System.out.println("���α׷� �����ϰڽ��ϴ�."); return;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
	}
	
	
	/**
	 * ����ȭ��1. �ű� ���� �߰��ϴ� ȭ�� 
	 */
	public void insertMusic() {
		
		System.out.println("==== �� �߰� ====");
		
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String artist = sc.nextLine();
		
		// �� �߰� ��û (MusicController �޼ҵ� ȣ��!!)
		mc.insertMusic(title, artist);
		
		System.out.println("���������� �߰� �Ǿ����ϴ�.");
		
	}
	
	
	/**
	 * ����ȭ��2. �� ��ü ��ȸ�� ȭ�� 
	 */
	public void selectList() {
		
		System.out.println("==== �� ����Ʈ ====");
		
		// �� ��ü ��ȸ ��û (MusicController �޼ҵ� ȣ��!!)
		ArrayList<Music> list = mc.selectList();
		
		// ��ȯ���� list�� ������� ��� => "�����ϴ� ���� �����ϴ�."
		if(list.isEmpty()) {
			System.out.println("�����ϴ� ���� �����ϴ�.");
			
		}else {
		// ��ȯ���� list�� ������� ���� ��� => �ݺ����� ���ؼ� �ش� Music ��ü�� ���
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
								
		}
	}
	
	
	/**
	 * ����ȭ��3. Ư�� �� �˻��ϴ� ȭ��
	 */
	public void searchMusic() {
		
		System.out.println("===== �� �˻� =====");
		
		System.out.println("1. ������� �˻�");
		System.out.println("2. ���������� �˻�");
		System.out.println("3. ���+���������� �˻�");
		System.out.print("�޴� : ");
		int search = sc.nextInt();
		
		System.out.print("�˻��� Ű���� : ");
		String keyword = sc.nextLine();
		
		// keyword �˻� ��û (MusicController �޼ҵ� ȣ��!!)
		ArrayList<Music> searchList = mc.searchMusic(search, keyword);
		
		// ������� ��� --> "�˻� ����� �����ϴ�."
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
		// ������� ���� ��� --> �ݺ����� ���ؼ� searchList�� ����ִ� Music ��ü�� ���
			for(Music m : searchList) {
				System.out.println(m);
			}
		}
		
	}
	
	/**
	 * ����ȭ��4. Ư�� ��� �Է��� �� ������û�ϴ� ȭ��
	 */
	public void deleteMusic() {
		
		System.out.println("===== �� ���� =====");
		
		System.out.print("������ ��� : ");
		String title = sc.nextLine();
		
		// ������û!! (MusicController �޼ҵ� ȣ��!)
		int result = mc.deleteMusic(title);
		
		if(result == 0) {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}else {
			System.out.println("���������� �����Ͽ����ϴ�.");
		}
		
		
		// �߰�, ��ȸ, ����, ����
		//  C    R    U    D
		//Create Read Update Delete
		
		
	}
	
	/**
	 * ����ȭ��5. Ư������ ã�� �����ϴ� ȭ��
	 */
	public void updateMusic() {
		
		System.out.println("===== �� ���� =====");
		
		// �����ϰ����ϴ� ���, ��������(������), ��������(���)
		System.out.print("�����ϰ��� �ϴ� ��� : ");
		String title = sc.nextLine();
		
		System.out.print("��������(������) : ");
		String upArtist = sc.nextLine();
		
		System.out.print("��������(���) : ");
		String upTitle = sc.nextLine();
		
		// ������û! (MusicController �޼ҵ� ȣ��)
		int result = mc.updateMusic(title, upArtist, upTitle);
		
		if(result == 0) { // ������ ���� ã�� ����
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}else { // ���������� ������
			System.out.println("���������� �����Ǿ����ϴ�.");
		}
		
		
	}
	
	
	/**
	 * ����ȭ��6. �� ���� �Ŀ� ��ȸ�ϴ� ȭ��
	 */
	public void sortMusic() {
		
		System.out.println("==== �� �����ϱ� ====");
		
		System.out.println("1. ������ ��������");
		System.out.println("2. ������ ��������");
		System.out.println("3. ��� ��������");
		System.out.println("4. ��� ��������");
		
		System.out.print("�޴� : ");
		int menu = sc.nextInt();
		
		if(menu != 1 && menu != 2 && menu != 3 && menu != 4) {
			System.out.println("�߸��Է��߽��ϴ�.");
			return;
		}
		
		// ���� ��ȸ ��û (MusicController�� �޼ҵ�ȣ��)
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		for(int i=0; i<sortList.size(); i++) {
			System.out.println(sortList.get(i));
		}
		
	}

}













