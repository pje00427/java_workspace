package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// 배열 : "같은 자료형의 값"들을 하나의 공간에 담을 수 있는 개념
	//       저장된 값마다 인덱스가 지정됨 (인덱스는 0부터 시작됨)
	
	public void method1() {
		
		// * 배열을 왜 쓰는지
		
		// 대량의 데이터를 보관하고자 할 때 각각의 변수를 만들어서 관리해야됨..
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력하고자 할때도 
		/*
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		*/
		
		// 총 합계를 구하고자 할 때도
		int sum = num1 + num2 + num3 + num4 + num5;
		
		/*
		 * 1. 배열 선언 (여러개의 값들을 보관할 배열을 만들겠다!!)
		 *    자료형 배열명[];
		 *    자료형[] 배열명;
		 */
		
		//int a; // 변수 선언
		
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당 (이 배열에 몇 개의 값들을 보관할건지 크기지정하는 과정 , 그 갯수만큼 방이 만들어짐)
		 *    배열명 = new 자료형[배열크기];
		 */
		//arr = new int[5];
		
		// * 배열 선언과 동시에 할당 (배열 만듦과 동시에 크기지정하겠다.)
		
		int a = 10;
		
		int[] arr = new int[5];
		
		
		/*
		 * 3. 값 초기화(대입)
		 *    배열명[인덱스] = 값;
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		//arr[5] = 5;
		//arr[6] = 6;
		
		
		// 배열 장점 : 반복문을 사용할 수 있다는 장점
		
		//for(int i=0; i<=4; i++) { // 0에서부터 4까지 1씩 증가하는 동안 반복이 수행되게끔
		//for(int i=0; i<=arr.length-1; i++) { // 배열의 길이 : 배열명.length
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// 출력문 또한 반복문으로
		//for(int i=0; i<=arr.length-1; i++) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
	}
	
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		/*
		 *  값을 바로 담을 수 있는 변수를 일반변수라고 얘기하고
		 *  주소값을 담고 있는 변수를 참조변수(레퍼런스변수)라고 표현
		 *  
		 *  기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 *  => 진짜 값을 바로 담는 변수 => 그냥 일반 변수
		 *  
		 *  그 외 자료형(String, int[], char[], double[], Scanner ... )으로 선언한 변수
		 *  => 주소값을 담는 변수 => 레퍼런스 변수(참조변수)
		 */
		
		System.out.println("i : " + i);
		System.out.println("iArr : " + iArr);	
		
		double[] dArr = new double[10];
		System.out.println("dArr : " + dArr);
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2
		
		double[] dArr = new double[5]; // 0~4
		
		// 배열 선언하고 크기지정(할당)까지 한 상태
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		// 아직 초기화를 직접 하지 않아도 잘 출력됨
		// 왜?
		
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음
		// 따라서 공간이 만들어질 때 
		// JVM이 기본값으로 초기화(대입)를 진행해줌
		
	}
	
	
	public void method4() {
		
		int[] iArr = new int[5];
		
		/*
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		*/
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(iArr);
		System.out.println(iArr.hashCode()); // 주소값의 10진수
		
	}
	
	public void method5() {
		// 사용자에게 입력받은 수만큼 배열의 크기 지정하기!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println(dArr.hashCode());
		System.out.println(dArr.length);
		System.out.println(dArr[0]);
		
	}
	
	
	public void method6() {
		
		int[] iArr = new int[5]; // 0~4
		
		/*
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		*/
		
		int num = 2;
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = num;
			num += 2;
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr의 해시코드값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		// 배열 크기 수정 후 넣어보자 ( 수정 자체가 안됨!! )
		//iArr[5] = 12;
	
		
		// * 배열의 가장 큰 단점
		// 1. 한번 지정한 배열의 크기는 변경 불가!!
		//    배열의 크기를 변경하고자 한다면 다시 만들어줘야됨
		iArr = new int[7];
		
		System.out.println("===변경 후 iArr===");
		System.out.println("iArr의 해시코드값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		/*
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 
		 * 연결이 끊어진 기존 배열은 Heap영역에 둥둥떠다님
		 * => 일정 시간이 지나면 "가비지 컬렉터" 지워줌
		 *    (자동 메모리 관리)
		 */
		
		// 지금 연결되어있는 고리를 끊고자 한다면 어떻게?
		iArr = null; // 아무것도 참조하지 않겠다!
		
		System.out.println("===삭제 후의 iArr===");
		System.out.println(iArr);
		System.out.println(iArr.hashCode());
		
		// null.xxx()  =>  NullPointerException
		
	}
	
	public void method7() {
		
		// 배열 선언 및 할당 과 동시에 초기화 해버리기
		int[] arr1 = {1, 2, 3, 4}; // 값이 갯수만큼 자동으로 크기가 할당됨(내부적으로 수행됨)
		int[] arr2 = new int[] {1, 2, 3, 4};
		
		System.out.println("arr1의 길이 : " + arr1.length);
		System.out.println("arr2의 길이 : " + arr2.length);
		
		System.out.println(arr1 == arr2);
		
	}
	
	
	public void method8() {
		
		String[] sArr = new String[5]; // 0~4
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			sArr[i] = sc.nextLine();
		}
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	
	public void method9() {
		
		// 크기 10짜리 int형배열 생성 후 랜덤값(1~100)들 담아서 출력하기
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			//System.out.println("arr[" + i + "] : " + arr[i]);
			System.out.printf("arr[%d] : %d\n", i, arr[i]);			
		}
		
	}
	
	public void method10() {
		
		// 3명의 사용자에게 키의 정보를 입력받아 배열에 담아두고
		// 3명의 키의 총합, 평균값을 구하시오
		
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		for(int i=0; i<heights.length; i++) {
			System.out.print("키 입력 : ");
			heights[i] = sc.nextDouble();
		}
		
		// sum += heights[0];
		// sum += heights[1];
		// sum += heights[2];
		
		double sum = 0.0;
		for(int i=0; i<heights.length; i++) {
			sum += heights[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / heights.length);
		
	}
	
	
	public void method11() {
		
		// 1. 사용자에게 입력받은 수만큼 배열의 크기 지정 후
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 2. 0~마지막인덱스까지 랜덤값(1~100) 담은 후
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 0~마지막인덱스까지의 값 출력 하면서 짝수들의 총합 계산
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		// 4. 총합 출력
		System.out.println("\n짝수의 총합 : " + sum);
		
	}
	
	
	public void method12() {
		
		// 사용자에게 문자열 입력받은 후 각 문자들을 char배열에 담기
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); // "apple"
		
		// 2. char배열 생성 (배열 크기 == 문자열의 길이만큼)
		char[] arr = new char[str.length()];
		
		// 3. 해당 문자열에서 각 인덱스별 문자를 char배열의 0~마지막인덱스까지 담기
		// arr[0] = str.charAt(0);
		// arr[1] = str.charAt(1);
		// ....
		// arr[길이-1] = str.charAt(길이-1);
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
					
		// 4. 0~마지막인덱스까지의 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}










