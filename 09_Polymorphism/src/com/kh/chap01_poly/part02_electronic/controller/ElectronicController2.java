package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicController2 {
	
	// 2. ������ �������� ��� 
	
	// �θ�Ÿ�� �迭�� �پ��� �ڽİ�ü�� ���� ���� --> �ϳ��� ������ �� ����
	private Electronic[] elec = new Electronic[3];
	
	private int count = 0;
	
	
	// �� ��ü�� �޾Ƽ� �ʱ�ȭ���ִ� �޼ҵ� 1��
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	// �� ��ü�� ��ȯ���ִ� �޼ҵ� 1��
	public Electronic select(int index) {
		//System.out.println(elec[index]);
		
		return elec[index];
	}
	
	public Electronic[] select() {
		return elec;
	}
	

}




