package com.kh.variable;

// �ٸ� ��Ű����� ���� Ŭ���������� ����� �� ���
public class A_Variable { // Ŭ���� ����
	
	/*
	 * * �н���ǥ
	 * 1. ������°� �����
	 * 2. ������ �� ����ϴ���
	 * 3. ������ ����ϴ� ���
	 * 4. �������� ��� ������ �Ǵ���
	 */
	
	public void printVariable() { // printVariable �޼ҵ� ����
		
		System.out.println("===���� ��� ��===");
		System.out.println(200 + 10);
		System.out.println((200 + 10) * 10);
		System.out.println(((200 + 10) * 10) - 10);
		// ������� �� ��µ����� �����ǹ����� �� �� ����
		
		// 1. ������ ? --> ��� ���� �޸𸮿� ����ϱ� ���� ����(�ڽ��͵� ���� ����)
		
		int point = 200;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println("===���� ��� �� ===");
		System.out.println(point + bonus); 
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		/*
		 * 2. ������ ����ϴ� ����
		 * -  ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ��� (�������� ������)
		 * -  �ѹ� ���� �����صΰ� ��� ����� �������� ���
		 * -  ���������� ���� �ϱ� ���� ����
		 */
		
	} // printVariable �޼ҵ� ��
	
	
	public void declareVariable() { // declareVariable �޼ҵ� ����
		
		/*
		 * * ���� ���� (������ �޸� ������ Ȯ���س��� ����) == �ڽ�����ڴ�!!
		 * 
		 * [ǥ����] �ڷ��� ������;
		 * 
		 * �ڷ��� : ����� ��������, �ũ���� ���� ���������� ���� ����(�ڽ�)�� ũ�� �� ����� ���ϴ� �κ�
		 * ������ : ����(�ڽ�)�� �̸��� ���ϴ� �κ� (�ǹ̺ο�)
		 * 
		 * * ������ ��
		 * - �������� �ݵ�� ù ���ڰ� �ҹ��ڿ����Ѵ�.
		 * - �����ܾ�� ���յ� ��� ��Ÿǥ��� ��Ű�� (testVariable) 
		 * - ���� �������� ������ ���������� ���� �Ұ�
		 * - �ش� ����({})�� ������ ������ �ش� �����ȿ����� ���� �� �� �ִ�. (��������)
		 * 
		 */
		
		// --- �ڷ����� ���� ���� ---
		
		// 1. ���� 
		boolean isTrue;			// 1byte
		
		// 2. ������
		// 2_1. ������ (4����)
		byte bNum;				// 1byte
		short sNum;				// 2byte
		int iNum;				// 4byte --> �������߿� ���� ��ǥ���� �ڷ���(�⺻��)
		long lNum;				// 8byte
		
		// 2_2. �Ǽ��� (2����)
		float fNum;				// 4byte
		double dNum;			// 8byte --> �Ǽ��� �߿� ���� ��ǥ���� �ڷ���(�⺻��)
		
		// 3. ����(�ѱ���)��
		char ch;				// 2byte
		
		// ---------- ���� ���� �⺻ �ڷ���(8��) -----------
		
		// 4. ���ڿ� (�����ڷ���)
		String str;
		
		
		/*
		 * * ������ �� ����(���)
		 * 
		 * [ǥ����] ������ = ������ϴ� ��;
		 */
		
		isTrue = true;		// ���� �������� true/false ���� ���尡��
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;	// long�� �������� ���ڰ� �ڿ� l �Ǵ� L�� ���̴°� ������� 
		
		fNum = 4.0f; // �ݵ�� f�� �ٿ��� �� 
		dNum = 8.0;
		
		ch = 'A';
		ch = '��';
		
		str = "ABC";
		str = "A";
		
		// * ������ ���� �� ������ ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
	} // declareVariable �޼ҵ� ��
	
	
	public void initVariable() {
		
		// * ���� ����� ���ÿ� �ʱ�ȭ
		// [ǥ����] �ڷ��� ������ = ��;
		
		// 1. ����
		boolean isTrue = false; // 1byte
		// 2_1. ������
		byte bNum = 1;		// 1byte
		short sNum = 2;		// 2byte
		int iNum = 4;		// 4byte	--> �⺻��
		long lNum = 8L;		// 8byte
		// 2_2. �Ǽ���
		float fNum = 4.0f;	// 4byte
		double dNum = 8.0;	// 8byte	--> �⺻��
		// 3. ������
		char ch = '��';		// 2byte 
		
		// ----- �⺻�ڷ���(8��) ----
		
		// ----- �����ڷ��� -----
		String str = "�ȳ��ϼ���";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
		
		// 4. ���� ��� ��Ģ
		int number;
		
		// 1) �������� �ߺ��Ǽ��� �ȵ� (�ٸ��ڷ����̿��� �ȵ�)
		//	   ��, ��ҹ��ڴ� ������
		//double number;
		int numBer;
		
		// 2) �����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű����) ����� �Ұ�
		//int public;
		//int void;
		//int abstract;
		//int true;
		
		// 3) ���� ��� ���� (��, ���ڷ� �����ϴ� �� �ȵ�)
		int age1;
		//int 1age;
		
		// 4) _ �Ǵ� $ Ư�� ���� ��� ���� (�� ���� Ư������ ��� �Ұ�)
		int number_1;
		int number$1;
		//int number#1;
		
		
		// * ��Ÿǥ��� ��Ű�°� �������
		String username;
		String userName;
		
		// * �ѱ��� ������� �ʴ°� �������
		String �̸�;
		
	}
	
	
	
} // Ŭ���� ��










