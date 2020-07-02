package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		// Map�� ������ List, Set���� �ٸ� �迭
		
		// K => key
		// V => value
		
		// 1. put(K key, V value)	: map�� key+value ��Ʈ�� �߰����ִ� �޼ҵ�
		hm.put("������", new Snack("���ڸ�", 1500));
		hm.put("ĭ��", new Snack("�ܸ�", 600));
		hm.put("�����", new Snack("§��", 500));
		hm.put("��������Ĩ", new Snack("§��", 500));
		
		System.out.println(hm); // ��������X, value���� �ߺ��ǵ� Ű���� �ߺ����� �ʾұ� ������ �� ����
								// Ű�������� �ߺ��˻��ϴ� ����
		
		hm.put("�����", new Snack("�ſ��", 700));
		
		System.out.println(hm); // Ű ���� �ߺ��� ��ü �߰��ϴ� ���� ������ value������ �������
		
		// 2. get(K key) : V		
		Snack s = /* (Snack) */hm.get("������");
		System.out.println(s);
		
		// 3. size() 
		System.out.println("���� : " + hm.size());
		
		// 4. replace(K key, V value)
		hm.replace("��������Ĩ", new Snack("�̳�§��", 1000));
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("��������Ĩ");
		System.out.println(hm);
		
		
		// HashMap�� ����ִ� key+value ��Ʈ�� ���������� �����ϰ��� �� �� ?
		/*
		 for each��(���� for��) �ȵ�!!
		for(Snack s : hm) {
			
		}
		*/
		
		// ArrayList�� ��� ����� �ȵ�!!
		//ArrayList list = new ArrayList(hm);
		
		
		// Iterator�� �̿�����!!
		
		//Iterator it = hm.iterator(); // �ٷξȵ�!! iterator()�� List�迭 �Ǵ� Set�迭������ ���� �ִ� �޼ҵ�!!
		// Map�� Set�� �Űܴ�� �޼ҵ带 �����Ѵ�!! (�Դٰ� 2����!!)
		
		// HashMap => Set�迭 => Iterator�ݺ���
		
		
		
		// 1. keySet() �̿��ϴ� ���
		// 1) hm�� �ִ� key�鸸 Set�� ��� (Ű���� ���� ����)		: keySet()
		Set<String> keySet = hm.keySet();
		
		// 2) 1���������� �۾���  keySet�� Iterator�� ���		: iterator()
		Iterator<String> itKey = keySet.iterator();
		
		// 3) �ݺ����� ���� key �̰� value�� �˾Ƴ���
		while(itKey.hasNext()) {
			String key = /* (String) */itKey.next(); // key���� �˾Ƴ� �� ����!!
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
		}
		
		
		System.out.println("====================");
		// 2. entrySet() �̿��ϴ� ���
		// 1) hm�� �ִ� Ű+��� ��Ʈ�� entrySet�̶�� ������ ��� (Ű�� ����� ��Ʈ�� ����) 
		//    * Entry == Ű+���
		//    entrySet()
		Set<Entry<String, Snack>> entrySet = hm.entrySet();		
		
		// 2) 1���������� �۾��� entrySet�� Iterator�� ���
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� �̿��ؼ� key, value�� �˾Ƴ���
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /* (Entry) */itEntry.next();
			
			String key = /* (String) */entry.getKey();
			Snack value = /* (Snack) */entry.getValue();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		
		
		
		
		
		
		
	}

}



