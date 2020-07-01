package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ�
		
		// 1. FileWriter ��ü ���� --> �ش� ���Ͼ����� �ڵ����� �������, ������ ���ϰ� �ٷ� ����
		//							true ���ý� ������ ���Ͽ� �̾�ۼ�
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. write() �޼ҵ� ����ؼ� ���
			fw.write("��! IO ��Ե�..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. ��Ʈ�� �ݳ��ϱ�
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		// try ~ with ~ resource ���� (JDK 7���� ����)
		/*
		 * try(��Ʈ�� ��ü ��������; ��Ʈ�� ��ü ��������;) {
		 * 
		 * } catch(����Ŭ���� ������) {
		 * 
		 * } 
		 */
		
		try(FileWriter fw = new FileWriter("b_char.dat")) {
			
			// 2. write() �޼ҵ� ����ؼ� ���
			fw.write("��! IO ��Ե�..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹ޱ�
		
		// 1. FileReader ��ü ����
		try(FileReader fr = new FileReader("b_char.dat")){
			
			// 2. ������ �о���� (read())
			// ������ ���� ������ -1
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}






