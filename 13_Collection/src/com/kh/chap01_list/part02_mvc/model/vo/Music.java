package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {
	
	private String title;		// �뷡 �����
	private String artist;		// ������
	
	// �⺻������
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
		
		// M1.compareTo(M2)   => ������� ��ȯ�� ���  M1�� M2 ���� �����!
		
		// this(��)    vs    o(��)
		//   Music          Music
		
		// Collections.sort(�����ϰ����ϴ¸���Ʈ) ȣ���
		// ���������� ����Ʈ�� ����ִ� ������ Music ��ü�� ������
		// �ź� �� compareTo �޼ҵ尡 �����!
		
		// �� �޼ҵ��� ��ȯ���� ���� ����� ��� �� ��ü�� ������ ����!
		
		// ���������� �������� �����ϰ��� �Ѵٸ�?
		
		// this(��)�� ��������  o(��)�� �������� Ŭ ��� => ���������ؾߵ�! -> ����� ��ȯ!
		//      "����"            "������"
		
		/*
		if(this.artist > o.artist) {
			return 1;
		}else {
			return 0; return -1;
		}
		*/
		
		// String Ŭ�������� �����ϴ� compareTo �޼ҵ带 ȣ���ϰ� �˾Ƽ� ����ؼ� ��ȯ����
		// this.������.compareTo(o.������)
		// ���� ���ڿ��� ���� ���ڿ����� �� ū ��� 1�� ��ȯ
		// ���� ���ڿ��� ���� ���ڿ��� ��ġ�� ���  0�� ��ȯ
		// ���� ���ڿ��� ���� ���ڿ����� �� ���� ��� -1�� ��ȯ
		
		return this.artist.compareTo(o.artist);
	}

	/*
	@Override
	public int compareTo(Object o) {
		
		// M1.compareTo(M2)
		
		// this    vs    o
		// Music      Object
		
		
		return ���; => ����
	}
	*/
	
	
}



