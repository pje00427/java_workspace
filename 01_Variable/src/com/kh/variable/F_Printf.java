package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
		
		/*
		 * * 출력문
		 * 
		 * System.out.println(출력하고자 하는 값);
		 * --> 출력 후 한줄 띄어쓰기
		 * 
		 * System.out.print(출력하고자 하는 값);
		 * --> 출력만 해줌 (한줄 띄어쓰기 X)
		 * 
		 * System.out.printf("출력하고자 하는 포맷(형식)", 값, 값, ...);
		 * --> 내가 제시한 형식에 맞춰서 출력만 해줌 (한줄 띄어쓰기 X)
		 * 
		 * * 형식을 지정할 때 제시할 수 있는 키워드
		 * %d : 정수값 들어갈 자리임
		 * %c : 문자값 들어갈 자리임
		 * %s : 문자열 들어갈 자리임
		 * %f : 실수값 들어갈 자리임
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "iNum1 : 10"
		System.out.println("iNum1 : " + iNum1);
		System.out.printf("iNum1 : %d\n", iNum1);
		System.out.printf("iNum1 : %d\n", iNum1, iNum2);
		
		// "iNum1 : 10, iNum2 : 20"
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		// "10 + 20 = 30"
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
		
		// 5칸의 공간을 확보하고 출력하고자 하는 값을 오른쪽 정렬시키겠음
		System.out.printf("%5d\n", iNum1);
		
		
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		
		// "dNum1 : xxxx, dNum2 : xxxx"
		
		// %f : 소수점 아래 6짜리 까지 무조건 출력 (넘어가면 반올림되서 출력,모자라면 0으로 채워서 출력)
		System.out.printf("dNum1 : %f, dNum2 : %f\n", dNum1, dNum2);
		System.out.printf("dNum1 : %.3f, dNum2 : %.3f\n", dNum1, dNum2);
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str);
		
		System.out.printf("%C %S", ch, str);
		
		
		
	}

}
