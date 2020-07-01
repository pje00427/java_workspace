package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hell World";
		
		//     �޼Ҹ�(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		//    ���ڿ����� ���޹��� index ��ġ�� ���ڸ��� �����ؼ� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String
		//    ���ڿ��� ���޹��� ���ڿ��� �ϳ��� ���ļ� ����
		String str2 = str1.concat("!!!");		// new String("Hell World!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";				// "Hell World!!!"
		System.out.println("str3 : " + str3);
		
		// 3. ���ڿ�.toString() : String
		System.out.println("str1 : " + str1);
		
		// 4. ���ڿ�.equals(Object obj) : boolean
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		// 5. ���ڿ�.hashCode() : int
		System.out.println("str1�� �ؽ��ڵ� : " + str1.hashCode());
		System.out.println("str2�� �ؽ��ڵ� : " + str2.hashCode());
		System.out.println("str3�� �ؽ��ڵ� : " + str3.hashCode());
		
		// 6. ���ڿ�.length() : int
		//    ���ڿ��� ���̸� ����
		System.out.println("str1�� ���� : " + str1.length());
		
		System.out.println();
		
		// 7. ���ڿ�.substring(int beginIndex) --> ���ڿ��� beginIndex��ġ�������� ������ ���ڿ��� �����ؼ� ����
		//    ���ڿ�.substring(int beginIndex, int endIndex) --> ���ڿ��� beginIndex ~ endIndex-1��ġ������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 6)); // 0 <=  < 6 
		
		
		// 8. ���ڿ�.replace(char old, char new) : String
		//    ���ڿ����� old���ڸ� new���ڷ� ��ȯ�� ���ڿ� ����
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		
		// 9. ���ڿ�.toUpperCase() / toLowerCase() : String
		//    ���ڿ��� �� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ؼ� ����
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str5.toLowerCase());
		
		
		// 10. ���ڿ�.trim() : String
		//     ���ڿ��� �� �� ���� ������ ���ڿ� ���� (���ڿ� ���̿� �ִ� ���� ���� x)
		String str6 = "    JA VA   ";
		System.out.println("str6 : " + str6);
		System.out.println("trim : " + str6.trim());
		
		// String --> char[]
		// 11. ���ڿ�.toCharArray() : char[]
		//     ���ڿ��� ���ڵ��� char[]�� ��� �ش� �迭�� �ּҰ� ����
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
