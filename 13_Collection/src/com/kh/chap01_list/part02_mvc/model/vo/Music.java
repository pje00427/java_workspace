package com.kh.chap01_list.part02_mvc.model.vo;

public class Music {

	private String title;	// �뷡 ���� 
	private String artist;	// ������
	
	// �⺻������
	public Music() {
		
	}
	// �Ű����� ������

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