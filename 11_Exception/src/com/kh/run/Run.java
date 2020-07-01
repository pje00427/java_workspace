package com.kh.run;

import java.io.IOException;

import com.kh.exception.A_UnCheckedException;
import com.kh.exception.B_CheckedException;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * * ��������
		 * 1. �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� --> �ҽ��ڵ� �ذ�ȵ� --> �ɰ��� ����
		 * 2. ������ ���� : �ҽ��ڵ� ������ ���� --> �����ٷ� ���ʿ� �˷��� 
		 * 3. ��Ÿ�� ���� : �ڵ� �����δ� ������ ���µ� ���α׷� �����ϰ� ���� �߻��ϴ� ���� (������� �Ǽ��ϼ��� �ְ� ���������� ��츦 ����� ó�� ���� �������� �Ǽ��ϼ���..)
		 * 
		 * ����. �� ���� : ���������� �������� ���α׷� �����Ҷ��� ������ ������ ���α׷� �ǵ��� ���� �ʴ� ��
		 * 
		 * �ý��� ������ ������ ������ ����, ��Ÿ�� ���� ���� ���� �� �ɰ��� ��(�ҽ��ڵ�� �ذ� ����)���� �۾�!
		 * �̷� �͵��� "����"��� ��!!  --> Exception
		 * 
		 * �̷� "���ܵ��� �߻�" ���� ��� "ó��" �ϴ� ����� "����ó��"
		 * 
		 * * ���� ó�� ���
		 * 1. try~catch��
		 * 2. throws�� �̿� (����)
		 * 3. try~with~resource
		 */
		
		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		
		B_CheckedException b = new B_CheckedException();
		b.method1(); // try~catch���� �ʰ� ���⼭ ������ ���ѱ�� ���� JVM�� ó���ع���!! (�������X)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
