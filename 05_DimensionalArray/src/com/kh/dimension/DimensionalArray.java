package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
	
	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것이 이차원 배열
	
	public void method1() {
		
		//int[] arr;
		//int arr[];
		//arr = new int[5];
		
		
		/*
		 * 1. 이차원 배열 선언
		 *    자료형 배열명[][];
		 *    자료형[] 배열명[];
		 *    자료형[][] 배열명;
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 * 2. 이차원 배열 할당
		 *    배열명 = new 자료형[행크기][열크기];
		 */
		arr3 = new int[2][4];
		
		// 위의 과정 동시에 진행 (선언과 동시에 할당)
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		
		System.out.println("행의 길이 : " + arr.length);
		
		// 각 행별로 열의 길이
		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);
		
		
		// *****
		// *****
		// *****
		
		// 바깥쪽 for문으로 --> 행의 갯수 만큼 반복
		// 안쪽 for문으로    --> 열의 갯수 만큼 반복
		
		for(int i=0; i<3; i++) { // 0에서 부터 2까지 1씩 증가하는 동안 반복 (3번)
			
			for(int j=0; j<5; j++) { // 0에서 부터 4까지 1씩 증가하는 동안 반복 (5번)
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=0; i<arr.length; i++) { // i == 행의 인덱스
			
			for(int j=0; j<arr[i].length; j++) { // j == 열의 인덱스
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
	
	
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		
		/*
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 *  ....
		 * arr[0][4] = 5;
		 * 
		 * arr[1][0] = 6;
		 * arr[1][1] = 7;
		 *  ....
		 * arr[1][4] = 10;
		 * 
		 * arr[2][0] = 11;
		 * arr[2][1] = 12;
		 *  ....
		 * arr[2][4] = 15;
		 * 
		 */
		
		int value = 1;
		for(int i=0; i<arr.length; i++) { // 행에 대한 for문( i == 행의인덱스 )
			
			for(int j=0; j<arr[i].length; j++) { // 열에 대한 for문 (j == 열의인덱스)
				arr[i][j] = value++;
				//value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				//System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		
		// 이차원 배열의 선언 및 할당과 동시에 초기화 
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			
			System.out.println();
			
		}
		
	}
	
	public void method4() {
		
		// 가변 배열
		// 행은 정해져있으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		
		int[][] arr = new int[3][]; // 가변 배열 할당
		
		//arr[0][0] = 10;
		
		// 0행은 열의 크기 2로 할당
		arr[0] = new int[2];
		// 1행은 열의 크기 1로 할당
		arr[1] = new int[1];
		// 2행은 열의 크기 3로 할당
		arr[2] = new int[3];
		
		
		/*
		 * 1 2 
		 * 3
		 * 4 5 6
		 * 
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 * 
		 * arr[1][0] = 3;
		 * 
		 * arr[2][0] = 4;
		 * arr[2][1] = 5;
		 * arr[2][2] = 6;
		 */
		
		int value = 1;
		for(int i=0; i<arr.length; i++) { // i == 행의인덱스
			for(int j=0; j<arr[i].length; j++) { // j == 열의 인덱스
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		
		// 1행 : 1 2
		// 2행 : 3
		// 3행 : 4 5 6
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i + 1 + "행 : ");
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void method6() {
		
		int[][] score = new int[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) { // i == 행의인덱스  0~1
			
			//int sum = 0;
			for(int j=0; j<score[i].length-1; j++) { // j == 열의인덱스  0~2
				
				if(i == 0) {
					System.out.print("국어점수 : ");
				}else {
					System.out.print("영어점수 : ");					
				}
				
				score[i][j] = sc.nextInt();
				//sum += score[i][j];
				score[i][3] += score[i][j];
			}
			//score[i][3] = sum;
			
		}
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%3d ", score[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	/**
	 * 4행 4열짜리 배열 생성 후 초록색 체크부분을 매번 1~10사이의 랜덤값으로 초기화 하면서
	 * 각 행별 총합을 마지막 열에 초기화, 각 열별 총합을 마지막 행에 초기화
	 * [3][3]에는 모든 랜덤값들의 총합으로 초기화 한 후 출력해보시오.
	 */
	public void hard() {
		
		int[][] arr = new int[4][4];
		
		// 행을 지정하는 for문 (0~2)
		for(int i=0; i<arr.length-1; i++) {
			// 열을 지정하는 for문(0~2)
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j]; // 각 행별 총합을 해당 행의 3번째 열에 매번 더해줌
				arr[3][j] += arr[i][j]; // 각 열별 총합을 3번째 행의 해당열에 매번 더해줌
				arr[3][3] += arr[i][j]; // 마지막행 마지막열에 매번 발생되는 랜덤값을 더해줌
				
			}			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	
	
}







 



