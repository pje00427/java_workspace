package com.method.hw3.sample;

public class StaticSample {
	
	// Field : 필드
	private static String value;

	
	// setter/getter 메소드 : 값 변경용, 조회용 메소드  (필드가 static이면 set/getter도  static이어야 한다.)
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	// 추가적인 메소드 : 해당 클래스에 존재하는 필드를 가지고 작업해야되는 메소드여야 된다. (즉, 얘도 static)
	
	/**
	 * 1. 반환값 없고 매개변수 없는 메소드
	 * -  value 필드 값을 모두 대문자로 바꾸는 static 메소드
	 */
	public static void toUpper() {
		
		// 문자 배열에 한 문자씩 나눠담기
		/*
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = value.charAt(i);
		}
		*/
		
		char[] cArr = value.toCharArray(); // 사실상 위의 코드들을 다음 한 줄로 끝낼 수 있다.
		
		for(int i=0; i<cArr.length; i++) {
			
			if(cArr[i] >= 'a' && cArr[i] <= 'z') { // 소문자일 경우 
				cArr[i] = (char)(cArr[i] - 32);	   // 대문자로 바꿔서 다시 대입
			}
		}
		
		
		/*
		value = "";
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}*/
		
		
		value = String.valueOf(cArr); // 위의 주석문을 사실상 다음 한 줄로 끝낼 수 있다. 
		
		//value = value.toUpperCase(); // --> 사실... 위의 모든 과정 다 필요없이 다음 한 줄로 모든걸 끝낼 수 있다. (String클래스에서 제공하는 toUpperCase()메소드)
	}
	
	/**
	 * 2. 반환값 없고 매개변수 있는 메소드
	 * -  인덱스와 문자하나를 전달 받고 value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	 * @param index
	 * @param c
	 */
	public static void setChar(int index, char c) {
		char[] cArr = value.toCharArray();
		
		cArr[index] = c;
		
		value = String.valueOf(cArr);
	}
	
	/**
	 * 3. 반환값 있고 매개변수 없는 static 메소드
	 * -  value 필드에 기록된 글자 갯수 리턴 처리
	 * @return
	 */
	public static int valueLength() {
		
		return value.length();
	}
	
	/**
	 * 4. 반환값 있고 매개변수 있는 static 메소드
	 * -  문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴 처리
	 * @param str
	 * @return
	 */
	public static String valueConcat(String str) {
		return value + str;
		// return value.concat(str);
	}
	

}
