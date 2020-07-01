package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Casting;
import com.kh.variable.D_Overflow;
import com.kh.variable.E_Constant;
import com.kh.variable.F_Printf;

public class Run {
	
	public static void main(String[] args) {
		// 클래스 생성
		A_Variable a = new A_Variable();
		// 실행할 메소드 호출
		//a.printVariable();
		//a.declareVariable();
		//a.initVariable();
		
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		b.inputScanner2();
		//b.inputScanner3();
		
		C_Casting c = new C_Casting();
		//c.rule1();
		//c.rule2();
		
		D_Overflow d = new D_Overflow();
		//d.overflow();
		
		E_Constant e = new E_Constant();
		//e.constant();
		
		F_Printf f = new F_Printf();
		//f.printfMethod();
		
	}

}







