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
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("엘지", "V40", 900000);
		arr[1] = new Phone("삼성", "갤럭시", 1200000);
		arr[2] = new Phone("애플", "아이폰", 1500000);
		
		
		// ObjectOutputStream : 보조스트림(객체 단위로써 데이터를 출력할 수 있게 도와주는)
		// FileOutputStream : 기반스트림(파일과의 직접적인 연결통로)
		
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
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// ObjectInputStream : 보조스트림 (객체단위로써 입력받을 수 있게 도와주는)
		// FileInputStream : 기반스트림 (파일과 직접적으로 연결된 통로)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.dat"))){
			
			// readObject()
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 값 반환x EOFException 발생 ==> 예외처리로 해결!
												  // EOF : End Of File
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일을 다읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

}





