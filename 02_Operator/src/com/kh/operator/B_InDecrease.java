package com.kh.operator;

// ����������
public class B_InDecrease {
	
	/*
	 * 	* ����������
	 * 
	 *  ++ : �ش� ������ ��� ���� 1������Ű�� ������
	 *  -- : �ش� ������ ��� ���� 1���ҽ�Ű�� ������
	 *  
	 *  (����������)���� : ���� ������		=> ������ ��ó��
	 *  ����(����������) : ���� ������	=> ��ó�� ������
	 */
	
	public void method1() {
		
		// ���� ���� �׽�Ʈ
		int num1 = 10;
		
		System.out.println("���� num1�� �� : " + num1);			// num1=10  ���
		System.out.println("���� ���� 1ȸ ���� ��� : " + ++num1);// num1=11�� ������ �� ���
		System.out.println("���� ���� 2ȸ ���� ��� : " + ++num1);// num1=12�� ������ �� ���
		System.out.println("���� ���� 3ȸ ���� ��� : " + ++num1);// num1=13�� ������ �� ���
		System.out.println("���� num1�� �� : " + num1);			// num1=13 ���
		
		System.out.println("=====================");
		
		// ���� ���� �׽�Ʈ
		int num2 = 10;
		
		System.out.println("���� num2�� �� : " + num2);			// num2=10 ���
		System.out.println("���� ���� 1ȸ ���� ��� : " + num2++);// ����10 ��� �� num2=11�� ����
		System.out.println("���� ���� 2ȸ ���� ��� : " + num2++);// ����11 ��� �� num2=12�� ����
		System.out.println("���� ���� 3ȸ ���� ��� : " + num2++);// ����12 ��� �� num2=13�� ����
		System.out.println("���� num2�� �� : " + num2);			// num2=13 ���
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = ++a;	// a=11, b=11
		
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++;   // c=10(11), d=10
		
		System.out.println("c : " + c + ", d : " + d);
		
		System.out.println("==================");
		
		int num1 = 20;
		int result = num1++ * 3; // num1=20(21)  result=20*3=60
		
		System.out.println("num1 : " + num1 + ", result : " + result);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2=21    result2=21*3=63
		
		System.out.println("num2 : " + num2 + ", result2 : " + result2);
		
		
		//++num2; // num2=num2+1;
		
	}
	
	
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11) => 10���
		// a=11
		System.out.println((++a) + (b++)); // a=12, b=20(21) => 32���
		// a=12, b=21
		System.out.println((a++) + (--b) + (--c)); // a=12(13), b=20, c=29 =>12+20+29 => 61 ���
		
		// a=13, b=20, c=29
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		
	}
	
	
	

}





