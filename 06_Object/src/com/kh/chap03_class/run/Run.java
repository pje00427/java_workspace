package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		// �ʵ忡 �� �ʱ�ȭ
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("������");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		
		System.out.println("�̸� : " 
					+ p.getName());
		System.out.println("���� : "
					+ p.getAge());
		
		System.out.println(p.information());
		
		
		Product pro1 = new Product();
		
		pro1.setpName("������");
		pro1.setPrice(900000);
		pro1.setBrand("�Ｚ");
		
		/*
		System.out.println(pro1);
		
		int[] arr = new int[4];
		System.out.println(arr);
		*/
		
		Product pro2 = new Product();
		pro2.setpName("������");
		pro2.setPrice(1300000);
		pro2.setBrand("����");
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		// 1���� �귶���ϴ�.. ������ �������ݺ��� 100000�� ����..
		//pro1.setPrice(800000);
		pro1.setPrice(pro1.getPrice() - 100000);
		pro2.setPrice(pro2.getPrice() - 100000);
		
		System.out.println("==== 1�� ��.. ====");
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		// Ŭ���� �տ� public : ��𼭵� �� �� ������
		// Ŭ���� �տ� default : ���� ��Ű���ȿ� �ִ� Ŭ���������� �� �� ���� (�ٸ���Ű������ ��� �Ұ�)
		
	}

}







