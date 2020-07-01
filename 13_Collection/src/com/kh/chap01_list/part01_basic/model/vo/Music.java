package com.kh.chap01_list.part01_basic.model.vo;

public class Music {

	private String title;	// 노래 제목 
	private String artist;	// 가수명
	
	// 기본생성자
	public Music() {
		
	}
	// 매개변수 생성자

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

	public void setArtist(String artist) { //o
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	
	
}
