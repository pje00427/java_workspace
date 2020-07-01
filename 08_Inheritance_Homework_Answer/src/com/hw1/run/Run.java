package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student("ȫ�浿", 20, 178.2, 70, 1, "�����ý��۰��а�");
		stu[1] = new Student("�踻��", 21, 187.3, 80, 2, "�濵�а�");
		stu[2] = new Student("������", 23, 167.0, 45, 4, "������Ű��а�");
		
		for(Student s : stu) {
			System.out.println(s.information());
		}
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[10];
		int count = 0;
		
		while(true) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			emp[count] = new Employee(name, age, height, weight, salary, dept);
			
			count ++;
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(emp[i].information());
		}
	}

}
