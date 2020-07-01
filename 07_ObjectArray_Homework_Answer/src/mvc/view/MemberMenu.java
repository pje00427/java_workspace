package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	
	// 기능 요청용 MemberController 클래스 객체 생성
	private MemberController mc = new MemberController();
	// 키보드로 값 입력받기 위한 Scanner 클래스 객체 생성
	private Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  화면1. 사용자가 제일 처음 보게될 메인 화면
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(menu) {
			case 1: insertMember(); break; // 신규 회원 등록하는 화면 호출
			case 2: searchMember(); break; // 회원 정보 검색하는 화면 호출
			case 3: updateMember(); break; // 회원 정보 수정하는 화면 호출
			case 4: deleteMember(); break; // 회원 정보 삭제하는 화면 호출
			case 5: printAllMember(); break; // 회원 정보 전체 출력하는 화면 호출
			case 9: return; // 프로그램을 종료해야되기 때문에 이 mainMenu 메소드 자체를 빠져나가야됨
			default: System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	/**
	 * 화면2. 신규 회원 정보 입력받고 추가 요청하는 화면
	 */
	public void insertMember() {
		
		// ** 현재 회원수 조회 요청 (Controller에 요청함)
		int memberCount = mc.getMemberCount();
		
		// 1. 현재 회원수(memberCount)가 최대 회원 수(SIZE)이상일 경우
		if(memberCount >= MemberController.SIZE) { 
			System.out.println("회원 수를 초과했습니다."); 
			return; // 더 이상 새로이 추가할 수 없기 때문에 return 처리
		}
		
		// 위의 조건이 false인경우 이쪽으로 넘어오게됨
		// 2. 아이디를 입력받아 아이디 중복체크 먼저 하기 
		System.out.print("아이디 : ");
		String userId = sc.nextLine(); 
		
		// ** 아이디 중복체크 요청 (Controller에 요청함)
		Member m = mc.checkId(userId); // m : 일치하는 회원 있었을 경우 해당 회원객체의 주소값, 일치하는 회원 없었을 경우 null
		
		// 2_1. 결과값이 null이 아닌 경우
		//		즉, 일치하는 회원이 있었을 경우 => 동일한 아이디가 존재하는 경우
		if(m != null) { 
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		
		}else { // 2_2. 그게 아닌경우 (결과값이 null인 경우)
				//      즉, 일치하는 회원이 없었을 경우 => 동일한 아이디가 존재하지 않는 경우
			
			// 본격적으로 나머지 회원정보 입력
			System.out.print("비밀번호 : ");
			String userPwd = sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
			Member newMem = new Member(userId, userPwd, name, age, gender, email);
			
			// ** 회원 정보 추가 요청(Controller에 요청함)
			mc.insertMember(newMem);
		
			System.out.println("성공적으로 회원등록이 되었습니다.");
		
		}
	}
	
	/**
	 *  화면3. 회원 정보 검색어 입력받고 검색요청하는 화면
	 */
	public void searchMember() {
		
		// 검색용 서브메뉴 => 반복처리
		while(true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 9번 선택했을 경우 => 이전메뉴로 => 즉, 이 메소드 자체를 빠져나가게
			if(menu == 9) {
				System.out.println("이전메뉴로 돌아갑니다.");
				return;
			}
			
			System.out.print("\n검색 내용 : ");
			String search = sc.nextLine();
			
			// ** 회원 정보 검색 요청 (Controller에 요청함)
			Member searchMember = mc.searchMember(menu, search); // 예를들어, (2, "강보람")를 전달시 이름으로 "강보람"을 검색하겠다는 의미
																 // searchMember : 검색 결과 존재할 시 해당 검색된 회원 객체, 검색결과 없으면 null
			
			// 1_1. 결과 값이 null인 경우 => 검색된 회원 객체가 없다란 소리
			if(searchMember == null) {
				System.out.println("검색된 결과가 없습니다.");
			}else { // 1_2. 결과값이 null이 아닌 경우 => 검색된 회원 객체가 searchMember에 담겨있다란 소리
				System.out.println("====== 검색결과 ======");
				System.out.println(searchMember.information());
			}
			
			System.out.println();
			
		}
	}
	
	/**
	 * 화면4. 회원 정보 수정하는 화면 
	 */
	public void updateMember() {
		
		// 수정용 서브메뉴 => 반복처리
		while(true) {
			
			System.out.println("====== 회원 정보 수정 ===== ");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 9번 선택했을 경우 => 이전메뉴로 => 즉, 이 메소드 자체를 빠져나가게
			if(menu == 9) {
				System.out.println("이전메뉴로 돌아갑니다.");
				return;
			}
			
			// 1. 우선은 변경할 회원의 아이디 입력받은 후 해당 회원 객체 조회해오기
			System.out.print("\n변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			// ** 아이디로 회원 조회 요청 (Controller에 요청함)
			Member m = mc.checkId(userId); // m : 일치하는 회원 찾은 경우 해당 회원 객체, 못찾은 경우 null
			
			// 1_1. 결과 값이 null인 경우 => 일치하는 회원 못찾음
			if(m == null) {
				System.out.println("변경할 회원에 대한 정보가 존재하지 않습니다.");
				
			}else { // 1_2. 결과값이 null이 아닌 경우 => 일치하는 회원 찾음 => 본격적으로 수정하면 됨
				
				System.out.println("기존 정보 : " + m.information()); // 우선 현재 회원의 기존 정보 출력
				
				System.out.print("\n변경 내용 : ");
				String update = sc.nextLine(); // 수정할 값 입력받기
				
				// ** 해당 회원 정보 수정 요청 (Controller에 요청)
				mc.updateMember(m, menu, update); // (검색된 회원객체, 1, "pass01") 전달시
												  // 해당 회원의 비밀번호 "pass01"로 수정하겠다는 의미
				
				System.out.println("회원의 정보가 변경되었습니다.");
			}
		}
	}
	
	/**
	 * 화면5. 회원 정보 삭제요청하는 화면
	 */
	public void deleteMember() {
		
		// 1. 우선은 삭제할 회원의 아이디 입력받은 후 해당 회원 객체 조회해오기
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		// ** 아이디로 회원 조회 요청 (Controller에 요청함)
		Member m = mc.checkId(userId); // m : 일치하는 회원 찾은 경우 해당 회원 객체, 못찾은 경우 null
		
		// 1_1. 결과 값이 null인 경우 => 즉, 삭제할 회원을 찾지 못한 경우
		if(m == null) {
			System.out.println("삭제할 회원에 대한 정보가 존재하지 않습니다.");
			
		}else { // 1_2. 결과값이 null이 아닌 경우 => 즉, 삭제할 회원을 찾은 경우
			System.out.println("기존 정보 : " + m.information());
			
			System.out.print("\n정말 삭제하겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0); // 사용자가 입력한 문자열을 대문자로 변환한 후 0번인덱스 추출
			
			if(ch == 'Y') { // 삭제하겠다는 의사 밝혔을 경우
				
				// ** 해당 회원 삭제 요청 (Controller에 요청함)
				mc.deleteMember(userId); 
				
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
		}
	}
	
	/**
	 * 화면6. 회원 정보 출력요청하는 화면
	 */
	public void printAllMember() {
		
		// ** 회원 정보 조회 요청 (Controller에 요청함)
		Member[] mem = mc.getMem(); // 해당 회원들이 담겨있는 배열 받아오기
		
		// 배열의 크기만큼 반복 x, 현재 회원 수만큼 반복
		for(int i=0; i<mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
	}
	

}
