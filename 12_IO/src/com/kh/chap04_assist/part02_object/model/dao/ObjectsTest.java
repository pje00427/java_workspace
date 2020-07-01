package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsTest {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("����", "V40", 900000);
		arr[1] = new Phone("�Ｚ", "������", 1200000);
		arr[2] = new Phone("����", "������", 1500000);
		
		
		// ObjectOutputStream : ������Ʈ��(��ü �����ν� �����͸� ����� �� �ְ� �����ִ�)
		// FileOutputStream : ��ݽ�Ʈ��(���ϰ��� �������� �������)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.dat"))){
			
			// writeObject()
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// ObjectInputStream : ������Ʈ�� (��ü�����ν� �Է¹��� �� �ְ� �����ִ�)
		// FileInputStream : ��ݽ�Ʈ�� (���ϰ� ���������� ����� ���)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.dat"))){
			
			// readObject()
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // ������ ���� ������ ���� �� ��ȯx EOFException �߻� ==> ����ó���� �ذ�!
												  // EOF : End Of File
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("������ ���о����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

}





