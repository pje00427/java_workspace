package com.method.hw3.sample;

public class StaticSample {
	
	// Field : �ʵ�
	private static String value;

	
	// setter/getter �޼ҵ� : �� �����, ��ȸ�� �޼ҵ�  (�ʵ尡 static�̸� set/getter��  static�̾�� �Ѵ�.)
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	// �߰����� �޼ҵ� : �ش� Ŭ������ �����ϴ� �ʵ带 ������ �۾��ؾߵǴ� �޼ҵ忩�� �ȴ�. (��, �굵 static)
	
	/**
	 * 1. ��ȯ�� ���� �Ű����� ���� �޼ҵ�
	 * -  value �ʵ� ���� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�
	 */
	public static void toUpper() {
		
		// ���� �迭�� �� ���ھ� �������
		/*
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = value.charAt(i);
		}
		*/
		
		char[] cArr = value.toCharArray(); // ��ǻ� ���� �ڵ���� ���� �� �ٷ� ���� �� �ִ�.
		
		for(int i=0; i<cArr.length; i++) {
			
			if(cArr[i] >= 'a' && cArr[i] <= 'z') { // �ҹ����� ��� 
				cArr[i] = (char)(cArr[i] - 32);	   // �빮�ڷ� �ٲ㼭 �ٽ� ����
			}
		}
		
		
		/*
		value = "";
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}*/
		
		
		value = String.valueOf(cArr); // ���� �ּ����� ��ǻ� ���� �� �ٷ� ���� �� �ִ�. 
		
		//value = value.toUpperCase(); // --> ���... ���� ��� ���� �� �ʿ���� ���� �� �ٷ� ���� ���� �� �ִ�. (StringŬ�������� �����ϴ� toUpperCase()�޼ҵ�)
	}
	
	/**
	 * 2. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	 * -  �ε����� �����ϳ��� ���� �ް� value �ʵ忡�� ���޹��� �ε��� ��ġ�� ���� ���޹��� ���ڷ� �����ϴ� static �޼ҵ�
	 * @param index
	 * @param c
	 */
	public static void setChar(int index, char c) {
		char[] cArr = value.toCharArray();
		
		cArr[index] = c;
		
		value = String.valueOf(cArr);
	}
	
	/**
	 * 3. ��ȯ�� �ְ� �Ű����� ���� static �޼ҵ�
	 * -  value �ʵ忡 ��ϵ� ���� ���� ���� ó��
	 * @return
	 */
	public static int valueLength() {
		
		return value.length();
	}
	
	/**
	 * 4. ��ȯ�� �ְ� �Ű����� �ִ� static �޼ҵ�
	 * -  ���ڿ� ���� ���޹޾� value �ʵ� ���� �ϳ��� ���ļ� ���� ó��
	 * @param str
	 * @return
	 */
	public static String valueConcat(String str) {
		return value + str;
		// return value.concat(str);
	}
	

}
