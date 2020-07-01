package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10; // �ִ� ȸ�� ��
	private int memberCount;		   // ���� ȸ�� ��
	private Member[] mem = new Member[SIZE]; // ȸ�� ��ü���� ������ ��ü �迭 (ũ��� �ִ�ȸ������ŭ)
	
	// �Ʒ��� {} �� �κ��� �ʱ�ȭ ���̶�� �Ѵ�. 
	{
		mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim123@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yoo55@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon01@gmail.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin89@naver.com");
		memberCount = 5; // 5���� ȸ���� �߰��س����� memberCount�� 5�� �ʱ�ȭ
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		
		// ���޹��� ȸ���� ���̵�� ��ġ�ϴ� ȸ�� ��ü�� ������ ����
		Member m = null;
		
		// ���� ȸ������ŭ �ݺ�
		for(int i=0; i<memberCount; i++	) {
			if(mem[i].getUserId().equals(userId)) { // ��ġ�ϴ� ȸ���� ã���� ���
				m = mem[i]; // �ش� ȸ�� ��ü�� m�� ����
			}
		}
		
		return m; // ���� ��ã���� ��� null�� ����, ã���� ��� �ش� ȸ�� ��ü ����
	}
	
	
	public void insertMember(Member m) {
		
		mem[memberCount++] = m; // ���޹��� ȸ�� ��ü �迭�� memberCount�ε��� ��°�� ��� memberCount�� 1����
		
	}
	
	public Member searchMember(int menu, String search) { // �˻��޴���ȣ, �˻���
		
		// �˻��� ȸ�� ��ü�� ������ ����
		Member searchMember = null;
		
		// ���� ȸ������ŭ �ݺ�
		for(int i=0; i<memberCount; i++) {
			
			// ���޹��� �޴� ��ȣ�� 1�� ��� ���̵�� �˻�
			if(menu == 1) {
				
				if(mem[i].getUserId().equals(search)) { // �ش� ���������� ������ ��ü�� ���̵�� �˻���� ��
					searchMember = mem[i];
				}
				
			}else if(menu == 2) { // ���޹��� �޴� ��ȣ�� 1�� ��� �̸����� �˻�
				
				if(mem[i].getName().equals(search)) { // �ش� ���������� ������ ��ü�� �̸��� �˻���� ��
					searchMember = mem[i];
				} 
				
			}else { // ���޹��� �޴� ��ȣ�� 3�� ��� �̸��Ϸ� �˻�
				
				if(mem[i].getEmail().equals(search)) { // �ش� ���������� ������ ��ü�� �̸��ϰ� �˻���� ��
					searchMember = mem[i];
				}
				
			}
			
		}
		
		return searchMember; // ���� �˻��� ȸ���� ���� ��� null�� ����, �˻��� ȸ���� ���� ��� �ش� ȸ�� ��ü ����
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		// �޴� ��ȣ�� 1�� ��� ��й�ȣ ����
		if(menu == 1) {
			m.setUserPwd(update); // �ش� ���޵� ȸ�� ��ü�� ��й�ȣ�� update���ڿ��� ����
			
		}else if(menu == 2) { // �޴� ��ȣ�� 2�� ��� �̸� ����
			
			m.setName(update); // �ش� ���޵� ȸ�� ��ü�� �̸��� update���ڿ��� ����
			
		}else { // �޴� ��ȣ�� 3�� ��� �̸� ����
			
			m.setEmail(update); // �ش� ���޵� ȸ�� ��ü��  �̸����� update���ڿ��� ����
		}
		
	}
	
	public void deleteMember(String userId) {
		
		// ���� ȸ������ŭ �ݺ�
		for(int i=0; i<memberCount; i++) {
			
			 // �ش� ���������� ������ ��ü�� ���̵�� ���޵� ������ ȸ���� ���̵�� ��
			if(mem[i].getUserId().equals(userId)) {// ��ġ�ϴ� ȸ�� ã���� ��� 
				
				// ���� �ش� ȸ���� ������ ĭ�� �־��� ���
				if(i == memberCount-1) {
					mem[i] = null; // �ش� ȸ�� �������ϸ� �� (null�� ����)
					
				}else { // ���� �ش� ȸ���� ������ ĭ�� �ƴ� �߰��� �־��� ��� => �ڿ� �ִ� ȸ������ ��ĭ�� ������ ���ܾ� �ȴ�.
					
					for(int j=i; j<memberCount-1; j++) {
						mem[j] = mem[j+1];
					}
					mem[memberCount - 1] = null;
				}
				
				break; // ���� �� �� �� �ݺ��� ���������ߵ�
			}
		}
		
		memberCount--; // �Ѹ� ���� �����Ƿ� memberCount �� 1����
	}
	
}
