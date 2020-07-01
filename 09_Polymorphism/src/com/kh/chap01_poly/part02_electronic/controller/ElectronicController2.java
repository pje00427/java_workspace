package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicController2 {
	
	// 2. 다형성 적용했을 경우 
	
	// 부모타입 배열로 다양한 자식객체들 수용 가능 --> 하나로 관리할 수 있음
	private Electronic[] elec = new Electronic[3];
	
	private int count = 0;
	
	
	// 각 객체들 받아서 초기화해주는 메소드 1개
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	// 각 객체들 반환해주는 메소드 1개
	public Electronic select(int index) {
		//System.out.println(elec[index]);
		
		return elec[index];
	}
	
	public Electronic[] select() {
		return elec;
	}
	

}




