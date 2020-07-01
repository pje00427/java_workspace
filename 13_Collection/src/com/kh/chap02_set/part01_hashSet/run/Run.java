package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<>();

		hs.add("�ݰ����ϴ�.");
		//hs.add(1); // int�� -- AutoBoxing --> Integer -- UpCasting -->Object
		hs.add(new String("�ݰ����ϴ�."));
		hs.add(new String("������"));
		hs.add(new String("�ȳ��ϼ���"));
		
		System.out.println(hs); // �������� x, �ߺ����� x
		
		// HashSet ������ ��ü�� �߰� �� ������ 
		// ������ ����ִ� ��ü��� hashCode()�� ��ġ�ϴ��� equals()�� true ���� ��
		// hashCode() ��ġ, equals()���� ��� true�� ��� => ���ϰ�ü�� �Ǵ�!
		
		// String Ŭ���������� hashcode(), equals()�� �������̵�(������) �Ǿ����� 
		// �ּҰ��� �ƴ� ���� ���ڿ� ������ ������ ���ڿ��� ��� ������ hashCode������ 
		// eqauls() ����� true�����Բ� 
		
		
		HashSet<Person> hs2 = new HashSet<>();
		hs2.add(new Person("����", 40, 100));
		hs2.add(new Person("�踻��", 26, 40));
		hs2.add(new Person("ȫ�浿", 24, 20));
		hs2.add(new Person("����", 40, 100));
		System.out.println(hs2); // �������� x, �ߺ����� o..?
								 // PersonŬ������ ������ ��ü�� �ǴܵǰԲ� hashCode(),equals() �������̵� �� �� �ߺ�����x
		
		// Set --> ������ ��ü�� ��� --> index�� ������� 
		//						--> �ݺ��� �� �� index�� ���� �Ұ�!
		// �׷� ����ִ� ��ü�� ���������� �����ϰ��� �� ����?
		
		// 1. for�� ��밡�� (��, for each������ ����! ���� for��)
		System.out.println("======");
		for( Person p : hs2 ) { // Music m = list.get(0); --> Music m = list.get(1);
	//	for( Object o : hs2 ) {
		//	System.out.println(((Person)o).getName()); // ���׸��� ���� ����ȯ ���ص���
			System.out.println(p.getName());
		}
		
		// 2. ArrayList�� �Ű� ���� �ڿ� ArrayList �ݺ��� ����
		//ArrayList list = new ArrayList(); // �� ����Ʈ
		//list.addAll(hs2);
		
		ArrayList<Person> list = new ArrayList<>(hs2); // hs2�� �ִ� ��ü�� ��� ä �� ����Ʈ ����
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=================");
		// 3. Iterator(�ݺ���)�� �̿��ؼ� ��� 
		// 1) hs2 --> it �Űܴ�� : iterator() �޼ҵ� �̿� (List, Set�迭������ ��밡���� �޼ҵ�)
		Iterator<Person> it = hs2.iterator();
		
		// 2) it�� ��� ��ü�� �ϳ��� �̾ƾ� �� 
		// 	it.next() : it������ ��� ��ü �̾ƿ��� �޼ҵ�
		while(it.hasNext()) {// it�� next()�� �̾ƿ� ��ü�� �������� ��� true �װ� �ƴϸ� false
		//	System.out.println(((Person)it.next()).getName());
			System.out.println(it.next().getName());
		}
		
	}

}
