package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone{

	public GalaxyNote9() {
		
	}
	
	
	// 강제 오버라이딩
	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("전화받기 버튼을 누름");
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
	}

	@Override
	public void charge() {
		System.out.println("고속 충전, 고속 무선 충전");
	}

	@Override
	public void picture() {
		System.out.println("1300만 듀얼카메라");
	}
	
	@Override
	public void printMaker() {
		System.out.println("갤럭시 노트 9은 삼성 에서 만들어 졌다.");
	}
}
