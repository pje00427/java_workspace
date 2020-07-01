package com.kh.chap03_wrapper.run;

import com.kh.chap03_wrapper.controller.A_WrapperTest;
import com.kh.chap03_wrapper.controller.B_primitiveStringTest;

public class Run {

	public static void main(String[] args) {
		
		A_WrapperTest a = new A_WrapperTest();
		
		//a.method1();
		
		B_primitiveStringTest b = new B_primitiveStringTest();
		b.method1();
	}

}
