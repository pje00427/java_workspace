package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  * �÷���?
		 *  - �ڹٿ��� "�ڷᱸ��"������ �̹� �����Ǿ� �ִ� "�����ӿ�ũ"
		 *  
		 *  > �ڷᱸ�� : ����� �����͸� ȿ����(������)���� �ٷ� �� �ʿ��� ����
		 *  > �����ӿ�ũ : �����ͳ� ��ɵ��� �ٷ�� ���� �̹� ���ǵǾ��ִ� Ʋ
		 *  
		 *  ���� : ����� �����͸� �߰�, ����, ����, ������ �� �� �츮�� ���� �ݺ��� �Ǵ� ���ǹ����� ������ �ʿ� ���� (���� �˰����� © �ʿ����)
		 *  	   �̷� �˰����� �����Ǿ��ִ� �÷����̶�°� �̿��ϸ� ���ó���� �����ϰ� �ذ�!!
		 *  
		 *  
		 *  * �迭�� ����
		 *  1. �迭���� ũ�������� �ݵ�� �ؾ߸� �ߴ�. (�Ӹ� �ƴ϶� �ѹ� ������ ũ��� ���� �Ұ�)
		 *  2. �迭 �߰� ��ġ�� �����͸� �߰��Ѵٰų� �����ϴ� ��� �ݺ����� ���� ��ĭ �� �����ִ� �۾��� �������� ��
		 *  3. �� Ÿ���� �����͸� ���� ����
		 *  
		 *  * �÷����� ����
		 *  1. ũ�⸦ �������� �ʿ䵵 ���� �����ϴµ��� �־ ũ���� �������!!
		 *  2. �߰��� ���� �߰��ϰų� �����ϴ� ���, ���Ŀ� �־�� ���� �˰����� ������ �ʿ����! 
		 *     �̹� �޼ҵ�� ��������� ������!!
		 *  3. ���� Ÿ���� �����͸� ���� ���� (��, ��ü�� ���尡��)
		 *  
		 *  * �÷��� ���� (List, Set, Map)
		 *  
		 *  			List	  |		Set		|	    Map
		 *  ----------------------------------------------------------
		 *  ���������� |         ������(��ü)        | ������Key + ������(��ü)
		 *  ----------------------------------------------------------
		 *  ���� ����   |     O       |      X      |        X
		 *  ----------------------------------------------------------
		 *  �ߺ� ����   |     O       |      X      |     Key���� X
		 *  ----------------------------------------------------------
		 *  
		 */
		
		// * ArrayList
		ArrayList<Music> list = new ArrayList<>(3); // ũ�� ������ ���� �ֱ���!! (���ص� ��! ���ϸ� �⺻������ 10�� �迭)
		
		System.out.println(list); // ����ִ� ������!!
		
		
		// E --> Element : ����Ʈ�� ��� ��ҵ�(��ü��� �����ϸ� ��)
		
		// 1. add(E e) : boolean
		//    ����Ʈ�� ���� ��ü�� �߰��ϴ� �޼ҵ�
		list.add(new Music("Good Bye", "��ȿ��"));
		list.add(new Music("�� ��", "�����"));
		list.add(new Music("��������", "��Ű"));
		//list.add("��");
		
		
		// ������ ũ�⺸�� ũ�� �־ �������� ����! --> ����1. ũ�⿡ ������ ����.
		// �پ��� Ÿ���� ���� �������		   --> ����2. ����Ÿ�� ���� ���� (��, ���Ȼ� ������ ���� ���� �ִ�.)
		
		System.out.println(list); // ���������� ��! --> index������ ���� --> �ߺ����� ����
		
		// 2. add(int index, E e) : void
		//    �ε����� �����Ͽ� ��ü�� �߰��ϴ� �޼ҵ�
		list.add(1, new Music("������ ��� �뷡", "���̽�"));
		
		// �߰� ��ġ�� ��ü�� �߰��Ҷ� �����ϰ� ������ �ʿ� ���� --> ����3. �߰���ġ�� ��ü �߰��� ���� ���� �˰����� © �ʿ����
		
		System.out.println(list);
		
		
		// 3. set(int index, E e) : E old (������ ��ü)
		//    �ش� �ε����� �����͸� e�� �������ִ� �޼ҵ�
		list.set(0, new Music("���� �޴�", "��������"));
		
		System.out.println(list);
		
		// 4. size() : int
		//    �÷��ǿ� �ȿ� �� ���� �����Ͱ� �ִ��� ���� ��ȯ���ִ� �޼ҵ�
		System.out.println("����Ʈ�� ���� : " + list.size());
		
		// 5. remove(int index) : E old (������ ��ü)
		//    �ش� �ε����� ��� ��ü�� ���������ִ� �޼ҵ�
		list.remove(1);
		
		System.out.println(list);
		System.out.println("����Ʈ�� ���� : " + list.size());
		
		// 6. get(int index) : E e
		//    �ش� �ε����� ����ִ� ��ü �������� �޼ҵ�
		//System.out.println(list.get(0)); // �迭�� ġ�� list[0]�� �Ȱ��� ��
		//System.out.println(((Music)list.get(0)).getTitle()); // list[0].getTitle()
		//System.out.println(list.get(0).getTitle());
		
		//Music m = (Music)list.get(0); // ���׸��� ���� �� --> ��������ȯ �ؾ߸� �� (��? Object�� ��ȯ�ϱ� ����)
		Music m = list.get(0); // ���׸��� ���� ��
		System.out.println(m);
		System.out.println(m.getTitle());
		
		// 7. subList(int index1, int index2) : List list
		//    ù��° �ε���~�ι�° �ε���-1 ���� �����ؼ� ���ο� List�� ��ȯ���ִ� �޼ҵ�
		List<Music> sub = list.subList(0, 2); // 0 <=   < 2
		
		System.out.println(sub);
		
		// 8. addAll(Collection c) : boolean
		//    �÷����� ��ä�� �ڿ� �߰����ִ� �޼ҵ�
		list.addAll(sub);
		
		System.out.println(list);
		
		// 9. isEmpty() : boolean
		//    �÷����� ����ִ��� ���� �޼ҵ� (��������� true, ������� ������ false)
		System.out.println(list.isEmpty());
		
		// 10. clear() : void
		//list.clear();
		System.out.println(list.isEmpty());
		
		/*
		 *  * ���׸���<>�� ����ϴ� ����
		 *  1. ��õ� Ÿ���� ��ü���� �����ϵ��� ������ �α� ���ؼ�
		 *  2. ����� ��ü�� ������ ����� �� �Ź� ����ȯ�ϴ� ������ ���ֱ� ����
		 */
		
		// 1. for loop�� (�Ϲ����� for��)
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
			System.out.println(list.get(i).getTitle());
		}
		
		System.out.println("=============");
		
		// 2. for each�� (���� for��)
		for(Music music : list) { // Music music = list.get(0); --> Music music = list.get(1); --> ... 
			System.out.println(music);
		}
		
		
	}

}









