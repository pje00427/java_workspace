package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	
	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, /) : ");
		char op = sc.nextLine().charAt(0);

		int result = 0; // 결과 보관할 변수
		switch (op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case 'x':
		case 'X': result = num1 * num2; break;
		case '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.\n");
				return;
			} else {
				result = num1 / num2;
			}
		}
		
		System.out.printf("%d %c %d = %d\n\n", num1, op, num2, result);
	}

	
	public void totalCalculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);

		int sum = 0;
		for (int i=min; i<=max; i++) {
			sum += i;
		}
		
		System.out.println(min + "부터 " + max + "까지 정수들의 합 : " + sum + "\n");
	}

	
	public void printProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String personality = sc.nextLine();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + personality + "\n");
	}

	
	public void printScore() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
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
			student = "남학생";
		} else {
			student = "여학생";
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다.\n\n", 
				grade, classNum, num, student, name, score, result);
	}

	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			
			for (int i=1; i<=num; i++) {
				for (int j=1; j<i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
			
		} else {
			System.out.println("양수가 아닙니다.");
			
		}
		
		System.out.println();
	}

	
	public void sumRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		for (int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d\n\n", random, sum);
		
	}

	
	public void exceptGugu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		if(dan > 0) {
			for(int su=1 ; su<=9 ; su++) {
				if(su % dan != 0) {
					System.out.println(dan + " * " + su + " = " + dan*su);
				}
			}
			
		}else {
			System.out.println("양수가 아닙니다.");
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
				
				System.out.print("주사위 두개의 합을 맞춰보세요(1~12입력) : ");
				int user = sc.nextInt();
				sc.nextLine();
				
				if(sum != user){
					System.out.println("틀렸습니다.");
					continue;
				}else{
					System.out.println("정답입니다.");
				}		
					
				
				System.out.println("주사위의 합 : " + sum);
				System.out.print("계속 하시겠습니까?(y/n) : ");
				
				if(sc.nextLine().equalsIgnoreCase("y")){
					break;
				}else {
					System.out.println("종료합니다.\n");
					return;
				}
			}		
			
		}
	}
}
