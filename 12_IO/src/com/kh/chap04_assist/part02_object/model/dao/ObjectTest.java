package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectTest {

	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		Phone ph = new Phone("삼성", "갤럭시s10", 1300000);
		
		// 객체를 파일에 출력할 때 사용되는 스트림
		
		// FileOutputStream : 기반스트림 (파일과 직접적인 연결 통로)
		// ObjectOutputStream : 보조스트림 (객체 단위로 출력될 수 있게 도와주는 역할)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"))){
			
			// 객체 출력시 사용되는 메소드 writeObject()
			oos.writeObject(ph); // NotSerializableException : 직렬화가 되지 않았을 때 발생!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileInputStream : 기반스트림 (파일과의 직접 적인 연결 통로)
		// ObjectInputStream : 보조스트림 (객체 단위로 입력받을 수 있게 도와주는)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"))){
			
			// 객체로 데이터 입력받기 readObject() 메소드 이용
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




