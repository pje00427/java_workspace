package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Mother;

public class Run {
	
	public static void main(String[] args) {
		
		//Person p = new Person(); // �߻�Ŭ�����δ� ���� ������ �Ұ� (���۷����δ� ��� ����)
		/*
		Person p1 = new Mother("������", 50, 70, "���");
		Person p2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// ������ �ƱⰡ ���� �Դ´�.
		p1.eat();	// ���� : ������ +10 / �ǰ��� -10
		p2.eat();	// �Ʊ� : ������ +3  / �ǰ��� +1
		
		// ������ �ƱⰡ ���� �ܴ�
		p1.sleep();	// ���� : �ǰ��� +10
		p2.sleep(); // �Ʊ� : �ǰ��� +3
		
		System.out.println("=== ������ ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		
		//Person p = new Person();
		//Basic b = new Basic(); // �������̽��� �̿ϼ��� ���±⶧���� ��ü ���� �Ұ�!!
		
		Basic b1 = new Mother("������", 50, 70, "���");
		Basic b2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 *  �Ϲ�Ŭ���� ���   -->  �߻�Ŭ���� ���  -->  �������̽� ����
		 *  		------------------------------>
		 *  		 �������� �� £���� (�Ծ��� �� ����)
		 *  
		 *  
		 *  Ŭ������ ��� 			: Ŭ���� extends Ŭ���� 				(���ϻ��)
		 *  Ŭ���� �������̽��� ����	: Ŭ���� implements �������̽�, �������̽� (���߻�� ����)
		 *  �������̽���			: �������̽� extends �������̽�, �������̽� 
		 *  
		 */
		
		
	}

}










