package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class ArtistDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) { // 제네릭스 Music 한 후 
		
		//	o1(앞)	vs	 o2(뒤)
		// Music		 Music
		
		// 가수명 내림차순 정렬
		// o2의 가수명이 o1의 가수명보다 클 경우 -> 순서변경 -> 양수반환
		/*
		if(o2.getArtist() > o1.getArtist()) {
			return 1;
		}else {
			return 0; return -1;
		}*/
		return o2.getArtist().compareTo(o1.getArtist());
	}
	
	/* 제네릭스 하기 전 
	@Override
	public int compare(Object o1, Object o2) {
		// compare(M1, M2);
		
		// o1	vs	 o2
		// Object	 Object
		
		return 0;
	}
	*/
	
	
}
