package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	/**
	 * �ǽ����� 1
	 * Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���.
	 */
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		/* ù��° ��� 
		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		System.out.println(result);
		*/
		
		
		System.out.println(num > 0 ? "�����" : "����� �ƴϴ�");
	}

	
	/**
	 * �ǽ����� 2
	 * Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����",
	 * ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		//String result = (num > 0) ? ("�����") : (num == 0 ? "0�̴�" : "������");
		//String result = (num > 0) ? ("�����") : (num < 0 ? "������" : "0�̴�");
		//String result = (num == 0) ? ("0�̴�") : (num > 0 ? "�����" : "������");
		//String result = (num == 0) ? ("0�̴�") : (num < 0 ? "������" : "�����");
		//String result = (num < 0) ? ("������") : (num > 0 ? "�����" : "0�̴�");
		String result = (num < 0) ? ("������") : (num == 0 ? "0�̴�" : "�����");
		
		System.out.println(result);
	}

	
	/**
	 * �ǽ����� 3
	 * Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();

		//String result = (num % 2 == 0) ? ("¦����") : ("Ȧ����");
		//String result = (num % 2 != 1) ? ("¦����") : ("Ȧ����");
		//String result = (num % 2 == 1) ? ("Ȧ����") : ("¦����");
		String result = (num % 2 != 0) ? ("Ȧ����") : ("¦����");
		
		System.out.println(result);
	}

	/**
	 * �ǽ����� 4
	 * ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 
	 * 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / people);
		System.out.println("���� ���� ���� : " + candy % people);
	}

	/**
	 * �ǽ����� 5
	 * Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	 * �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		String student = (gender == 'M') ? ("���л�") : ("���л�");
	
		System.out.println();
		
		/*
		System.out.println(	grade + "�г� " + classNum + "�� " + num + "�� " 
						+ name + " " + student + "�� ������ " + score + "�̴�.");
		*/
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", grade, classNum, num, name, student, score);
	}

	/**
	 * �ǽ����� 6
	 * ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)���� ����ϼ���.
	 */
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		//String result = (age <= 13) ? "���" : (age <= 19 ? "û�ҳ�" : "����");
		//String result = (age <= 13) ? "���" : (age > 19 ? "����" : "û�ҳ�");
		//String result = (age > 19) ? "����" : (age > 13 ? "û�ҳ�" : "���");
		//String result = (age > 19) ? "����" : (age <= 13 ? "���" : "û�ҳ�");
		//String result = (age > 13 && age <= 19) ? "û�ҳ�" : (age <= 13 ? "���" : "����");
		String result = (age > 13 && age <= 19) ? "û�ҳ�" : (age > 19 ? "����" : "���");
		
		System.out.println(result);
	}

	/**
	 * �ǽ����� 7
	 * ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
	 * �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	 * �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ� 
	 * �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���	
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		/*
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? ("�հ�") : ("���հ�");
		System.out.println(result);
		*/
		
		System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�");
	}

	/**
	 * �ǽ����� 8
	 * �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (- ����) :  ");
		String str = sc.nextLine();
		
		// "******-*** *  *  *  *"
		//  0123456789 10 11 12 13
		
		char pId = str.charAt(7); // �����ڸ��� �ش��ϴ� ���� �ϳ����� ���� ('1' �Ǵ� '2' �Ǵ� '3' �Ǵ� '4')
		
		String gender = (pId == '1' || pId == '3') ? "���� " : 
						(pId == '2' || pId == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�";
		
		System.out.println(gender);
		
	}

	/**
	 * �ǽ����� 9
	 * Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
	 * �׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
	 * �ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		System.out.println((input <= num1) || (input > num2));
	}

	/**
	 * �ǽ����� 10
	 * 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���
	 */
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
						// num1 == num2 == num3
		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);
	}

	/**
	 * �ǽ����� 11
	 * A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� 
	 * �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000 �̻�", �̸��̸� "3000 �̸�"�� ����ϼ���.
	 * (A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
	 */
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		// �μ�Ƽ�� ���� ���� == (���� + ���� * �μ�Ƽ��) == (���� * (1+�μ�Ƽ��))
		double aIncen = a * 1.4; // a + a * 0.4 --> a * (1 + 0.4) --> a * 1.4
		double bIncen = b;
		double cIncen = c * 1.15; // --> ���� ���ȭ��ó��
		//double cIncen = c + c * 0.15; // --> ���� ���ȭ�� ó�� �ȳ���.. �Ȱ��� ���н��ε� ��? �Ʒ��ʼ���!!
		
		/*
		 * ��? �Ʒ��� ���� ��ǻ�Ͱ� 0.15�� 1.15�� ���� �Ǽ����� 
		 * �ִ±״�η� ó������ �ʰ� �ش� �������� �Ʒ��� ����.. (�˾ƺ��� �������� �̼��� ������ ����)
		 * 
		 * double�� 0.15 ���� �� : 0.1499999999999999944488848768742172978818416595458984375
		 * double�� 1.15 ���� �� : 1.149999999999999911182158029987476766109466552734375
		 * 
		 */
		
		
		/*** 
		 	�� �ñ��ϸ� �̳����� �����ϵ� ���� ���� �Ǵ� �����Դϴ�.. �츮�� ���������� ����ϸ鼭 ��Ʈ������ ó���ϴ����� ���ؿ�
		 	�ǳ� ��ŵ� �ǿ�.. �ƿ� �Ⱥ��°� ���ƿ�.. Ȥ�� �ñ����Ͻô� ���� �������ؼ�..
		  
		 	float, double�� �Ǽ��� �ε��Ҽ��� ������� �����ϴµ� �� �� �ٻ� ������ ����
		 	�ε��Ҽ� 2��ȭ ���� ==> �Ҽ� ���� ��� x 2�� �ؼ� ���� 0.���� 1.������ 2���� ǥ��
		 	
		 		ex. 0.1234567
		 			x 2 = 0.2469134  --- 0
		 			x 2 = 0.4938268  --- 0
		 			x 2 = 0.9876536  --- 0
		 			x 2 = 1.9753072  --- 1
		 			- 1 = 0.9753072
		 			x 2 = 1.9506144  --- 1 ....
		 			
		 	==> �Ҽ��� �Ʒ� �κ��� ����ȭ �� �� �������� ���� ��� 
		 	      ���� �Ҽ��� �Ǿ� �����θ� ������� ä��ٰ� �������� �뷮 (float : 23bit / double : 52bit) ������ ���� ����
		 	    --> �� �� 1�������� ���� �߻�
		 	
		 	���� float, double ��� �� ǥ���Ǵ� ���� �ٻ� ������ ǥ��
		 	
		 	0.15�� double�� ����(64ĭ¥��)�� �ε��Ҽ��� ������� ���� ��
		 	
				[�ε� �Ҽ��� ǥ��]
				��ȣ 1,         ���� 11, 
				  0          011 1111 1100 
				                                                          ���� 52
				0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011
				
				�̿Ͱ��� ǥ���ǰ� �̰� �ٽ� ���������� ��ȯ�ϸ�
				
				0.14999999999998858690730685339076
				
				������ �߻��� ���� Ȯ�� ����
			
		 */

		System.out.println();

		String s1 = "3000 �̻�";
		String s2 = "3000 �̸�";

		System.out.println("A����� �μ�Ƽ������ ���� : " + aIncen);
		System.out.println(aIncen >= 3000 ? s1 : s2);
		
		System.out.println("B����� �μ�Ƽ������ ���� : " + bIncen);
		System.out.println(bIncen >= 3000 ? s1 : s2);
		
		System.out.println("C����� �μ�Ƽ������ ���� : " + cIncen);
		System.out.println(cIncen >= 3000 ? s1 : s2);

	}

}
