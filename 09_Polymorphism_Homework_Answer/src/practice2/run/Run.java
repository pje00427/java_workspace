package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {
	
	public static void main(String[] args) {
		
		SmartPhone[] phone = new SmartPhone[2];
		
		// 다형성 적용
		// 각각의 인덱스에 GalaxyNote9, V40 객체 저장(다형성)

		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		
		for(int i=0; i<phone.length ; i++) {

			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();		
					
			System.out.println(); // 한 줄 띄기
		}
		
	}
}
