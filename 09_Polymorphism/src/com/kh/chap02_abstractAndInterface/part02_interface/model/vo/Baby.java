package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Baby extends Person implements Basic {
	
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// �ƱⰡ ���� ���� --> ������ 3���� / �ǰ��� 1����
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}

	@Override
	public void sleep() {
		
		// �ƱⰡ ���� �� --> �ǰ��� 3����
		super.setHealth(super.getHealth() + 3);
		
	}
	
		
}
