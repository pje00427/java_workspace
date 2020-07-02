package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("반갑습니다.");
		//hs.add(1); 
		// int형 -- <AutoBoxing> --> Integer -- <UpCasting> --> Object
		hs.add(new String("반갑습니다."));
		hs.add(new String("여러분"));
		hs.add(new String("안녕하세요"));
		hs.add(new String("여러분"));
		
		System.out.println(hs); // 순서유지X, 중복저장X(중복제거됨)
		
		// HashSet 공간에 객체가 추가될때마다
		// 기존에 담겨잇는 객체들과 hashCode()가 일치한지, equals()로 true인지 비교
		// hashCode() 일치, equals() 실행 결과  true인 경우 => 동일객체로 판단!!
		
		// String 클래스에서는 hashCode(), equals()가 오버라이딩(재정의 되어있음!)
		// 주소값이 아닌 실제 문자열값으로 동일한 문자열일 경우 동일한 hashCode 나오게
		// equals() 수행시 true 나오게끔
		
		
		HashSet<Person> hs2 = new HashSet<>();
		hs2.add(new Person("공유", 40, 100));
		hs2.add(new Person("김말똥", 26, 40));
		hs2.add(new Person("홍길동", 24, 20));
		hs2.add(new Person("공유", 40, 100));
		//hs2.add("강보람");
		
		System.out.println(hs2); // 순서유지X, 중복저장O..? => 동일한 객체로 판단이 안되서!!
								 // Person클래스에 동일한 객체로 판단되게끔 hashCode(), equals() 오버라이딩 한 후 중복저장X(중복제거)
		
		
		// Set  --> 무작위 객체가 담김 --> index의 개념없음
		//						  --> 반복문 쓸 때 index로 접근 불가!
		
		// 그럼 담겨있는 객체에 순차적으로 접근하고자 할때 ?
		
		// 1. for문 사용가능 (단, for each문으로 가능! 향상된 for문)
		for(Person p : hs2) { 
		//for(Object o : hs2) {
			//System.out.println(o);
			//System.out.println(((Person)o).getName());
			System.out.println(p.getName());
		}
		
		// 2. ArrayList에 옮겨 담은 뒤에 ArrayList 반복문 수행
		//ArrayList list = new ArrayList(); // 빈 리스트
		//list.addAll(hs2);
		ArrayList<Person> list = new ArrayList<>(hs2); // hs2에 있는 객체들 담긴 채로 리스트 생성
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("==========================");
		
		// 3. Iterator(반복자)를 이용해서 출력
		//    1) hs2  -->  it 옮겨담기          : iterator() 메소드 이용 (List, Set계열에서만 사용가능한 메소드)
		Iterator<Person> it = hs2.iterator();
		
		//    2) it에 담긴 객체들 하나씩 뽑아쓸 것
		//       it.next() : it공간에 담긴 객체 뽑아오는 메소드
		
		while(it.hasNext()) { // it에 next()로 뽑아올 객체가 남아있을 경우 true 그게아니면 false를 받아
			//System.out.println(((Person)it.next()).getName());
			System.out.println(it.next().getName());
		}
		
	}

}



