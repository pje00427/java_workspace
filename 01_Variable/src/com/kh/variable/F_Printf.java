package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
		
		/*
		 * * ��¹�
		 * 
		 * System.out.println(����ϰ��� �ϴ� ��);
		 * --> ��� �� ���� ����
		 * 
		 * System.out.print(����ϰ��� �ϴ� ��);
		 * --> ��¸� ���� (���� ���� X)
		 * 
		 * System.out.printf("����ϰ��� �ϴ� ����(����)", ��, ��, ...);
		 * --> ���� ������ ���Ŀ� ���缭 ��¸� ���� (���� ���� X)
		 * 
		 * * ������ ������ �� ������ �� �ִ� Ű����
		 * %d : ������ �� �ڸ���
		 * %c : ���ڰ� �� �ڸ���
		 * %s : ���ڿ� �� �ڸ���
		 * %f : �Ǽ��� �� �ڸ���
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "iNum1 : 10"
		System.out.println("iNum1 : " + iNum1);
		System.out.printf("iNum1 : %d\n", iNum1);
		System.out.printf("iNum1 : %d\n", iNum1, iNum2);
		
		// "iNum1 : 10, iNum2 : 20"
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		// "10 + 20 = 30"
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
		
		// 5ĭ�� ������ Ȯ���ϰ� ����ϰ��� �ϴ� ���� ������ ���Ľ�Ű����
		System.out.printf("%5d\n", iNum1);
		
		
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		
		// "dNum1 : xxxx, dNum2 : xxxx"
		
		// %f : �Ҽ��� �Ʒ� 6¥�� ���� ������ ��� (�Ѿ�� �ݿø��Ǽ� ���,���ڶ�� 0���� ä���� ���)
		System.out.printf("dNum1 : %f, dNum2 : %f\n", dNum1, dNum2);
		System.out.printf("dNum1 : %.3f, dNum2 : %.3f\n", dNum1, dNum2);
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str);
		
		System.out.printf("%C %S", ch, str);
		
		
		
	}

}
