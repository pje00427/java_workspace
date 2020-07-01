package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem;
	private Book[] bList = new Book[5];
	
	{ // 샘플 데이터
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public LibraryManager() {
		
	}
	
	// 전달 받은 내 신상 정보를 등록
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	// 회원 레퍼런스 주소값 리턴
	public Member myPage() {
		return mem;
	}
	
	// 도서리스트 주소값 리턴
	public Book[] selectAll() {
		return bList;
	}
	
	// 도서검색 리스트 리턴
	public Book[] searchBook(String title) {
		Book[] searchList = new Book[5];
		int count=0;
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(title)) {
				searchList[count] = bList[i];
				count++;
			}
		}
		
		return searchList;
	}
	
	// 대여하기
	public int rentBook(int index) {
		
		int result = 0;
		
		if(bList[index] instanceof AniBook) { // 대여하고자 하는 도서가 AniBook일 경우 현재 회원 나이와 도서의 제한나이와 비교해야된다.  
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) { 
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) { // 대여하고자 하는 도서가 CookBook일 경우 해당 도서에 쿠폰이 있는지 판단해야된다. 
			if(((CookBook)bList[index]).getCoupon() == true){
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return result;
	}

}
