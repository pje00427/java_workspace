package com.method.hw2.sample;

public class NonStaticSample {
	
	/**
	 * 1. 매개변수도 있고 반환값도 있는 메소드
	 * -  전달받은 정수의 갯수만큼 int 배열 공간을 할당하여
	 *    임의의 1부터 100까지의 값으로 값을 기록하고 그 배열 리턴
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
	 * 2. 매개변수 있고 반환값 없는 메소드
	 * -  배열을 전달받아 해당 배열에 담겨있는 값 출력
	 * @param arr
	 */
	public void display(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 3. 매개변수 있고 반환값 없는 메소드
	 * -  배열과, 두 정수의 인덱스를 전달받아 두 인덱스의 값을 교환시켜주는 메소드
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
	 * 4. 매개변수 있고 반환값 없는 메소드
	 * -  위에서 작성한 swap 메소드를 이용하여 배열의 값들을 내림차순으로 정렬 처리하고 
	 *    위의 display 메소드를 이용하여 배열 출력
	 * @param arr
	 */
	public void sortDescending(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j); // 배열과 두개의 인덱스값 전달하면 바꿔주는 메소드인 swap메소드를 호출하자!
				}
			}
		}
		
		display(arr); // 배열만 전달하면 해당 배열 내용을 출력해주는 display 메소드 호출하자! 
	}
	
	/**
	 * 5. 매개변수 있고 반환값 없는 메소드
	 * -  위에서 작성한 swap 메소드를 이용하여 배열의 값들을 오름차순으로 정렬 처리하여 출력
	 *    위의 display 메소드를 이용하여 배열 출력
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
	 * 6. 매개변수 있고 반환값도 있는 메소드 
	 * -  문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴
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
	 * 7. 매개변수 있고 반환값도 있는 메소드
	 * -  정수 두개를 전달받아, 두 수중 작은 값에서 큰 값 사이의 정수들의 합계를 구해서 리턴
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
	 * 8. 매개변수 있고 반환값도 있는 메소드
	 * -  문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
	 * @param str
	 * @param index
	 * @return
	 */
	public char pCharAt(String str, int index) {
		
		return str.charAt(index);
	}
	
	/**
	 * 9. 매개변수 있고 반환값도 있는 메소드
	 * -  두 개의 문자열을 전달받아 하나의 문자열로 합쳐서 리턴하는 메소드
	 * @param str1
	 * @param str2
	 * @return
	 */
	public String pConcat(String str1, String str2) {
		
		// 방법1.
		//return str1 + str2;
		
		// 방법2.
		return str1.concat(str2);
	}

}
