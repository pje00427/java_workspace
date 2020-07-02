package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class TitleDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		// ��� �������� ����
		// o2(��)�� ����� o1(��)�� ����� �� Ŭ��� --> �������� -> �����ȯ
		
		return o2.getTitle().compareTo(o1.getTitle());
	}

	
}





