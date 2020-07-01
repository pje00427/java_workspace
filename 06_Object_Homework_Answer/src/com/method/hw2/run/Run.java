package com.method.hw2.run;

import com.method.hw2.sample.NonStaticSample;

public class Run {
	
	public static void main(String[] args) {
		
		NonStaticSample ns = new NonStaticSample();
		
		// 1. intArrayAllocation() - 크기가 5인 배열에 임의의 1부터 100까지의 값이 기록된 배열 받기
		int[] arr = ns.intArrayAllocation(5);
		
		// 2. display() - 위의 배열 출력하기
		System.out.print("- 크기가 5인 배열의 랜덤값 : ");
		ns.display(arr);
		
		// 4. sortDescending() - 내림차순 출력 (swap, display)
		System.out.print("- 내림차순 출력 : ");
		ns.sortDescending(arr);
		
		// 5. sortAscending() - 오름차순 출력 (swap, display)
		System.out.print("- 오름차순 출력 : ");
		ns.sortAscending(arr);
		
		System.out.println();
		
		// 6. countChar() - "apple"문자열에 'p' 문자의 갯수 
		System.out.println("- apple문자열에 p의 갯수 : " + ns.countChar("apple", 'p'));
		
		// 7. totalValue() - 13과 7사이의 정수들의 합계
		System.out.println("- 13과 7사이 정수들의 합계 : " + ns.totalValue(13, 7));
		
		// 8. pCharAt() - "programming" 문자열의 3번 인덱스 문자
		System.out.println("- programming문자열의 3번 인덱스 문자 : " + ns.pCharAt("programming", 3));
		
		// 9. pConcat() - "JAVA"문자열과 "programming"문자열을 합친 결과
		System.out.println("- JAVA와 programming을 합친 문자열 : " + ns.pConcat("JAVA", "programming"));
		
		
	}

}
