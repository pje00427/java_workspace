package com.method.hw1.sample;

public class NonStaticSample {
	
	/**
	 * 1. 반환값 없고 매개변수 없는 메소드
	 * -  실행 요청시 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
	 */
	public void printLottoNumbers() {
		
		int num[] = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");			
		}
		
		System.out.println();
	}
	
	/**
	 * 2. 반환값 없고 매개변수 있는 메소드
	 * -  실행 요청시 정수 하나, 문자 하나를 전달 받아 전달받은 문자를 전달받은 정수 갯수만큼 출력하는 메소드
	 * @param num
	 * @param c
	 */
	public void outputChar(int num, char c) {
		
		for(int i=0; i<num; i++) { // num 갯수 만큼 반복
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 3. 반환값 있고 매개변수 없는 메소드
	 * -  실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	 * @return 
	 */
	public char alphabette() {
		
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 58 + 65); // 65부터 58개의 랜덤값 (즉, 65~122 사이의 랜덤값)
			
			if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
				break;
			}
		}
		
		return (char)num;
	}

	/**
	 * 4. 반환값 있고 매개변수 있는 메소드
	 * -  실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을 
	 *    추출하여 리턴하는 메소드. 단, 문자열은 반드시 값이 있어야한다. 없으면 null 리턴처리
	 * @param str
	 * @param index1
	 * @param index2
	 * @return 
	 */
	public String mySubstring(String str, int index1, int index2) {
		
		
		String result = null;
		
		if(!str.equals("")) {
			
			// 방법1. 
			/*
			for(int i=index1; i<index2; i++) {
				
				result += str.charAt(i); 
			}
			*/
			
			// 방법2. 사실 위의 과정을 아래의 한 문장으로 처리할 수 있다. (String 클래스에서 제공하는 substring(시작인덱스, 끝인덱스))
			//		단, 시작인덱스 <=  < 끝인덱스   사이 범위의 문자열만을 추출해준다. 
			result = str.substring(index1, index2);
		}
		
		return result;
		
		
	 }
}
