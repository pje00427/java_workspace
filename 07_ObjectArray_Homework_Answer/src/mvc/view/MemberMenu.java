package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	
	// ��� ��û�� MemberController Ŭ���� ��ü ����
	private MemberController mc = new MemberController();
	// Ű����� �� �Է¹ޱ� ���� Scanner Ŭ���� ��ü ����
	private Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  ȭ��1. ����ڰ� ���� ó�� ���Ե� ���� ȭ��
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(menu) {
			case 1: insertMember(); break; // �ű� ȸ�� ����ϴ� ȭ�� ȣ��
			case 2: searchMember(); break; // ȸ�� ���� �˻��ϴ� ȭ�� ȣ��
			case 3: updateMember(); break; // ȸ�� ���� �����ϴ� ȭ�� ȣ��
			case 4: deleteMember(); break; // ȸ�� ���� �����ϴ� ȭ�� ȣ��
			case 5: printAllMember(); break; // ȸ�� ���� ��ü ����ϴ� ȭ�� ȣ��
			case 9: return; // ���α׷��� �����ؾߵǱ� ������ �� mainMenu �޼ҵ� ��ü�� ���������ߵ�
			default: System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
	}
	
	/**
	 * ȭ��2. �ű� ȸ�� ���� �Է¹ް� �߰� ��û�ϴ� ȭ��
	 */
	public void insertMember() {
		
		// ** ���� ȸ���� ��ȸ ��û (Controller�� ��û��)
		int memberCount = mc.getMemberCount();
		
		// 1. ���� ȸ����(memberCount)�� �ִ� ȸ�� ��(SIZE)�̻��� ���
		if(memberCount >= MemberController.SIZE) { 
			System.out.println("ȸ�� ���� �ʰ��߽��ϴ�."); 
			return; // �� �̻� ������ �߰��� �� ���� ������ return ó��
		}
		
		// ���� ������ false�ΰ�� �������� �Ѿ���Ե�
		// 2. ���̵� �Է¹޾� ���̵� �ߺ�üũ ���� �ϱ� 
		System.out.print("���̵� : ");
		String userId = sc.nextLine(); 
		
		// ** ���̵� �ߺ�üũ ��û (Controller�� ��û��)
		Member m = mc.checkId(userId); // m : ��ġ�ϴ� ȸ�� �־��� ��� �ش� ȸ����ü�� �ּҰ�, ��ġ�ϴ� ȸ�� ������ ��� null
		
		// 2_1. ������� null�� �ƴ� ���
		//		��, ��ġ�ϴ� ȸ���� �־��� ��� => ������ ���̵� �����ϴ� ���
		if(m != null) { 
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ����");
		
		}else { // 2_2. �װ� �ƴѰ�� (������� null�� ���)
				//      ��, ��ġ�ϴ� ȸ���� ������ ��� => ������ ���̵� �������� �ʴ� ���
			
			// ���������� ������ ȸ������ �Է�
			System.out.print("��й�ȣ : ");
			String userPwd = sc.nextLine();
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���� : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			
			Member newMem = new Member(userId, userPwd, name, age, gender, email);
			
			// ** ȸ�� ���� �߰� ��û(Controller�� ��û��)
			mc.insertMember(newMem);
		
			System.out.println("���������� ȸ������� �Ǿ����ϴ�.");
		
		}
	}
	
	/**
	 *  ȭ��3. ȸ�� ���� �˻��� �Է¹ް� �˻���û�ϴ� ȭ��
	 */
	public void searchMember() {
		
		// �˻��� ����޴� => �ݺ�ó��
		while(true) {
			System.out.println("====== ȸ�� ���� �˻� ======");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���� �޴���");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 9�� �������� ��� => �����޴��� => ��, �� �޼ҵ� ��ü�� ����������
			if(menu == 9) {
				System.out.println("�����޴��� ���ư��ϴ�.");
				return;
			}
			
			System.out.print("\n�˻� ���� : ");
			String search = sc.nextLine();
			
			// ** ȸ�� ���� �˻� ��û (Controller�� ��û��)
			Member searchMember = mc.searchMember(menu, search); // �������, (2, "������")�� ���޽� �̸����� "������"�� �˻��ϰڴٴ� �ǹ�
																 // searchMember : �˻� ��� ������ �� �ش� �˻��� ȸ�� ��ü, �˻���� ������ null
			
			// 1_1. ��� ���� null�� ��� => �˻��� ȸ�� ��ü�� ���ٶ� �Ҹ�
			if(searchMember == null) {
				System.out.println("�˻��� ����� �����ϴ�.");
			}else { // 1_2. ������� null�� �ƴ� ��� => �˻��� ȸ�� ��ü�� searchMember�� ����ִٶ� �Ҹ�
				System.out.println("====== �˻���� ======");
				System.out.println(searchMember.information());
			}
			
			System.out.println();
			
		}
	}
	
	/**
	 * ȭ��4. ȸ�� ���� �����ϴ� ȭ�� 
	 */
	public void updateMember() {
		
		// ������ ����޴� => �ݺ�ó��
		while(true) {
			
			System.out.println("====== ȸ�� ���� ���� ===== ");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 9�� �������� ��� => �����޴��� => ��, �� �޼ҵ� ��ü�� ����������
			if(menu == 9) {
				System.out.println("�����޴��� ���ư��ϴ�.");
				return;
			}
			
			// 1. �켱�� ������ ȸ���� ���̵� �Է¹��� �� �ش� ȸ�� ��ü ��ȸ�ؿ���
			System.out.print("\n������ ȸ�� ���̵� : ");
			String userId = sc.nextLine();
			
			// ** ���̵�� ȸ�� ��ȸ ��û (Controller�� ��û��)
			Member m = mc.checkId(userId); // m : ��ġ�ϴ� ȸ�� ã�� ��� �ش� ȸ�� ��ü, ��ã�� ��� null
			
			// 1_1. ��� ���� null�� ��� => ��ġ�ϴ� ȸ�� ��ã��
			if(m == null) {
				System.out.println("������ ȸ���� ���� ������ �������� �ʽ��ϴ�.");
				
			}else { // 1_2. ������� null�� �ƴ� ��� => ��ġ�ϴ� ȸ�� ã�� => ���������� �����ϸ� ��
				
				System.out.println("���� ���� : " + m.information()); // �켱 ���� ȸ���� ���� ���� ���
				
				System.out.print("\n���� ���� : ");
				String update = sc.nextLine(); // ������ �� �Է¹ޱ�
				
				// ** �ش� ȸ�� ���� ���� ��û (Controller�� ��û)
				mc.updateMember(m, menu, update); // (�˻��� ȸ����ü, 1, "pass01") ���޽�
												  // �ش� ȸ���� ��й�ȣ "pass01"�� �����ϰڴٴ� �ǹ�
				
				System.out.println("ȸ���� ������ ����Ǿ����ϴ�.");
			}
		}
	}
	
	/**
	 * ȭ��5. ȸ�� ���� ������û�ϴ� ȭ��
	 */
	public void deleteMember() {
		
		// 1. �켱�� ������ ȸ���� ���̵� �Է¹��� �� �ش� ȸ�� ��ü ��ȸ�ؿ���
		System.out.print("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		
		// ** ���̵�� ȸ�� ��ȸ ��û (Controller�� ��û��)
		Member m = mc.checkId(userId); // m : ��ġ�ϴ� ȸ�� ã�� ��� �ش� ȸ�� ��ü, ��ã�� ��� null
		
		// 1_1. ��� ���� null�� ��� => ��, ������ ȸ���� ã�� ���� ���
		if(m == null) {
			System.out.println("������ ȸ���� ���� ������ �������� �ʽ��ϴ�.");
			
		}else { // 1_2. ������� null�� �ƴ� ��� => ��, ������ ȸ���� ã�� ���
			System.out.println("���� ���� : " + m.information());
			
			System.out.print("\n���� �����ϰڽ��ϱ�? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0); // ����ڰ� �Է��� ���ڿ��� �빮�ڷ� ��ȯ�� �� 0���ε��� ����
			
			if(ch == 'Y') { // �����ϰڴٴ� �ǻ� ������ ���
				
				// ** �ش� ȸ�� ���� ��û (Controller�� ��û��)
				mc.deleteMember(userId); 
				
				System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
			}
		}
	}
	
	/**
	 * ȭ��6. ȸ�� ���� ��¿�û�ϴ� ȭ��
	 */
	public void printAllMember() {
		
		// ** ȸ�� ���� ��ȸ ��û (Controller�� ��û��)
		Member[] mem = mc.getMem(); // �ش� ȸ������ ����ִ� �迭 �޾ƿ���
		
		// �迭�� ũ�⸸ŭ �ݺ� x, ���� ȸ�� ����ŭ �ݺ�
		for(int i=0; i<mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
	}
	

}
