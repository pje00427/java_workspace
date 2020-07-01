package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hell World";
		
		//     메소명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//    문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열에 전달받은 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");		// new String("Hell World!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";				// "Hell World!!!"
		System.out.println("str3 : " + str3);
		
		// 3. 문자열.toString() : String
		System.out.println("str1 : " + str1);
		
		// 4. 문자열.equals(Object obj) : boolean
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		// 5. 문자열.hashCode() : int
		System.out.println("str1의 해쉬코드 : " + str1.hashCode());
		System.out.println("str2의 해쉬코드 : " + str2.hashCode());
		System.out.println("str3의 해쉬코드 : " + str3.hashCode());
		
		// 6. 문자열.length() : int
		//    문자열의 길이를 리턴
		System.out.println("str1의 길이 : " + str1.length());
		
		System.out.println();
		
		// 7. 문자열.substring(int beginIndex) --> 문자열의 beginIndex위치에서부터 끝까지 문자열을 추출해서 리턴
		//    문자열.substring(int beginIndex, int endIndex) --> 문자열의 beginIndex ~ endIndex-1위치까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 6)); // 0 <=  < 6 
		
		
		// 8. 문자열.replace(char old, char new) : String
		//    문자열에서 old문자를 new문자로 변환한 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		
		// 9. 문자열.toUpperCase() / toLowerCase() : String
		//    문자열을 다 대문자 또는 소문자로 변환해서 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str5.toLowerCase());
		
		
		// 10. 문자열.trim() : String
		//     문자열의 앞 뒤 공백 제거한 문자열 리턴 (문자열 사이에 있는 공백 제거 x)
		String str6 = "    JA VA   ";
		System.out.println("str6 : " + str6);
		System.out.println("trim : " + str6.trim());
		
		// String --> char[]
		// 11. 문자열.toCharArray() : char[]
		//     문자열의 문자들을 char[]에 담아 해당 배열의 주소값 리턴
		String str7 = "Hello";
		char[] arr = str7.toCharArray(); // ['H', 'e', 'l', 'l', 'o']
		System.out.println(arr[0]);
		
		// char[] --> String
		// 12. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
		// 1 --> "1"
		// 0.23 --> "0.23"
		// true --> "true"
		
		
	}

}
