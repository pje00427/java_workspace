package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		// Map은 기존의 List, Set과는 다른 계열
		
		// K => key
		// V => value
		
		// 1. put(K key, V value)	: map에 key+value 세트로 추가해주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 순서유지X, value값이 중복되도 키값이 중복되지 않았기 때문에 잘 저장
								// 키값가지고 중복검사하는 거임
		
		hm.put("새우깡", new Snack("매운맛", 700));
		
		System.out.println(hm); // 키 값이 중복된 객체 추가하는 순간 마지막 value값으로 덮어씌워짐
		
		// 2. get(K key) : V		
		Snack s = /* (Snack) */hm.get("다이제");
		System.out.println(s);
		
		// 3. size() 
		System.out.println("갯수 : " + hm.size());
		
		// 4. replace(K key, V value)
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		// HashMap에 담겨있는 key+value 세트에 순차적으로 접근하고자 할 때 ?
		/*
		 for each문(향상된 for문) 안됨!!
		for(Snack s : hm) {
			
		}
		*/
		
		// ArrayList에 담는 방법도 안됨!!
		//ArrayList list = new ArrayList(hm);
		
		
		// Iterator를 이용하자!!
		
		//Iterator it = hm.iterator(); // 바로안됨!! iterator()는 List계열 또는 Set계열에서만 쓸수 있는 메소드!!
		// Map을 Set로 옮겨담는 메소드를 제공한다!! (게다가 2개나!!)
		
		// HashMap => Set계열 => Iterator반복자
		
		
		
		// 1. keySet() 이용하는 방법
		// 1) hm에 있는 key들만 Set에 담기 (키들의 집합 형태)		: keySet()
		Set<String> keySet = hm.keySet();
		
		// 2) 1번과정에서 작업된  keySet을 Iterator에 담기		: iterator()
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반복문을 통해 key 뽑고 value값 알아내기
		while(itKey.hasNext()) {
			String key = /* (String) */itKey.next(); // key값을 알아낼 수 있음!!
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
		}
		
		
		System.out.println("====================");
		// 2. entrySet() 이용하는 방법
		// 1) hm에 있는 키+밸류 세트로 entrySet이라는 공간에 담기 (키와 밸류값 세트의 집합) 
		//    * Entry == 키+밸류
		//    entrySet()
		Set<Entry<String, Snack>> entrySet = hm.entrySet();		
		
		// 2) 1번과정에서 작업된 entrySet을 Iterator에 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 이용해서 key, value값 알아내기
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /* (Entry) */itEntry.next();
			
			String key = /* (String) */entry.getKey();
			Snack value = /* (Snack) */entry.getValue();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		
		
		
		
		
		
		
	}

}



