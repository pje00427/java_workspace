package com.method.hw3.run;

import com.method.hw3.sample.StaticSample;

public class Run {
	
	public static void main(String[] args) {
		
		// StaticSample Ŭ������ �ʵ��� value�� "Java"�� �ʱ�ȭ �� ���
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper �޼ҵ� ���� --> ���
		StaticSample.toUpper();
		System.out.println("�빮�ڷ� : " + StaticSample.getValue());
		
		// valueLength �޼ҵ� ���� --> ���
		System.out.println("���� : " + StaticSample.valueLength());
		
		// valueConcat �޼ҵ� ���� --> ���
		System.out.println("PROGRAMMING �ٿ��� : " + StaticSample.valueConcat("PROGRAMMING"));
		
		// setChar �޼ҵ� ���� --> ���
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());
		
	}

}
