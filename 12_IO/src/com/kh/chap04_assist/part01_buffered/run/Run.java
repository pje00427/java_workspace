package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedTest;

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 * ���� ��Ʈ�� : ��� ��Ʈ�������� �����ߴ� ������ ���� ��� �����ִ� ���
		 * 			    ������Ʈ�� �ܵ����� ��� �Ұ�! �ݵ�� ��ݽ�Ʈ�� �ʿ�!
		 * 
		 * Buffered : �ӵ��� ��� ��Ŵ, ��� ��Ʈ������ �������� �ʴ� �޼ҵ���� ����
		 * 
		 */
		
		BufferedTest b = new BufferedTest();
		//b.fileSave();
		b.fileRead();

	}

}
