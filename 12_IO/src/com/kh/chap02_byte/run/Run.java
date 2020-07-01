package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {
	
	/*
	 * 프로그램상의 데이터를 외부매체로 출력을 한다거나 또는 외부매체로부터 입력을 받아올 때
	 * 반드시 그 외부매체와의 통로를 만들어줘야됨!! => 그게 바로 "스트림(Stream)"
	 * 
	 * * 스트림의 특징
	 * - 단방향 : 입력이면 입력, 출력이면 출력만 가능! 즉, 입력과 출력을 동시에 하려면 각각의 스트림을 만들어야됨!!
	 * - 선입선출 : 먼저 들어간 값이 먼저나오게 된다! 즉, 시간지연이 생길 수 있다. 
	 * 
	 * 
	 * * 스트림의 구분
	 * > 통로의 사이즈 (1byte짜리 / 2byte짜리)
	 *   - 바이트 스트림 : 1byte짜리만 왔다 갔다 할 수있는 정도의 사이즈(좁은 통로) ==> XXXInputStream(입력) / XXXOutputSteam(출력)
	 *   - 문자 스트림 : 2byte짜리 왔다 갔다 할 수 있는 정도의 사이즈(넓은 통로)	   ==>    XXXReader(입력)   /    XXXWriter(출력)
	 *   
	 * > 외부매체와 직접 연결하는 유무
	 *   - 기반 스트림 : 외부매체와 직접적으로 연결하는 통로
	 *   - 보조 스트림 : 말그대로 보조역할만 하는 통로 (외부매체와 직접 연결 x)
	 *   			   속도 증가시킨다거나, 데이터의 자료형을 변환 시키는 (면뽑는 기계), 유용한 기능들을 제공
	 *   			   따라서 보조스트림 단독으로는 사용 불가!! 기반스트림은 반드시 필수임!!   
	 * 
	 */
	
	public static void main(String[] args) {
		
		// "바이트 기반 스트림" 가지고 데이터 입출력!!
		
		// 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1바이트 단위로 전송하겠다!! 
		
		// XXXInputStream
		// XXXOutputStream
		
		// File Input/Output Stream : 외부매체로 파일 지정
		// Audio Input/Output Stream : 외부매체로 오디오로 지정
		// Piped Input/Output Stream : 외부매체로 또다른 프로세스로 지정
		
		FileByteTest fb = new FileByteTest();
		//fb.fileSave();
		fb.fileRead();
		
	}

}
