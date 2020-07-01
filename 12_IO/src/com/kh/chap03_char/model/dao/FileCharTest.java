package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력하기
		
		// 1. FileWriter 객체 생성 --> 해당 파일없으면 자동으로 만들어짐, 있으면 파일과 바로 연결
		//							true 제시시 기존에 파일에 이어서작성
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. write() 메소드 사용해서 출력
			fw.write("와! IO 재밋따..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납하기
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		// try ~ with ~ resource 구문 (JDK 7버전 이후)
		/*
		 * try(스트림 객체 생성구문; 스트림 객체 생성구문;) {
		 * 
		 * } catch(예외클래스 변수명) {
		 * 
		 * } 
		 */
		
		try(FileWriter fw = new FileWriter("b_char.dat")) {
			
			// 2. write() 메소드 사용해서 출력
			fw.write("와! IO 재밋따..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받기
		
		// 1. FileReader 객체 생성
		try(FileReader fr = new FileReader("b_char.dat")){
			
			// 2. 데이터 읽어오기 (read())
			// 파일의 끝을 만나면 -1
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






