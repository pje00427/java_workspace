package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {
	
	private String title;		// 노래 제목명
	private String artist;		// 가수명
	
	// 기본생성자
	public Music() {
		
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		
		// M1.compareTo(M2)   => 양수값이 반환될 경우  M1과 M2 순서 변경됨!
		
		// this(앞)    vs    o(뒤)
		//   Music          Music
		
		// Collections.sort(정렬하고자하는리스트) 호출시
		// 내부적으로 리스트에 담겨있는 각각의 Music 객체들 가지고
		// 매변 이 compareTo 메소드가 실행됨!
		
		// 이 메소드의 반환값이 만약 양수일 경우 두 객체의 순서가 변경!
		
		// 가수명으로 오름차순 정렬하고자 한다면?
		
		// this(앞)의 가수명이  o(뒤)의 가수명보다 클 경우 => 순서변경해야됨! -> 양수값 반환!
		//      "하하"            "강보람"
		
		/*
		if(this.artist > o.artist) {
			return 1;
		}else {
			return 0; return -1;
		}
		*/
		
		// String 클래스에서 제공하는 compareTo 메소드를 호출하게 알아서 계산해서 반환해줌
		// this.가수명.compareTo(o.가수명)
		// 앞의 문자열이 뒤의 문자열보다 더 큰 경우 1을 반환
		// 앞의 문자열과 뒤의 문자열이 일치한 경우  0을 반환
		// 앞의 문자열이 뒤의 문자열보다 더 작을 경우 -1을 반환
		
		return this.artist.compareTo(o.artist);
	}

	/*
	@Override
	public int compareTo(Object o) {
		
		// M1.compareTo(M2)
		
		// this    vs    o
		// Music      Object
		
		
		return 양수; => 변경
	}
	*/
	
	
}



