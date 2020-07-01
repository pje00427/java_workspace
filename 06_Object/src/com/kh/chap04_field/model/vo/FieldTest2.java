package com.kh.chap04_field.model.vo;

// 필드들의 접근제한자들 테스트 해보기!
public class FieldTest2 {
	
	/*
	 * * 필드에서 사용가능한 접근제한자 4가지
	 * 
	 * public 	 => 어디서든(같은패키지, 다른패키지 모두) 접근 가능
	 * protected => 같은 패키지 접근 가능 + 만약 다른 패키지라면 상속구조에서는 접근 가능
	 * default   => 같은 패키지 접근 가능 
	 * private   => only 그 클래스에서만 접근 가능
	 * 
	 * 위에서 부터 아래로 내려올 수록 접근 범위 좁아짐
	 * 
	 */
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String def = "default";
	private String pri = "private";
	
	public static String sta = "FieldTest2 static";

}





