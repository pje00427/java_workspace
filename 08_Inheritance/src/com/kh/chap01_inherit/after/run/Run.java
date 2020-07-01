package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

public class Run {
	
	public static void main(String[] args) {
		
		// Desktop ��ü ����
		/*
		Desktop d = new Desktop();
		d.setBrand("�Ｚ");
		d.setpCode("d-01");
		d.setpName("¯¯����ũž");
		d.setPrice(1000000);
		d.setAllInOne(true);
		*/
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 1000000, true);
		
		SmartPhone s = new SmartPhone("���", "s-01", "������", 1300000, "SK");
		
		Tv t = new Tv("LG", "t-01", "�̳�����Ƽ��", 3500000, 58);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		
		/*
		 *  * ����� ����
		 *  - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 *  - �������� �ڵ���� �ϳ��� Ŭ������ �����ϱ� ������ ���ο� �ڵ带 �߰��ϰų� ���濡 ���� 
		 *    => ���������� ����! ���꼺 ���
		 *    
		 *  * ����� Ư¡
		 *  - Ŭ�������� ����� ���� ��� �Ұ���!!(���� ��Ӹ� ���� ��, �θ�� �ϳ����ߵ�!)
		 *  - ��� Ŭ�������� ��õǾ� ���� ������ Object Ŭ������ �ļ��̴�. 
		 *    => ��, Object Ŭ������ �����ϴ� �޼ҵ���� �������̵��ؼ� ������ �� �� ����!!
		 *  
		 */
		
		System.out.println(d);
		System.out.println(d.toString());
		
		// ��¹� �ȿ� ���۷��� ������ �������� ��
		// JVM�� �ش� ���۷�������.toString() ȣ���� ����� ��ǻ� ����ߴ���!!
		
		
	}

}





