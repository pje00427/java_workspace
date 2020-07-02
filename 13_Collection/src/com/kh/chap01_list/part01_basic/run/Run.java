package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  * 컬렉션?
		 *  - 자바에서 "자료구조"개념이 이미 내제되어 있는 "프레임워크"
		 *  
		 *  > 자료구조 : 방대한 데이터를 효율적(구조적)으로 다룰 때 필요한 개념
		 *  > 프레임워크 : 데이터나 기능들을 다루기 쉽게 이미 정의되어있는 틀
		 *  
		 *  정리 : 방대한 데이터를 추가, 삭제, 수정, 정렬을 할 때 우리가 직접 반복문 또는 조건문으로 구현할 필요 없이 (직접 알고리즘을 짤 필요없이)
		 *  	   이런 알고리즘이 내제되어있는 컬렉션이라는걸 이용하면 기능처리가 간단하게 해결!!
		 *  
		 *  
		 *  * 배열의 단점
		 *  1. 배열사용시 크기지정을 반드시 해야만 했다. (뿐만 아니라 한번 지정된 크기는 변경 불가)
		 *  2. 배열 중간 위치에 데이터를 추가한다거나 삭제하는 경우 반복문을 통해 한칸 씩 땡겨주는 작업을 구현했을 것
		 *  3. 한 타입의 데이터만 저장 가능
		 *  
		 *  * 컬렉션의 장점
		 *  1. 크기를 지정해줄 필요도 없고 저장하는데에 있어서 크기의 제약없음!!
		 *  2. 중간에 값을 추가하거나 삭제하는 경우, 정렬에 있어서도 직접 알고리즘을 구현할 필요없음! 
		 *     이미 메소드로 만들어져서 제공됨!!
		 *  3. 여러 타입의 데이터를 저장 가능 (단, 객체만 저장가능)
		 *  
		 *  * 컬렉션 종류 (List, Set, Map)
		 *  
		 *  			List	  |		Set		|	    Map
		 *  ----------------------------------------------------------
		 *  보관데이터 |         데이터(객체)        | 고유한Key + 데이터(객체)
		 *  ----------------------------------------------------------
		 *  순서 유지   |     O       |      X      |        X
		 *  ----------------------------------------------------------
		 *  중복 저장   |     O       |      X      |     Key값이 X
		 *  ----------------------------------------------------------
		 *  
		 */
		
		// * ArrayList
		ArrayList<Music> list = new ArrayList<>(3); // 크기 지정할 수도 있긴함!! (안해도 됨! 안하면 기본사이즈 10인 배열)
		
		System.out.println(list); // 비어있는 상태임!!
		
		
		// E --> Element : 리스트에 담길 요소들(객체라고 생각하면 됨)
		
		// 1. add(E e) : boolean
		//    리스트의 끝에 객체를 추가하는 메소드
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		//list.add("끝");
		
		
		// 지정한 크기보다 크게 넣어도 오류나지 않음! --> 장점1. 크기에 제약이 없다.
		// 다양한 타입이 들어가도 상관없음		   --> 장점2. 여러타입 보관 가능 (단, 보안상 문제가 있을 수도 있다.)
		
		System.out.println(list); // 순서유지가 됨! --> index가지고 관리 --> 중복저장 가능
		
		// 2. add(int index, E e) : void
		//    인덱스를 지정하여 객체를 추가하는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		// 중간 위치에 객체를 추가할때 복잡하게 구현할 필요 없음 --> 장점3. 중간위치에 객체 추가시 내가 직접 알고리즘을 짤 필요없음
		
		System.out.println(list);
		
		
		// 3. set(int index, E e) : E old (수정전 객체)
		//    해당 인덱스의 데이터를 e로 변경해주는 메소드
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		// 4. size() : int
		//    컬렉션에 안에 몇 개의 데이터가 있는지 개수 반환해주는 메소드
		System.out.println("리스트의 갯수 : " + list.size());
		
		// 5. remove(int index) : E old (지워진 객체)
		//    해당 인덱스에 담긴 객체를 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list);
		System.out.println("리스트의 갯수 : " + list.size());
		
		// 6. get(int index) : E e
		//    해당 인덱스에 담겨있는 객체 가져오는 메소드
		//System.out.println(list.get(0)); // 배열로 치면 list[0]랑 똑같은 말
		//System.out.println(((Music)list.get(0)).getTitle()); // list[0].getTitle()
		//System.out.println(list.get(0).getTitle());
		
		//Music m = (Music)list.get(0); // 제네릭스 적용 전 --> 강제형변환 해야만 함 (왜? Object로 반환하기 때문)
		Music m = list.get(0); // 제네릭스 적용 후
		System.out.println(m);
		System.out.println(m.getTitle());
		
		// 7. subList(int index1, int index2) : List list
		//    첫번째 인덱스~두번째 인덱스-1 까지 추출해서 새로운 List로 반환해주는 메소드
		List<Music> sub = list.subList(0, 2); // 0 <=   < 2
		
		System.out.println(sub);
		
		// 8. addAll(Collection c) : boolean
		//    컬렉션을 통채로 뒤에 추가해주는 메소드
		list.addAll(sub);
		
		System.out.println(list);
		
		// 9. isEmpty() : boolean
		//    컬렉션이 비어있는지 묻는 메소드 (비어있으면 true, 비어있지 않으면 false)
		System.out.println(list.isEmpty());
		
		// 10. clear() : void
		//list.clear();
		System.out.println(list.isEmpty());
		
		/*
		 *  * 제네릭스<>를 사용하는 이유
		 *  1. 명시된 타입의 객체만을 저장하도록 제한을 두기 위해서
		 *  2. 저장된 객체를 꺼내서 사용할 때 매번 형변환하는 절차를 없애기 위해
		 */
		
		// 1. for loop문 (일반적인 for문)
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
			System.out.println(list.get(i).getTitle());
		}
		
		System.out.println("=============");
		
		// 2. for each문 (향상된 for문)
		for(Music music : list) { // Music music = list.get(0); --> Music music = list.get(1); --> ... 
			System.out.println(music);
		}
		
		
	}

}









