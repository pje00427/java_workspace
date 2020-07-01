package com.kh.exception;

import java.util.Scanner;

public class A_UnCheckedException {
	
	/*
	 *  * RuntimeException
	 *  - ���α׷� ���� �� �߻��Ǵ� ���ܵ� (���������� �������� ����! => ����ó���� �ʼ��� �ƴ�!)
	 *  - ������� �Ǽ��̰ų� ���������� ��쿡 ���� ����� ó�� ���� �������� �Ǽ��ϼ���!!
	 *  
	 *  * RuntimeException �ļ� Ŭ����
	 *  
	 *  - ArrayIndexOutOfBoundsException : �迭�� �߸��� �ε��� ���� �������� ���!
	 *  - ClassCastException : ����� �� ���� ����ȯ�� ����Ǵ� ���
	 *  - NegativeArraySizeException : �迭�� ũ�⸦ ������ �����ϴ� ��� 
	 *  - NullPointerException : ���������� null �ʱ�ȭ�� ��Ȳ���� �޼ҵ带 ȣ���ϴ� ���
	 *  - ArithmeticException : ������ ���꿡�� 0���� ������ ���
	 *  
	 *  => ���� ������� ���������� ��Ȳ���� ��κ�! 
	 *     ��, ����� ���� ������ ��Ȳ�� �־ �ƿ� ���ʿ� ���ܰ� �߻��ȵǰԲ� if�� �������� ����� ó�� ����!!
	 *  
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException
		
		// ����ڿ��� �ΰ��� ������ �Է¹��� �� ������ ������ ��� ����ϱ�!
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		// ���� ������ ��Ȳ�̹Ƿ� ���ʿ� ���ܰ� �߻� �ȵǰ� if������ ���ǰ˻�����!  => ����ó�� X
		/*
		int result = 0;
		
		if(num2 != 0) {
			result = num1 / num2;			
		}
		
		System.out.println("��� : " + result);
		*/
		
		
		// ����ó�� : ���ܰ� �߻����� �� ó���ϴ� ������ �ۼ��س��°�!
		/*
		 * 1. try{} catch() {} ���
		 * 
		 * try {
		 * 		���ܰ� �߻��� �� �ִ� ����;
		 * 
		 * }catch(�߻��ɿ���Ŭ���� ������) {
		 * 		�ش� ���ܰ� �߻��Ǵ� ��� ó���� ����;
		 * 
		 * }
		 * 
		 */
		
		int result = 0;
		try {
			result = num1 / num2;
			
			System.out.println("�ȳ��ϼ���"); // ���ʿ��� ���ܰ� �߻����� ��� ������� ����!!
			
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			
		}
		
		System.out.println("��� : " + result);
		
		
	}
	
	
	public void method2() {
		
		// NegativeArraySizeException
		
		System.out.print("�迭�� ���� : ");
		int size = sc.nextInt();
		
		/*
		if(size > 0) {
			int[] arr = new int[size];
			System.out.println(arr[0]);
			
		}else {
			System.out.println("����� �Է����ּ���");
		}	
		*/
			
		
		/*
		try {
			
			int[] arr = new int[size];	// NegativeArraySizeException
			System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
			
		// ���� ĳġ ������!!
		}catch(NegativeArraySizeException e) {
			System.out.println("����� �Է����ּ���");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}
		*/
		
		try {
			
			int[] arr = new int[size];	// NegativeArraySizeException
			System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
			
		}catch(RuntimeException e) { // �θ�Ÿ���� ����Ŭ���� ���ý� �� �޾��ش�! (����������)
			System.out.println("���ܰ� �߻��߾��!");
		}/*catch(NegativeArraySizeException e) {
			// ������ catch���� �ۼ��ϰ��� �Ѵٸ�
			// �ڼ�Ŭ���� ������ �θ�Ŭ���� �����ؾߵ�!!
		}*/
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	
	/*
	 *  * ��Ÿ�� ���� (RuntimeException)
	 *  - ���α׷� ����� ������ �߻���!
	 *  - ����� ���������� ��Ȳ�� �־�� ���ʿ� ���ܰ� �߻��ȵǰԲ� if������ �ڵ鸵���ִ°� �������! (����ó��)
	 *  - ����ó��������ε� ó�������ϱ� �ϴ�! 
	 *    => ������ �ɹ��� , ����ó���� �ʼ��� �ƴ�!! => UnCheckedException
	 */

}










