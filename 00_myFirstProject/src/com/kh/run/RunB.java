package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {
	
	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ� ȣ�� �ϰ��� �Ҷ� ���Ѿ� �� ����
		// 1) ����ϰ��� �ϴ� Ŭ���� ���� (new) �ؾ߸� ��
		//    [ǥ����] Ŭ������ ������̸� = new Ŭ������();
		B_ValuePrinter b = new B_ValuePrinter();
		
		// 2) �����ϰ��� �ϴ� �޼ҵ� ȣ��
		//	  [ǥ����] ������̸�.�����Ҹ޼ҵ��();
		//b.printValue();
		b.sumStringNumber();
		
	}

}




