package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Run2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); // �� ����
		
		try {
			// 5. load(InputStream is) : ���Ͽ� �մ� �����͵��� �ҷ��ͼ� prop�� ���
			prop.load(new FileInputStream("test.properties"));
			
			System.out.println(prop);
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			System.out.println(prop);
			
			System.out.println(prop.getProperty("Map"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 *  .properties�� ����ϴ� ���
		 *  1. �ش� ���α׷��� �⺻������ ������ �ִ� �������� .properties Ȯ���� ������ �����س�����
		 *     key=value  ��� ���ڿ��̱� ������ �����ڰ� �ƴ� �Ϲ��� �����ڰ� �ش� ������ �ٷ�� ����! => JDBC ���� �غ� ��
		 *     
		 *  2. xml���Ϸ� �����Ҽ��ִ� �޼ҵ嵵 ���� ����
		 *     .xml ������ �پ��� ���α׷��� ���� ȣȯ�� ����. 
		 *     .xml�� ���α׷� �� ȯ�漳�� ���õ� �������� ����صδ� Ȯ����
		 */
		
	}
	
	
}
