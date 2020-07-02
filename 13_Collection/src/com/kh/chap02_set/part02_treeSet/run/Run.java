package com.kh.chap02_set.part02_treeSet.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add(new String("������"));
		ts.add(new String("������"));
		ts.add(new String("������"));
		ts.add(new String("�ٴٴ�"));
		ts.add(new String("������"));
		ts.add(new String("����"));
		
		System.out.println(ts); // ��������X, �ߺ�����X (�ߺ����ŵ�)
		// ������������..?
		
		
		TreeSet<Person> ts2 = new TreeSet<>();
		
		ts2.add(new Person("����", 40, 100));
		ts2.add(new Person("ȫ�浿", 26, 40));
		ts2.add(new Person("�踻��", 24, 20));
		ts2.add(new Person("����", 20, 80));
		
		System.out.println(ts2); // �������� X, �ߺ�����O
		
		// TreeSet�� �ߺ��˻縦 �ϴ°� compareTo�޼ҵ忡 ������ ���ı����� ��ġ�� ��� �ߺ����Ű� �߻�!
		
		// HashSet�� hashCode(), equals() ������ ���ϰ�ü���� �Ǵ�
		// TreeSet�� compareTo() ������ ���ı����� ��ġ�ϴ� ���� ���ϰ�ü�� �Ǵ�
		
		// TreeSet ���� ��ü�鿡 ���������� ������ �� ���
		// 1. for each�� ������ �̿�
		for(Person p : ts2) {
			System.out.println(p);
		}
		
		System.out.println("================");
		
		// 2. ArrayList�� �ű� �� �̿�
		ArrayList<Person> list = new ArrayList<>(ts2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("================");
		
		// 3. Iterator�� ��Ƽ� �̿�
		
		// 1) Set => Iterator    : iterator()
		Iterator<Person> it = ts2.iterator();

		// 2) �ݺ����� �̿��ؼ� �̱�
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}






