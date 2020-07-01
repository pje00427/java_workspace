package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	
	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������(+, -, x, /) : ");
		char op = sc.nextLine().charAt(0);

		int result = 0; // ��� ������ ����
		switch (op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case 'x':
		case 'X': result = num1 * num2; break;
		case '/':
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.\n");
				return;
			} else {
				result = num1 / num2;
			}
		}
		
		System.out.printf("%d %c %d = %d\n\n", num1, op, num2, result);
	}

	
	public void totalCalculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);

		int sum = 0;
		for (int i=min; i<=max; i++) {
			sum += i;
		}
		
		System.out.println(min + "���� " + max + "���� �������� �� : " + sum + "\n");
	}

	
	public void printProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		String gender = sc.nextLine();
		System.out.print("���� : ");
		String personality = sc.nextLine();

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + personality + "\n");
	}

	
	public void printScore() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("�� : ");
		int classNum = sc.nextInt();
		System.out.print("�� : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("���� : ");
		double score = sc.nextDouble();
		
		char result = 'F';

		if (score >= 90) {
			result = 'A';
		} else if (score >= 80) {
			result = 'B';			
		} else if (score >= 70) {
			result = 'C';
		} else if (score >= 60) {
			result = 'D';
		} 
		
		String student = "";
		if (gender == 'M') {
			student = "���л�";
		} else {
			student = "���л�";
		}
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̰� %c�����Դϴ�.\n\n", 
				grade, classNum, num, student, name, score, result);
	}

	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num > 0) {
			
			for (int i=1; i<=num; i++) {
				for (int j=1; j<i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
			
		} else {
			System.out.println("����� �ƴմϴ�.");
			
		}
		
		System.out.println();
	}

	
	public void sumRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		for (int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.printf("1���� %d������ �� : %d\n\n", random, sum);
		
	}

	
	public void exceptGugu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan > 0) {
			for(int su=1 ; su<=9 ; su++) {
				if(su % dan != 0) {
					System.out.println(dan + " * " + su + " = " + dan*su);
				}
			}
			
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
		System.out.println();
	}

	
	public void diceGame() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			int num1 = (int)(Math.random() * 6) +1;
			int num2 = (int)(Math.random() * 6) +1;
			int sum = (num1 + num2);
			
			while(true) {
				
				System.out.print("�ֻ��� �ΰ��� ���� ���纸����(1~12�Է�) : ");
				int user = sc.nextInt();
				sc.nextLine();
				
				if(sum != user){
					System.out.println("Ʋ�Ƚ��ϴ�.");
					continue;
				}else{
					System.out.println("�����Դϴ�.");
				}		
					
				
				System.out.println("�ֻ����� �� : " + sum);
				System.out.print("��� �Ͻðڽ��ϱ�?(y/n) : ");
				
				if(sc.nextLine().equalsIgnoreCase("y")){
					break;
				}else {
					System.out.println("�����մϴ�.\n");
					return;
				}
			}		
			
		}
	}
}
