package practice2.model.vo;

public class V40 extends SmartPhone{

	public V40() {
		
	}
	
	@Override
	public void charge() {
		System.out.println("�������");
	}

	@Override
	public void picture() {
		System.out.println("1200, 1600�� ȭ�� Ʈ���� ī�޶�");
	}

	@Override
	public void touch() {
		System.out.println("������");
	}

	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");
	}

	@Override
	public void takeaCall() {
		System.out.println("��ȭ�ޱ� ��ư�� ����");
		
	}

	@Override
	public void printMaker() {
		System.out.println("V40�� LG���� ����� ����.");
	}
}
