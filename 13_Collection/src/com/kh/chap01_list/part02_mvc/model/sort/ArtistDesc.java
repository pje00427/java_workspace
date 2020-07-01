package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class ArtistDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) { // ���׸��� Music �� �� 
		
		//	o1(��)	vs	 o2(��)
		// Music		 Music
		
		// ������ �������� ����
		// o2�� �������� o1�� �������� Ŭ ��� -> �������� -> �����ȯ
		/*
		if(o2.getArtist() > o1.getArtist()) {
			return 1;
		}else {
			return 0; return -1;
		}*/
		return o2.getArtist().compareTo(o1.getArtist());
	}
	
	/* ���׸��� �ϱ� �� 
	@Override
	public int compare(Object o1, Object o2) {
		// compare(M1, M2);
		
		// o1	vs	 o2
		// Object	 Object
		
		return 0;
	}
	*/
	
	
}
