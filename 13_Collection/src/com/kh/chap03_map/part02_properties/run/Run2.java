package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Run2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); // 빈 상태
		
		try {
			// 5. load(InputStream is) : 파일에 잇는 데이터들을 불러와서 prop에 담기
			prop.load(new FileInputStream("test.properties"));
			
			System.out.println(prop);
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			System.out.println(prop);
			
			System.out.println(prop.getProperty("Map"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 *  .properties를 사용하는 경우
		 *  1. 해당 프로그램이 기본적으로 가지고 있는 정보들을 .properties 확장자 문서로 저장해놓으면
		 *     key=value  모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 다루기 쉽다! => JDBC 가면 해볼 것
		 *     
		 *  2. xml파일로 저장할수있는 메소드도 따로 제공
		 *     .xml 파일은 다양한 프로그래밍 언어간에 호환이 쉽다. 
		 *     .xml도 프로그램 상 환경설정 관련된 정보들을 기록해두는 확장자
		 */
		
	}
	
	
}
