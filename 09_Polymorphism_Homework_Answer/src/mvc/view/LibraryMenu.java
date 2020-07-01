package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;


public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("******** 환영합니다 *******");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		
		lm.insertMember(new Member(name, age, gender));
		
		while(true) {
			System.out.println("======= 메뉴 ======");
			System.out.println("1. 마이페이지");		// lm의 myPage()
			System.out.println("2. 도서 전체 조회");		// selectAll()
			System.out.println("3. 도서 검색");			// searchBook()
			System.out.println("4. 도서 대여하기");		// rentBook()
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1: System.out.println(lm.myPage()); break;
				case 2: selectAll(); break;
				case 3: searchBook(); break;
				case 4: rentBook(); break;
				case 9: System.out.println("프로그램을 종료합니다. "); return;
				default: System.out.println("다시 입력해주세요."); break;
			}
		}
	}
	
	// 전체조회 메소드
	public void selectAll() {
		// lm의 selectAll()메소드를 통해 전체 도서 목록 받아오기
		Book[] bList = lm.selectAll();
		
		System.out.println("===== 도서 목록 =====");
		// for문을 이용하여 출력 + i를 이용하여 인덱스도 같이 출력
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString()); // 오버라이딩이기 때문에 동적바인딩으로 실행
		}
	}
	
	// 도서검색 메소드
	public void searchBook() {
		System.out.print("검색할 제목 입력 : ");
		String title = sc.next();
		
		// 입력받은 검색 제목을 lm의 searchTitle()메소드로 전달, 그 검색 결과 검색한 도서목록을 받아옴
		Book[] searchList = lm.searchBook(title);
		
		// 향상된 for문(for each문)를 이용하여 출력
		int count = 0;
		for(Book bk : searchList) {
			if(bk != null) {
				System.out.println(bk);
				count++;	// 존재할 경우 count 1증가
			}
		}
		
		if(count == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	// 도서대여 메소드
	public void rentBook() {
		
		selectAll();
		
		System.out.print("대여 할 도서 선택 : ");
		int index = sc.nextInt();
		
		// 대여할 도서 인덱스 번호를 lm의 rentBook()메소드로 전달하고 그 결과 값을 받아옴
		int result = lm.rentBook(index);
		
		// 각각에 해당하는 출력문을 출력하기 위해 result 받았음
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이제한으로 대여 불가능 입니다.");
		}else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
		}
	}

}
