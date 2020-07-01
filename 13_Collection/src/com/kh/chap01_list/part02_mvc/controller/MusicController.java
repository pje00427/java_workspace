package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// controller : 사용자가 요청한 기능을 처리하는 역할
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectList() {
		return list;
	}

	public ArrayList<Music> searchMusic(int search, String keyword) {
		// list.get(0).getTitle()에 keyword가 포함되어있나요?
		// list.get(1).getTitle()에 keyword가 포함되어있나요?
		// ...마지막 인덱스

		// 검색된 결과(키워드가 포함되어있는 Music객체를 보관할 리스트)
		ArrayList<Music> searchList = new ArrayList<>();

		if (search == 1) {

			for (int i = 0; i < list.size(); i++) {
				// equals() : 일치하는지, contains() : 포함되어있는지
				if (list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else if (search == 2) {
			for (int i = 0; i < list.size(); i++) {
				// equals() : 일치하는지, contains() : 포함되어있는지
				if (list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { // 곡명+가수명으로 검색 
			for (int i = 0; i < list.size(); i++) {
				// equals() : 일치하는지, contains() : 포함되어있는지
				if (list.get(i).getArtist().contains(keyword)
						|| list.get(i).getTitle().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
			}
			
		}
		return searchList;
	}

	public int deleteMusic(String title) {

		int result = 0; // 출력할수 없기 때문에, 변수에 담아서 리턴한다

		for (int i = 0; i < list.size(); i++) {
			// Music 객체의 제목 == title
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				// System.out.println("성공적으로 삭제되었습니다.");
				result = 1;
			}
		}
		// result = 0 이면 if문 실행 안된 것 (삭제할 곡을 찾지 못한 것)
		// result = 1 이면 성공적으로 삭제가 된 것
		return result;

	}
}
