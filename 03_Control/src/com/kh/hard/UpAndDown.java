package com.kh.hard;

import java.util.Scanner;

public class UpAndDown {

	public void method1() {
		// 1���� 100������ ���� �߿��� ������ �������� ������
		// ����ڴ� ������ �������� ���ߴµ� �� ������ ���ߴ��� ���
		
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 1���� 100 ������ ������ ������ �̱�
		int random = (int)(Math.random() * 100 + 1);
		
		
		int count = 0; // �� ������ ������� ���� ���� 
		
		while(true) { // ����ڰ� ���⶧���� ���� �ݺ�
			
			// 2. ����ڿ��� �� �Է¹ޱ�
			System.out.print("1~100 ������ ������ ������ ���纸���� : ");
			int user = sc.nextInt();
			
			// 3. ����ڰ� �Է��� ���� 1~100 ������ �������� Ȯ��
			if(user >=  1 && user <= 100) { // 3_1. ����ڰ� 1~100 ������ ���ڸ� �� �Է��� ���
				
				// 4. ����ڰ� �Է��� ���� ���� ���� �ٸ��� ������ Ȯ��
				if(user != random) { // 4_1. �Է��� ���� �������� �ٸ� ���	
					
					
					// �Է��� ���� random������ ū�� ������ Ȯ��
					if(user > random) { // random ���� ū ���
						System.out.println("Down!");
						
					}else { // random ���� ���� ���
						System.out.println("Up!");
					}
					
					count++;	// Ʋ�ȱ� ������ Ƚ�� 1 ����
					
				}else { // 4_2. �Է��� ���� �������� ���� ���
					
					count++; 	// ���� �͵� Ƚ���� ���� ������ 1 ����
					System.out.println("�����Դϴ�!");
					break;		// ������ ������ ������ ���ѹݺ����� ���������� ���� break;
				}
				
			}else { // 3_2. ����ڰ� 1~100 ������ ���ڸ� �Է����� ���� ��� 
				
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���.");
			}
			
		}
		
		System.out.println(count + "ȸ���� ���߼̽��ϴ�!!"); 
	}
}
