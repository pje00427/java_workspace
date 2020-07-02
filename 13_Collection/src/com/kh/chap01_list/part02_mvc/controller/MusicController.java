package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part02_mvc.model.sort.ArtistDesc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleAsc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleDesc;
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
		
		// list.get(0).getTitle()에  keyword 포함되어있나요?
		// list.get(1).getTitle()에  keyword 포함되어있나요?
		// .... 마지막 인덱스 
		
		// 검색된 결과(키워드가 포함되어있는 Music객체들)를 보관할 리스트
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(search == 1) { // 곡명으로 검색
			for(int i=0; i<list.size(); i++) {
				// equals() : 일치하는지 , contains() : 포함되어있는지
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else if(search == 2) { // 가수명으로 검색
			for(int i=0; i<list.size(); i++) {
				// equals() : 일치하는지 , contains() : 포함되어있는지
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else { // 곡명+가수명으로 검색
			
			for(int i=0; i<list.size(); i++) {
				// equals() : 일치하는지 , contains() : 포함되어있는지
				if(list.get(i).getArtist().contains(keyword) 
						|| list.get(i).getTitle().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
			}
			
		}
		
		return searchList;
		
	}
	
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			// Music객체의 제목 == title
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				//System.out.println("성공적으로 삭제되었습니다.");
				result = 1;
			}
		}
		
		// result == 0 	=> 삭제할 곡을 찾지 못한거임
		// result == 1	=> 성공적으로 삭제가 된거임
		
		return result;
		
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) { // 수정할곡을 찾은 경우
				
				// 첫번째 방법. 해당 Music객체에 setter메소드 이용해서 변경
				/*
				// list.get(i) 의 가수명 => upArtist
				list.get(i).setArtist(upArtist);
				// list.get(i) 의 곡명 => upTitle
				list.get(i).setTitle(upTitle);
				*/
				
				// 두번째 방법. 일치하는 곡의 인덱스를 가지고 새로운 Music객체 바꾸는 방법
				list.set(i, new Music(upTitle, upArtist));
				
				//System.out.println("성공적으로  수정되었습니다.");
				result = 1;
			}
			
		}
		
		// result => 0 => 수정할곡을 찾지 못함..
		// result => 1 => 성공적으로 수정됨..
		
		return result;
		
	}
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// 복사본 리스트 sortList 만들기
		ArrayList<Music> sortList = new ArrayList<>(); // 빈 리스트
		sortList.addAll(list); // 기존의 list에 있는거 통째로 옮겨담기
		
		// Collections.sort(정렬시키고자하는리스트);
		
		if(menu == 1) { // 가수명 오름차순 정렬
			Collections.sort(sortList);
			
		}else if(menu == 2) { // 가수명 내림차순 정렬
			Collections.sort(sortList, new ArtistDesc());
			
		}else if(menu == 3) { // 곡명 오름차순 정렬
			Collections.sort(sortList, new TitleAsc());
			
		}else { // 곡명 내림차순 정렬
			Collections.sort(sortList, new TitleDesc());
			
		}
		
		
		return sortList;
		
		
	}
	
}














