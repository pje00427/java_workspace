package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10; // 최대 회원 수
	private int memberCount;		   // 현재 회원 수
	private Member[] mem = new Member[SIZE]; // 회원 객체들을 보관할 객체 배열 (크기는 최대회원수만큼)
	
	// 아래의 {} 이 부분을 초기화 블럭이라고 한다. 
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim123@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yoo55@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon01@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin89@naver.com");
		memberCount = 5; // 5명의 회원을 추가해놨으니 memberCount도 5로 초기화
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		
		// 전달받은 회원의 아이디와 일치하는 회원 객체를 보관할 변수
		Member m = null;
		
		// 현재 회원수만큼 반복
		for(int i=0; i<memberCount; i++	) {
			if(mem[i].getUserId().equals(userId)) { // 일치하는 회원을 찾았을 경우
				m = mem[i]; // 해당 회원 객체를 m에 대입
			}
		}
		
		return m; // 만일 못찾았을 경우 null이 리턴, 찾았을 경우 해당 회원 객체 리턴
	}
	
	
	public void insertMember(Member m) {
		
		mem[memberCount++] = m; // 전달받은 회원 객체 배열의 memberCount인덱스 번째에 담고 memberCount수 1증가
		
	}
	
	public Member searchMember(int menu, String search) { // 검색메뉴번호, 검색어
		
		// 검색된 회원 객체를 보관할 변수
		Member searchMember = null;
		
		// 현재 회원수만큼 반복
		for(int i=0; i<memberCount; i++) {
			
			// 전달받은 메뉴 번호가 1인 경우 아이디로 검색
			if(menu == 1) {
				
				if(mem[i].getUserId().equals(search)) { // 해당 순차적으로 접근한 객체의 아이디와 검색어와 비교
					searchMember = mem[i];
				}
				
			}else if(menu == 2) { // 전달받은 메뉴 번호가 1인 경우 이름으로 검색
				
				if(mem[i].getName().equals(search)) { // 해당 순차적으로 접근한 객체의 이름과 검색어와 비교
					searchMember = mem[i];
				} 
				
			}else { // 전달받은 메뉴 번호가 3인 경우 이메일로 검색
				
				if(mem[i].getEmail().equals(search)) { // 해당 순차적으로 접근한 객체의 이메일과 검색어와 비교
					searchMember = mem[i];
				}
				
			}
			
		}
		
		return searchMember; // 만일 검색된 회원이 없을 경우 null이 리턴, 검색된 회원이 있을 경우 해당 회원 객체 리턴
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		// 메뉴 번호가 1인 경우 비밀번호 수정
		if(menu == 1) {
			m.setUserPwd(update); // 해당 전달된 회원 객체의 비밀번호를 update문자열로 변경
			
		}else if(menu == 2) { // 메뉴 번호가 2인 경우 이름 수정
			
			m.setName(update); // 해당 전달된 회원 객체의 이름을 update문자열로 변경
			
		}else { // 메뉴 번호가 3인 경우 이름 수정
			
			m.setEmail(update); // 해당 전달된 회원 객체의  이메일을 update문자열로 변경
		}
		
	}
	
	public void deleteMember(String userId) {
		
		// 현재 회원수만큼 반복
		for(int i=0; i<memberCount; i++) {
			
			 // 해당 순차적으로 접근한 객체의 아이디와 전달된 삭제할 회원의 아이디와 비교
			if(mem[i].getUserId().equals(userId)) {// 일치하는 회원 찾았을 경우 
				
				// 만약 해당 회원이 마지막 칸에 있었을 경우
				if(i == memberCount-1) {
					mem[i] = null; // 해당 회원 삭제만하면 됨 (null로 대입)
					
				}else { // 만약 해당 회원이 마지막 칸이 아닌 중간에 있었을 경우 => 뒤에 있는 회원들을 한칸씩 앞으로 땡겨야 된다.
					
					for(int j=i; j<memberCount-1; j++) {
						mem[j] = mem[j+1];
					}
					mem[memberCount - 1] = null;
				}
				
				break; // 삭제 한 후 이 반복문 빠져나가야됨
			}
		}
		
		memberCount--; // 한명 삭제 했으므로 memberCount 수 1감소
	}
	
}
