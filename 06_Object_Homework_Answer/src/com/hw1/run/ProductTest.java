package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

		// 1. �Ű����� �����ڸ� �̿��Ͽ� 3���� ��ü ���� �� ���
		Product pro1 = new Product("ssgnote9", "�����ó�Ʈ9", "��⵵ ����", 960000, 10.0);
		Product pro2 = new Product("lgxnote5", "LG����Ʈ��5", "��⵵ ����", 780000, 0.7);
		Product pro3 = new Product("ktsnote3", "KT����Ʈ��3", "����� ����", 250000, 0.3);

		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());

		System.out.println("==============================================================");

		// 2. setter�޼ҵ带 �̿��Ͽ� ������ ��� 120�������� ����, �ΰ������� ��� 0.05�� ���� �� ���
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);

		pro1.setTax(0.05);
		pro2.setTax(0.05);
		pro3.setTax(0.05);

		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());

		System.out.println("==============================================================");

		// 3. getter �޼ҵ带 �̿��Ͽ� �� ��ü�� ���ݿ� �ΰ������� ������ ���� ������ ����ؼ� ���
		// �ΰ��� ���� ���� = ���� + (���� * �ΰ�����)
		System.out.println("��ǰ�� = " + pro1.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + (int)(pro1.getPrice() + (pro1.getPrice() * pro1.getTax())) + "��");
		
		System.out.println("��ǰ�� = " + pro2.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + (int)(pro2.getPrice() + (pro2.getPrice() * pro2.getTax())) + "��");
		
		System.out.println("��ǰ�� = " + pro3.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + (int)(pro3.getPrice() + (pro3.getPrice() * pro3.getTax())) + "��");

	}

}
