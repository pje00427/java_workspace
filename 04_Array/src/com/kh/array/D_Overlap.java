package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// 중복제거
	
	public void method1() {
		
		// 사용자에게 입력받은 값을 매번 0번인덱스에서부터 차곡차곡 담기
		// 단, 기존의 값들 중에서 방금 입력받은 값과 중복된 값이 있을 경우 다시 입력받게끔
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i + "번째 정수값 : ");
			arr[i] = sc.nextInt(); // 비교주체
			
			for(int j=0; j<i; j++) { // 비교대상
				if(arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다. 다시입력해주세요.");
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void method2() {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복값발생! 다시랜덤값발생합니다.");
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

}











