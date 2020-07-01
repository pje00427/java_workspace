package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	/**
	 * 실습문제1. 길이가 10인 배열 생성 후 반복문을 이용하여 1에서부터 1씩 커지는 값을 순서대로 담은 후 출력하시오.
	 */
	public void practice1() {
		
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 1부터 10까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		*/
		// i번째 인덱스 값에 i+1 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	/**
	 * 실습문제2. 길이가 10인 배열 생성 후 10부터 1씩 감소하는 값을 순서대로 담은 후 출력하시오.
	 */
	public void practice2() {
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 10부터 1까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 3;
		arr[8] = 2;
		arr[9] = 1;
		*/
		// i번째 인덱스 값에 arr.length-i 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	/**
	 * 실습문제3. 사용자가 입력한 수만큼의 크기인 배열 생성 후 1부터 사용자가 입력한 수까지 1씩 증가하는 값을 순서대로 담은 후 출력하시오.
	 */
	public void practice3() {
		// 1. 사용자에게 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
		int[] arr = new int[size];
		
		// 3. 1부터 입력받은 값까지 배열에 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. 잘 들어갔는지 출력을 통해 확인
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/**
	 * 실습문제4. 길이가 5인 문자열 배열 선언 후 "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후 귤을 출력하시오.
	 */
	public void practice4() {
		// 1. 길이가 5인 String 배열 선언
		String[] arr = new String[5];
		
		// 2. 각 인덱스별 값 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이 (배열 선언 및 할당과 동시에 초기화)
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 3. 배열 인덱스를 활용해서 귤 출력
		System.out.println(arr[1]);
	}
	
	/**
	 * 실습문제5. 사용자에게 문자열과 검색할 문자를 입력받아 해당 문자가 어느 인덱스에 위치하는지, 몇 개 존재하는지 개수를 출력하시오.
	 * 			(난이도 중)
	 */
	public void practice5() {
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
		
		// 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당 
		char[] arr = new char[str.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		// 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악
		
		int count = 0; 	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄꺼임
		
		// 우선 반복문을 실행하기 전에 출력문좀..
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		// 인덱스마다 접근하기 위해 반복문 사용
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				System.out.print(i + " ");	// 해당 인덱스 이어서 출력
				
				count++;	// 그리고 count 1증가
			}
		}
		
		// 위에서 print()를 사용했기 때문에 개행이 안되어있을 것
		System.out.println();	// 개행을 해주자
		
		System.out.println(ch + "개수 : " + count);
		
		
		
	}
	
	/**
	 * 실습문제6. "월"~"일"까지 초기화된 문자열 배열 생성 후 사용자에게 0~6사이의 정수값 입력받은 후
	 * 			해당 사용자가 입력한 인덱스에 있는 요일 출력하시오.
	 * 			(단, 0~6사이의 정수가 아닌 경우 "잘못 입력하셨습니다." 출력)
	 */
	public void practice6() {
		
		// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
		if(num >= 0 && num <= 6) {
			
			// 해당 요일 출력
			System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	/**
	 * 실습문제7. 사용자가 입력한 정수만큼의 크기인 배열을 생성하고 
	 * 			그 배열의 크기만큼 사용자가 입력한 값들을 각 인덱스에 초기화 한 후 출력 (총 합계도 같이)
	 */
	public void practice7() {
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		
		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	
	/**
	 * 실습문제8. 사용자에게 3이상의 홀수를 입력받아 해당 입력받은 정수만큼의 크기인 배열 생성 후
	 * 			0번 인덱스 부터 배열의 중간(배열의길이/2)인덱스까지는 1부터 1씩 증가한 값으로 초기화하고
	 * 			배열의 중간이후부터 끝까지는 1씩 감소한 값으로 초기화 한 후 출력하시오.
	 * 			(단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요" 출력후 위의 내용 반복) 
	 * 
	 * 			(난이도 중상)
	 */
	public void practice8() {
		
		// 1. 사용자에게 3이상의 정수값을 입력받자 (반복)
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 2. 사용자가 입력한값이 유효한값인지 판별 (문제에 요구한 값인지 그게 아닌지)
			if(num >= 3 && num % 2 == 1) { // 3이상이고 뿐만아니라 홀수인경우 == 잘 입력했을 경우
				
				// 5 ==> 1 2 "3" 2 1		  => 배열의 중간 == 2번 인덱스
				// 7 ==> 1 2 3 "4" 3 2 1 	  => 배열의 중간 == 3번 인덱스
				// 9 ==> 1 2 3 4 "5" 4 3 2 1  => 배열의 중간 == 4번 인덱스
				//								  배열의 중간 == 배열의크기/2 번 인덱스
				
				// 2_1. 사용자가 입력한 수만큼의 크기로 배열 생성
				int[] arr = new int[num];
				
				// 2_2. 문제에서 요구한대로 배열에 값 담기
				int value = 1;
				for(int i=0; i<arr.length; i++) { // i == 인덱스
					arr[i] = value;
					
					if(i < arr.length / 2) {  // i인덱스값이 중간인덱스 이전까지
						value++; // 1증가
					}else {
						value--; // 1감소
					}
					
				}
				
				// 2_3. 잘 담겼는지 출력으로 확인
				for(int i=0; i<arr.length; i++) {
					
					if(i != arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.print(arr[i]);						
					}
					
				}
				
				// 2_4. 반복문을 빠져나가기
				break;		
				
				
			}else { // 그게아닌경우 (즉, 3이상이 아니거나 홀수가 아닌경우 == 잘못입력했을 경우) 
				
				// "다시입력해주세요" 출력 --> 반복 수행되게끔
				System.out.println("다시입력해주세요");
			}
			
		}
	}
	
	
	/**
	 * 실습문제9. 명시적으로 몇개의 치킨메뉴들이 들어있는 문자열 배열을 생성해 놓고
	 * 			사용자가 입력한 메뉴가 해당 배열에 있는 검색한 후 
	 * 			있으면 "XXXX 치킨 배달 가능", 없으면 "XXXX 치킨은 없는 메뉴입니다." 출력
	 * 			(난이도 중상)
	 */
	public void practice9() {
		// 1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 2. 사용자에게 치킨 메뉴 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 3. 반복문을 통해 배열의 0번 인덱스부터 마지막 인덱스까지 접근하여
		//    사용자가 입력한 메뉴와 동일한 메뉴가 있는지
		boolean flag = false; // 동일한 메뉴가 있는지 없는지 논리값을 받아주기 위한 변수 사용
		
		for(int i=0; i<chickens.length; i++) {
			
			if(chickens[i].equals(menu)) { // 사용자가 입력한 메뉴와 동일한 메뉴일 경우
				flag = true; // flag 값을 true로 바꿔주고
				break;       // 반복문을 빠져나간다. (생략가능하지만 true로 바뀐 후 더이상 반복문을 돌 필요가 없기때문에 효율적으로 사용한거임)
			}
		}
		
		if(flag) { // flag가 true일 경우 즉, 사용자가 입력한 메뉴가 존재할 경우
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
	}
	
	/**
	 * 실습문제10. 크기 10짜리인 배열 생성한 후 1~10 사이 범위의 랜덤값을 매번 발생시켜 각 인덱스에 초기화 한 후 출력
	 */
	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * 실습문제11. 위의 실습문제10번 내용에서 추가적으로 그 값들 중 최대값과 최소값을 출력하시오.
	 */
	public void practice11() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 개행
		
		// 3. 오름차순 정렬을 통해 최대값 최소값 알아내기
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// 오름차순 정렬 후 첫번째 인덱스값 == 최소값     /   마지막 인덱스값 == 최대값
		
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
				
	}
	
	/**
	 * 실습문제12. 크기 10짜리인 배열 생성 후 1~10사이의 랜덤값을 매번 발생시키면서 초기화 하되 
	 * 			  중복값이 없게 초기화한 후 출력하시오. 
	 */
	public void practice12() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { // 기존의 값들 중 동일한 값이 있을 경우 
					i--; // 다시 해당 인덱스에 값 초기화 할 수 있도록 i값 1감소시키기
					break; // 중복된 값 찾았기 때문에 궂이 다른 값들이랑 비교해볼 필요 없기때문에 빠져나가는게 좀더 효율적
				}
			}
		}
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * 실습문제13. 사용자에게 주민등록번호(문자열)를 입력받고 
	 * 			  해당 입력받은 문자열을 반복문을 통해 char배열(원본)에 옮겨 담은 후
	 * 			  복사본 배열을 만들어 원본배열에 있는 값들을 복사를 진행하는데
	 * 			  이때 성별자리 이후부터는 *로 값이 들어가게끔 복사 진행후 출력
	 * 			 (난이도 중)
	 */
	public void practice13() {
		
		// 1. 사용자에게 주민등록번호 문자열 입력받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();		// "xxxxxx-xxxxxxx"		==> 문자열의 길이 == 14
										//  012345678910111213
		
		// 2. 반복문을 이용하여 char[]에 문자열에 담겨있는 각각의 문자들을 옮겨 담기
		// 2_1. 문자열의 크기만큼의 char[] 배열 생성
		char[] origin = new char[str.length()];
		
		// 2_2. 반복문으로 0번~마지막인덱스까지 해당 문자들 옮겨 담기
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// 3. 복사본 char[] 생성 후 성별자리포함 그 전까지는 있는 그대로의 문자들을 옮겨 담고 그 이후부터는 *로 값이 들어가게끔
		char[] copy = new char[origin.length];
		// copy[0] = origin[0];
		// copy[1] = origin[1];
		// ....
		// copy[7] = origin[7];
		// copy[8] = '*';
		// copy[9] = '*';
		// ...
		// copy[마지막] = '*';
		for(int i=0; i<copy.length; i++) {
			
			if(i <= 7) { // 7번인덱스까지는
				copy[i] = origin[i];
			}else {
				copy[i] = '*';
			}
		}
		
			
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
		
	}
	
	
	/**
	 * 실습문제14. 로또 번호 자동 생성기 같은 프로그램을 만드시오
	 * 			  즉, 크기 6짜리인 배열 생성 한 후 1~45사이의 랜덤값을 매번 발생시켜 순서대로 초기화하되
	 * 			  중복값없이 초기화 진행한 후 오름차순 정렬하고 나서 출력하시오.
	 */
	public void practice14() {
		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		for(int i=0; i<lotto.length; i++) { // 비교 주체
			for(int j=i+1; j<lotto.length; j++) { // 비교 대상
				if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		// 4. 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	/**
	 * 실습문제 15. 사용자가 입력한 수만큼 크기의 문자열 배열 생성 한 후 
	 * 			  0번 인덱스부터 순차적으로 접근해서 사용자가 입력한 문자열로 초기화 진행,
	 * 			    마지막 인덱스까지 값 초기화 하고 난 후에는 
	 * 			    사용자에게 배열에 값을 더 넣을 지 물어봤을 때 y일 경우 몇개를 더 입력할 건지 입력받은 후
	 * 			    위의 내용 반복(사용자에게 입력받은 문자열 해당 인덱스에 초기화하는 내용)
	 * 			    단, n일 경우 더이상 입력받지 않고 최종 배열의 전체 값을 출력
	 * 			  (난이도 상)
	 */
	public void practice15() {
		
		// 1. 사용자에게 배열의 길이 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// 2. 사용자가 입력한 수만큼의 크기인 배열 생성
		String[] arr = new String[size];
		
		// 3. 각 인덱스별 기록하고자하는 문자열을 사용자에게 입력받은 후 해당 인덱스에 값 대입(초기화)
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 반복적으로 사용자에게 더 값을 입력받을 건지 물어본 후에 y인지 n인지 판별하는 반복문
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 사용자가 입력한 문자가 y인지 n인지 판별
			if(ch == 'y' || ch == 'Y') { // 더 값을 입력하겠다는 의사
				
				// 추가로 몇개 더 입력하고 싶은지 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				// 기존배열의 크기 + addSize 만큼의 새로운 배열 만들기
				String[] newArr = new String[arr.length + addSize];
				
				// newArr[0] = arr[0];
				// newArr[1] = arr[1];
				// newArr[2] = arr[2]; // 기존 배열에 존재했던 값들 옮겨 담은 후 그 후에는 추가적으로 입력받은 값 기록
				// newArr[3] = 사용자에게 입력받은 값;
				// newArr[4] = 사용자에게 입력받은 값;
				for(int i=0; i<newArr.length; i++) {
					if(i <= arr.length-1) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i + 1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr;
				
			}else { // 더이상 입력하지 않겠다는 의사밝힘 --> 반복문 빠져나가게끔
				break;
			}
		}
		
		// 최종적으로 arr이라는 배열에 담긴 값 출력
		System.out.println(Arrays.toString(arr));
		
	}
}






