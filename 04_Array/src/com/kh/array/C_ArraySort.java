package com.kh.array;

import java.util.Arrays;

// 배열 정렬
public class C_ArraySort {
	
	public void method1() {
		
		// 변수를 가지고 값을 변경해보자
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("==== 변경전 ====");
		System.out.println("num1 : " + num1); // 10
		System.out.println("num2 : " + num2); // 20
		
		/*
		num1 = num2;  // num1=20
		num2 = num1;  // num2=20
		*/
		
		// 임시로 한개의 값을 보관해둘 변수
		int temp = num1;	// temp=10;
		
		num1 = num2;  // num1=20
		num2 = temp;  // num2=10
		
		System.out.println("==== 변경후 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
				
	}
	
	public void method2() {
		
		int[] arr = {2, 1, 3};
		
		// arr[0] <-> arr[1]
		
		/*
		arr[0] = arr[1]; // arr[0] = 1
		arr[1] = arr[0]; // arr[1] = 1
		*/
		
		int temp = arr[0]; // temp=2
		
		arr[0] = arr[1];   // arr[0]=1
		arr[1] = temp;	   // arr[1]=2
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		
		// 비교주체(빨) => 바깥쪽 for문   (i)
		// 비교대상(파) => 안쪽 for문	(j)
		
		/*
		 *비교주체(뒤) 비교대상(앞)
		 *  i=0일때     j=x
		 *  i=1일때     j=0~0
		 *  i=2일때     j=0~1
		 *  i=3일때     j=0~2
		 *  i=4일때     j=0~3
		 *  
		 *  i=0~마지막인덱스     j=0~i-1
		 */
		
		// 오름차순 정렬
		
		// 1. "비교 주체"를 정하는 for문
		for(int i=0; i<arr.length; i++) {
			// 2. 해당 비교 주체와 비교할 "비교 대상"을 정하는 for문
			for(int j=0; j<i; j++) { // 0에서부터 i-1값 까지 1씩 증가 반복
				
				// 비교주체(뒤)가 비교대상(앞)보다 작을 경우 값 교환
				if(arr[i] < arr[j]) {
					
					System.out.println("==교환발생==");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		// 정렬 잘 되었는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method5() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		Arrays.sort(arr); // 오름차순 정렬 끝
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		System.out.println(Arrays.toString(arr));
		
		// Arrays.toString(배열) --> "[" + 배열의 각인덱스값들 + ", " + ... + "]"
		
		
	}
	
	
}




