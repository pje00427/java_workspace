package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {
	
	// ������ڻ󰡰���
	// 1. ������ ���� ������ ��
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// ������ ��ü ���޹޾Ƽ� �ʵ忡 �ʱ�ȭ ��Ű�� �޼ҵ� 3��
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// �� �ʵ忡 ��䰪 ��ȯ ��Ű�� �޼ҵ� 3��
	public Desktop selectDesktop() {
		//System.out.println(desk);
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}


















