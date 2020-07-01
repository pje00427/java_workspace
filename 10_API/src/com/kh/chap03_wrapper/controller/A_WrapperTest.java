package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	
	/*
	 *  * Wrapper Ŭ����
	 *  
	 *  - �⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� ����(Wrapper) Ŭ�����̴�.
	 *  
	 *    �⺻�ڷ���		 WrapperŬ����
	 *    
	 *    boolean  <-->   Boolean
	 *      char   <-->  Character
	 *      byte   <-->     Byte
	 *     short   <-->    Short
	 *      int    <-->   Integer
	 *      long   <-->     Long
	 *     float   <-->    Float
	 *    double   <-->    Double
	 *  
	 *  - �⺻ Ÿ���� ��ü�� ����ؾ� �Ǵ� ��찡 ����
	 *    ex) �޼ҵ��� �Ű������� ��ü Ÿ�Ը��� �䱸�� ��
	 *        �������� �����ϰ� ���� ��
	 *        Ŭ�������� �����ϴ� �޼ҵ带 ����ϰ� ���� ��
	 */
	
	// �⺻�ڷ��� --> Wrapper Ŭ���� �ڷ������� �ٲ㺸��!
	public void method1() {
		
		// Boxing : �⺻�ڷ���-->WrapperŬ����
		int num1 = 10;
		int num2 = 15;
		// int == Integer
		//num1.equals(num2);
		
		// 1. ��ü ������ ���� �ϴ� ���
		Integer i1 = new Integer(num1); // num1 --> i1
		Integer i2 = new Integer(num2); // num2 --> i2
		
		System.out.println(i1/* .toString() */);
		System.out.println(i2);
		// Integer ���� ��� Wrapper Ŭ�������� toString �������̵� �Ǿ�����!
		
		// ��üȭ ��Ų ���� �޼ҵ� �̿� ����
		System.out.println(i1.equals(i2));
		// equals �������̵� �Ǿ�����! �ּҰ� �񱳰� �ƴ� ������ �񱳷�!
		System.out.println(i1.compareTo(i2)); // �� ���� ���ؼ� ������ ũ�� 1��ȯ, ������ ũ�� -1��ȯ, ������ 0��ȯ�ϴ� �޼ҵ�
		
		// ��üȭ ��Ų ���� ������ ���� ����
		Object o = num1; // int --> Integer --> UpCasting(�ڽ� --> �θ�) ���� ���� --> Object
		Object o2 = i1;
		
		// 2. ��ü �������� �ʰ� �ٷ� ���� ��� (AutoBoxing)
		Integer i3 = num2; // �ٷ� ���� ����.. (��, ���� Ÿ�����θ�)
		
		// ���� ��ü������ �ؼ� Boxing�մϱ�?
		// ��, ��ü ������ ���� Boxing �ϰ� �Ǹ� ���ڿ��� ���� �� �ִ�!! --> ���ڿ��� ����ȭ ������!! (���ڿ��� ���ڸ� �־�ߵ�!!)
		Integer i4 = new Integer("123"); // "123" --> 123
		//Integer i5 = "123";
		System.out.println(i4);
		
		
		
		// UnBoxing : Wrapper Ŭ���� --> �⺻�ڷ������� �ٲٴ� ��
		
		// 1. ����Ŭ�������� �����ϴ� xxxValue() �޼ҵ带 ����
		
		// i1 --> num3
		int num3 = i1.intValue(); // 10
		int num4 = i2.intValue(); // 15
		
		System.out.println(num3 + ", " + num4);
		
		// 2. �޼ҵ���� ������� �ʰ� �ٷ� �����ϴ� ��� (AutoUnBoxing)
		int num5 = i3;
		
		
		// Auto�� ���ִ� ��ɵ��� ������ ���� ��ü������ ���� Boxing�� �Ѵٰų� xxxValue�޼ҵ带 ���ؼ� UnBoxing�� �ϳ�?
		// �׷��� 9���� ���ĺ��ʹ� �ش� ����� �Ⱦ����� Deprecated �Ǿ��ִ�.
		
	}
	

}





