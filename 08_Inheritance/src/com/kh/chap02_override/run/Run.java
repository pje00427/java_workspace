package com.kh.chap02_override.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;
import com.kh.chap01_inherit.model.vo.Vehicle;
import com.kh.chap02_override.model.vo.Book;

//import java.lang.*;

public class Run {
	
	// ��� Ŭ������ Object�� �ļ��̴�. ��, �ֻ���Ŭ������ �׻� Object
	// �׸��� �ｼ Object�� �ִ� �޼ҵ�� �� ���� �� �� �ִ�!
	// �Ǵٸ� ���δ� Object�� �ִ� �޼ҵ�� ������ ����! (�������̵� ����!)
	
	public static void main(String[] args) {
		
		/*
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr.hashCode());
		*/
		
		Book bk1 = new Book("������ ����", "������", 10000);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 20000);
		
		//System.out.println(bk1.information());
		//System.out.println(bk2.information());
		
		
		// 1. toString() ---------------------------------------------
		// �������̵� �� : ObjectŬ������ toString() ���� 		--> "Ǯ��Ű���� + @ + ��ü�� �ؽ��ڵ� 16���� ��" ����
		// �������̵� �� : BookŬ������ toString() ����		--> "�ش� ��ü�� �������ִ� �ʵ尪���� �ϳ��� ���ڿ�" ����
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		// ��¹����� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� �ش� ���۷���.toString() ȣ�����ش�.
		// ��, ���۷���.toString()�� ��������� ������ �ʿ� ����!!
		
		System.out.println(bk1);
		System.out.println(bk2);
		
		System.out.println("======================================");
		
		// ------------------- equals()�� hashCode()�� ������ �۾�!! -----------------
		
		// 2. equals() ----------------------------------------------------------
		// �������̵� �� : Object Ŭ������ equals() �޼ҵ� ���� 		--> ����ü�� ������ ��ü�� �� "�ּҰ����� ������ ��"
		// �������̵� �� : Book Ŭ������ equals() �޼ҵ� ����		--> �� ��ü�� �ּҰ� �񱳰� �ƴ� "���� �ʵ� ������ ��� ��ġ�ϸ� true ��ȯ"
		
		Book bk3 = new Book("������ ����", "������", 10000); // bk1�� ������ �ʵ尪�� ���� bk3��ü ����
		
		System.out.println("bk1�� bk3�� ���� å�Դϱ�? : " + (bk1 == bk3)); // false
		System.out.println("bk1�� bk3�� ���� å�Դϱ�? : " + bk1.equals(bk3)); // false --> �������̵� �� true
		
		// ���ϰ�ü : ���� �ʵ尪�鵵 ���� (equals()) �ؽ��ڵ尪�� ���� ��� 
		
		// 3. hashCode() ---------------------------------------------------------
		// �������̵� �� : Object Ŭ������ hashCode() �޼ҵ� ����		--> �ش� ��ü�� ���� �ּҰ��� 10������ ����� �����
		// �������̵� �� : Book Ŭ������ hashCode() �޼ҵ� ����			--> ���� �ּҰ��� ������ ����� �ϴ°� �ƴ� �ʵ尪���� ������ �ؽ��ڵ带 ����� ���
		System.out.println("bk1�� �ؽ��ڵ� : " + bk1.hashCode());
		System.out.println("bk2�� �ؽ��ڵ� : " + bk2.hashCode());
		System.out.println("bk3�� �ؽ��ڵ� : " + bk3.hashCode());
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); // String Ŭ������ �̹� �������̵� �Ǿ��ִ� �޼ҵ� ȣ��
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.toString());
		
		Object bk4 = new Book();
		Object a = new Airplane();
		Vehicle v = new Car();
		Vehicle v2 = new Ship();
		
		Car c = new Car();
		
		
	}

}







