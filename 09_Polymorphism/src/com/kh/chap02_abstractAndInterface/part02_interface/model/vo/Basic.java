package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Basic {
	
	// �߻�Ŭ���� --> �Ϲ� ���(�ʵ� + �޼ҵ�) + [�߻�޼ҵ�]
	// �������̽� --> ����ʵ� + �߻�޼ҵ�
	
	/* public static final */ int NUM = 10; // interface�� ��õǾ����� ��� ���� ���� (�˾Ƽ� ����ʵ�� �ν�)
	
	/* public abstract */ void eat();

	/* public abstract */ void sleep();	// �������� (�˾Ƽ� �߻�޼ҵ�� �ν�)
	
	
	
}
