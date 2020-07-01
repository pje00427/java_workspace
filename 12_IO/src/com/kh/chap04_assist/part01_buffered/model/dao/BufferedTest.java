package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// ������Ʈ�� �ܵ� ���Ұ�!! (��ݽ�Ʈ�� ��ü �ݵ�� �ʿ�)
		
		// 1. ��ݽ�Ʈ�� ���� ���� (���ϰ� ���� �����ϴ� ���)
		//FileWriter fw = new FileWriter("c_buffer.dat");
		
		// 2. ������Ʈ�� ���� (��� ��Ʈ����ü �����ϸ鼭 ����)
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// ���� ���� �ѹ��� ó��
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"))){
			
			// write() �޼ҵ� �̿��ؼ� ���
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine();  // ����־��ִ� �޼ҵ�
			bw.write("����������");			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// ��ݽ�Ʈ�� : FileReader
		// ������Ʈ�� : BufferedReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))){
			
			// �����͸� �о���� �� readLine() �޼ҵ� �̿� --> �� �ٴ����� �о����
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // ������ ���� ������ null
			System.out.println(br.readLine());
			*/
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}




