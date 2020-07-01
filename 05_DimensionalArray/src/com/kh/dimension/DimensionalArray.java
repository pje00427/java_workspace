package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
	
	// ������ �迭 : ������ �迭 �������� �ϳ��� ���� ���� ������ �迭
	
	public void method1() {
		
		//int[] arr;
		//int arr[];
		//arr = new int[5];
		
		
		/*
		 * 1. ������ �迭 ����
		 *    �ڷ��� �迭��[][];
		 *    �ڷ���[] �迭��[];
		 *    �ڷ���[][] �迭��;
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 * 2. ������ �迭 �Ҵ�
		 *    �迭�� = new �ڷ���[��ũ��][��ũ��];
		 */
		arr3 = new int[2][4];
		
		// ���� ���� ���ÿ� ���� (����� ���ÿ� �Ҵ�)
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		
		System.out.println("���� ���� : " + arr.length);
		
		// �� �ະ�� ���� ����
		System.out.println("���� ���� : " + arr[0].length);
		System.out.println("���� ���� : " + arr[1].length);
		System.out.println("���� ���� : " + arr[2].length);
		
		
		// *****
		// *****
		// *****
		
		// �ٱ��� for������ --> ���� ���� ��ŭ �ݺ�
		// ���� for������    --> ���� ���� ��ŭ �ݺ�
		
		for(int i=0; i<3; i++) { // 0���� ���� 2���� 1�� �����ϴ� ���� �ݺ� (3��)
			
			for(int j=0; j<5; j++) { // 0���� ���� 4���� 1�� �����ϴ� ���� �ݺ� (5��)
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=0; i<arr.length; i++) { // i == ���� �ε���
			
			for(int j=0; j<arr[i].length; j++) { // j == ���� �ε���
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
		for(int i=0; i<arr.length; i++) { // �࿡ ���� for��( i == �����ε��� )
			
			for(int j=0; j<arr[i].length; j++) { // ���� ���� for�� (j == �����ε���)
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
		
		// ������ �迭�� ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ 
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			
			System.out.println();
			
		}
		
	}
	
	public void method4() {
		
		// ���� �迭
		// ���� ������������ �� �࿡ ���� ���� ������ �������� ���� ����
		
		int[][] arr = new int[3][]; // ���� �迭 �Ҵ�
		
		//arr[0][0] = 10;
		
		// 0���� ���� ũ�� 2�� �Ҵ�
		arr[0] = new int[2];
		// 1���� ���� ũ�� 1�� �Ҵ�
		arr[1] = new int[1];
		// 2���� ���� ũ�� 3�� �Ҵ�
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
		for(int i=0; i<arr.length; i++) { // i == �����ε���
			for(int j=0; j<arr[i].length; j++) { // j == ���� �ε���
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
		
		
		// 1�� : 1 2
		// 2�� : 3
		// 3�� : 4 5 6
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i + 1 + "�� : ");
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void method6() {
		
		int[][] score = new int[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) { // i == �����ε���  0~1
			
			//int sum = 0;
			for(int j=0; j<score[i].length-1; j++) { // j == �����ε���  0~2
				
				if(i == 0) {
					System.out.print("�������� : ");
				}else {
					System.out.print("�������� : ");					
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
	 * 4�� 4��¥�� �迭 ���� �� �ʷϻ� üũ�κ��� �Ź� 1~10������ ���������� �ʱ�ȭ �ϸ鼭
	 * �� �ະ ������ ������ ���� �ʱ�ȭ, �� ���� ������ ������ �࿡ �ʱ�ȭ
	 * [3][3]���� ��� ���������� �������� �ʱ�ȭ �� �� ����غ��ÿ�.
	 */
	public void hard() {
		
		int[][] arr = new int[4][4];
		
		// ���� �����ϴ� for�� (0~2)
		for(int i=0; i<arr.length-1; i++) {
			// ���� �����ϴ� for��(0~2)
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j]; // �� �ະ ������ �ش� ���� 3��° ���� �Ź� ������
				arr[3][j] += arr[i][j]; // �� ���� ������ 3��° ���� �ش翭�� �Ź� ������
				arr[3][3] += arr[i][j]; // �������� ���������� �Ź� �߻��Ǵ� �������� ������
				
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







 



