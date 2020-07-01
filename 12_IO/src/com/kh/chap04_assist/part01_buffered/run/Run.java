package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedTest;

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 * 보조 스트림 : 기반 스트림만으로 부족했던 성능을 보다 향상 시켜주는 기능
		 * 			    보조스트림 단독으로 사용 불가! 반드시 기반스트림 필요!
		 * 
		 * Buffered : 속도를 향상 시킴, 기반 스트림에서 제공하지 않는 메소드들을 제공
		 * 
		 */
		
		BufferedTest b = new BufferedTest();
		//b.fileSave();
		b.fileRead();

	}

}
