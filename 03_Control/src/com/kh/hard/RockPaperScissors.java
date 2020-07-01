package com.kh.hard;

import java.util.Scanner;

public class RockPaperScissors {
	
	// ��ǻ�Ϳ� ���������� �ϴ� ����
	
public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		// �������� ���� ��� � ���� �� ����Ҳ��� 
		int count = 0;		// ���� Ƚ��(��)
		int win = 0;		// �̱� Ƚ��(��)
		int draw = 0;		// ��� Ƚ��(��)
		int lose = 0;		// �� Ƚ��(��)
		
		String result = "";	// ��� ���� ���� ����
		String winStr = "�̰���ϴ�!!"; // �̰��� ��� result�� ���� ����
		String loseStr = "�����ϴ� �Ф�"; // ���� ��� result�� ���� ����
		String drawStr = "�����ϴ�."; // ����� ��� result�� ���� ����
		
		
		while(true) { // ����ڰ� �����ϰڴٴ� �ǻ縦 ���������� ���� �ݺ�
			
			// 1. ���� ��ǻ�Ϳ��� �������� �̿��ؼ� �������� ����,����,�� �� �������� �Ѵ�.
			int compRan = (int)(Math.random() * 3);  // 0, 1, 2 ������ ������ �߻�
			
			String computer = ""; 	// ��ǻ���� ����/����/�� �� �ش� �ϴ� ���� ���� ����
			
			switch(compRan) {
			case 0: computer = "����"; break; // �������� 0�� ��� ��ǻ�ʹ� "����"
			case 1: computer = "����"; break; // �������� 1�� ��� ��ǻ�ʹ� "����"
			case 2: computer = "��"; break;	 // �������� 2�� ��� ��ǻ�ʹ� "��"
			}
			
			// 2. ��������� ����/����/��/exit �� �ϳ��� �Է¹ް� �Ѵ�.
			System.out.print("����������(�����Ͻ÷��� exit �Է�) : ");
			String user = sc.nextLine();
			
			
			// 3. ����ڰ� �Է��� ���� ����/����/�� �� �ϳ��� ��� 	--> 3_1 ���ǽ���
			//    ����ڰ� �Է��� ���� exit�� ��� 		   		--> 3_2 ���� ����
			//    ����ڰ� �Է��� ���� �߸��� ���� ��� 		 	--> 3_3 ���� ����
			
			if (user.equals("����") || user.equals("����") || user.equals("��")) { // 3_1. ����ڰ� ����, ����, �� �� �ϳ��� �Է��Ͽ��� ���
				
				if(computer.equals(user)) {	// ��ǻ�Ϳ� ����ڰ� �Է��� ���� ���� ��� (��, ��� ���)
					result = drawStr; // ��� ���� ��� ������ ���
					draw++;	// ��� Ƚ�� 1 ����
					
				}else if(computer.equals("����")){ // ��ǻ���� ���� ���� �� ��
					
					// * switch ���
					switch(user) {
					case "����" : result = winStr; win++; break; // ����ڰ� ������ ��� (��, �̱� ���) --> ������� �̱� ���� ��� �̱� Ƚ�� 1 ���� 
					case "��" : result = loseStr; lose++; break; // ����ڰ� ���� ��� (��, �� ���) --> ������� �� ���� ��� �� Ƚ�� 1 ���� 
					}
					
				}else if(computer.equals("����")) { // ��ǻ���� ���� ���� �� ��
					
					// * if-else if�� ���
					if(user.equals("����")) { // ����ڰ� ������ ��� (��, �� ���)
						result = loseStr;    // ��� ���� �� ���� ���
						lose++; 		     // �� Ƚ�� 1 ���� 
						
					}else if(user.equals("��")) { // ����ڰ� ���� ��� (��, �̱� ���)
						result = winStr; 		 // ��� ���� �̱� ���� ���
						win++;  		 		 // �̱� Ƚ�� 1 ���� 
					}
					
				}else {	// ��ǻ���� ���� �� �� ��
					
					// * ���׿����� ���
					result = user.equals("����") ? winStr : loseStr;
					
					if(result.equals(winStr)) { // �̱� ���
						win++;
					}else {		// �� ���
						lose++;
					}
					
				}
				
				count++;	// ���� Ƚ�� 1 ���� 
				
			}else if(user.equals("exit")) { // 3_2. exit �Է� ��
				break;	// ���� �ݺ����� ���������� �ȴ�.
				
			}else {	// 3_3. �� ���� ��� (��, �߸� �Է��Ͽ��� ���)
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				continue; // �ݺ��� ó������ �ٽ� ����
			}
			
			System.out.println("��ǻ�� : " + computer);
			System.out.println(name + " : " + user);
			System.out.println(result);
			System.out.println();
			
		}
		
		
		System.out.println(count + "�� " + win + "�� " + draw + "�� " + lose + "��");
		
	}

}
