package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// �ߺ�����
	
	public void method1() {
		
		// ����ڿ��� �Է¹��� ���� �Ź� 0���ε����������� �������� ���
		// ��, ������ ���� �߿��� ��� �Է¹��� ���� �ߺ��� ���� ���� ��� �ٽ� �Է¹ްԲ�
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i + "��° ������ : ");
			arr[i] = sc.nextInt(); // ����ü
			
			for(int j=0; j<i; j++) { // �񱳴��
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ����� �����մϴ�. �ٽ��Է����ּ���.");
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
					System.out.println("�ߺ����߻�! �ٽ÷������߻��մϴ�.");
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

}











