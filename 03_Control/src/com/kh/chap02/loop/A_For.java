package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 *  < �ݺ��� > 
	 *  ���α׷� �����帧�� �����ϴ� ��� �� �ϳ�
	 *  � �����ڵ带 �ݺ������� ��������ش�.
	 *  
	 *  ũ�� �� ������ ���� (for�� / while��(do-while��))
	 * 
	 *  * for��
	 *  
	 *  for(�ʱ��; ���ǽ�; ������) {
	 *  	.. �ݺ������� �����Ű���� �ϴ� ���� ���� ..
	 *  }
	 *  
	 *  for���� ������ ����
	 *  �ʱ�� --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 *       --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 *       --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 *       --------------- �� ������ ��� �ݺ� ---------------
	 *       --> ���ǽ� �˻� --> false�� ��� ���౸�� ���� X --> �ݺ��� ��������..
	 *       
	 *  
	 *  - �ʱ�� : �ݺ����� ����� �� "�� �ѹ��� ����Ǵ� ����"
	 *           (���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ �ϴ� �κ�)
	 * 
	 *  - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 *  		   ���ǽ��� true�� ��� �ش� ���� ������ ����
	 *  		   ���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ���������� ��
	 *  		 (���� �ʱ�Ŀ��� ����� ������ ������ ���ǽ��� �ۼ���)
	 * 
	 *  - ������ : �ݺ����� �����ϴ� ���� ���� ������Ű�� �κ�
	 *  		 (���� ����������(++, --)�� ������ �ۼ���)
	 */
	
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� ����ϰ��� �� ��
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		
		//for(int i=1; i<=5; i++) { // 1�������� 5���� 1�� ������ ���� �ݺ��Ѵ�. 
		//for(int i=0; i<=4; i++) { // 0�������� 4���� 1�� ������ ���� �ݺ��Ѵ�.
		//for(int i=0; i<5; i++) {
		for(int i=11; i<16; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		//System.out.println("i : " + i);
		/*
		 * i=1  i<=5  true  ���   i++
		 * i=2  i<=5  true  ���   i++
		 * i=3  i<=5  true  ���   i++
		 * i=4  i<=5  true  ���   i++
		 * i=5  i<=5  true  ���   i++
		 * i=6  i<=5  false �ݺ��� ��������
		 */
		
	}
	
	public void method2() {
		// 1���� 5���� ���
		// 1
		// 2
		// 3
		// 4
		// 5
		
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		*/
		/*
		 * i=1  true  1���   i++
		 * i=2  true  2���   i++
		 * i=3  true  3���   i++
		 * i=4  true  4���   i++
		 * i=5  true  5���   i++
		 * i=6  false �ݺ��� ��������
		 */
		
		// 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// �ݴ뵵 ����
		// 5 4 3 2 1 
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		/*
		 * i=5  true  5���   i--
		 * i=4  true  4���   i--
		 * i=3  true  3���   i--
		 * i=2  true  2���   i--
		 * i=1  true  1���   i--
		 * i=0  false �ݺ����� ��������
		 */
		
	}
	
	public void method4() {
		
		// 1 2 3 4 5 .... 9 10
		
		for(int i=0; i<=9; i++) { // 0�������� 9���� 1�� �����ϴ� ���� �ݺ� => 10Ƚ��
			System.out.print(i + 1 + " ");
		}
		
		System.out.println();
		
		for(int i=2; i<=11; i++) { // 2�������� 11���� 1�� �����ϴ� ���� �ݺ�
			System.out.print(i - 1 + " ");		
		}
		
	}
	
	public void method5() {
		
		// 1���� 10������ Ȧ������ ���
		// 1 3 5 7 9
		
		/*
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		for(int i=1; i<=10; i+=2) { // 1�������� 10���� 2�������ϴµ��� �ݺ�
			System.out.print(i + " ");
		}
		/*
		 * i=1  true  1���   i+=2
		 * i=3  true  3���   i+=2
		 * i=5  true  5���   i+=2
		 * i=7  true  7���   i+=2
		 * i=9  true  9���   i+=2
		 * i=11 false �ݺ����� ��������
		 */
		
	}
	
	public void method6() {
		// 1���� 10������ ��������  �հ�
		//int sum = 1+2+3+4+5+6+7+8+9+10;
		
		int sum = 0;
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// .....
		// sum += 9;
		// sum += 10;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("�� �հ� : " + sum);
		
	}
	
	public void method7() {
		
		// 1���� ����ڰ� �Է��� �������� �հ踦 ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// ....
		// sum += num;
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) { // 1�������� num���� 1�� �����ϴ� ���� �ݺ�
			sum += i;
		}
		
		// 1���� xx������ �� �հ� : xx
		System.out.println("1���� " + num + "������ �� �հ� : " + sum);
		
	}
	
	public void method8() {
		
		// 1�������� ������(1~10������ ������ ����)������ �հ�
		
		/*
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ带 ����ؼ� ������ �߻� ����
		 * Math.random() --> 0.0 ~ 0.999999 ������ ������ �߻�
		 */
		
		//int random = Math.random(); // double���̶� int�� ������ ��°� �Ұ�
				//   0.0 <=    < 1.0  -->  0.0 ~ 0.999999
		
		//int random = Math.random() * 10;
				//   0.0 <=    < 10.0 -->  0.0 ~ 9.999999
		
		//int random = Math.random() * 10 + 1;
				//   1.0 <=	   < 11.0 -->  1.0 ~ 10.99999
		
		int random = (int)(Math.random() * 10 + 1);
				// 	   1 <=    < 11	  -->  1 ~ 10
		
		//System.out.println(random);
		
		// sum += 1;
		// sum += 2;
		// ...
		// sum += random;
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + random + "������ �� �հ� : " + sum);
	}
	
	public void method9() {
		// 2�� ����ϱ�
		// ���(2 x 1 = 2);
		// ���(2 x 2 = 4);
		// ���(2 x 3 = 6);
		// 		...
		// ���(2 x 8 = 16);
		// ���(2 x 9 = 18);
		
		for(int i=1; i<=9; i++) { // 1�������� 9���� 1�� �����ϴ� ���� �ݺ� => 9
			//System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("2 x %d = %2d\n", i, 2 * i);
		}
		
	}
	
	public void method10() {
		// ����ڰ� �Է��� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2�� ~9��)�� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		// dan x 1 = �������
		// dan x 2 = �������
		// ....
		// dan x 8 = �������
		// dan x 9 = �������
		
		if(dan >= 2 && dan <= 9) { // �� �Է����� ��� --> �ݺ����� ���� ���
			
			for(int i=1; i<=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan * i);
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
			
		}else { // �߸� �Է����� ��� --> �����������
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
	}
	
	public void method11() {
		
		// 2~9������ �������� ����ϱ�
		int random = (int)(Math.random() * 8 + 2);
							// 2.0<=  <10.0 --> 2.0 ~ 9.99999
							// 2<=    <10   --> 2 ~ 9
		
		// random x 1 = 
		// random x 2 = 
		// ...
		// random x 9 = 
		
		System.out.println("==== " + random + "�� ====");
		
		for(int i=1; i<10; i++) { // 1�������� 9���� 1�� �����ϴ� ���� �ݺ�
			System.out.printf("%d x %d = %d\n", random, i, random*i);
		}
		
	}
	
	public void method12() {
		
		// ����ڿ��� ���ڿ��� �Է¹��� ��
		// �� ���ڿ��� �� �ε����� ���ڸ� ���� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		// "apple"�� �Է¹޾Ҵٸ�  ==> str
		//  01234
		
		// a	--> str.charAt(0) ���
		// p	--> str.charAt(1) ���
		// p	--> str.charAt(2) ���
		// l	--> str.charAt(3) ���
		// e	--> str.charAt(4) ���
		
		// �ε��� ����     0 ~ ���ڿ��� ����-1 (�������ε���)
		
		System.out.println("str : " + str);
		System.out.println("���ڿ��� ���� : " + str.length());
		
		for(int i=0; i<=str.length()-1; i++) { // 0�������� �������ε������� 1�� �����ϴ� ���� �ݺ�
			System.out.println(str.charAt(i));
		}
		
	}
	
	/*
	 * * ��ø for�� 
	 * 
	 * for(�ʱ��1; ���ǽ�1; ������1){
	 * 
	 * 		������ ����1; 
	 * 
	 * 		for(�ʱ��2; ���ǽ�2; ������2){
	 * 			������ ����2;
	 * 		}
	 * 
	 * 		������ ����3;
	 * }
	 * 
	 */
	
	public void method13() {
		// 1���� 5���� ���̼� ��µǴ� ������ �� 3�� �ݺ�
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i=1; i<=3; i++) { // �� 3�� �ݺ�(1���� 3���� 1������)
			
			for(int j=1; j<=5; j++) { // �� 5�� �ݺ�(1���� 5���� 1������)
				System.out.print(j + " ");
			}
			
			System.out.println();			
		}
		/*
		 * i=1  true  
		 * 			  j=1  true  1���  j++
		 * 			  j=2  true  2���  j++
		 * 			  j=3  true  3���  j++
		 * 			  j=4  true  4���  j++
		 * 			  j=5  true  5���  j++
		 * 			  j=6  false ���� �ݺ��� ����
		 * 			    ���� ���  i++
		 * 
		 * i=2  true  
		 * 			  j=1  true  1���  j++
		 * 			  j=2  true  2���  j++
		 * 			  j=3  true  3���  j++
		 * 			  j=4  true  4���  j++
		 * 			  j=5  true  5���  j++
		 * 			  j=6  false ���� �ݺ��� ����
		 * 			    ���� ���  i++
		 * 
		 * i=3  true
		 * 			  j=1  true  1���  j++
		 * 			  j=2  true  2���  j++
		 * 			  j=3  true  3���  j++
		 * 			  j=4  true  4���  j++
		 * 			  j=5  true  5���  j++
		 * 			  j=6  false ���� �ݺ��� ����
		 * 			    ���� ���  i++
		 * 
		 * i=4  false �ٱ��� �ݺ��� ����
		 */
		
	}
	
	
	public void method14() {
		
		// *****
		// *****
		// *****
		
		// ���� 3�� �ݺ� (1�������� 3���� 1�� �����ϴ� ����)
		// �� �ະ�� ���� 5�� �ݺ� (1�������� 5���� 1�� �����ϴ� ����)
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public void method15() {
		// 0�� 0�� ~ 23�� 59��
		
		// 0�� 0��
		// 0�� 1��
		// 0�� 2��
		// ...
		// 0�� 58��
		// 0�� 59��
		// 
		// 1�� 0��
		// 1�� 1��
		// ...
		// 1�� 59��
		// 
		// ....
		// 23�� 0��
		// 23�� 1��
		// ..
		// 23�� 59��
		
		// �� --> 0~23�ñ��� 1�� ����			--> �ٱ��� for�� 
		// �Žø��� �� --> 0~59�б��� 1�� ����	--> ���� for��
		
		for(int hour=0; hour<24; hour++) {
			
			for(int min=0; min<=59; min++) {
				System.out.println(hour + "�� " + min + "��");
			}
			
			System.out.println("=======");
			
		}
		
	}
	
	public void method16() {
		// 2�� ~ 9�� ���
		
		// === 2�� ===
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ....
		// 2 x 9 = 18
		
		// === 3�� ===
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27
		
		// ...
		
		// === 9�� ===
		// 9 x 1 = 9
		// 9 x 2 = 18
		// ..
		// 9 x 9 = 81
		
		// �� --> 2 ~ 9 ���� 1�� ���� 		==> �ٱ��� for��
		// �� �� �������� �� --> 1 ~ 9���� 1�� ����	==> ���� for��
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println("=== " + dan + "�� ===");
			
			for(int su=1; su<=9; su++) {
				System.out.println(dan + " x " + su + " = " + dan*su);
			}
			
			System.out.println();
			
		}
		
	}
	
	public void method17() {
		// ����ڰ� �Է��� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ��(2�� ~9��)�� �Է����ּ��� : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { // �� �Է����� ��� --> �ݺ����� ���� ��� --> ���α׷� ����(���ѹݺ��� ���������Բ�)
				
				for(int i=1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
				
				break; // ���� ����� �ݺ����� ���������� �б⹮
				
			}else { // �߸� �Է����� ��� --> �����������
				System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���. ");
			}
		
		}
		
		
		
	}
	
	
}











