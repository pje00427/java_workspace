package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  * 문자 기반 스트림
		 *  
		 *  XXXReader(입력)  XXXWriter(출력)
		 *  
		 */
		FileCharTest fc = new FileCharTest();
		//fc.fileSave();
		fc.fileRead();
	}

}
