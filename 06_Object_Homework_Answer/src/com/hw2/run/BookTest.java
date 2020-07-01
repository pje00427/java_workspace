package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		// 1. �⺻�����ڸ� �̿��� ��ü����, �Ű������� �̿��� ��ü���� �� ���
		Book bk1 = new Book();
		Book bk2 = new Book("�ڹ�������", 20000, 0.2, "����");

		System.out.println(bk1.information());
		System.out.println(bk2.information());

		System.out.println("=============================");

		// 2. ù��° ��ü�� ���� ���� setter�� �̿��ؼ� ���� �� ���
		bk1.setTitle("C���");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("ȫ�浿");

		System.out.println("������ ��� Ȯ��");
		System.out.println(bk1.information());

		System.out.println("=============================");

		// 3. getter�� �̿��Ͽ� �� ��ü ���� �������� ������ å ������ ����ؼ� �����
		// ���ε� ���� = ���� - (���� * ������)
		System.out.println("������ = " + bk1.getTitle());
		System.out.println("���ε� ���� = " + (int)(bk1.getPrice() - (bk1.getPrice() * bk1.getDiscountRate())) + "��");

		System.out.println("������ = " + bk2.getTitle());
		System.out.println("���ε� ���� = " + (int)(bk2.getPrice() - (bk2.getPrice() * bk2.getDiscountRate())) + "��");

	}

}
