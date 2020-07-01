package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	/**
	 *  ����1. ����ڿ��� �� ���� ������ �Է¹ް�
	 *        1���� �Է¹��� ������ Ȧ������ ¦������ �Ǻ� �� 
	 *        Ȧ���� "��", ¦���� "��" ����ϰԲ�
	 *        (��, �Է¹��� ���� ����� �ƴϸ� "����� �ƴմϴ�" ���)
	 *        
	 *  ���� ) 4 �Է½�  -->  "�ڼ��ڼ�" ���
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) { // �Է¹��� ���� ����� ��� (�� �Է��Ͽ��� ���)
			
			for(int i = 1; i <= num; i++) { // 1���� ����ڰ� �Է��� ������ �ݺ�����
				
				if(i % 2 == 1) {	// Ȧ���� ���
					System.out.print("��");
					
				} else {			// ¦���� ���
					System.out.print("��");
					
				}
			}
			
		} else {	// �Է� ���� ���� ����� �ƴ� ��� (�� �� �Է��Ͽ��� ���)
			
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	
	/**
	 *  ����2. ���� 1�� �������� ���� ����� �ƴҰ�� �ٽ� �Է¹��� �� �ְԲ�
	 *        �� �Է��ߴٸ� �� �ش� ��¹��� �����ϰ� �ݺ��� ����ǰԲ�
	 */
	public void method2() {
		// ���� method1���� ����� �ƴ� ��� �ٽ� �Է¹޵��� �ݺ� ����
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) { // �켱 ���� �ݺ����� �����ϰ�
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num > 0) { // �Է¹��� ���� ����� ��� (�� �Է��Ͽ��� ���)
				
				for(int i = 1; i <= num; i++) { // 1���� ����ڰ� �Է��� ������ �ݺ�����
					
					if(i % 2 == 1) {	// Ȧ���� ���
						System.out.print("��");
						
					} else {			// ¦���� ���
						System.out.print("��");
						
					}
				}
				
				// ����� ��� ����� ��µǰ� ���ѹݺ����� ����������
				break;
				
			} else {	// �Է� ���� ���� ����� �ƴ� ��� (�߸� �Է��Ͽ��� ���)
				
				System.out.println("����� �ƴմϴ�.");
				
				// ����� �ƴ� ��� �ٽ� �ݺ����� ó������ ���ư� ������ �Է¹ް� �ɰŴ�.
			}
			
		}
	}
	
	
	/**
	 *  ���� 3. ����ڿ��� ���ڿ��� �� ���ڿ����� �˻��ϰ��� �ϴ� ���ڸ� �Է¹��� �� 
	 *         �� ���ڿ����� �˻��ϰ��� �ϴ� ���ڰ� �� � �ִ��� ���
	 *         
	 *  ���� ) "apple" �̶�� ���ڿ��� 'a'��� ���ڸ� �Է¹ް� �Ǹ� �Ѱ����� 3�� ����ϵ���
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("ã���� �ϴ� ���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// �˻��� ������ ������ ���� ����
		
		for(int i=0; i<str.length(); i++) { // 0���� ���ڿ��� ����-1 ��ŭ 1�� �����ϴ� ���� �ݺ�
			
			if(ch == str.charAt(i)) { // �Է¹��� ���ڿ� ���ڿ��� �� �ε��� ���� ���� ���
				count++; // ������ ���ڶ�� �Ǵ��Ͽ� count 1 ����
			}
			
		}
		
		System.out.println("���Ե� ���� : " + count);
		
	}
	
	
	/**
	 *  ���� 4. �Ʒ��� ���� ����� ����ǰԲ� �Ͻÿ�
	 *  
	 *  *
	 *  **
	 *  ***
	 *  ****
	 */
	public void method4() {
		
		for(int i=1; i<=4; i++) { // 4���� �� �ݺ�
			for(int j=1; j<=i; j++) { // 1~i���� 1�� �����ϸ鼭 �ݺ�
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	

}
