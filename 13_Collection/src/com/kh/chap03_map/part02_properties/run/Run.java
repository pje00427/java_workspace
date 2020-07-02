package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		// Properties : Map 계열이다. 	=> 키,밸류 세트로 저장
		// 단, HashMap과 다른점은    키값과 밸류값이 모두 String으로 저장
		Properties prop = new Properties();

		// Map계열이기 때문에 put() 사용가능하긴 함..
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		// 하지만 properties를 사용하는 목적은 주로 파일로 저장하고 또는 불러올 때 사용하게 됨..
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서 주로 사용..
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 그래서 Properties에 값 추가할 때는 
		// 1. setProperty(String key, String value) 
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("Map"));
		
		try {
			// 3. store(OuputStream os, String comments) : Properties 컬렉션에 담긴 key-value 값들을 String로 파일에 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// 4. storeToXML(os, comments) : Properties 컬렉션에 담긴 key-value 값들을 .xml 확장자 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}




