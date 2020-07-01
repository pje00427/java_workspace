package com.kh.chap01_objectVSobjectArray.run;

import com.kh.chap01_objectVSobjectArray.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {
		
		// 제품객체들 3개를 보관할 arr 배열 생성
		Product[] arr = new Product[3];
		
		// 각 인덱스에 제품객체들 담기
		arr[0] = new Product("은하수", "샘송", 1000000);
		arr[1] = new Product("아이뽄", "사과", 1300000);
		arr[2] = new Product("벨벳", "헬지", 800000);
		
		// 단순한 for문
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i].information());
			System.out.println(arr[i].getName());
		}
		
		// 향상된 for문 
		int[] iArr = new int[3];
		
		//int a = iArr[0];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int num : iArr) { // int num = iArr[0];	--> int num = iArr[1]; --> int num = iArr[2];
			System.out.println(num);
		}
		
		// Product[] arr = new Product[3];
		for(Product p : arr) { // Product p = arr[0]; --> Product p = arr[1]; --> Product p = arr[2];
			System.out.println(p.information());
		}
		
	}

}







