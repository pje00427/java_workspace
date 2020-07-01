package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {
	
	public static void main(String[] args) {
		
		// java.io.File
		
		// test.txt ���� ������!!
		
		try {
			// 1. ��������� ���� ���� ������ ���� project ������ �ش� ������ �������
			File f1 = new File("test.txt"); // �޸𸮻� File ��ü �����Ѱ� ��
			f1.createNewFile(); // �޼ҵ带 �����ؾ߸� ���� ���� �������!! --> IOException
			
			// 2. �����ϴ� ����̺곪 ������ ���� ����
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. �������� �ʴ� ���� ���ý� �ٷ� �ڵ����� ��������� ����!!
			//    ���� �����ϰ� ���� ����!
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile(); // �ٷδ� �ȵ�
			
			File tempFolder = new File("D:\\temp"); // ������ Ȯ���� �������ϸ� ������ �ν�
			tempFolder.mkdir(); // ���� ����� �޼ҵ�
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// ----------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			
			System.out.println(file.isFile());
			System.out.println(folder.isFile());
			
			System.out.println(file.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
			//System.out.println("���ܹ߻��߽��ϴ�!!");
		}
		
		//System.out.println("����");
		
	}

}









