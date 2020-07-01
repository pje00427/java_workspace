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

		while (true) {

			System.out.println("\n==welcome ����==");
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� �����ϱ�");
			System.out.println("0. ���α׷�  ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();

			System.out.println();

			switch (menu) {
			case 1:
				insertMusic();
				break; // ���� Ŭ���� ���� �޼ҵ� ȣ�� �Ѵٴ� �ǹ�
			case 2:
				selectList();
				break;
			case 3:
				searchMusic();
				break;
			case 4:
				deleteMusic();
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("���α׷� �����ϰڽ��ϴ�.");
				return; // �̸޼ҵ带 ȣ���ߴ� ������ ��������
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ��Է� ���ּ��� ");
			}

		}

	}

	/**
	 * ����ȭ��1. �ű� ���� �߰��ϴ� ȭ��
	 */

	public void insertMusic() {

		System.out.println("==�� �߰�==");
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("�����Է� : ");
		String artist = sc.nextLine();

		// �� �߰� ��û(MusicController �޼ҵ� ȣ��)

		mc.insertMusic(title, artist);
		System.out.println("���������� �߰� �Ǿ����ϴ�.");

	}

	/**
	 * ����ȭ�� 2.�� ��ü ��ȸ�� ȭ��
	 * 
	 */
	public void selectList() {
		System.out.println("== �� ����Ʈ ==");
		// �� ��ü ��ȸ (MusicController �޼ҵ� ȣ���ϰڴ�)
		ArrayList<Music> list = mc.selectList(); // �ڵ� ���þ� ����

		// ��ȯ���� list�� ������� ��� => �����ϴ� ���� �����ϴ�.
		if(list.isEmpty()) {
			System.out.println("�����ϴ� ���� �����ϴ�");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i)); // �迭�̶� �ٸ� 
			}
		}
		
	}
		// ��ȯ���� list�� ������� ���� ��� => �ݺ����� ���ؼ� �ش� Music��ü��  ��� 
		/**
		 * ����ȭ��3. Ư�� �� �˻��ϴ� ȭ��
		 */
		public void searchMusic() {
			
			System.out.println("====�� �˻�===");
			System.out.println("1. ������� �˻�");
			System.out.println("2. ���������� �˻�");
			System.out.println("3. ���+���������� �˻�");
			System.out.println("�޴� : ");
			int search = sc.nextInt();
			
			System.out.print("�˻��� ��� Ű���� : ");
			String keyword = sc.nextLine();
			// keyword �˻���û! MusicController �޼ҵ� ȣ��
			
			ArrayList<Music>searchList = mc.searchMusic(search,keyword);
			
			// ��� ���� ��� --> �˻� ����� �����ϴ�.
			if(searchList.isEmpty()) {
				System.out.println("�˻� ����� �����ϴ�. ");
			}else {
				for( Music m : searchList ) {
					System.out.println(m);
				}
			}
			// ������� ���� ��� --> �ݺ����� ���ؼ� searchList�� ����ִ� Music��ü�� ���	
		}
		/**
		 * ����ȭ�� 4. Ư�� �� �Է��� �� ���� ��û�ϴ� ȭ��
		 */
		public void deleteMusic() {
			
			System.out.println("===�� ����===");
			System.out.print("������ �� �� : ");
			String title = sc.nextLine();
			
			// ������û !! (MusicController �޼ҵ� ȣ��!)
			int result = mc.deleteMusic(title);
			
			if(result == 0) {
				System.out.println("������ ���� ã�� ���߽��ϴ�.");
			}else {
				System.out.println("���������� �����Ͽ����ϴ�.");
			}
			
			// �߰�, ��ȸ, ����, ���� 
			// C	R	U	D
			//create read update delate
			
		}

	
}
