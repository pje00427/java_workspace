package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		// Desktop��ü ����
		// �귣���, ��ǰ�ڵ�, ��ǰ��, ����, ��ü����
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 1000000, true);
		
		// SmartPhone ��ü ����
		// �귣���, ��ǰ�ڵ�, ��ǰ��, ����, ��Ż�
		SmartPhone s = new SmartPhone("����", "s-01", "������", 1300000, "KT");
		
		// Tv ��ü ����
		// �귣���, ��ǰ�ڵ�, ��ǰ��, ����, ��ġ
		Tv t = new Tv("LG", "t-01", "�̳�����Ƽ��", 3500000, 60);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// �� �� ���� Ŭ�������� �������� �ʵ�, �޼ҵ� ������
		// �̷� �ߺ��� �ڵ�� �θ� Ŭ������ �ѹ��� ���Ǹ� �صΰ�
		// �� �θ� ������ ���ڴٶ�� ������ ����� ���������!!
		
		// --> ���߿� ���������� �ϰԵ� �� ������ ã�ư��� ������ �ʿ����
		//     �θ�Ŭ������ �������ָ� ��� ���� �ݿ���
		
		// �� Ŭ������ ������ �մ� �������� �ʵ�
		// brand, pCode, pName, price
		// �� Ŭ������ ������ �ִ� �������� �޼ҵ�
		// ���� �������� �ʵ嶧���� �ۼ��� set/getter�޼ҵ�, information�޼ҵ�
		
		// --> Product �θ� Ŭ������ �� �ѹ��� ���� �صΰ���!!
		
	}

}




