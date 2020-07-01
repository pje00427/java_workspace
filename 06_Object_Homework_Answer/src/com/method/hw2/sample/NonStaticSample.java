package com.method.hw2.sample;

public class NonStaticSample {
	
	/**
	 * 1. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	 * -  ���޹��� ������ ������ŭ int �迭 ������ �Ҵ��Ͽ�
	 *    ������ 1���� 100������ ������ ���� ����ϰ� �� �迭 ����
	 * @param length
	 * @return
	 */
	public int[] intArrayAllocation(int length) {
		
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.random()*100) + 1;
			
			arr[i] = num;
		}
		
		return arr;
	}
	
	/**
	 * 2. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	 * -  �迭�� ���޹޾� �ش� �迭�� ����ִ� �� ���
	 * @param arr
	 */
	public void display(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 3. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	 * -  �迭��, �� ������ �ε����� ���޹޾� �� �ε����� ���� ��ȯ�����ִ� �޼ҵ�
	 * @param arr
	 * @param idx1
	 * @param idx2
	 */
	public void swap(int[] arr, int idx1, int idx2) {
		
		int temp = arr[idx1];
		
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	/**
	 * 4. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	 * -  ������ �ۼ��� swap �޼ҵ带 �̿��Ͽ� �迭�� ������ ������������ ���� ó���ϰ� 
	 *    ���� display �޼ҵ带 �̿��Ͽ� �迭 ���
	 * @param arr
	 */
	public void sortDescending(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j); // �迭�� �ΰ��� �ε����� �����ϸ� �ٲ��ִ� �޼ҵ��� swap�޼ҵ带 ȣ������!
				}
			}
		}
		
		display(arr); // �迭�� �����ϸ� �ش� �迭 ������ ������ִ� display �޼ҵ� ȣ������! 
	}
	
	/**
	 * 5. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	 * -  ������ �ۼ��� swap �޼ҵ带 �̿��Ͽ� �迭�� ������ ������������ ���� ó���Ͽ� ���
	 *    ���� display �޼ҵ带 �̿��Ͽ� �迭 ���
	 * @param arr
	 */
	public void sortAscending(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
		display(arr); 
	}
	
	/**
	 * 6. �Ű����� �ְ� ��ȯ���� �ִ� �޼ҵ� 
	 * -  ���ڿ��� ���� �ϳ��� ���޹޾�, ���ڿ��� ���Ե� ������ ������ ����
	 * @param str
	 * @param c
	 * @return
	 */
	public int countChar(String str, char c) {
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) 
				count++;
		}
		
		return count;
	}
	
	/**
	 * 7. �Ű����� �ְ� ��ȯ���� �ִ� �޼ҵ�
	 * -  ���� �ΰ��� ���޹޾�, �� ���� ���� ������ ū �� ������ �������� �հ踦 ���ؼ� ����
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int totalValue(int num1, int num2) {
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int sum = 0;
		
		for(int i=min+1; i<max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	/**
	 * 8. �Ű����� �ְ� ��ȯ���� �ִ� �޼ҵ�
	 * -  ���ڿ��� �ε����� ���޹޾�, �� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
	 * @param str
	 * @param index
	 * @return
	 */
	public char pCharAt(String str, int index) {
		
		return str.charAt(index);
	}
	
	/**
	 * 9. �Ű����� �ְ� ��ȯ���� �ִ� �޼ҵ�
	 * -  �� ���� ���ڿ��� ���޹޾� �ϳ��� ���ڿ��� ���ļ� �����ϴ� �޼ҵ�
	 * @param str1
	 * @param str2
	 * @return
	 */
	public String pConcat(String str1, String str2) {
		
		// ���1.
		//return str1 + str2;
		
		// ���2.
		return str1.concat(str2);
	}

}
