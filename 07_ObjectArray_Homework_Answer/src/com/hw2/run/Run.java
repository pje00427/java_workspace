package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Student[] sArr = new Student[10];
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			sArr[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.print("��� �߰��Ͻðڽ��ϱ�? (y/n) : ");
			/*
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				break;
			}
			*/
			char ch = sc.nextLine().toUpperCase().charAt(0); // �ƿ� ����ڰ� �Է��� ���ڿ��� "�빮��"�� ��ȯ�� �� 0���ε��� �����ϱ�
			
			if(ch == 'N') {
				break;
			}
		}
		
		// ���1. ���� �߰��� �л� ��ü�� ��µǰԲ� count ����ŭ �ݺ�
		/*
		for(int i=0; i<count; i++) {
			System.out.println(sArr[i].information());
		}
		*/
		
		// �Ʒ��� ���� �迭�� �������ε��� ���� ���������� �����ϸ鼭 ��½�
		// NullPointerException �߻��� �� ����!!
		// ��? ���� 3���� �л��� �߰��Ǿ��� ���
		// sArr[0], sArr[1], sArr[2]������ ����ְ� sArr[3] ~ sArr[������]�� null�� ������ ��
		// null.xxx() �޼ҵ� ȣ�� �� NullPointerException �߻�!!
		/*
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].information());
		}
		*/
		
		// ���2. ���� �� ���� �ݺ����� ���� �ʹٸ�
		for(int i=0; i<sArr.length; i++) {
			// �ٷ� ����ϱ� �� �ش� ��ü�� null�� �ƴ� ��츸 ����ϰԲ� ���� �˻� �ϸ��
			if(sArr[i] != null) {
				System.out.println(sArr[i].information());
			}
		}
	}
	
}
