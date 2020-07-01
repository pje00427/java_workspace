package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	/**
	 * �ǽ�����1. ���̰� 10�� �迭 ���� �� �ݺ����� �̿��Ͽ� 1�������� 1�� Ŀ���� ���� ������� ���� �� ����Ͻÿ�.
	 */
	public void practice1() {
		
		// 1. ���̰� 10�� �迭�� ������
		int[] arr = new int[10];
		
		// 2. 1���� 10������ ���� �ݺ����� ���� ������� ����
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		*/
		// i��° �ε��� ���� i+1 ���� �־��ָ� �ǰڱ���!
		
		// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		// 3. �� ������ ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	/**
	 * �ǽ�����2. ���̰� 10�� �迭 ���� �� 10���� 1�� �����ϴ� ���� ������� ���� �� ����Ͻÿ�.
	 */
	public void practice2() {
		// 1. ���̰� 10�� �迭�� ������
		int[] arr = new int[10];
		
		// 2. 10���� 1������ ���� �ݺ����� ���� ������� ����
		/*
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 3;
		arr[8] = 2;
		arr[9] = 1;
		*/
		// i��° �ε��� ���� arr.length-i ���� �־��ָ� �ǰڱ���!
		
		// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		// 3. �� ������ ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	/**
	 * �ǽ�����3. ����ڰ� �Է��� ����ŭ�� ũ���� �迭 ���� �� 1���� ����ڰ� �Է��� ������ 1�� �����ϴ� ���� ������� ���� �� ����Ͻÿ�.
	 */
	public void practice3() {
		// 1. ����ڿ��� ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		// 2. �迭�� �Ҵ��� ���� ����ڰ� �Է��� ����(size)��ŭ�� ũ��� �Ҵ�
		int[] arr = new int[size];
		
		// 3. 1���� �Է¹��� ������ �迭�� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. �� ������ ����� ���� Ȯ��
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/**
	 * �ǽ�����4. ���̰� 5�� ���ڿ� �迭 ���� �� "���", "��", "����", "������", "����"�� �ʱ�ȭ �� �� ���� ����Ͻÿ�.
	 */
	public void practice4() {
		// 1. ���̰� 5�� String �迭 ����
		String[] arr = new String[5];
		
		// 2. �� �ε����� �� �ʱ�ȭ
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		// ���� 1�� 2�� ������ ���ÿ� ���� �� ���� �ִ�. �Ʒ��� ���� (�迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ)
		//String[] arr = {"���", "��", "����", "������", "����"};
		
		// 3. �迭 �ε����� Ȱ���ؼ� �� ���
		System.out.println(arr[1]);
	}
	
	/**
	 * �ǽ�����5. ����ڿ��� ���ڿ��� �˻��� ���ڸ� �Է¹޾� �ش� ���ڰ� ��� �ε����� ��ġ�ϴ���, �� �� �����ϴ��� ������ ����Ͻÿ�.
	 * 			(���̵� ��)
	 */
	public void practice5() {
		// 1. ����ڿ��� ���ڿ��� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.println("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. ����ڰ� �Է��� ���ڿ�(str)�� ���� �ϳ��ϳ��� char�迭�� �ֱ�
		
		// ���� ����ڰ� �Է��� ���ڿ� ���̸�ŭ�� char�迭�� �Ҵ� 
		char[] arr = new char[str.length()];
		
		// �ݺ����� ���� str.charAt(i) ���� arr[i] �� ��� ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		// 3. �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ��� �ε����� �ִ��� �ľ�
		
		int count = 0; 	// �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ������ ����
						// ���ڿ����� ������ ���ڰ� �߻��� ������ 1�� ���� �����ٲ���
		
		// �켱 �ݺ����� �����ϱ� ���� ��¹���..
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		// �ε������� �����ϱ� ���� �ݺ��� ���
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { // �ش� �ε��� ���� �˻��� ���ڿ� ���� ��� 
				System.out.print(i + " ");	// �ش� �ε��� �̾ ���
				
				count++;	// �׸��� count 1����
			}
		}
		
		// ������ print()�� ����߱� ������ ������ �ȵǾ����� ��
		System.out.println();	// ������ ������
		
		System.out.println(ch + "���� : " + count);
		
		
		
	}
	
	/**
	 * �ǽ�����6. "��"~"��"���� �ʱ�ȭ�� ���ڿ� �迭 ���� �� ����ڿ��� 0~6������ ������ �Է¹��� ��
	 * 			�ش� ����ڰ� �Է��� �ε����� �ִ� ���� ����Ͻÿ�.
	 * 			(��, 0~6������ ������ �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���)
	 */
	public void practice6() {
		
		// 1. "��" ~ "��"���� �ʱ�ȭ�� ���ڿ� �迭 �����
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		// 2. ����ڿ��� 0���� 6������ ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		// 3. num���� 0 ~ 6 ������ �������� Ȯ�� --> �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		if(num >= 0 && num <= 6) {
			
			// �ش� ���� ���
			System.out.println(arr[num] + "����");
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	/**
	 * �ǽ�����7. ����ڰ� �Է��� ������ŭ�� ũ���� �迭�� �����ϰ� 
	 * 			�� �迭�� ũ�⸸ŭ ����ڰ� �Է��� ������ �� �ε����� �ʱ�ȭ �� �� ��� (�� �հ赵 ����)
	 */
	public void practice7() {
		// 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		
		// 3. ��ü �� ���� �� �� �� ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("�� �� : " + sum);
		
		
	}
	
	
	/**
	 * �ǽ�����8. ����ڿ��� 3�̻��� Ȧ���� �Է¹޾� �ش� �Է¹��� ������ŭ�� ũ���� �迭 ���� ��
	 * 			0�� �ε��� ���� �迭�� �߰�(�迭�Ǳ���/2)�ε��������� 1���� 1�� ������ ������ �ʱ�ȭ�ϰ�
	 * 			�迭�� �߰����ĺ��� �������� 1�� ������ ������ �ʱ�ȭ �� �� ����Ͻÿ�.
	 * 			(��, �Է��� ������ Ȧ���� �ƴϰų� 3�̸��� ��� "�ٽ� �Է��ϼ���" ����� ���� ���� �ݺ�) 
	 * 
	 * 			(���̵� �߻�)
	 */
	public void practice8() {
		
		// 1. ����ڿ��� 3�̻��� �������� �Է¹��� (�ݺ�)
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			// 2. ����ڰ� �Է��Ѱ��� ��ȿ�Ѱ����� �Ǻ� (������ �䱸�� ������ �װ� �ƴ���)
			if(num >= 3 && num % 2 == 1) { // 3�̻��̰� �Ӹ��ƴ϶� Ȧ���ΰ�� == �� �Է����� ���
				
				// 5 ==> 1 2 "3" 2 1		  => �迭�� �߰� == 2�� �ε���
				// 7 ==> 1 2 3 "4" 3 2 1 	  => �迭�� �߰� == 3�� �ε���
				// 9 ==> 1 2 3 4 "5" 4 3 2 1  => �迭�� �߰� == 4�� �ε���
				//								  �迭�� �߰� == �迭��ũ��/2 �� �ε���
				
				// 2_1. ����ڰ� �Է��� ����ŭ�� ũ��� �迭 ����
				int[] arr = new int[num];
				
				// 2_2. �������� �䱸�Ѵ�� �迭�� �� ���
				int value = 1;
				for(int i=0; i<arr.length; i++) { // i == �ε���
					arr[i] = value;
					
					if(i < arr.length / 2) {  // i�ε������� �߰��ε��� ��������
						value++; // 1����
					}else {
						value--; // 1����
					}
					
				}
				
				// 2_3. �� ������ ������� Ȯ��
				for(int i=0; i<arr.length; i++) {
					
					if(i != arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.print(arr[i]);						
					}
					
				}
				
				// 2_4. �ݺ����� ����������
				break;		
				
				
			}else { // �װԾƴѰ�� (��, 3�̻��� �ƴϰų� Ȧ���� �ƴѰ�� == �߸��Է����� ���) 
				
				// "�ٽ��Է����ּ���" ��� --> �ݺ� ����ǰԲ�
				System.out.println("�ٽ��Է����ּ���");
			}
			
		}
	}
	
	
	/**
	 * �ǽ�����9. ���������� ��� ġŲ�޴����� ����ִ� ���ڿ� �迭�� ������ ����
	 * 			����ڰ� �Է��� �޴��� �ش� �迭�� �ִ� �˻��� �� 
	 * 			������ "XXXX ġŲ ��� ����", ������ "XXXX ġŲ�� ���� �޴��Դϴ�." ���
	 * 			(���̵� �߻�)
	 */
	public void practice9() {
		// 1. ġŲ �޴����� ����ִ� String �迭 ����, �Ҵ� ���ÿ� �ʱ�ȭ
		String[] chickens = {"�Ķ��̵�", "���", "�Ĵ�", "ġ��"};
		
		// 2. ����ڿ��� ġŲ �޴� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		
		// 3. �ݺ����� ���� �迭�� 0�� �ε������� ������ �ε������� �����Ͽ�
		//    ����ڰ� �Է��� �޴��� ������ �޴��� �ִ���
		boolean flag = false; // ������ �޴��� �ִ��� ������ �������� �޾��ֱ� ���� ���� ���
		
		for(int i=0; i<chickens.length; i++) {
			
			if(chickens[i].equals(menu)) { // ����ڰ� �Է��� �޴��� ������ �޴��� ���
				flag = true; // flag ���� true�� �ٲ��ְ�
				break;       // �ݺ����� ����������. (�������������� true�� �ٲ� �� ���̻� �ݺ����� �� �ʿ䰡 ���⶧���� ȿ�������� ����Ѱ���)
			}
		}
		
		if(flag) { // flag�� true�� ��� ��, ����ڰ� �Է��� �޴��� ������ ���
			System.out.println(menu + "ġŲ ��� ����");
		}else {
			System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	/**
	 * �ǽ�����10. ũ�� 10¥���� �迭 ������ �� 1~10 ���� ������ �������� �Ź� �߻����� �� �ε����� �ʱ�ȭ �� �� ���
	 */
	public void practice10() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ�� �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * �ǽ�����11. ���� �ǽ�����10�� ���뿡�� �߰������� �� ���� �� �ִ밪�� �ּҰ��� ����Ͻÿ�.
	 */
	public void practice11() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // ����
		
		// 3. �������� ������ ���� �ִ밪 �ּҰ� �˾Ƴ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// �������� ���� �� ù��° �ε����� == �ּҰ�     /   ������ �ε����� == �ִ밪
		
		System.out.println("�ִ밪 : " + arr[9]);
		System.out.println("�ּҰ� : " + arr[0]);
				
	}
	
	/**
	 * �ǽ�����12. ũ�� 10¥���� �迭 ���� �� 1~10������ �������� �Ź� �߻���Ű�鼭 �ʱ�ȭ �ϵ� 
	 * 			  �ߺ����� ���� �ʱ�ȭ�� �� ����Ͻÿ�. 
	 */
	public void practice12() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε��� ���� 1���� 10 ������ ������ �߻���Ű�µ� �̶� �ߺ��� ������
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { // ������ ���� �� ������ ���� ���� ��� 
					i--; // �ٽ� �ش� �ε����� �� �ʱ�ȭ �� �� �ֵ��� i�� 1���ҽ�Ű��
					break; // �ߺ��� �� ã�ұ� ������ ���� �ٸ� �����̶� ���غ� �ʿ� ���⶧���� ���������°� ���� ȿ����
				}
			}
		}
		
		// 3. ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * �ǽ�����13. ����ڿ��� �ֹε�Ϲ�ȣ(���ڿ�)�� �Է¹ް� 
	 * 			  �ش� �Է¹��� ���ڿ��� �ݺ����� ���� char�迭(����)�� �Ű� ���� ��
	 * 			  ���纻 �迭�� ����� �����迭�� �ִ� ������ ���縦 �����ϴµ�
	 * 			  �̶� �����ڸ� ���ĺ��ʹ� *�� ���� ���Բ� ���� ������ ���
	 * 			 (���̵� ��)
	 */
	public void practice13() {
		
		// 1. ����ڿ��� �ֹε�Ϲ�ȣ ���ڿ� �Է¹ޱ� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();		// "xxxxxx-xxxxxxx"		==> ���ڿ��� ���� == 14
										//  012345678910111213
		
		// 2. �ݺ����� �̿��Ͽ� char[]�� ���ڿ��� ����ִ� ������ ���ڵ��� �Ű� ���
		// 2_1. ���ڿ��� ũ�⸸ŭ�� char[] �迭 ����
		char[] origin = new char[str.length()];
		
		// 2_2. �ݺ������� 0��~�������ε������� �ش� ���ڵ� �Ű� ���
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// 3. ���纻 char[] ���� �� �����ڸ����� �� �������� �ִ� �״���� ���ڵ��� �Ű� ��� �� ���ĺ��ʹ� *�� ���� ���Բ�
		char[] copy = new char[origin.length];
		// copy[0] = origin[0];
		// copy[1] = origin[1];
		// ....
		// copy[7] = origin[7];
		// copy[8] = '*';
		// copy[9] = '*';
		// ...
		// copy[������] = '*';
		for(int i=0; i<copy.length; i++) {
			
			if(i <= 7) { // 7���ε���������
				copy[i] = origin[i];
			}else {
				copy[i] = '*';
			}
		}
		
			
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
		
	}
	
	
	/**
	 * �ǽ�����14. �ζ� ��ȣ �ڵ� ������ ���� ���α׷��� ����ÿ�
	 * 			  ��, ũ�� 6¥���� �迭 ���� �� �� 1~45������ �������� �Ź� �߻����� ������� �ʱ�ȭ�ϵ�
	 * 			  �ߺ������� �ʱ�ȭ ������ �� �������� �����ϰ� ���� ����Ͻÿ�.
	 */
	public void practice14() {
		// 1. ũ�Ⱑ 6�� ������ �迭 ���� �� �Ҵ�
		int[] lotto = new int[6];
		
		// 2. �迭�� �ߺ������� 1���� 45������ ���� �ʱ�ȭ
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. �������� ����
		for(int i=0; i<lotto.length; i++) { // �� ��ü
			for(int j=i+1; j<lotto.length; j++) { // �� ���
				if(lotto[i] > lotto[j]) { // �� ��ü�� �� ��󺸴� ū ��� ���� �ٲ���ߵ�
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		// 4. ���
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	/**
	 * �ǽ����� 15. ����ڰ� �Է��� ����ŭ ũ���� ���ڿ� �迭 ���� �� �� 
	 * 			  0�� �ε������� ���������� �����ؼ� ����ڰ� �Է��� ���ڿ��� �ʱ�ȭ ����,
	 * 			    ������ �ε������� �� �ʱ�ȭ �ϰ� �� �Ŀ��� 
	 * 			    ����ڿ��� �迭�� ���� �� ���� �� ������� �� y�� ��� ��� �� �Է��� ���� �Է¹��� ��
	 * 			    ���� ���� �ݺ�(����ڿ��� �Է¹��� ���ڿ� �ش� �ε����� �ʱ�ȭ�ϴ� ����)
	 * 			    ��, n�� ��� ���̻� �Է¹��� �ʰ� ���� �迭�� ��ü ���� ���
	 * 			  (���̵� ��)
	 */
	public void practice15() {
		
		// 1. ����ڿ��� �迭�� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// 2. ����ڰ� �Է��� ����ŭ�� ũ���� �迭 ����
		String[] arr = new String[size];
		
		// 3. �� �ε����� ����ϰ����ϴ� ���ڿ��� ����ڿ��� �Է¹��� �� �ش� �ε����� �� ����(�ʱ�ȭ)
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "��° ���ڿ� : ");
			arr[i] = sc.nextLine();
		}
		
		// �ݺ������� ����ڿ��� �� ���� �Է¹��� ���� ��� �Ŀ� y���� n���� �Ǻ��ϴ� �ݺ���
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// ����ڰ� �Է��� ���ڰ� y���� n���� �Ǻ�
			if(ch == 'y' || ch == 'Y') { // �� ���� �Է��ϰڴٴ� �ǻ�
				
				// �߰��� � �� �Է��ϰ� ������ ���� �Է¹ޱ�
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				// �����迭�� ũ�� + addSize ��ŭ�� ���ο� �迭 �����
				String[] newArr = new String[arr.length + addSize];
				
				// newArr[0] = arr[0];
				// newArr[1] = arr[1];
				// newArr[2] = arr[2]; // ���� �迭�� �����ߴ� ���� �Ű� ���� �� �� �Ŀ��� �߰������� �Է¹��� �� ���
				// newArr[3] = ����ڿ��� �Է¹��� ��;
				// newArr[4] = ����ڿ��� �Է¹��� ��;
				for(int i=0; i<newArr.length; i++) {
					if(i <= arr.length-1) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i + 1 + "��° ���ڿ� : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr;
				
			}else { // ���̻� �Է����� �ʰڴٴ� �ǻ���� --> �ݺ��� ���������Բ�
				break;
			}
		}
		
		// ���������� arr�̶�� �迭�� ��� �� ���
		System.out.println(Arrays.toString(arr));
		
	}
}





