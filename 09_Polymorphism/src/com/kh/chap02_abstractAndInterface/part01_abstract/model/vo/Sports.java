package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

// �θ� Ŭ����
public abstract class Sports {
	
	// �����ϴ� ��� ��
	private int personCount;
	
	public Sports() {
		
	}
	
	public Sports(int personCount) {
		this.personCount = personCount;
	}
	
	public int getPersonCount() {
		return personCount;
	}
	
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}
	
	@Override
	public String toString() {
		return "����� : " + personCount;
	}
	
	public abstract void rule();
	
	/*
	 * * �߻�޼ҵ� (�̿ϼ��� �޼ҵ� == ���뱸���� �Ǿ����� ���� �޼ҵ�)
	 * => {} ����ΰ� ���� �����Ǿ����� ���� ����
	 * => �̿ϼ��� �߻�޼ҵ带 ������ �ִٴ� �Ҹ��� �� Ŭ���� ���� �̿ϼ��� Ŭ������!! => �߻�Ŭ������ �ؾߵ�!! 
	 * 
	 */

}
