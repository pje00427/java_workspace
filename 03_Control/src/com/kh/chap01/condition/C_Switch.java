package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * * switch�� (���ǹ�)
	 * 
	 * if������ ������ : if���� ���ǿ� ������ �����Ҽ� �־��ٰ� �Ѵٸ�
	 * 				 switch���� Ȯ�ǰ��� �����̴�. (����񱳿� ����)
	 * 
	 * switch(���Ҵ����) {
	 * case ��1 : �����ڵ�1; break;
	 * case ��2 : �����ڵ�2; break;
	 * case ��3 : �����ڵ�3; break;
	 * ....
	 * default : ���� ���ǿ� �� �������� ���� ��� �������ڵ�;
	 * }
	 * 
	 * �񱳴����==��1 �� ������ true�� ��� �����ڵ�1 ����ǰ� break���� ��������
	 * switch���� if-else if���� �޸� �����ڵ常�� �����ϰ� �ڵ����� ���������� ����..
	 * ���� break�� �ɾ���ߵ�
	 */
	 
	public void method1() {
		// ����ڿ��� 1~3������ ������ �Է¹޾� �� ������
		// 1�� ��� "�������Դϴ�."
		// 2�� ��� "�Ķ����Դϴ�."
		// 3�� ��� "�ʷϻ��Դϴ�."
		// �߸��Է����� ��� "�߸��Է��߽��ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3������ ���� : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
			System.out.println("�������Դϴ�.");
		}else if(num == 2) {
			System.out.println("�Ķ����Դϴ�.");
		}else if(num == 3) {
			System.out.println("�ʷϻ��Դϴ�.");
		}else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		*/
		
		String color = "";
		
		switch(num) {
		case 1: color = "������"; break;
		case 2: color = "�Ķ���"; break;
		case 3: color = "�ʷϻ�"; break;
		default: System.out.println("�߸��Է��Ͽ����ϴ�."); return;
		}
		
		System.out.println(color + "�Դϴ�.");
		
	}
	
	public void method2() {
		// ����ڿ��� ������ �Է¹��� �� �׿� �ش��ϴ� ���� ���
		// xxx�� ������ xxx�� �Դϴ�.
		
		// ��� : 1000��
		// �ٳ��� : 3000��
		// Ű�� : 5000��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(���/�ٳ���/Ű��) : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "���": price = 1000; break;
		case "�ٳ���": price = 3000; break;
		case "Ű��": price = 5000; break;
		default: System.out.println("�߸��Է��Ͽ����ϴ�."); return;
		}
		
		System.out.println(fruit + "�� ������ " + price + "���Դϴ�.");
		System.out.printf("%s�� ������ %d���Դϴ�.", fruit, price);
		
	}
	
	// break ���� switch�� ����
	public void method3() {
		
		// ���(1,2,3)�� ����
		
		// 3��� : ���� ����, �۾��� ����, �б� ����
		// 2��� : �۾��� ����, �б� ����
		// 1��� : �б� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���(1,2,3) �Է� : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("�� ���� �����־�");
		case 2: System.out.println("�� �۾��� �����־�");
		case 1: System.out.println("�� �б� �����־�"); break;
		default:System.out.println("�߸��Է��߽��ϴ�.");
		}
	}
	
	public void method4() {
		// 1 ~ 12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ���
		
		// 1, 3, 5, 7, 8, 10, 12	=> "�Է��Ͻ� ���� 31�ϱ��� �Դϴ�."
		// 4, 6, 9, 11				=> "�Է��Ͻ� ���� 30�ϱ��� �Դϴ�."
		// 2 						=> "�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�."
		// �߸��Է����� ���				=> "�ݵ�� 1��~12�������� �Է��ؾߵ˴ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� ~ 12������ �� �ϳ��� �Է��ϼ���(����) : ");
		int month = sc.nextInt();
		
		/*
		if(month == 1 || month == 3 || 
				month == 5 || month == 7 || 
					month == 8 || month == 10 || month == 12) {
			
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			
		}else if(month == 2) {
			
		}else {
			
		}*/
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�."); break;
		case 2: System.out.println("�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�."); break;
		default: System.out.println("�ݵ�� 1�� ~ 12������ �Է��ؾߵ˴ϴ�.");
		}
		
		
		
	}
	
	
	
	
	 

}




