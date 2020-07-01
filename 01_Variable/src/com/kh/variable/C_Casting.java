package com.kh.variable;

public class C_Casting {
	
	// ����ȯ : ���� �ڷ����� �ٲٴ� ��
	
	/*
	 * * ��ǻ�Ϳ����� �� ó�� ��Ģ (��, ����ȯ�� �ʿ��� ��Ȳ)
	 * 1. ���Կ����ڸ� �������� �ؼ� ���� �ڷ����� ������ �ڷ����� ��ġ�ؾߵ�
	 *    --> ���� �ڷ����� �ش��ϴ� ������ ���Ե�
	 *    --> �ٸ� �ڷ����� ���� �����ϰ��� �Ѵٸ� �����ϰ����ϴ� �� ���� ����ȯ�� �ʼ�
	 * 
	 * 2. ���� �ڷ��������� ����� ���� --> �� ����� ������ ���� �ڷ��� 
	 *    int ���� = int�� + double��
	 *    
	 * * ����ȯ ����
	 * - �ڵ�����ȯ : �ڵ����� ����ȯ�Ǽ� �˾Ƽ� ����(����,���)�Ǳ� ������ ����ȯ�� ���� �� �ʿ� ����
	 * - ����(�����)����ȯ : �ڵ����� ����ȯ�� ���� �ʴ� ��� ���� ����ȯ�� ����ߵ�
	 *   [ǥ����] (�ٲ��ڷ���)��
	 */
	
	// �ڵ�����ȯ (�����ڷ����� ���� �ڵ����� ū�ڷ����� ������ ��ȯ)
	public void rule1() {
		
		// 1) int(4byte) --> double(8byte)
		// > ���� ����
		int i1 = 12;
		double d1 = /*(double)*/i1;   // double d1 = 12.0;
		
		System.out.println("d1 : " + d1);
		
		// > ��� ����
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // double result = 12.0 + 3.3;
		
		System.out.println("result : " + result);
		
		// 2) int(4byte) --> long(8byte)
		// > ���Կ���
		int i3 = 2222;
		long l3 = /*(long)*/i3;   // long l3 = 2222L;
		
		// > �������
		int i4 = 2147483000;
		long l4 = 1000000000L;
		
		long result2 = /*(long)*/i4 + l4;
		
		System.out.println("result2 : " + result2);
		
		
		// 3) float(4byte) --> double(8byte)
		// > ���Կ���
		float f5 = 1.0f;
		double d5 = /*(double)*/f5;
		
		double result3 = /*(double)*/f5 + d5;
		
		
		// ** Ư�� ���̽� **
		// 1) long(8byte) --> float(4byte)
		// > ���Կ���
		long l6 = 1000000000L;
		float f6 = /*(float)*/l6;
		// float �Ǽ����� 4byte��� �ص� long ���������� ǥ�� ������ ���� ������ �ξ� �� ũ�⶧���� �ڵ�����ȯ�߻�!
		
		System.out.println("f6 : " + f6);
		
		// 2) char(2byte) <-> int(4byte)
		int num = 'A'; // �ش� ������ �����ڵ� ���� ���
		System.out.println("num : " + num);
		
		char ch = 65; // �������� �Ұ�
		System.out.println("ch : " + ch);
		
		// �����ڵ� ǥ ���� (0~65535) --> �ѱ۱��� ǥ��
		// �� �� �Ϻκ��� �ƽ�Ű�ڵ�  --> ������, ����, Ư����ȣ
		
		
		// 3) byte, short ���� ���� --> ������ int������ ���
		byte b1 = 1;
		byte b2 = 10;
		
		//byte result4 = b1 + b2; // ���� �߻�
		// --> ��������� ������� ������ ����ȯ �ϸ� �ذ� ����
		byte result4 = (byte)(b1 + b2);
		
		System.out.println("result4 : " + result4);
		
	}
	
	// ��������ȯ (ū �ڷ����� ���� �ڷ������� ��ȯ�� ��)
	public void rule2() {
		
		// 1) double(8byte) --> float(4byte)
		// > ���Կ���
		double d = 8.0;
		float f = (float)d;
		
		float f1 = 5.0f;
		
		// 2) double(8byte) --> int(4byte)
		// > ���� ����
		double d2 = 5.89;
		int i = (int)d2; // int i = 5;
		
		System.out.println("i : " + i);
		
		int i2 = 10;
		
		//int iSum = d2 + /*(double)*/i2; // int iSum = 5.89 + 10.0
		
		// ���� �ذ� ��� 
		// ���1. ��������� �����(double�ڷ���)�� int������ ��������ȯ �� �� ���
		int iSum = (int)(d2 + i2); // int iSum = (int)15.89 --> 15
		System.out.println("iSum : " + iSum);
		// �Ǽ�=>���� ����ȯ �ϰ� �Ǹ� �Ҽ��� �Ʒ��� ���� (������ �ս� �߻�)
		
		// ���2. �������� double�� ���� int������ ��������ȯ �� �� ���
		int iSum2 = (int)d2 + i2; // int iSum2 = (int)5.89 + 10 => 5 + 10
		System.out.println("iSum2 : " + iSum2);
		
		// ���3. ���� ������� �ƽθ� double���� ���
		double dSum = d2 + i2; // double dSum = 5.89 + 10.0 => 15.89
		System.out.println("dSum : " + dSum);
		
		
		
		// byte�� short ���� ���� --> ������ int������ ���
		byte b1 = 1;
		short s1 = 2;
		
		//byte bSum = b1 + s1;
		//short sSum = b1 + s1;
		// �ذ���1. ���� ����� byte �Ǵ� short�� ��������ȯ �� �� �ش� ������ ���
		byte bSum = (byte)(b1 + s1); // 3
		short sSum = (short)(b1 + s1); // 3
		
		// �ذ���2. ���� ����� �ƽθ� int�� ������ ���
		int sum = b1 + s1; // 3
		
	}
	
	

}





