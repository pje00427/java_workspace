package com.kh.first;

/*
 * ** ��Ģ **
 * 1. Ŭ������ --> �빮�ڷ� ����
 * 2. ��Ű���� --> �ҹ��ڷ� ����
 * 3. �޼ҵ�� --> �ҹ��ڷ� ����
 * 4. ������    --> �ҹ��ڷ� ����
 * 
 * com.kh.first.A_MethodPrinter.methodA
 * 
 * > ��, �������� �ܾ ���յǾ� ���� ���� �ܾ� ���ڸ� ���� �빮�ڷ�! == ��Ÿǥ���
 * 	 ex) Ŭ������ Methodprinter => MethodPrinter
 * 		  �޼ҵ�� testprint => testPrint
 * 
 * > �׻� �ǹ��ְ� �̸�����!
 * > �ѱ۸� �������!
 * 
 */

public class B_ValuePrinter { // Ŭ���� ����
	
	// �پ��� ������ ���� ����ϴ� ����� �����ϴ� �޼ҵ�
	public void printValue() {
		
		// 1. ���� ���  --> ����ǥ ����
		System.out.println(123);		// ������ ��� ����
		System.out.println(1.23);		// �Ǽ��� ��� ����
		
		// 2. ����(�ѱ���) ���  --> Ȭ����ǥ �̿�
		System.out.println('a');
		System.out.println('��');
		
		// 3. ���ڿ�(��������) ��� --> �ֵ���ǥ �̿�
		System.out.println("������");
		System.out.println("�ȳ��ϼ���");
		
		// 4. ������ ��� ���� ��� ����
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // ��ǻ�Ϳ����� �Ǽ��� ������ �ҿ����ؼ� �̼��� ���� �߻�����
		
		// 5. ���ڿ� ���ڴ� ���갡�� --> ���ڿ� ���� ����� ���ڸ� �ڵ����� ���ڷ� �ν�
		System.out.println('a' + 1); // �� ���ڸ��� ��ǻ�Ͱ� �ν��ϴ� ������ ���ڰ� (a=97)
		
		// 6. ���ڿ�("")�� �� ���� ������ �������� --> ���ڿ�ȭ ��
		System.out.println("����" + 'a');		// "����a"
		System.out.println("�ȳ��ϼ���" + 123);   // "�ȳ��ϼ���123"
		System.out.println("�ݰ����ϴ�" + 111 + 222); // "�ݰ����ϴ�111" + 222 ==> "�ݰ����ϴ�111222" 
		
	}
	
	// ���ڿ��� ������ �������� ��ɿ� �޼ҵ�
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// "99"
		System.out.println("9" + 9);	// "99"
		System.out.println("9" + "9");	// "99"
		
		System.out.println("--");
		
		System.out.println(9 + 9 + "9"); // 18 + "9" ==> "189"
		System.out.println(9 + "9" + 9); // "99" + 9 ==> "999"
		System.out.println("9" + 9 + 9); // "99" + 9 ==> "999"
		System.out.println("9" + (9 + 9)); // "9" + 18 ==> "918"
		
	}
	
	
	
} // Ŭ���� ��




