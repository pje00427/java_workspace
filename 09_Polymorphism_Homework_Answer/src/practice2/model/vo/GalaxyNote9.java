package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone{

	public GalaxyNote9() {
		
	}
	
	
	// ���� �������̵�
	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");
	}

	@Override
	public void takeaCall() {
		System.out.println("��ȭ�ޱ� ��ư�� ����");
	}

	@Override
	public void touch() {
		System.out.println("������, ������ ����");
	}

	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");
	}

	@Override
	public void picture() {
		System.out.println("1300�� ���ī�޶�");
	}
	
	@Override
	public void printMaker() {
		System.out.println("������ ��Ʈ 9�� �Ｚ ���� ����� ����.");
	}
}
