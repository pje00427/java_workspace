package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectTest {

	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		Phone ph = new Phone("�Ｚ", "������s10", 1300000);
		
		// ��ü�� ���Ͽ� ����� �� ���Ǵ� ��Ʈ��
		
		// FileOutputStream : ��ݽ�Ʈ�� (���ϰ� �������� ���� ���)
		// ObjectOutputStream : ������Ʈ�� (��ü ������ ��µ� �� �ְ� �����ִ� ����)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"))){
			
			// ��ü ��½� ���Ǵ� �޼ҵ� writeObject()
			oos.writeObject(ph); // NotSerializableException : ����ȭ�� ���� �ʾ��� �� �߻�!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// FileInputStream : ��ݽ�Ʈ�� (���ϰ��� ���� ���� ���� ���)
		// ObjectInputStream : ������Ʈ�� (��ü ������ �Է¹��� �� �ְ� �����ִ�)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"))){
			
			// ��ü�� ������ �Է¹ޱ� readObject() �޼ҵ� �̿�
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}




