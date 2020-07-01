package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// view : 시각적인 요소 (출력 및 입력)
public class MusicMenu {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	/**
	 * 메인메뉴 : 프로그램 실행시 제일 처음 보여지는 화면
	 */
	public void mainMenu() {

		while (true) {

			System.out.println("\n==welcome 별밤==");
			System.out.println("1. 신규 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 곡 정렬하기");
			System.out.println("0. 프로그램  종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			System.out.println();

			switch (menu) {
			case 1:
				insertMusic();
				break; // 같은 클래스 내에 메소드 호출 한다는 의미
			case 2:
				selectList();
				break;
			case 3:
				searchMusic();
				break;
			case 4:
				deleteMusic();
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("프로그램 종료하겠습니다.");
				return; // 이메소드를 호출했던 곳으로 빠져나감
			default:
				System.out.println("잘못 입력 하셨습니다. 다시입력 해주세요 ");
			}

		}

	}

	/**
	 * 서브화면1. 신규 곡을 추가하는 화면
	 */

	public void insertMusic() {

		System.out.println("==곡 추가==");
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수입력 : ");
		String artist = sc.nextLine();

		// 곡 추가 요청(MusicController 메소드 호출)

		mc.insertMusic(title, artist);
		System.out.println("성공적으로 추가 되었습니다.");

	}

	/**
	 * 서브화면 2.곡 전체 조회용 화면
	 * 
	 */
	public void selectList() {
		System.out.println("== 곡 리스트 ==");
		// 곡 전체 조회 (MusicController 메소드 호출하겠다)
		ArrayList<Music> list = mc.selectList(); // 코드 곱씹어 보기

		// 반환받은 list가 비어있을 경우 => 존재하는 곡이 없습니다.
		if(list.isEmpty()) {
			System.out.println("존재하는 곡이 없습니다");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i)); // 배열이랑 다름 
			}
		}
		
	}
		// 반환받은 list가 비어있지 않을 경우 => 반복문을 통해서 해당 Music객체를  출력 
		/**
		 * 서브화면3. 특정 곡 검색하는 화면
		 */
		public void searchMusic() {
			
			System.out.println("====곡 검색===");
			System.out.println("1. 곡명으로 검색");
			System.out.println("2. 가수명으로 검색");
			System.out.println("3. 곡명+가수명으로 검색");
			System.out.println("메뉴 : ");
			int search = sc.nextInt();
			
			System.out.print("검색할 곡명 키워드 : ");
			String keyword = sc.nextLine();
			// keyword 검색요청! MusicController 메소드 호출
			
			ArrayList<Music>searchList = mc.searchMusic(search,keyword);
			
			// 비어 있을 경우 --> 검색 결과가 없습니다.
			if(searchList.isEmpty()) {
				System.out.println("검색 결과가 없습니다. ");
			}else {
				for( Music m : searchList ) {
					System.out.println(m);
				}
			}
			// 비어있지 않을 경우 --> 반복문을 통해서 searchList에 담겨있는 Music객체들 출력	
		}
		/**
		 * 서브화면 4. 특정 곡 입력한 후 삭제 요청하는 화면
		 */
		public void deleteMusic() {
			
			System.out.println("===곡 삭제===");
			System.out.print("삭제할 곡 명 : ");
			String title = sc.nextLine();
			
			// 삭제요청 !! (MusicController 메소드 호출!)
			int result = mc.deleteMusic(title);
			
			if(result == 0) {
				System.out.println("삭제할 곡을 찾지 못했습니다.");
			}else {
				System.out.println("성공적으로 삭제하였습니다.");
			}
			
			// 추가, 조회, 수정, 삭제 
			// C	R	U	D
			//create read update delate
			
		}

	
}
