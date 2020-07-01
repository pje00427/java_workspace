package practice2.model.vo;

public interface Phone {

	// 메소드 : public abstract
	// 키워드를 생략해도 컴파일 시 자동으로 생략된 키워드 추가
	
	//public abstract void makeaCall();
	void makeaCall(); // 전화 걸기
	// 일반 전화 : 번호를 누름
	// 공중 전화 : 돈을 넣고 번호를 누름
	// 휴대 전화 : 번호를 누르고 통화버튼을 누름
	
	
	//public abstract void takeaCall();
	void takeaCall(); // 전화 받기
	// 일반전화 : 수화기를 든다.
	// 휴대전화 : 받기 버튼을 누른다.
	
}
