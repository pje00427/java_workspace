package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// 프로그램(자바 또는 코드 또는 메모리) --> 외부매체(파일) (출력:프로그램상의 데이터를 파일로 내보내기) 
	public void fileSave() {
		
		// 출력용 스트림 
		
		// FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		
		// 1. FileOutputStream 객체 생성 --> 해당 파일과의 연결통로를 만들겠다!
		FileOutputStream fos = null;
		try {
			
			// 객체생성 시
			// true 미작성시 --> 기존의 파일에 덮어씌워짐 (기본값이 false)
			// true 작성시 --> 기존의 파일에 이어서출력
			fos = new FileOutputStream("a_byte.txt"); // 해당 파일없으면 새로만들어지고 있으면 그냥 바로 연결)
			// FileNotFoundException 언제 발생? : 존재하지 않는 경로 제시시!
			
			// 2. 해당 만들어진 스트림(통로)으로 데이터 출력 
			//    스트림.write() 메소드 사용!
			
			// 1바이트 단위로 밖에 출력 불가!! 1byte (-128 ~ 127)
			// 단, 파일에 기록되기로는 숫자로 기록되지 않음!! (실제로 파일에기록되는건 해당 숫자의 고유한 문자가 기록됨!)
			// 97 'a'  98 'b'  65 'A'
			// 문자들의 고유한 숫자값은 0부터 시작 (0 ~ 127) => 음수값 불가!!
			fos.write(97); // a 문자가 저장
			fos.write('b');// b 문자가 저장
			//fos.write('강');// 2byte짜리 한글 전달시 깨져서 저장됨! 
			
			// 바이트 배열도 파일에 출력
			byte[] bArr = {99, 100, 101};
			fos.write(bArr); // cde 문자 저장
			
			// write(byte[], int off, int len)
			fos.write(bArr, 1, 2); // de 문자 저장
			
			// fos.close();
			
		} catch (FileNotFoundException e) { // FileNotFoundException의 부모클래스 IOException
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			// 어떤 예외가 발생하든 반드시 실행해야되는 구문
			
			try {
				// 3. 스트림을 다 이용했으면 스트림 반납하기 (닫아주기)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 프로그램  <-- 파일  (입력 : 파일로부터 데이터 가져오기)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. FileInputStream 객체 생성
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터 입력받아오기 
			//    스트림.read() 메소드 이용
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read()); // -1 
			System.out.println(fis.read()); // -1 
			*/
			// 파일의 끝을 만나는 순간 -1값을 받아오는걸 알았음!!
			
			// fis.read() 읽어온 값이 -1이 아닐 경우에 출력되도록!
			/*
			while(fis.read() != -1) {
				System.out.println(fis.read());
			}
			fis.read() 반복문 안에서 단 한번만 실행되야만 함!*/
			
			// 해결방법1. 무한반복으로 돌리면서 조건검사
			/*
			while(true) {
				int value = fis.read();
				
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법2. 조건 검사할 때 마다 읽어온 값을 변수에 기록해두고 출력
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 3. 스트림 반납하기! (close)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}





