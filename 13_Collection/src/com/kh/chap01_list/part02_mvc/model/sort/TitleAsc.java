package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class TitleAsc implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		// ��� ��������
		// o1(��)�� ����� o2(��)�� ����� Ŭ ��� --> �������� --> �����ȯ
		
		
		return o1.getTitle().compareTo(o2.getTitle());
		
	}

	
}
