package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * * do-while��
	 * 
	 * �ʱ��;
	 * 
	 * do {
	 * 		�ݺ������� ������ �ڵ�;
	 * 
	 * 		������;
	 * 
	 * }while(���ǽ�);
	 * 
	 * �ʱ�� --> ������ �ѹ��� ���� --> ������ -->
	 * ���ǽ� --> true�� ����	--> ������ -->
	 * ���ǽ� --> false�� ��� �ݺ��� ��������
	 * 
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("�ȳ��ϼ���");
		}while(num == 0);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			
			System.out.print(i++ + " ");
			
		}while(i <= 5);
		
		/*
		 * i=1    ������ 1���    i++
		 * i=2 true  2���    i++
		 * i=3 true  3���    i++
		 * i=4 true  4���    i++
		 * i=5 true  5���    i++
		 * i=6 false �ݺ��� �������� 
		 */
		
	}
	
	public void method3() {
		// 1�������� ������(1~100)������ �� �հ�
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		do {
			
			//sum += i;
			//i++;
			sum += i++;
			
		}while(i <= random);
		
		System.out.println("1���� " + random + "������ �� �հ� : " + sum);
		
		
	}
	

}







