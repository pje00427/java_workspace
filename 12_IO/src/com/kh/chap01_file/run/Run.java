package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {
	
	public static void main(String[] args) {
		
		// java.io.File
		
		// test.txt 파일 만들어보자!!
		
		try {
			// 1. 경로지정을 딱히 하지 않으면 현재 project 폴더에 해당 파일이 만들어짐
			File f1 = new File("test.txt"); // 메모리상에 File 객체 생성한것 뿐
			f1.createNewFile(); // 메소드를 실행해야만 실제 파일 만들어짐!! --> IOException
			
			// 2. 존재하는 드라이브나 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. 존재하지 않는 폴더 제시시 바로 자동으로 만들어지진 않음!!
			//    폴더 생성하고 파일 생성!
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile(); // 바로는 안됨
			
			File tempFolder = new File("D:\\temp"); // 별도의 확장자 지정안하면 폴더로 인식
			tempFolder.mkdir(); // 폴더 만드는 메소드
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// ----------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
			System.out.println(file.isFile());
			System.out.println(folder.isFile());
			
			System.out.println(file.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
			//System.out.println("예외발생했습니다!!");
		}
		
		//System.out.println("하이");
		
	}

}









