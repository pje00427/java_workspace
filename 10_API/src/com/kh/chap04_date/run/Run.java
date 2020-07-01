package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
	
	/*
	 * Date(java.util)
	 * - �ڹ� ��â�� ������ ��� ���ϰ� ����� ���� �ϼ����� ���� ����! �ٱ������� ���⿡�� ���� ���� ����
	 */
	
	public static void main(String[] args) {
		
		// �⺻�����ڸ� ���� Date ��ü ����
		Date today = new Date();
		
		System.out.println("�⺻ ������ (���糯¥) : " + today); // �ý��� ��¥�� ����Ǵ°���!!
		System.out.println();
		
		// �Ű����������ڸ� ���� ���� ��¥ �����ϱ�!
		// 2020�� 5�� 21��
		System.out.println("----- 2020�� 5�� 21�Ϸ� �����ϱ� -----");
		//Date date1 = new Date(2020, 5, 21); // ���������� ���� ������ "�⵵ + 1900"���ϰ� ���� ������ "�� + 1"�� ������!!
		Date date1 = new Date(120, 4, 21, 6, 10, 30);
		
		System.out.println("1. �Ű����� ������ : " + date1);
		
		// �⺻�����ڷ� ���� �� setter�޼ҵ�� �����ϴ� ���
		Date date2 = new Date(); // ���糯¥ ����Ͻú���
		date2.setYear(2020-1900); // 120
		date2.setMonth(5-1); // 4
		date2.setDate(21);
		
		System.out.println("2. setter�޼ҵ�� ���� : " + date2);
		
		System.out.println();
		
		// getter�޼ҵ� ����
		System.out.println(date2.getYear() + 1900 + "��");
		System.out.println(date2.getMonth() + 1 + "��");
		System.out.println(date2.getDate() + "��");
		System.out.println(date2.getDay());
		System.out.println(date2.getHours() + "��");
		// getMinutes, getSeconds
		
		// 2020�� 05�� 21�� 11�� 11�� 12��
		
		// Ư�� ����(����)�� ������ ä�� ��µǰԲ�!! --> SimpleDateFormatŬ����
		
		// SimpleDateFormat �Ű����� �����ڷ� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		// today --> String
		String todayStr = sdf.format(today);
		System.out.println(todayStr);
		
		
		
		
	}

}
