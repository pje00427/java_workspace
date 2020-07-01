package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem;
	private Book[] bList = new Book[5];
	
	{ // ���� ������
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public LibraryManager() {
		
	}
	
	// ���� ���� �� �Ż� ������ ���
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	// ȸ�� ���۷��� �ּҰ� ����
	public Member myPage() {
		return mem;
	}
	
	// ��������Ʈ �ּҰ� ����
	public Book[] selectAll() {
		return bList;
	}
	
	// �����˻� ����Ʈ ����
	public Book[] searchBook(String title) {
		Book[] searchList = new Book[5];
		int count=0;
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(title)) {
				searchList[count] = bList[i];
				count++;
			}
		}
		
		return searchList;
	}
	
	// �뿩�ϱ�
	public int rentBook(int index) {
		
		int result = 0;
		
		if(bList[index] instanceof AniBook) { // �뿩�ϰ��� �ϴ� ������ AniBook�� ��� ���� ȸ�� ���̿� ������ ���ѳ��̿� ���ؾߵȴ�.  
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) { 
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) { // �뿩�ϰ��� �ϴ� ������ CookBook�� ��� �ش� ������ ������ �ִ��� �Ǵ��ؾߵȴ�. 
			if(((CookBook)bList[index]).getCoupon() == true){
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return result;
	}

}
