package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 보조스트림 단독 사용불가!! (기반스트림 객체 반드시 필요)
		
		// 1. 기반스트림 먼저 생성 (파일과 직접 연결하는 통로)
		//FileWriter fw = new FileWriter("c_buffer.dat");
		
		// 2. 보조스트림 생성 (기반 스트림객체 제시하면서 생성)
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// 위의 과정 한번에 처리
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"))){
			
			// write() 메소드 이용해서 출력
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();  // 개행넣어주는 메소드
			bw.write("저리가세요");			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// 기반스트림 : FileReader
		// 보조스트림 : BufferedReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))){
			
			// 데이터를 읽어들일 때 readLine() 메소드 이용 --> 한 줄단위로 읽어들임
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // 파일의 끝을 만나면 null
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




