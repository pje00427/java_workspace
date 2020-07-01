package practice2.model.vo;

// 휴대전화
public interface CellPhone extends Phone, Camera {
	
	//배터리 충전
	public abstract void charge();
	//저속 충전, 일반충전, 고속충전, 무선충전 등
}
