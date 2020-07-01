package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// controller : ����ڰ� ��û�� ����� ó���ϴ� ����
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectList() {
		return list;
	}

	public ArrayList<Music> searchMusic(int search, String keyword) {
		// list.get(0).getTitle()�� keyword�� ���ԵǾ��ֳ���?
		// list.get(1).getTitle()�� keyword�� ���ԵǾ��ֳ���?
		// ...������ �ε���

		// �˻��� ���(Ű���尡 ���ԵǾ��ִ� Music��ü�� ������ ����Ʈ)
		ArrayList<Music> searchList = new ArrayList<>();

		if (search == 1) {

			for (int i = 0; i < list.size(); i++) {
				// equals() : ��ġ�ϴ���, contains() : ���ԵǾ��ִ���
				if (list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else if (search == 2) {
			for (int i = 0; i < list.size(); i++) {
				// equals() : ��ġ�ϴ���, contains() : ���ԵǾ��ִ���
				if (list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { // ���+���������� �˻� 
			for (int i = 0; i < list.size(); i++) {
				// equals() : ��ġ�ϴ���, contains() : ���ԵǾ��ִ���
				if (list.get(i).getArtist().contains(keyword)
						|| list.get(i).getTitle().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
			}
			
		}
		return searchList;
	}

	public int deleteMusic(String title) {

		int result = 0; // ����Ҽ� ���� ������, ������ ��Ƽ� �����Ѵ�

		for (int i = 0; i < list.size(); i++) {
			// Music ��ü�� ���� == title
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				// System.out.println("���������� �����Ǿ����ϴ�.");
				result = 1;
			}
		}
		// result = 0 �̸� if�� ���� �ȵ� �� (������ ���� ã�� ���� ��)
		// result = 1 �̸� ���������� ������ �� ��
		return result;

	}
}
