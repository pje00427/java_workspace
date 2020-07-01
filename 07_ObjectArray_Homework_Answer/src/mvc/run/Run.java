package mvc.run;

import mvc.view.MemberMenu;

public class Run {
	public static void main(String[] args) {
		new MemberMenu().mainMenu();
		
		System.out.println("회원관리 프로그램을 종료합니다.");
	}
}
