package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// �迭 : "���� �ڷ����� ��"���� �ϳ��� ������ ���� �� �ִ� ����
	//       ����� ������ �ε����� ������ (�ε����� 0���� ���۵�)
	
	public void method1() {
		
		// * �迭�� �� ������
		
		// �뷮�� �����͸� �����ϰ��� �� �� ������ ������ ���� �����ؾߵ�..
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// ����ϰ��� �Ҷ��� 
		/*
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		*/
		
		// �� �հ踦 ���ϰ��� �� ����
		int sum = num1 + num2 + num3 + num4 + num5;
		
		/*
		 * 1. �迭 ���� (�������� ������ ������ �迭�� ����ڴ�!!)
		 *    �ڷ��� �迭��[];
		 *    �ڷ���[] �迭��;
		 */
		
		//int a; // ���� ����
		
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. �迭 �Ҵ� (�� �迭�� �� ���� ������ �����Ұ��� ũ�������ϴ� ���� , �� ������ŭ ���� �������)
		 *    �迭�� = new �ڷ���[�迭ũ��];
		 */
		//arr = new int[5];
		
		// * �迭 ����� ���ÿ� �Ҵ� (�迭 ����� ���ÿ� ũ�������ϰڴ�.)
		
		int a = 10;
		
		int[] arr = new int[5];
		
		
		/*
		 * 3. �� �ʱ�ȭ(����)
		 *    �迭��[�ε���] = ��;
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		//arr[5] = 5;
		//arr[6] = 6;
		
		
		// �迭 ���� : �ݺ����� ����� �� �ִٴ� ����
		
		//for(int i=0; i<=4; i++) { // 0�������� 4���� 1�� �����ϴ� ���� �ݺ��� ����ǰԲ�
		//for(int i=0; i<=arr.length-1; i++) { // �迭�� ���� : �迭��.length
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// ��¹� ���� �ݺ�������
		//for(int i=0; i<=arr.length-1; i++) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
	}
	
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		/*
		 *  ���� �ٷ� ���� �� �ִ� ������ �Ϲݺ������ ����ϰ�
		 *  �ּҰ��� ��� �ִ� ������ ��������(���۷�������)��� ǥ��
		 *  
		 *  �⺻�ڷ���(boolean, char, byte, short, int, long, float, double)���� ������ ����
		 *  => ��¥ ���� �ٷ� ��� ���� => �׳� �Ϲ� ����
		 *  
		 *  �� �� �ڷ���(String, int[], char[], double[], Scanner ... )���� ������ ����
		 *  => �ּҰ��� ��� ���� => ���۷��� ����(��������)
		 */
		
		System.out.println("i : " + i);
		System.out.println("iArr : " + iArr);	
		
		double[] dArr = new double[10];
		System.out.println("dArr : " + dArr);
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2
		
		double[] dArr = new double[5]; // 0~4
		
		// �迭 �����ϰ� ũ������(�Ҵ�)���� �� ����
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		// ���� �ʱ�ȭ�� ���� ���� �ʾƵ� �� ��µ�
		// ��?
		
		// Heap�̶�� ������ ���� ������� ������ �� ����
		// ���� ������ ������� �� 
		// JVM�� �⺻������ �ʱ�ȭ(����)�� ��������
		
	}
	
	
	public void method4() {
		
		int[] iArr = new int[5];
		
		/*
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		*/
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(iArr);
		System.out.println(iArr.hashCode()); // �ּҰ��� 10����
		
	}
	
	public void method5() {
		// ����ڿ��� �Է¹��� ����ŭ �迭�� ũ�� �����ϱ�!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println(dArr.hashCode());
		System.out.println(dArr.length);
		System.out.println(dArr[0]);
		
	}
	
	
	public void method6() {
		
		int[] iArr = new int[5]; // 0~4
		
		/*
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		*/
		
		int num = 2;
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = num;
			num += 2;
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr�� �ؽ��ڵ尪 : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// �迭 ũ�� ���� �� �־�� ( ���� ��ü�� �ȵ�!! )
		//iArr[5] = 12;
	
		
		// * �迭�� ���� ū ����
		// 1. �ѹ� ������ �迭�� ũ��� ���� �Ұ�!!
		//    �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� �ٽ� �������ߵ�
		iArr = new int[7];
		
		System.out.println("===���� �� iArr===");
		System.out.println("iArr�� �ؽ��ڵ尪 : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		/*
		 * ������ �����ϰ� �ִ� ������ ����� ���ο� �� ����
		 * 
		 * ������ ������ ���� �迭�� Heap������ �յն��ٴ�
		 * => ���� �ð��� ������ "������ �÷���" ������
		 *    (�ڵ� �޸� ����)
		 */
		
		// ���� ����Ǿ��ִ� ���� ������ �Ѵٸ� ���?
		iArr = null; // �ƹ��͵� �������� �ʰڴ�!
		
		System.out.println("===���� ���� iArr===");
		System.out.println(iArr);
		System.out.println(iArr.hashCode());
		
		// null.xxx()  =>  NullPointerException
		
	}
	
	public void method7() {
		
		// �迭 ���� �� �Ҵ� �� ���ÿ� �ʱ�ȭ �ع�����
		int[] arr1 = {1, 2, 3, 4}; // ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ��(���������� �����)
		int[] arr2 = new int[] {1, 2, 3, 4};
		
		System.out.println("arr1�� ���� : " + arr1.length);
		System.out.println("arr2�� ���� : " + arr2.length);
		
		System.out.println(arr1 == arr2);
		
	}
	
	
	public void method8() {
		
		String[] sArr = new String[5]; // 0~4
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print("�����ϴ� ���� �Է� : ");
			sArr[i] = sc.nextLine();
		}
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	
	public void method9() {
		
		// ũ�� 10¥�� int���迭 ���� �� ������(1~100)�� ��Ƽ� ����ϱ�
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			//System.out.println("arr[" + i + "] : " + arr[i]);
			System.out.printf("arr[%d] : %d\n", i, arr[i]);			
		}
		
	}
	
	public void method10() {
		
		// 3���� ����ڿ��� Ű�� ������ �Է¹޾� �迭�� ��Ƶΰ�
		// 3���� Ű�� ����, ��հ��� ���Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		for(int i=0; i<heights.length; i++) {
			System.out.print("Ű �Է� : ");
			heights[i] = sc.nextDouble();
		}
		
		// sum += heights[0];
		// sum += heights[1];
		// sum += heights[2];
		
		double sum = 0.0;
		for(int i=0; i<heights.length; i++) {
			sum += heights[i];
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / heights.length);
		
	}
	
	
	public void method11() {
		
		// 1. ����ڿ��� �Է¹��� ����ŭ �迭�� ũ�� ���� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ũ�� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 2. 0~�������ε������� ������(1~100) ���� ��
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 0~�������ε��������� �� ��� �ϸ鼭 ¦������ ���� ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		// 4. ���� ���
		System.out.println("\n¦���� ���� : " + sum);
		
	}
	
	
	public void method12() {
		
		// ����ڿ��� ���ڿ� �Է¹��� �� �� ���ڵ��� char�迭�� ���
		
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); // "apple"
		
		// 2. char�迭 ���� (�迭 ũ�� == ���ڿ��� ���̸�ŭ)
		char[] arr = new char[str.length()];
		
		// 3. �ش� ���ڿ����� �� �ε����� ���ڸ� char�迭�� 0~�������ε������� ���
		// arr[0] = str.charAt(0);
		// arr[1] = str.charAt(1);
		// ....
		// arr[����-1] = str.charAt(����-1);
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
					
		// 4. 0~�������ε��������� �� ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}










