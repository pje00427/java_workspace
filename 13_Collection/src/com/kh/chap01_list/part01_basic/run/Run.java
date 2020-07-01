package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * * �÷���?
		 *  - �ڹٿ��� "�ڷᱸ��"������ �̹� ����Ǿ��ִ� "�����ӿ�ũ"
		 *  
		 *  > �ڷᱸ�� : ����� �����͸� ȿ����(������)���� �ٷ� �� �ʿ��� ����
		 *  > �����ӿ�ũ : �����ͳ� ��ɵ��� �ٷ�� ���� �̹� ���ǵǾ��ִ� Ʋ
		 *  
		 *  ���� : ����� �����͸� �߰�, ����, ����, ������ �� �� �츮�� ���� �ݺ��� �Ǵ� ���ǹ����� ������ �ʿ����
		 *  	 (���� �˰����� © �ʿ� ����) �̷� �˰����� ����Ǿ��ִ� �÷����� �̿��ϸ� ���ó���� �����ϰ� �� �� �ִ�.
		 * 
		 * * �迭�� ����
		 * 1. �迭���� ũ�������� �ݵ�� �ؾ� �Ѵ�. (�Ӹ� �ƴ϶� �ѹ� ������ ũ��� ���� �Ұ�)
		 * 2. �迭 �߰� ��ġ�� �����͸� �߰� �Ѵٰų� ���� �ϴ� ��� �ݺ����� ���ؼ� ��ĭ �� �����ִ� �۾��� �������� �� 
		 * 3. �� Ÿ���� �����͸� ������ ���� 
		 * 
		 * * �÷����� ����
		 * 1. ũ�⸦ ������ �� �ʿ䵵 ���� �����ϴµ��� �־ ũ���� ������ ���� 
		 * 2. �߰��� ���� �߰��ϰų� �����ϴ� ���, ���Ŀ� �־�� ���� �˰����� ������ �ʿ䰡 ���� 
		 * 	  �̹� �޼ҵ�� ��������� ������
		 * 3. ���� Ÿ���� �����͸� ���� ����(��, ��ü�� ���尡��)
		 * 
		 * * �÷��� ����(List, Set, Map)
		 * 
		 * 			List	|	  Set 	 | 	   	Map
		 * -----------------------------------------------
		 * ���������� | 	������(��ü)		 |  ������ key + ������ 
		 * -----------------------------------------------
		 * ���� ����   |     O	| 	   X	 | 		X
		 * -----------------------------------------------
		 * �ߺ� ����   |		O	|	   X	 |		Key���� X
		 * -----------------------------------------------
		 *
		 */
		
		// * ArrayList
	//	List list = new List(); // �������̽��� ��ü���� �Ұ� 
		ArrayList<Music> list = new ArrayList</*Music*/>(3); // ũ�� ���� �� ���� �ֱ��� (���ϸ� �⺻������� 10�� �迭)
		// jdk������ �Ǹ鼭 ������  ����� Ÿ���� ����ֵ� ok!
		
		System.out.println(list); // ����ִ� ������
		
		
		// E --> Element : ����Ʈ�� ��� ��ҵ� (��ü��� �����ϸ� �ȴ�.)
		// 1. add(E e) : boolean 
		// 	  ����Ʈ�� ���� ��ü�� �߰��ϴ� �޼ҵ�  (�������� ���)
		list.add(new Music("Good Bye","��ȿ��"));
		list.add(new Music("�� ��","�����"));
		list.add(new Music("��������","��Ű"));
	//	list.add("��");
		
		// ���� ������ ũ�⺸�� ũ�� �־ ������ ���� ���� ! --> ����1. ũ�⿡ ������ ����.
		// �پ��� Ÿ���� ���� ������� 				 --> ����2. ����Ÿ�� ���� ����(��, ���Ȼ� ������ ���� ���� �ִ�.)
		
		System.out.println(list); // ���� ������ �� 
		
		// 2. add(int index, E e) : void
		list.add(1, new Music("������ ��� �뷡","���̽�"));
		
		System.out.println(list);
		// �߰���ġ�� ��ü�� �߰� �� �� �����ϰ� ������ �ʿ� ����  --> ����3. �߰���ġ�� ��ü �߰��� ���� ���� �˰��� © �ʿ� ���� 
		
		// 3. set(int index, E set) : E set(���� �� ��ü)
		// �ش� �ε����� �����͸� e�� �������ִ� �޼ҵ� 
		list.set(0, new Music("���� �޴�","��������"));
		
		System.out.println(list);
		
		// 4. size() : int
		// �÷��ǿ� �ȿ� ��� �����Ͱ� �ִ��� ���� ��ȯ���ִ� �޼ҵ�
		System.out.println("����Ʈ�� ���� : " + list.size());
		
		// 5. remove(int index) : E old (������ ��ü)
		// �ش� �ε����� ��� ��ü�� ���������ִ� �޼ҵ� 
		list.remove(1);
		System.out.println(list);
		System.out.println("����Ʈ�� ���� : " + list.size());
		
		// 6. get(int index) : E e
		// �ش� �ε����� ����ִ� ��ü �������� �޼ҵ� 
	//	System.out.println(list.get(0)); // list[0]�� �Ȱ��� �� 
	//	System.out.println(((Music)list.get(0)).getTitle());  // ����ȯ ����ߵ�
		System.out.println(list.get(0).getTitle()); // ���׸��� ���� �� 
		
	//	Music m = (Music)list.get(0);
		Music m = list.get(0); // ������ �δ� ���� ��������ȯ ���� �ʾƵ��� object --> Music
		System.out.println(m);
		System.out.println(m.getTitle());
		
		// 7. subList(int index1, int index2) : List list
		// 		ù��° �ε���~�ι�° �ε��� ���� �����ؼ� ���ο� List�� ��ȯ���ִ� �޼ҵ� 
		List<Music> sub = list.subList(0,2); // 0 <=  < 2
		System.out.println(sub);
		
		// 8. addAll(Collection c) : boolean
		// �÷����� ��°�� �ڿ� �߰����ִ� �޼ҵ�
		list.addAll(sub);
		
		System.out.println(list);
		
		// 9. isEmpty() : boolean
		//	�÷����� ����ִ��� ���� �޼ҵ�  (��������� true, ������� ������ false)
		System.out.println(list.isEmpty());
		
		// 10.clear() : void
		//list.clear(); // ��ü ���� 
		System.out.println(list.isEmpty()); // true
		
		/*
		 * * ���׸���<>�� ����ϴ� ����
		 * 1. ��õ� Ÿ���� ��ü���� �����ϵ��� ������ �α� ���ؼ�
		 * 2. ���� �� ��ü�� ������ �� �Ź� ����ȯ ���� �ʾƵ� �ȴ�.
		 */
		
		// 1. for loop�� (�Ϲ����� for��)
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		System.out.println("==============");
		
		// 2. for each��(���� for��)
		for( Music music : list) { // Music music = list.get(0) --> Music music = list.get(1);
			
		}
		
		
	}
}
