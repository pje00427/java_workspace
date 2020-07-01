package com.method.hw1.sample;

public class NonStaticSample {
	
	/**
	 * 1. ��ȯ�� ���� �Ű����� ���� �޼ҵ�
	 * -  ���� ��û�� 1~45������ ������ ���� 6���� �ߺ����� �ʰ� �߻����� ����ϴ� �޼ҵ�
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
	 * 2. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	 * -  ���� ��û�� ���� �ϳ�, ���� �ϳ��� ���� �޾� ���޹��� ���ڸ� ���޹��� ���� ������ŭ ����ϴ� �޼ҵ�
	 * @param num
	 * @param c
	 */
	public void outputChar(int num, char c) {
		
		for(int i=0; i<num; i++) { // num ���� ��ŭ �ݺ�
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 3. ��ȯ�� �ְ� �Ű����� ���� �޼ҵ�
	 * -  ���� ��û�� ���ĺ� ������ ������ �����ڸ� �ϳ� �߻����� �����ϴ� �޼ҵ�
	 * @return 
	 */
	public char alphabette() {
		
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 58 + 65); // 65���� 58���� ������ (��, 65~122 ������ ������)
			
			if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
				break;
			}
		}
		
		return (char)num;
	}

	/**
	 * 4. ��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	 * -  ���� ��û�� ���ڿ��� �����ε���, ���ε����� ���޹޾� �ش� �ε��� ������ ���ڿ��� 
	 *    �����Ͽ� �����ϴ� �޼ҵ�. ��, ���ڿ��� �ݵ�� ���� �־���Ѵ�. ������ null ����ó��
	 * @param str
	 * @param index1
	 * @param index2
	 * @return 
	 */
	public String mySubstring(String str, int index1, int index2) {
		
		
		String result = null;
		
		if(!str.equals("")) {
			
			// ���1. 
			/*
			for(int i=index1; i<index2; i++) {
				
				result += str.charAt(i); 
			}
			*/
			
			// ���2. ��� ���� ������ �Ʒ��� �� �������� ó���� �� �ִ�. (String Ŭ�������� �����ϴ� substring(�����ε���, ���ε���))
			//		��, �����ε��� <=  < ���ε���   ���� ������ ���ڿ����� �������ش�. 
			result = str.substring(index1, index2);
		}
		
		return result;
		
		
	 }
}
